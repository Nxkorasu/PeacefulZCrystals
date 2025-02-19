package dev.nxkorasu.zcrystals.commands;


import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.battles.*;
import com.cobblemon.mod.common.battles.pokemon.BattlePokemon;
import com.cobblemon.mod.common.client.gui.battle.subscreen.BattleActionSelection;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.particle.CobblemonParticles;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import dev.nxkorasu.zcrystals.ZCrystals;
import dev.nxkorasu.zcrystals.permissions.CobbleTransformationsPermissions;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.Collections;

import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

public class GiveKeyItemCommand {
    /**
     * Registers the command with the command dispatcher.
     *
     * @param dispatcher - the command dispatcher.
     */
    public void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        // Set up command.
        dispatcher.register(
                literal("keyitem")
                        .requires(src -> CobbleTransformationsPermissions.checkPermission(src,
                                ZCrystals.permissions.Z_RING_PERMISSION_LEVEL))
                        .then(argument("player", EntityArgumentType.player())
                        .then(argument("keyItem", StringArgumentType.string())
                                .suggests((((context, builder) -> {
                                    builder.suggest("ZRing");
                                    return builder.buildFuture();
                                })))
                                .executes(this::execute)
                        )
                        )
        );

    }



    private int execute(CommandContext<ServerCommandSource> ctx) throws CommandSyntaxException {
        String keyItem = StringArgumentType.getString(ctx,"keyItem");
        ServerPlayerEntity player = EntityArgumentType.getPlayer(ctx,"player");
        if (player != null) {
            switch (keyItem){
                case "ZRing":
                    Cobblemon.playerDataManager.getGenericData(player.getUuid()).setKeyItems(Collections.singleton(Identifier.of("cobblemon","z_ring")));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + keyItem);

            }

        }
        return 1;
    }

}
