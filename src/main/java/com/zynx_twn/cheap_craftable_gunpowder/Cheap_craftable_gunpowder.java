package com.zynx_twn.cheap_craftable_gunpowder;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Cheap_craftable_gunpowder.MODID)
public class Cheap_craftable_gunpowder {
    public static final String MODID = "cheap_craftable_gunpowder";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Cheap_craftable_gunpowder() {
        LOGGER.info("Cheap Craftable Gunpowder loaded");
    }
}
