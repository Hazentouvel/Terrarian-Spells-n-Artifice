package net.hazen.terrarian_spells_n_artifice.Spells.AbstractSpells;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.hazen.terrarian_spells_n_artifice.Registries.TSAItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

import static net.acetheeldritchking.aces_spell_utils.utils.ASUtils.isValidUnlockItemInInventory;

public abstract class NightsEdgeSpell extends AbstractSpell {

    @Override
    public Component getLockedMessage() {
        return Component.translatable("ui.hazennstuff.weapon_resonation");
    }

    @Override
    public boolean allowLooting() {
        return false;
    }

    @Override
    public boolean canBeCraftedBy(Player player) {
        Item[] validItems = {
                TSAItemRegistry.NIGHTS_EDGE.get(),
                TSAItemRegistry.TRUE_NIGHTS_EDGE.get()
        };
        for (Item item : validItems) {
            if (isValidUnlockItemInInventory(item, player)) {
                return true;
            }
        }
        return false;
    }
}
