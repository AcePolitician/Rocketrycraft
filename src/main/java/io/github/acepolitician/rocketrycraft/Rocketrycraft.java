package io.github.acepolitician.rocketrycraft;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Rocketrycraft.MODID)
public class Rocketrycraft {
    public static final String MODID = "rocketrycraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Rocketrycraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
