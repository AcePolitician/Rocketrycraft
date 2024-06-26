package io.github.acepolitician.rocketrycraft.block;

import io.github.acepolitician.rocketrycraft.Rocketrycraft;
import io.github.acepolitician.rocketrycraft.block.custom.MetalCompressorBlock;
import io.github.acepolitician.rocketrycraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> __BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Rocketrycraft.MODID);

    public static final RegistryObject<Block> METAL_COMPRESSOR = registerBlock("metal_compressor", () -> new MetalCompressorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(6.0F, 7.0F)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> registeredBlock = __BLOCKS.register(name, block);
        registerBlockItem(name, registeredBlock);
        return registeredBlock;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.__ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        __BLOCKS.register(eventBus);
    }
}
