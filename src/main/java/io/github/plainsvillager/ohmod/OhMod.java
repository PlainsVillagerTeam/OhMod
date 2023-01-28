/*
 * Copyright (c) Github PlainsVillagerTeam
 * SPDX-License-Identifier: MIT License
 */
package io.github.plainsvillager.ohmod;

import io.github.plainsvillager.ohmod.item.ModItemReg;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

@Mod(OhMod.MODID)
@Mod.EventBusSubscriber(modid = OhMod.MODID)
public class OhMod {

    public static final String MODID = "ohmod";

    public OhMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        ModItemReg.ITEMS.register(modEventBus);
        ModItemReg.ModEnchantmentsReg.ENCHANTMENTS.register(modEventBus);

        //MinecraftForge.EVENT_BUS.register(new CarEnchantment());

        // 24个，事雪球（悲
        ObfuscationReflectionHelper.setPrivateValue(Item.class, Items.SNOWBALL, 24, "f_41370_");

    }
}
