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

public class FairiumZ extends SimplePolymerItem {
    PolymerModelData modelData;

    public FairiumZ(Settings settings, Item polymerItem) {
        super(settings, polymerItem);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return super.getPolymerItem(itemStack, player);
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        this.modelData = ZCrystals.fairiumZModelData;
        return this.modelData.value();
    }


    public ActionResult useOnBlock(ItemUsageContext itemUsageContext) {
        Block block = itemUsageContext.getWorld().getBlockState(itemUsageContext.getBlockPos()).getBlock();
        PlayerEntity player = Objects.requireNonNull(itemUsageContext.getPlayer());
        ItemStack heldStack = Objects.requireNonNull(itemUsageContext.getPlayer()).getMainHandStack();
        if(block == Blocks.BRAIN_CORAL_BLOCK){
            heldStack.decrement(1);
            player.giveItemStack(new ItemStack(ZCrystals.TAPUNIUM_Z));
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}
