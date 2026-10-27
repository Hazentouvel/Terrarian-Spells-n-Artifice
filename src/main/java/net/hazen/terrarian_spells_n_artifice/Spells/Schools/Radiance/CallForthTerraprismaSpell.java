package net.hazen.terrarian_spells_n_artifice.Spells.Schools.Radiance;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.events.SpellSummonEvent;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.*;
import net.hazen.hazennstuff.Entity.Mobs.Summons.SummonTerraprisma.SummonedTerraprisma;
import net.hazen.hazennstuff.Registries.HnSSounds;
import net.hazen.hazentouvelib.Registries.HLSchoolRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.NeoForge;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CallForthTerraprismaSpell extends AbstractSpell {
    private final ResourceLocation spellId = ResourceLocation.fromNamespaceAndPath("hazennstuff", "call_forth_terraprisma");
    private final DefaultConfig defaultConfig;


    @Override
    public List<MutableComponent> getUniqueInfo(int spellLevel, LivingEntity caster) {
        var li = new ArrayList<>(super.getUniqueInfo(spellLevel, caster));

        li.addAll(List.of(
                Component.translatable("ui.irons_spellbooks.damage",
                        new Object[]{Utils.stringTruncation((double)this.getHealthBonus(spellLevel, caster), 1)}
                ),
                Component.translatable("ui.irons_spellbooks.hp",
                        new Object[]{Utils.stringTruncation((double)this.getDamageBonus(spellLevel, caster), 1)}
                )
        ));

        return li;
    }

    public CallForthTerraprismaSpell() {
        this.defaultConfig = (new DefaultConfig())
                .setMinRarity(SpellRarity.EPIC)
                .setSchoolResource(HLSchoolRegistry.RADIANCE_RESOURCE)
                .setMaxLevel(5)
                .setCooldownSeconds(150.0F)
                .build();
        this.manaCostPerLevel = 15;
        this.baseSpellPower = 1;
        this.spellPowerPerLevel = 2;
        this.castTime = 20;
        this.baseManaCost = 80;
    }

    public CastType getCastType() {
        return CastType.LONG;
    }

    public DefaultConfig getDefaultConfig() {
        return this.defaultConfig;
    }

    public ResourceLocation getSpellResource() {
        return this.spellId;
    }

    public Optional<SoundEvent> getCastStartSound() {
        return Optional.of(HnSSounds.TERRAPRISMA_CASTING.get());
    }

    public Optional<SoundEvent> getCastFinishSound() {
        return Optional.of(HnSSounds.TERRAPRISMA_SUMMON.get());
    }

    public int getRecastCount(int spellLevel, @Nullable LivingEntity entity) {
        return 2;
    }

    public void onRecastFinished(ServerPlayer serverPlayer, RecastInstance recastInstance, RecastResult recastResult, ICastDataSerializable castDataSerializable) {
        if (SummonManager.recastFinishedHelper(serverPlayer, recastInstance, recastResult, castDataSerializable)) {
            super.onRecastFinished(serverPlayer, recastInstance, recastResult, castDataSerializable);
        }

    }

    public ICastDataSerializable getEmptyCastData() {
        return new SummonedEntitiesCastData();
    }

    public void onCast(Level world, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        PlayerRecasts recasts = playerMagicData.getPlayerRecasts();
        int summonCount = Math.min(spellLevel, 7);

        if (!recasts.hasRecastForSpell(this)) {
            SummonedEntitiesCastData summonedEntitiesCastData = new SummonedEntitiesCastData();
            int summonTime = 12000;

            for (int i = 0; i < summonCount; i++) {
                SummonedTerraprisma summonedTerraprisma = new SummonedTerraprisma(world, entity);
                summonedTerraprisma.getAttributes().getInstance(Attributes.ATTACK_DAMAGE).setBaseValue(this.getDamageBonus(spellLevel, entity));
                summonedTerraprisma.getAttributes().getInstance(Attributes.MAX_HEALTH).setBaseValue(this.getHealthBonus(spellLevel, entity));
                summonedTerraprisma.setHealth(summonedTerraprisma.getMaxHealth());
                summonedTerraprisma.setPos(entity.position());
                SummonedTerraprisma creature = (SummonedTerraprisma)(NeoForge.EVENT_BUS.post(new SpellSummonEvent(entity, summonedTerraprisma, this.spellId, spellLevel))).getCreature();
                world.addFreshEntity(creature);
                SummonManager.initSummon(entity, creature, summonTime, summonedEntitiesCastData);
            }
            RecastInstance recastInstance = new RecastInstance(this.getSpellId(), spellLevel, this.getRecastCount(spellLevel, entity), summonTime, castSource, summonedEntitiesCastData);
            recasts.addRecast(recastInstance, playerMagicData);
        }

        super.onCast(world, spellLevel, entity, castSource, playerMagicData);
    }

    public double getHealthBonus(int spellLevel, LivingEntity caster) {
        return (double)(this.getSpellPower(spellLevel, caster) - 1.0F) * 0.1;
    }

    public double getDamageBonus(int spellLevel, LivingEntity caster) {
        return (double)(this.getSpellPower(spellLevel, caster) - 1.0F) * 0.05;
    }
}
