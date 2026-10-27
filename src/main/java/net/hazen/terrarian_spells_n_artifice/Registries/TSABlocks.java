package net.hazen.terrarian_spells_n_artifice.Registries;

import net.hazen.terrarian_spells_n_artifice.TerrarianSpellsNArtifice;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TSABlocks {
        public static final DeferredRegister.Blocks BLOCKS =
                DeferredRegister.createBlocks(TerrarianSpellsNArtifice.MOD_ID);

        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, TerrarianSpellsNArtifice.MOD_ID);


        //Chlorophyte Ore
        public static final DeferredBlock<Block> CHLOROPHYTE_ORE = registerBlock("chlorophyte_ore",
                () -> new DropExperienceBlock(UniformInt.of(2, 4),
                        BlockBehaviour
                                .Properties.of()
                                .strength(3f)
                                .requiresCorrectToolForDrops()
                                .sound(SoundType.STONE)
                ));


        private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
                DeferredBlock<T> toReturn = BLOCKS.register(name, block);
                return toReturn;
        }

        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }
}