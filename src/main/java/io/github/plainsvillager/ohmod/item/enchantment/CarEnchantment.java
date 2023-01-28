/*
 * Copyright (c) Github PlainsVillagerTeam
 * SPDX-License-Identifier: MIT License
 */
package io.github.plainsvillager.ohmod.item.enchantment;

import io.github.plainsvillager.ohmod.OhMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OhMod.MODID)
public class CarEnchantment extends Enchantment {
    public CarEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR, new EquipmentSlot[]{EquipmentSlot.FEET});
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinCost(int pLevel) {
        return 1;
    }

    @Override
    public int getMaxCost(int pLevel) {
        return 1;
    }

    @SubscribeEvent
    public static void wear(LivingEquipmentChangeEvent event) {
        LivingEntity livingEntity = event.getEntity();
        var tag = event.getTo().getEnchantmentTags();

    }
}
