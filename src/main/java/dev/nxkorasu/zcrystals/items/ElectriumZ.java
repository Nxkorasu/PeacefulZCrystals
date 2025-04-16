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

import static dev.nxkorasu.zcrystals.util.ZCrystals.ELECTRIUM_Z;

public class ElectriumZ extends SimplePolymerItem {

    PolymerModelData modelData;
    public ElectriumZ(Settings settings, Item polymerItem){
        super(settings, polymerItem);
    }
    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player){
        return super.getPolymerItem(itemStack,player);
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player){
        this.modelData = ZCrystals.electriumZModelData;
        return this.modelData.value();
    }
    private void RemoveItem(ItemUsageContext itemUsageContext){
        ItemStack mainHand = Objects.requireNonNull(itemUsageContext.getPlayer()).getMainHandStack();
        ItemStack offHand = Objects.requireNonNull(itemUsageContext.getPlayer()).getOffHandStack();
        if(!offHand.getItem().equals(ELECTRIUM_Z)){
            mainHand.decrement(1);
        }else{
            offHand.decrement(1);
        }
    }
    public ActionResult useOnBlock(ItemUsageContext itemUsageContext) {
        Block block = itemUsageContext.getWorld().getBlockState(itemUsageContext.getBlockPos()).getBlock();
        PlayerEntity player = Objects.requireNonNull(itemUsageContext.getPlayer());
        ItemStack heldStack = Objects.requireNonNull(itemUsageContext.getPlayer()).getMainHandStack();
        ItemStack offHand = Objects.requireNonNull(itemUsageContext.getPlayer()).getOffHandStack();
        if(!offHand.getItem().equals(ELECTRIUM_Z) || !heldStack.getItem().equals(ELECTRIUM_Z)){
            if(block == Blocks.LIGHTNING_ROD){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.PIKANIUM_Z));
                return ActionResult.SUCCESS;
            }
            if(block == Blocks.END_GATEWAY){
                RemoveItem(itemUsageContext);
                player.giveItemStack(new ItemStack(ZCrystals.ALORAICHIUM_Z));
                return ActionResult.SUCCESS;
            }
        }else{
            player.sendMessage(Text.literal("An Error Occurred, please hold only the Empty Z Crystal").formatted(Formatting.RED),true);
        }
        return ActionResult.PASS;
    }
}
