package net.ceevyte.voidroot_echo.item.custom;

import net.ceevyte.voidroot_echo.block.ModBlocks;
import net.ceevyte.voidroot_echo.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.Map;

public class SauceCanItem extends Item {
    public SauceCanItem(Settings settings) {
        super(settings);
    }
}
