package net.hazen.terrarian_spells_n_artifice.Spells.AbstractSpells;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.hazen.terrarian_spells_n_artifice.Registries.TSAItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

import static net.acetheeldritchking.aces_spell_utils.utils.ASUtils.isValidUnlockItemInInventory;

public abstract class AbstractGoldenShowerSpell extends AbstractSpell {

    @Override
    public Component getLockedMessage() {
        return Component.translatable("ui.hazennstuff.spellbook_resonation");
    }

    @Override
    public boolean allowLooting() {
        return false;
    }

    @Override
    public boolean canBeCraftedBy(Player player) {
        Item goldenShowerSpellbook = TSAItemRegistry.GOLDEN_SHOWER_SPELLBOOK.get();
        return isValidUnlockItemInInventory(goldenShowerSpellbook, player);
    }
}
