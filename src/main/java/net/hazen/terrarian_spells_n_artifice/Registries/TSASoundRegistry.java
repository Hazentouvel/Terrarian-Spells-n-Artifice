package net.hazen.terrarian_spells_n_artifice.Registries;

import net.hazen.terrarian_spells_n_artifice.TerrarianSpellsNArtifice;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TSASoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, TerrarianSpellsNArtifice.MOD_ID);


    /*
     * Entity
     */



    /*
     * Spell Sounds
     */

    // Terraria Cast
    public static DeferredHolder<SoundEvent, SoundEvent> TERRARIA_CAST = registerSoundEvent("terraria_cast");

    // Vampire Knife Throw
    public static DeferredHolder<SoundEvent, SoundEvent> VAMPIRE_KNIFE_THROW = registerSoundEvent("vampire_knife_throw");

    public static DeferredHolder<SoundEvent, SoundEvent> VAMPIRE_KNIFE_HIT = registerSoundEvent("vampire_knife_hit");

    // Golden Shower Cast
    public static DeferredHolder<SoundEvent, SoundEvent> GOLDEN_SHOWER_CAST = registerSoundEvent("golden_shower_cast");

    /*
     ***Terraprisma Sounds
     */

    // Cast
    public static DeferredHolder<SoundEvent, SoundEvent> TERRAPRISMA_CASTING = registerSoundEvent("terraprisma_casting");
    public static DeferredHolder<SoundEvent, SoundEvent> TERRAPRISMA_SUMMON = registerSoundEvent("terraprisma_summon");
    public static DeferredHolder<SoundEvent, SoundEvent> TERRARIA_SUMMON = registerSoundEvent("terraria_summon");

    /*
    *** Cosmic Sounds
     */

    //Star Cast
    public static DeferredHolder<SoundEvent, SoundEvent> STAR_CAST_1 = registerSoundEvent("star_cast_1");
    public static DeferredHolder<SoundEvent, SoundEvent> STAR_CAST_2 = registerSoundEvent("star_cast_2");

    /*
    *** Melee Sounds
     */

    //Terrablade Slash
    public static DeferredHolder<SoundEvent, SoundEvent> TERRABLADE_SLASH = registerSoundEvent("terrablade_slash");


    //Terraria Sword Sounds
    public static DeferredHolder<SoundEvent, SoundEvent> TERRARIA_SWING = registerSoundEvent("terraria_swing");
    public static DeferredHolder<SoundEvent, SoundEvent> TERRARIA_IMPACT = registerSoundEvent("terraria_impact");

    //Cat Sounds
    public static DeferredHolder<SoundEvent, SoundEvent> CAT_SWING = registerSoundEvent("cat_swing");
    public static DeferredHolder<SoundEvent, SoundEvent> CAT_CAST = registerSoundEvent("cat_cast");
    public static DeferredHolder<SoundEvent, SoundEvent> CAT_IMPACT = registerSoundEvent("cat_impact");

    /*
     * Gun Sounds
     */

    public static DeferredHolder<SoundEvent, SoundEvent> STAR_CANNON_RELOAD = registerSoundEvent("star_cannon_reload");
    public static DeferredHolder<SoundEvent, SoundEvent> SUPER_STAR_SHOOTER_RELOAD = registerSoundEvent("super_star_shooter_reload");

    public static DeferredHolder<SoundEvent, SoundEvent> STAR_FIRE = registerSoundEvent("star_fire");
    public static DeferredHolder<SoundEvent, SoundEvent> STAR_IMPACT = registerSoundEvent("star_impact");
    public static DeferredHolder<SoundEvent, SoundEvent> STAR_FAIL = registerSoundEvent("star_fail");


    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvent(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent
                (ResourceLocation.fromNamespaceAndPath(TerrarianSpellsNArtifice.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
