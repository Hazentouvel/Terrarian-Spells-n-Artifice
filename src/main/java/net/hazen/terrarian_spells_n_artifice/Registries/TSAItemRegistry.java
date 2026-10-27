package net.hazen.terrarian_spells_n_artifice.Registries;

import io.redspace.irons_artifice.item.GunItem;
import net.hazen.hazentouvelib.Rarities.HLRarities;
import net.hazen.terrarian_spells_n_artifice.Items.Armor.General.Chlorophyte.ChlorophyteArmorItem;
import net.hazen.terrarian_spells_n_artifice.Items.Armor.General.Chlorophyte.Headgear.ChlorophyteHeadgearArmorItem;
import net.hazen.terrarian_spells_n_artifice.Items.Armor.General.Chlorophyte.Helmet.ChlorophyteHelmetArmorItem;
import net.hazen.terrarian_spells_n_artifice.Items.Armor.General.Chlorophyte.Mask.ChlorophyteMaskArmorItem;
import net.hazen.terrarian_spells_n_artifice.Items.Armor.Melee.ShadowScale.ShadowScaleArmorItem;
import net.hazen.terrarian_spells_n_artifice.Items.Curios.Charms.PendantOfHarmonyCurio;
import net.hazen.terrarian_spells_n_artifice.Items.Curios.Spellbooks.GoldenShowerSpellbook;
import net.hazen.terrarian_spells_n_artifice.Items.Guns.TSAGuns;
import net.hazen.terrarian_spells_n_artifice.Items.Staves.RodOfDiscord.RodOfDiscord;
import net.hazen.terrarian_spells_n_artifice.Items.Tools.PickaxeAxe.PickaxeAxeItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.BladeOfGrass.BladeOfGrassItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.Excalibur.Terraria.ExcaliburItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.Hammush.HammushItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.LightsBane.LightsBaneItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.Meowmere.MeowmereItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.Muramasa.MuramasaItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.NightsEdge.NightsEdgeItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.Starfury.StarfuryItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.Terraprisma.TerraprismaItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.ThornChakram.ThornChakramItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.TrueNightsEdge.TrueNightsEdgeItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.VampireKnives.VampireKnivesItem;
import net.hazen.terrarian_spells_n_artifice.Items.Weapons.Volcano.VolcanoItem;
import net.hazen.terrarian_spells_n_artifice.TerrarianSpellsNArtifice;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Unbreakable;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collection;

public class TSAItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TerrarianSpellsNArtifice.MOD_ID);

    /*
     *** Ingots and Raw Material
     */

    /*
     *** Pre-Hardmode **************************************************************************************************
     */

    // Demonite Ingot
    public static final DeferredItem<Item> DEMONITE_INGOT = ITEMS.register("demonite_ingot",
            () -> new Item(new Item
                    .Properties()
                    .rarity(HLRarities.SHADOW_RARITY.getValue()))

    );


    /*
    *** Hardmode *******************************************************************************************************
     */

    // Chlorophyte Chunk
    public static final DeferredItem<Item> CHLOROPHYTE_CHUNK = ITEMS.register("chlorophyte_chunk",
            () -> new Item(new Item
                    .Properties()
                    .rarity(HLRarities.NATURE_RARITY.getValue()))
    );

    // Chlorophyte Ingot
    public static final DeferredItem<Item> CHLOROPHYTE_INGOT = ITEMS.register("chlorophyte_ingot",
            () -> new Item(new Item
                    .Properties()
                    .rarity(HLRarities.NATURE_RARITY.getValue())
                    .fireResistant())

    );

    // Hallowed Ingot
    public static final DeferredItem<Item> HALLOWED_INGOT = ITEMS.register("hallowed_ingot",
            () -> new Item(new Item
                    .Properties()
                    .rarity(HLRarities.DEUS_RARITY.getValue()))
    );

    /*
     *** Weapons
     */

    /*
     *** Pre-Hardmode **************************************************************************************************
     */

    // Starfury
    public static final DeferredHolder<Item, Item> STARFURY = ITEMS.register
            ("starfury", StarfuryItem::new);

    // Thorn Chakram
    public static final DeferredHolder<Item, Item> THORN_CHAKRAM = ITEMS.register
            ("thorn_chakram", ThornChakramItem::new);

    // Blade of Grass
    public static final DeferredHolder<Item, Item> BLADE_OF_GRASS = ITEMS.register
            ("blade_of_grass", BladeOfGrassItem::new);

    //Lights Bane
    public static final DeferredHolder<Item, Item> LIGHTS_BANE = ITEMS.register
            ("lights_bane", LightsBaneItem::new);

    // Volcano
    public static final DeferredHolder<Item, Item> VOLCANO = ITEMS.register
            ("volcano", VolcanoItem::new);

    //Muramasa
    public static final DeferredHolder<Item, Item> MURAMASA = ITEMS.register
            ("muramasa", MuramasaItem::new);

    //Nights Edge
    public static final DeferredHolder<Item, Item> NIGHTS_EDGE = ITEMS.register
            ("nights_edge", NightsEdgeItem::new);


    /*
     *** Hardmode *******************************************************************************************************
     */

    //Vampire Knives
    public static final DeferredHolder<Item, Item> VAMPIRE_KNIVES = ITEMS.register
            ("vampire_knives", VampireKnivesItem::new);

    //Meowmere
    public static final DeferredHolder<Item, Item> MEOWMERE = ITEMS.register
            ("meowmere", MeowmereItem::new);

    //Hammush
    public static final DeferredHolder<Item, Item> HAMMUSH = ITEMS.register
            ("hammush", HammushItem::new);

    //Terraprisma
    public static final DeferredHolder<Item, Item> TERRAPRISMA = ITEMS.register
            ("terraprisma", TerraprismaItem::new);

    //True Nights Edge
    public static final DeferredHolder<Item, Item> TRUE_NIGHTS_EDGE = ITEMS.register
            ("true_nights_edge", TrueNightsEdgeItem::new);

    //Excalibur
    public static final DeferredHolder<Item, Item> EXCALIBUR = ITEMS.register
            ("excalibur", ExcaliburItem::new);

    /*
    *** Staves
     */

    //Rod of Discord
    public static final DeferredHolder<Item, Item> ROD_OF_DISCORD = ITEMS.register("rod_of_discord", RodOfDiscord::new);

    /*
    *** Guns
     */

    // Star Cannon
    public static final DeferredItem<GunItem> STAR_CANNON = ITEMS.registerItem("star_cannon",
            properties -> new GunItem(properties, TSAGuns.STAR_CANNON)
    );

    // Super Star Shooter
    public static final DeferredItem<GunItem> SUPER_STAR_SHOOTER = ITEMS.registerItem("super_star_shooter",
            properties -> new GunItem(properties.rarity(Rarity.EPIC), TSAGuns.SUPER_STAR_SHOOTER)
    );

    /*
     *** Tools
     */

    // Pickaxe Axe
    public static final DeferredHolder<Item, Item> PICKAXE_AXE = ITEMS.register("pickaxe_axe", PickaxeAxeItem::new);

    /*
     *** Curios
     */

    /*
    *** Spellbooks
     */

    public static final DeferredItem <GoldenShowerSpellbook> GOLDEN_SHOWER_SPELLBOOK = ITEMS.register("golden_shower_spellbook", GoldenShowerSpellbook::new);


    /*
    *** Charms
     */

    //Pendant of Harmony
    public static final DeferredItem<PendantOfHarmonyCurio> PENDANT_OF_HARMONY = ITEMS.register("pendant_of_harmony", PendantOfHarmonyCurio::new);

    /*
     *** Armor
     */

    /*
     *** Pre-Hardmode **************************************************************************************************
     */

    //Shadow Scale

    public static final DeferredHolder<Item, Item> SHADOW_SCALE_HELMET = ITEMS.register("shadow_scale_helmet", () -> new ShadowScaleArmorItem(ArmorItem.Type.HELMET, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.SHADOW_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.HELMET.getDurability(64))
    ));
    public static final DeferredHolder<Item, Item> SHADOW_SCALE_CHESTPLATE = ITEMS.register("shadow_scale_chestplate", () -> new ShadowScaleArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.SHADOW_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.CHESTPLATE.getDurability(64))
    ));
    public static final DeferredHolder<Item, Item> SHADOW_SCALE_LEGGINGS = ITEMS.register("shadow_scale_leggings", () -> new ShadowScaleArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.SHADOW_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.LEGGINGS.getDurability(64))
    ));
    public static final DeferredHolder<Item, Item> SHADOW_SCALE_BOOTS = ITEMS.register("shadow_scale_boots", () -> new ShadowScaleArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.SHADOW_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.BOOTS.getDurability(64))

    ));


    /*
     *** Hardmode *******************************************************************************************************
     */

    //Chlorophyte
    public static final DeferredHolder<Item, Item> CHLOROPHYTE_HELMET = ITEMS.register("chlorophyte_helmet", () -> new ChlorophyteHelmetArmorItem(ArmorItem.Type.HELMET, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.NATURE_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.HELMET.getDurability(64))
            .component(DataComponents.UNBREAKABLE, new Unbreakable(false))
    ));
    public static final DeferredHolder<Item, Item> CHLOROPHYTE_MASK = ITEMS.register("chlorophyte_mask", () -> new ChlorophyteMaskArmorItem(ArmorItem.Type.HELMET, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.NATURE_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.HELMET.getDurability(64))
            .component(DataComponents.UNBREAKABLE, new Unbreakable(false))
    ));
    public static final DeferredHolder<Item, Item> CHLOROPHYTE_HEADGEAR = ITEMS.register("chlorophyte_headgear", () -> new ChlorophyteHeadgearArmorItem(ArmorItem.Type.HELMET, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.NATURE_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.HELMET.getDurability(64))
            .component(DataComponents.UNBREAKABLE, new Unbreakable(false))
    ));
    public static final DeferredHolder<Item, Item> CHLOROPHYTE_CHESTPLATE = ITEMS.register("chlorophyte_chestplate", () -> new ChlorophyteArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.NATURE_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.CHESTPLATE.getDurability(64))
            .component(DataComponents.UNBREAKABLE, new Unbreakable(false))
    ));
    public static final DeferredHolder<Item, Item> CHLOROPHYTE_LEGGINGS = ITEMS.register("chlorophyte_leggings", () -> new ChlorophyteArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.NATURE_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.LEGGINGS.getDurability(64))
            .component(DataComponents.UNBREAKABLE, new Unbreakable(false))
    ));
    public static final DeferredHolder<Item, Item> CHLOROPHYTE_BOOTS = ITEMS.register("chlorophyte_boots", () -> new ChlorophyteArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()
            .stacksTo(1)
            .rarity(HLRarities.NATURE_RARITY.getValue())
            .fireResistant()
            .durability(ArmorItem.Type.BOOTS.getDurability(64))
            .component(DataComponents.UNBREAKABLE, new Unbreakable(false))
    ));

    /*
    *** Blocks
     */

    public static final DeferredHolder<Item, Item> CHLOROPHYTE_ORE = ITEMS.register("chlorophyte_ore", () -> new BlockItem((Block)
            TSABlocks.CHLOROPHYTE_ORE.get(), new Item.Properties()
            //.rarity(Rarity.UNCOMMON)
    ));

    public static Collection<DeferredHolder<Item, ? extends Item>> getTSAItems()
    {
        return ITEMS.getEntries();
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
