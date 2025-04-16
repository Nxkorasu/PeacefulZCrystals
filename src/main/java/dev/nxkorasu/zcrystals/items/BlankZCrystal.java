package dev.nxkorasu.zcrystals.items;

import dev.nxkorasu.zcrystals.util.ZCrystals;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import static dev.nxkorasu.zcrystals.util.ZCrystals.BLANK_Z_CRYSTAL;

public class BlankZCrystal extends SimplePolymerItem {
    PolymerModelData modelData;
    public BlankZCrystal(Settings settings, Item polymerItem){
        super(settings,polymerItem);
    }
    private void RemoveItem(ItemUsageContext itemUsageContext){
        ItemStack mainHand = Objects.requireNonNull(itemUsageContext.getPlayer()).getMainHandStack();
        ItemStack offHand = Objects.requireNonNull(itemUsageContext.getPlayer()).getOffHandStack();
        if(!offHand.getItem().equals(BLANK_Z_CRYSTAL)){
            mainHand.decrement(1);
        }else{
            offHand.decrement(1);
        }
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext itemUsageContext) {
        Block block = itemUsageContext.getWorld().getBlockState(itemUsageContext.getBlockPos()).getBlock();
        PlayerEntity player = Objects.requireNonNull(itemUsageContext.getPlayer());
        ItemStack heldStack = Objects.requireNonNull(itemUsageContext.getPlayer()).getMainHandStack();
        ItemStack offHand = Objects.requireNonNull(itemUsageContext.getPlayer()).getOffHandStack();
        if(!offHand.getItem().equals(BLANK_Z_CRYSTAL) || !heldStack.getItem().equals(BLANK_Z_CRYSTAL)){
            if(block == Blocks.WHEAT){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.GRASSIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.MAGMA_BLOCK){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.FIRIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.BEEHIVE){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.BUGINIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.POWDER_SNOW){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.ICIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.REINFORCED_DEEPSLATE){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.DARKINIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.BEDROCK){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.ROCKIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.ENDER_CHEST){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.DRAGONIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.COPPER_BLOCK){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.ELECTRIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.MUD){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.GROUNDIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.POTATOES){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.POISONIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.SOUL_SAND){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.GHOSTIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.BAMBOO_BLOCK){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.FIGHTINIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.WET_SPONGE){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.WATERIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.ENCHANTING_TABLE){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.PSYCHIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.GLASS && player.getBlockY() >= 100){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.FLYINIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.AMETHYST_BLOCK){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.FAIRIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.IRON_BLOCK){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.STEELIUM_Z));
                return ActionResult.SUCCESS;
            }
        }else{
            player.sendMessage(Text.literal("An Error Occurred, please hold only the Empty Z Crystal").formatted(Formatting.RED),true);
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
