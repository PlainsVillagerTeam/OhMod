/*
 * Copyright (c) Github PlainsVillagerTeam
 * SPDX-License-Identifier: MIT License
 */
package github.plainsvillager.ohmod.item;

import github.plainsvillager.ohmod.OhMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OhMod.MODID);

    public static final RegistryObject<Item> CAR_BOOT = ITEMS.register("car_boot", CarBootItem::new);

//    public static class ModEnchantmentsReg {
//        public static final Enchantment CAR_ENCHANTMENT = new CarEnchantment();
//
//        public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, OhMod.MODID);
//
//    }
}
