package dev.nxkorasu.zcrystals


import com.cobblemon.mod.common.config.CobblemonConfig
import com.cobblemon.mod.common.platform.events.PlatformEvents
import com.cobblemon.mod.common.platform.events.ServerEvent
import com.mojang.brigadier.CommandDispatcher
import dev.nxkorasu.zcrystals.commands.GiveKeyItemCommand
import dev.nxkorasu.zcrystals.config.CobbleTransformationsConfig
import dev.nxkorasu.zcrystals.event.CobbleEvents
import dev.nxkorasu.zcrystals.permissions.CobbleTransformationsPermissions
import dev.nxkorasu.zcrystals.util.BattleItemUtil
import dev.nxkorasu.zcrystals.util.ZCrystals
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.server.MinecraftServer
import net.minecraft.server.command.ServerCommandSource
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.io.File

object ZCrystals {

    var MOD_ID = "zcrystals"
    const val MOD_NAME = "ZCrystals"
    lateinit var SERVER: MinecraftServer
    val log: Logger = LogManager.getLogger(MOD_NAME)
    lateinit var config: CobbleTransformationsConfig
    lateinit var permissions: CobbleTransformationsPermissions

    lateinit var configDir: File

    fun initialize() {
        config = CobbleTransformationsConfig()
        permissions = CobbleTransformationsPermissions()
        reload()
        PolymerResourcePackUtils.markAsRequired()
        PolymerResourcePackUtils.addModAssets(MOD_ID)
        // Z-Crystals
        ZCrystals.requestModel()
        ZCrystals.registerItemGroup()
        // Register Battle Items
        BattleItemUtil.registerServerSideItems()
        //Register Events
        CobbleEvents.register()
        // Load official Cobblemon's config.
        CobblemonConfig()
        CommandRegistrationCallback.EVENT.register(
            CommandRegistrationCallback { dispatcher, _, _ ->
                registerCommands(
                    dispatcher
                )
            }
        )
        PlatformEvents.SERVER_STARTED.subscribe { started: ServerEvent.Started ->
            run {
                SERVER = started.server
                reload()
            }
        }


    }


    private fun reload() {
        initDirs()
        initConfigs()
    }

    private fun initDirs() {
        configDir = File("${FabricLoader.getInstance().configDir}/zcrystals/")
        configDir.mkdir()
    }

    private fun initConfigs() {
        CobbleTransformationsConfig.writeConfig()
        config = CobbleTransformationsConfig.getConfig()!!
        CobbleTransformationsConfig.updateConfig(config)
    }


    private fun registerCommands(
        dispatcher: CommandDispatcher<ServerCommandSource>
    ) {
        GiveKeyItemCommand().register(dispatcher)
    }
}