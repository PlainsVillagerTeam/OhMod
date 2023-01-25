/*
 * Copyright (c) Github PlainsVillagerTeam
 * SPDX-License-Identifier: MIT License
 */
package github.plainsvillager.ohmod.item;

import github.plainsvillager.ohmod.OhMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OhMod.MODID)
public class CarBootItem extends ArmorItem {
    public CarBootItem() {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot pSlot) {
                return 114;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot pSlot) {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 0;
            }

            @Override
            public SoundEvent getEquipSound() {
                return null;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return null;
            }

            @Override
            public String getName() {
                return "car_boot";
            }

            @Override
            public float getToughness() {
                return 0;
            }

            @Override
            public float getKnockbackResistance() {
                return 0;
            }
        }
        , EquipmentSlot.FEET, new Properties().stacksTo(1));
    }

    // 打上了 SubscribeEvent 注解
    // 监听：生物实体装备栏改变事件
    @SubscribeEvent
    public static void wear(LivingEquipmentChangeEvent event){
        if(event.getTo().equals(ModItemReg.CAR_BOOT.get().getDefaultInstance(),false) && event.getSlot().isArmor()){
            event.getEntity().addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 114, 1, true, true));
        }
    }

}
