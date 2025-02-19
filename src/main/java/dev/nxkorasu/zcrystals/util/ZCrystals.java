package dev.nxkorasu.zcrystals.util;

import dev.nxkorasu.zcrystals.items.*;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ZCrystals {
    static final String MOD_ID = dev.nxkorasu.zcrystals.ZCrystals.INSTANCE.getMOD_ID();

    public static PolymerModelData aloraichiumZModelData, buginiumZModelData, darkiniumZModelData, decidiumZModelData,
            dragoniumZModelData, eeviumZModelData, electriumZModelData, fairiumZModelData, fightiniumZModelData, firiumZModelData,
            flyiniumZModelData, ghostiumZModelData, grassiumZModelData, groundiumZModelData, iciumZModelData, inciniumZModelData, kommoniumZModelData,
            lunaliumZModelData,lycaniumZModelData,marshadiumZModelData, mewniumZModelData, mimikiumZModelData, normaliumZModelData,
            pikaniumZModelData,pikashuniumZModelData, poisoniumZModelData, primariumZModelData, psychiumZModelData, rockiumZModelData, snorliumZModelData,
            solganiumZModelData, steeliumZModelData, tapuniumZModelData, ultranecroziumZModelData, wateriumZModelData, blankZCrystalModelData, zringModelData, boosterenergyModelData, teraorbModelData;

    public static final BlankZCrystal BLANK_Z_CRYSTAL = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "blank_z_crystal"),
            new BlankZCrystal(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final ZRing Z_RING = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "z_ring"),
            new ZRing(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final TeraOrb TERA_ORB = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "tera_orb"),
            new TeraOrb(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));

    public static final AloraichiumZ ALORAICHIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "aloraichium_z"),
            new AloraichiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final BuginiumZ BUGINIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "buginium_z"),
            new BuginiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final DarkiniumZ DARKINIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "darkinium_z"),
            new DarkiniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final DecidiumZ DECIDIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "decidium_z"),
            new DecidiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final DragoniumZ DRAGONIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "dragonium_z"),
            new DragoniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final EeviumZ EEVIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "eevium_z"),
            new EeviumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final ElectriumZ ELECTRIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "electrium_z"),
            new ElectriumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final FairiumZ FAIRIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "fairium_z"),
            new FairiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final FightiniumZ FIGHTINIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "fightinium_z"),
            new FightiniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final FiriumZ FIRIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "firium_z"),
            new FiriumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final FlyiniumZ FLYINIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "flyinium_z"),
            new FlyiniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final GhostiumZ GHOSTIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "ghostium_z"),
            new GhostiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final GrassiumZ GRASSIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "grassium_z"),
            new GrassiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final GroundiumZ GROUNDIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "groundium_z"),
            new GroundiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final IciumZ ICIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "icium_z"),
            new IciumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final InciniumZ INCINIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "incinium_z"),
            new InciniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final KommoniumZ KOMMONIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "kommonium_z"),
            new KommoniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final LunaliumZ LUNALIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "lunalium_z"),
            new LunaliumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final LycaniumZ LYCANIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "lycanium_z"),
            new LycaniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final MarshadiumZ MARSHADIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "marshadium_z"),
            new MarshadiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final MewniumZ MEWNIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "mewnium_z"),
            new MewniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final MimikiumZ MIMIKIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "mimikium_z"),
            new MimikiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final NormaliumZ NORMALIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "normalium_z"),
            new NormaliumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final PikaniumZ PIKANIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "pikanium_z"),
            new PikaniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final PikashuniumZ PIKASHUNIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "pikashunium_z"),
            new PikashuniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final PoisoniumZ POISONIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "poisonium_z"),
            new PoisoniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final PrimariumZ PRIMARIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "primarium_z"),
            new PrimariumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final PsychiumZ PSYCHIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "psychium_z"),
            new PsychiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final RockiumZ ROCKIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "rockium_z"),
            new RockiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final SnorliumZ SNORLIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "snorlium_z"),
            new SnorliumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final SolganiumZ SOLGANIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "solganium_z"),
            new SolganiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final SteeliumZ STEELIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "steelium_z"),
            new SteeliumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final TapuniumZ TAPUNIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "tapunium_z"),
            new TapuniumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final UltranecrozmiumZ ULTRANECROZIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "ultranecrozium_z"),
            new UltranecrozmiumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final WateriumZ WATERIUM_Z = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "waterium_z"),
            new WateriumZ(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));
    public static final BoosterEnergy BOOSTER_ENERGY = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "booster_energy"),
            new BoosterEnergy(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Items.EMERALD));


    public static void requestModel(){
        blankZCrystalModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/blank_z_crystal"));
        zringModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/z_ring"));
        aloraichiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/aloraichium_z"));
        buginiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/buginium_z"));
        darkiniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/darkinium_z"));
        decidiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/decidium_z"));
        dragoniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/dragonium_z"));
        eeviumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/eevium_z"));
        electriumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/electrium_z"));
        fairiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/fairium_z"));
        fightiniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/fightinium_z"));
        firiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/firium_z"));
        flyiniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/flyinium_z"));
        ghostiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/ghostium_z"));
        grassiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/grassium_z"));
        groundiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/groundium_z"));
        iciumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/icium_z"));
        inciniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/incinium_z"));
        kommoniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/kommonium_z"));
        lunaliumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/lunalium_z"));
        lycaniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/lycanium_z"));
        marshadiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/marshadium_z"));
        mewniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/mewnium_z"));
        mimikiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/mimikium_z"));
        normaliumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/normalium_z"));
        pikaniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/pikanium_z"));
        pikashuniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/pikashunium_z"));
        poisoniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/poisonium_z"));
        primariumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/primarium_z"));
        psychiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/psychium_z"));
        rockiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/rockium_z"));
        snorliumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/snorlium_z"));
        solganiumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/solganium_z"));
        steeliumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/steelium_z"));
        tapuniumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/tapunium_z"));
        ultranecroziumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/ultranecrozium_z"));
        wateriumZModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/waterium_z"));
        boosterenergyModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/booster_energy"));
        teraorbModelData = PolymerResourcePackUtils.requestModel(Items.EMERALD, Identifier.of(MOD_ID, "item/tera_orb"));

    }
    public static final ItemGroup Z_CRYSTALS = FabricItemGroup.builder()
            .icon(ULTRANECROZIUM_Z::getDefaultStack)
            .displayName(Text.translatable("zcrystals.itemGroup.zcrystals"))
            .entries(((displayContext, entries) -> {
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
                entries.add(TERA_ORB);
                entries.add(BOOSTER_ENERGY);
            }))
            .build();

    public static void registerItemGroup(){
        Identifier test;
        Registry.register(Registries.ITEM_GROUP,test = Identifier.of(MOD_ID, "zcrystals"), Z_CRYSTALS);
    }
}
