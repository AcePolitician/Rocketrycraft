package io.github.acepolitician.rocketrycraft.block.entity;

import io.github.acepolitician.rocketrycraft.Rocketrycraft;
import io.github.acepolitician.rocketrycraft.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Rocketrycraft.MODID);

    public static final RegistryObject<BlockEntityType<MetalCompressorBlockEntity>> METAL_COMPRESSOR = BLOCK_ENTITIES.register("metal_compressor", () -> BlockEntityType.Builder.of(MetalCompressorBlockEntity::new, ModBlocks.METAL_COMPRESSOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
