package dev.nxkorasu.zcrystals.items;

import com.cobblemon.mod.common.Cobblemon;
import dev.nxkorasu.zcrystals.util.ZCrystals;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import static dev.nxkorasu.zcrystals.util.ZCrystals.BLANK_Z_CRYSTAL;
import static dev.nxkorasu.zcrystals.util.ZCrystals.TERA_ORB;

public class TeraOrb extends SimplePolymerItem {
    PolymerModelData modelData;
    public TeraOrb(Settings settings, Item polymerItem) {
        super(settings, polymerItem);
    }
    boolean test = false;
    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player){
        return super.getPolymerItem(itemStack,player);
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player){
        this.modelData = ZCrystals.teraorbModelData;
        return this.modelData.value();
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack mainHand = Objects.requireNonNull(playerEntity.getMainHandStack());
        ItemStack offHand = Objects.requireNonNull(playerEntity.getOffHandStack());
        if(!offHand.getItem().equals(TERA_ORB)){
            mainHand.decrement(1);
        }else{
            offHand.decrement(1);
        }
            return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
