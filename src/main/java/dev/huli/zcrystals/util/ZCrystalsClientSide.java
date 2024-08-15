package dev.huli.zcrystals.util;

import dev.huli.zcrystals.ZCrystals;
import dev.huli.zcrystals.items.clientside.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ZCrystalsClientSide {
    static final String MOD_ID = ZCrystals.INSTANCE.getMOD_ID();


    public static final BlankZCrystal BLANK_Z_CRYSTAL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "blank_z_crystal"),
            new BlankZCrystal(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE).fireproof()));
    public static final ZRing Z_RING = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "z_ring"),
            new ZRing(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE).fireproof()));

    public static final AloraichiumZ ALORAICHIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "aloraichium_z"),
            new AloraichiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final BuginiumZ BUGINIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "buginium_z"),
            new BuginiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final DarkiniumZ DARKINIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "darkinium_z"),
            new DarkiniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final DecidiumZ DECIDIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "decidium_z"),
            new DecidiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final DragoniumZ DRAGONIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dragonium_z"),
            new DragoniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final EeviumZ EEVIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "eevium_z"),
            new EeviumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final ElectriumZ ELECTRIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "electrium_z"),
            new ElectriumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final FairiumZ FAIRIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "fairium_z"),
            new FairiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final FightiniumZ FIGHTINIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "fightinium_z"),
            new FightiniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final FiriumZ FIRIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "firium_z"),
            new FiriumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final FlyiniumZ FLYINIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "flyinium_z"),
            new FlyiniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final GhostiumZ GHOSTIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ghostium_z"),
            new GhostiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final GrassiumZ GRASSIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "grassium_z"),
            new GrassiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final GroundiumZ GROUNDIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "groundium_z"),
            new GroundiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final IciumZ ICIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "icium_z"),
            new IciumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final InciniumZ INCINIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "incinium_z"),
            new InciniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final KommoniumZ KOMMONIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "kommonium_z"),
            new KommoniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final LunaliumZ LUNALIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunalium_z"),
            new LunaliumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final LycaniumZ LYCANIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lycanium_z"),
            new LycaniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final MarshadiumZ MARSHADIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "marshadium_z"),
            new MarshadiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final MewniumZ MEWNIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "mewnium_z"),
            new MewniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final MimikiumZ MIMIKIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "mimikium_z"),
            new MimikiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final NormaliumZ NORMALIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "normalium_z"),
            new NormaliumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final PikaniumZ PIKANIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "pikanium_z"),
            new PikaniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final PikashuniumZ PIKASHUNIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "pikashunium_z"),
            new PikashuniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final PoisoniumZ POISONIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "poisonium_z"),
            new PoisoniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final PrimariumZ PRIMARIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "primarium_z"),
            new PrimariumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final PsychiumZ PSYCHIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "psychium_z"),
            new PsychiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final RockiumZ ROCKIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rockium_z"),
            new RockiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final SnorliumZ SNORLIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "snorlium_z"),
            new SnorliumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final SolganiumZ SOLGANIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "solganium_z"),
            new SolganiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final SteeliumZ STEELIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "steelium_z"),
            new SteeliumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final TapuniumZ TAPUNIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "tapunium_z"),
            new TapuniumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final UltranecrozmiumZ ULTRANECROZIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ultranecrozium_z"),
            new UltranecrozmiumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final WateriumZ WATERIUM_Z = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "waterium_z"),
            new WateriumZ(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final BoosterEnergy BOOSTER_ENERGY = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "booster_energy"),
            new BoosterEnergy(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final ItemGroup Z_CRYSTALS = FabricItemGroup.builder()
            .icon(ULTRANECROZIUM_Z::getDefaultStack)
            .displayName(Text.translatable("zcrystals.itemGroup.zcrystals"))
            .entries(((displayContext, entries) -> {
                entries.add(BLANK_Z_CRYSTAL);
                entries.add(ALORAICHIUM_Z);
                entries.add(BUGINIUM_Z);
                entries.add(DARKINIUM_Z);
                entries.add(DECIDIUM_Z);
                entries.add(DRAGONIUM_Z);
                entries.add(EEVIUM_Z);
                entries.add(ELECTRIUM_Z);
                entries.add(FAIRIUM_Z);
                entries.add(FIGHTINIUM_Z);
                entries.add(FIRIUM_Z);
                entries.add(FLYINIUM_Z);
                entries.add(GHOSTIUM_Z);
                entries.add(GRASSIUM_Z);
                entries.add(GROUNDIUM_Z);
                entries.add(ICIUM_Z);
                entries.add(INCINIUM_Z);
                entries.add(KOMMONIUM_Z);
                entries.add(LUNALIUM_Z);
                entries.add(LYCANIUM_Z);
                entries.add(MARSHADIUM_Z);
                entries.add(MEWNIUM_Z);
                entries.add(MIMIKIUM_Z);
                entries.add(NORMALIUM_Z);
                entries.add(PIKANIUM_Z);
                entries.add(PIKASHUNIUM_Z);
                entries.add(POISONIUM_Z);
                entries.add(PRIMARIUM_Z);
                entries.add(PSYCHIUM_Z);
                entries.add(ROCKIUM_Z);
                entries.add(SNORLIUM_Z);
                entries.add(SOLGANIUM_Z);
                entries.add(STEELIUM_Z);
                entries.add(TAPUNIUM_Z);
                entries.add(ULTRANECROZIUM_Z);
                entries.add(WATERIUM_Z);
                entries.add(BLANK_Z_CRYSTAL);
                entries.add(Z_RING);
                entries.add(BOOSTER_ENERGY);
            }))
            .build();

}
