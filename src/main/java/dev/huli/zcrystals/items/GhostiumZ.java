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
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class GhostiumZ extends SimplePolymerItem {
    PolymerModelData modelData;
    public GhostiumZ(Settings settings, Item polymerItem){
        super(settings, polymerItem);
    }
    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player){
        return super.getPolymerItem(itemStack,player);
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player){
        this.modelData = ZCrystals.ghostiumZModelData;
        return this.modelData.value();
    }


    public ActionResult useOnBlock(ItemUsageContext itemUsageContext) {
        Block block = itemUsageContext.getWorld().getBlockState(itemUsageContext.getBlockPos()).getBlock();
        PlayerEntity player = Objects.requireNonNull(itemUsageContext.getPlayer());
        ItemStack heldStack = Objects.requireNonNull(itemUsageContext.getPlayer()).getMainHandStack();
        ItemStack offHand = Objects.requireNonNull(itemUsageContext.getPlayer()).getOffHandStack();
        if(offHand.getItem().equals(Items.AIR)){
            if(block == Blocks.TARGET){
                heldStack.decrement(1);
                player.giveItemStack(new ItemStack(ZCrystals.MARSHADIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.BRAIN_CORAL_BLOCK){
                heldStack.decrement(1);
                player.giveItemStack(new ItemStack(ZCrystals.MIMIKIUM_Z));
                return ActionResult.SUCCESS;
            }
        }else{
            player.sendMessage(Text.literal("Please, Z-Crystal on main hand and empty offhand!").formatted(Formatting.RED),true);
        }

        return ActionResult.PASS;
    }
}
