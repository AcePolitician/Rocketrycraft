package io.github.acepolitician.rocketrycraft.item;

import io.github.acepolitician.rocketrycraft.Rocketrycraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> __ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rocketrycraft.MODID);

    public static final RegistryObject<Item> STEEL_INGOT = __ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PLATE = __ITEMS.register("steel_plate", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        __ITEMS.register(eventBus);
    }
}
