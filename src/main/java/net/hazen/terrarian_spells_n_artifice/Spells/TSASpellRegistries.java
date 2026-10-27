package net.hazen.terrarian_spells_n_artifice.Spells;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Cosmic.ShootingStarSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Holy.GoldenShowerSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Hydro.RazorbladeTyphoonSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Hydro.WaterBoltSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Nature.ThornChakramSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Radiance.CallForthTerraprismaSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Radiance.PrismaticShiftSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Radiance.SyringeBarrageSpell;
import net.hazen.terrarian_spells_n_artifice.Spells.Schools.Shadow.NightsEdgeStrikeSpell;
import net.hazen.terrarian_spells_n_artifice.TerrarianSpellsNArtifice;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.api.registry.SpellRegistry.SPELL_REGISTRY_KEY;

public class TSASpellRegistries {
    public static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SPELL_REGISTRY_KEY, TerrarianSpellsNArtifice.MOD_ID);

    public static Supplier<AbstractSpell> registerSpell(AbstractSpell spell) {
        return SPELLS.register(spell.getSpellName(), () -> spell);
    }

    /*
     *** Ender
     */

    /*
     *** Blood
     */


    /*
     *** Fire
     */

    /*
    *** Ice
     */

    /*
     *** Lightning
     */

    /*
    *** Nature
     */

    //Thorn Chakram
    public static final Supplier<AbstractSpell> THORN_CHAKRAM = registerSpell(new ThornChakramSpell());

    /*
    *** Evocation
     */

    /*
     *** Holy
     */

    // Golden Shower
    public static final Supplier<AbstractSpell> GOLDEN_SHOWER = registerSpell(new GoldenShowerSpell());

    /*
     *** Radiance
     */

    //Syringe Barrage
    public static final Supplier<AbstractSpell> SYRINGE_BARRAGE = registerSpell(new SyringeBarrageSpell());

    // Call Forth Terraprisma
    public static final Supplier<AbstractSpell> CALL_FORTH_TERRAPRISMA = registerSpell(new CallForthTerraprismaSpell());

    //Prismatic Shift
    public static final Supplier<AbstractSpell> PRISMATIC_SHIFT = registerSpell(new PrismaticShiftSpell());

    /*
     *** Shadow
     */

    //Night's Edge Strike
    public static final Supplier<AbstractSpell> NIGHTS_EDGE_STRIKE = registerSpell(new NightsEdgeStrikeSpell());


    /*
     *** Eldritch
     */

    /*
    *** Cosmic
     */

    // Shooting Star
    public static final Supplier<AbstractSpell> SHOOTING_STAR = registerSpell(new ShootingStarSpell());

    /*
    *** Hydro
     */

    // Water Bolt
    public static final Supplier<AbstractSpell> WATER_BOLT = registerSpell(new WaterBoltSpell());

    // Razorblade Typhoon
    public static final Supplier<AbstractSpell> RAZORBLADE_TYPHOON = registerSpell(new RazorbladeTyphoonSpell());



    public static void register(IEventBus eventBus)
    {
        SPELLS.register(eventBus);
    }

}