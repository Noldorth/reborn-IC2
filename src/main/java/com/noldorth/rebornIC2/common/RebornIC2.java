package com.noldorth.rebornIC2.common;

import com.noldorth.rebornIC2.common.init.RebornIC2Blocks;
import com.noldorth.rebornIC2.common.init.RebornIC2Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RebornIC2.MODID)
public class RebornIC2 {
    public static final String MODID = "rebornic2";

    private void setup(FMLCommonSetupEvent e) {

    }

    public RebornIC2() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        RebornIC2Items.ITEMS.register(bus);
        RebornIC2Blocks.BLOCKS.register(bus);
    }

    private void clientSetup(FMLClientSetupEvent e) {

    }
}
