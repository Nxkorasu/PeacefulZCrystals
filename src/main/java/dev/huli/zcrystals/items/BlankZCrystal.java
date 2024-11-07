package dev.huli.zcrystals.items;

import dev.huli.zcrystals.util.ZCrystals;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class BlankZCrystal extends SimplePolymerItem {
    PolymerModelData modelData;
    public BlankZCrystal(Settings settings, Item polymerItem){
        super(settings,polymerItem);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext itemUsageContext) {
        Block block = itemUsageContext.getWorld().getBlockState(itemUsageContext.getBlockPos()).getBlock();
        PlayerEntity player = Objects.requireNonNull(itemUsageContext.getPlayer());
        ItemStack heldStack = Objects.requireNonNull(itemUsageContext.getPlayer()).getMainHandStack();

        if(block == Blocks.WHEAT){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.GRASSIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.MAGMA_BLOCK){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.FIRIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.BEEHIVE){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.BUGINIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.POWDER_SNOW){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.ICIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.REINFORCED_DEEPSLATE){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.DARKINIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.BEDROCK){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.ROCKIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.DRAGON_HEAD || block == Blocks.DRAGON_WALL_HEAD){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.DRAGONIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.COPPER_BLOCK){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.ELECTRIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.MUD){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.GROUNDIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.POTATOES){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.POISONIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.SOUL_SAND){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.GHOSTIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.BAMBOO_BLOCK){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.FIGHTINIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.WET_SPONGE){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.WATERIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.END_GATEWAY){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.PSYCHIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.SHULKER_BOX){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.FLYINIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.AMETHYST_BLOCK){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.FAIRIUM_Z));
            return ActionResult.SUCCESS;
        }
        if(block == Blocks.IRON_BLOCK){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.STEELIUM_Z));
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player){
        return super.getPolymerItem(itemStack,player);
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player){
        this.modelData = ZCrystals.blankZCrystalModelData;
        return this.modelData.value();
    }
}
