package io.github.acepolitician.rocketrycraft.item;

import io.github.acepolitician.rocketrycraft.Rocketrycraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Rocketrycraft.MODID);

    public static final RegistryObject<CreativeModeTab> ROCKETRYCRAFT_BLOCKS = CREATIVE_MODE_TABS.register("rocketrycraft_blocks",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(net.minecraft.world.level.block.Blocks.AIR))
                    .title(Component.translatable("itemGroup.rocketrycraft.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ROCKETRYCRAFT_ITEMS = CREATIVE_MODE_TABS.register("rocketrycraft_items",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("itemGroup.rocketrycraft.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STEEL_INGOT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
