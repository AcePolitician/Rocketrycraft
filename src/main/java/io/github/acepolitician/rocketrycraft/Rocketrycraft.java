package io.github.acepolitician.rocketrycraft;

import com.mojang.logging.LogUtils;
import io.github.acepolitician.rocketrycraft.block.ModBlocks;
import io.github.acepolitician.rocketrycraft.block.entity.ModBlockEntities;
import io.github.acepolitician.rocketrycraft.item.ModCreativeModeTabs;
import io.github.acepolitician.rocketrycraft.item.ModItems;
import io.github.acepolitician.rocketrycraft.screen.MetalCompressorScreen;
import io.github.acepolitician.rocketrycraft.screen.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Rocketrycraft.MODID)
public class Rocketrycraft {
    public static final String MODID = "rocketrycraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Rocketrycraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(eventBus);

        ModBlocks.register(eventBus);
        ModItems.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.METAL_COMPRESSOR.get(), MetalCompressorScreen::new);
        }
    }
}
