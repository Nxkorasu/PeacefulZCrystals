package dev.nxkorasu.zcrystals.fabric

import dev.nxkorasu.zcrystals.ZCrystals
import net.fabricmc.api.ModInitializer

class CobblemonFabric : ModInitializer {
    override fun onInitialize() {
        System.out.println("Fabric Mod init")
        ZCrystals.initialize()
    }
}
