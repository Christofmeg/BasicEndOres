package com.cscot.basicendores.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenerationConfig
{
    //Variables for Ore Generation

    //Emerald Settings
    public static ForgeConfigSpec.IntValue emeraldVeinSize;
    public static ForgeConfigSpec.IntValue emeraldPerChunk;
    public static ForgeConfigSpec.IntValue emeraldMinHeight;
    public static ForgeConfigSpec.IntValue emeraldMaxHeight;

    //Diamond Settings
    public static ForgeConfigSpec.IntValue diamondVeinSize;
    public static ForgeConfigSpec.IntValue diamondPerChunk;
    public static ForgeConfigSpec.IntValue diamondMinHeight;
    public static ForgeConfigSpec.IntValue diamondMaxHeight;

    //Redstone Settings
    public static ForgeConfigSpec.IntValue redstoneVeinSize;
    public static ForgeConfigSpec.IntValue redstonePerChunk;
    public static ForgeConfigSpec.IntValue redstoneMinHeight;
    public static ForgeConfigSpec.IntValue redstoneMaxHeight;

    //Lapis Settings
    public static ForgeConfigSpec.IntValue lapisVeinSize;
    public static ForgeConfigSpec.IntValue lapisPerChunk;
    public static ForgeConfigSpec.IntValue lapisMinHeight;
    public static ForgeConfigSpec.IntValue lapisMaxHeight;

    //Coal Settings
    public static ForgeConfigSpec.IntValue coalVeinSize;
    public static ForgeConfigSpec.IntValue coalPerChunk;
    public static ForgeConfigSpec.IntValue coalMinHeight;
    public static ForgeConfigSpec.IntValue coalMaxHeight;

    //Gold Settings
    public static ForgeConfigSpec.IntValue goldVeinSize;
    public static ForgeConfigSpec.IntValue goldPerChunk;
    public static ForgeConfigSpec.IntValue goldMinHeight;
    public static ForgeConfigSpec.IntValue goldMaxHeight;

    //Silver Settings
    public static ForgeConfigSpec.IntValue silverVeinSize;
    public static ForgeConfigSpec.IntValue silverPerChunk;
    public static ForgeConfigSpec.IntValue silverMinHeight;
    public static ForgeConfigSpec.IntValue silverMaxHeight;
    
    //Iron Settings
    public static ForgeConfigSpec.IntValue ironVeinSize;
    public static ForgeConfigSpec.IntValue ironPerChunk;
    public static ForgeConfigSpec.IntValue ironMinHeight;
    public static ForgeConfigSpec.IntValue ironMaxHeight;

    //Lead Settings
    public static ForgeConfigSpec.IntValue leadVeinSize;
    public static ForgeConfigSpec.IntValue leadPerChunk;
    public static ForgeConfigSpec.IntValue leadMinHeight;
    public static ForgeConfigSpec.IntValue leadMaxHeight;

    //Nickel Settings
    public static ForgeConfigSpec.IntValue nickelVeinSize;
    public static ForgeConfigSpec.IntValue nickelPerChunk;
    public static ForgeConfigSpec.IntValue nickelMinHeight;
    public static ForgeConfigSpec.IntValue nickelMaxHeight;

    //Copper Settings
    public static ForgeConfigSpec.IntValue copperVeinSize;
    public static ForgeConfigSpec.IntValue copperPerChunk;
    public static ForgeConfigSpec.IntValue copperMinHeight;
    public static ForgeConfigSpec.IntValue copperMaxHeight;

    //Aluminum Settings
    public static ForgeConfigSpec.IntValue aluminumVeinSize;
    public static ForgeConfigSpec.IntValue aluminumPerChunk;
    public static ForgeConfigSpec.IntValue aluminumMinHeight;
    public static ForgeConfigSpec.IntValue aluminumMaxHeight;

    //Tin Settings
    public static ForgeConfigSpec.IntValue tinVeinSize;
    public static ForgeConfigSpec.IntValue tinPerChunk;
    public static ForgeConfigSpec.IntValue tinMinHeight;
    public static ForgeConfigSpec.IntValue tinMaxHeight;

    //Osmium Settings
    public static ForgeConfigSpec.IntValue osmiumVeinSize;
    public static ForgeConfigSpec.IntValue osmiumPerChunk;
    public static ForgeConfigSpec.IntValue osmiumMinHeight;
    public static ForgeConfigSpec.IntValue osmiumMaxHeight;

    //Uranium Settings
    public static ForgeConfigSpec.IntValue uraniumVeinSize;
    public static ForgeConfigSpec.IntValue uraniumPerChunk;
    public static ForgeConfigSpec.IntValue uraniumMinHeight;
    public static ForgeConfigSpec.IntValue uraniumMaxHeight;

    //Zinc Settings
    public static ForgeConfigSpec.IntValue zincVeinSize;
    public static ForgeConfigSpec.IntValue zincPerChunk;
    public static ForgeConfigSpec.IntValue zincMinHeight;
    public static ForgeConfigSpec.IntValue zincMaxHeight;

    //Ore Generation Toggle
    public static ForgeConfigSpec.BooleanValue emeraldGeneration;
    public static ForgeConfigSpec.BooleanValue diamondGeneration;
    public static ForgeConfigSpec.BooleanValue redstoneGeneration;
    public static ForgeConfigSpec.BooleanValue lapisGeneration;
    public static ForgeConfigSpec.BooleanValue coalGeneration;
    public static ForgeConfigSpec.BooleanValue goldGeneration;
    public static ForgeConfigSpec.BooleanValue silverGeneration;
    public static ForgeConfigSpec.BooleanValue ironGeneration;
    public static ForgeConfigSpec.BooleanValue leadGeneration;
    public static ForgeConfigSpec.BooleanValue nickelGeneration;
    public static ForgeConfigSpec.BooleanValue copperGeneration;
    public static ForgeConfigSpec.BooleanValue aluminumGeneration;
    public static ForgeConfigSpec.BooleanValue tinGeneration;
    public static ForgeConfigSpec.BooleanValue osmiumGeneration;
    public static ForgeConfigSpec.BooleanValue uraniumGeneration;
    public static ForgeConfigSpec.BooleanValue zincGeneration;


    public static void Init(ForgeConfigSpec.Builder builder) {

        //Emerald Ore Values
        emeraldVeinSize = builder
                .comment("Set Max Emerald Vein Size (Default = 4)")
                .defineInRange("ore_generation.emerald.emeraldVeinSize", 4, 0, 36);
        emeraldPerChunk = builder
                .comment("Set Emerald Spawn Chance (Default = 2)")
                .defineInRange("ore_generation.emerald.emeraldChance", 2, 0, 32);
        emeraldMinHeight = builder
                .comment("Set Emerald Min Spawn Height (Default = 25)")
                .defineInRange("ore_generation.emerald.emeraldMinHeight", 25, 12, 75);
        emeraldMaxHeight = builder
                .comment("Set Emerald Max Spawn Height (Default = 55)")
                .defineInRange("ore_generation.emerald.emeraldMaxHeight", 55, 12, 75);

        //Diamond Ore Values
        diamondVeinSize = builder
                .comment("Set Max Diamond Vein Size (Default = 8)")
                .defineInRange("ore_generation.diamond.diamondVeinSize", 8, 0, 36);
        diamondPerChunk = builder
                .comment("Set Diamond Spawn Chance (Default = 2)")
                .defineInRange("ore_generation.diamond.diamondChance", 2, 0, 32);
        diamondMinHeight = builder
                .comment("Set Diamond Min Spawn Height (Default = 35)")
                .defineInRange("ore_generation.diamond.diamondMinHeight", 35, 12, 75);
        diamondMaxHeight = builder
                .comment("Set Diamond Max Spawn Height (Default = 65)")
                .defineInRange("ore_generation.diamond.diamondMaxHeight", 65, 12, 75);

        //Redstone Ore Values
        redstoneVeinSize = builder
                .comment("Set Max Redstone Vein Size (Default = 8)")
                .defineInRange("ore_generation.redstone.redstoneVeinSize", 8, 0, 36);
        redstonePerChunk = builder
                .comment("Set Redstone Spawn Chance (Default = 4)")
                .defineInRange("ore_generation.redstone.redstoneChance", 4, 0, 64);
        redstoneMinHeight = builder
                .comment("Set Redstone Min Spawn Height (Default = 45)")
                .defineInRange("ore_generation.redstone.redstoneMinHeight", 45, 12, 75);
        redstoneMaxHeight = builder
                .comment("Set Redstone Max Spawn Height (Default = 65)")
                .defineInRange("ore_generation.redstone.redstoneMaxHeight", 65, 12, 75);

        //Lapis Ore Values
        lapisVeinSize = builder
                .comment("Set Max Lapis Vein Size (Default = 7)")
                .defineInRange("ore_generation.lapis.lapisVeinSize", 7, 0, 36);
        lapisPerChunk = builder
                .comment("Set Lapis Spawn Chance (Default = 2)")
                .defineInRange("ore_generation.lapis.lapisChance", 2, 0, 64);
        lapisMinHeight = builder
                .comment("Set Lapis Min Spawn Height (Default = 30)")
                .defineInRange("ore_generation.lapis.lapisMinHeight", 30, 12, 75);
        lapisMaxHeight = builder
                .comment("Set Lapis Max Spawn Height (Default = 60)")
                .defineInRange("ore_generation.lapis.lapisMaxHeight", 60, 12, 75);

        //Coal Ore Values
        coalVeinSize = builder
                .comment("Set Max Coal Vein Size (Default = 17)")
                .defineInRange("ore_generation.coal.coalVeinSize", 17, 0, 64);
        coalPerChunk = builder
                .comment("Set Coal Spawn Chance (Default = 10)")
                .defineInRange("ore_generation.coal.coalChance", 10, 0, 64);
        coalMinHeight = builder
                .comment("Set Coal Min Spawn Height (Default = 25)")
                .defineInRange("ore_generation.coal.coalMinHeight", 25, 12, 75);
        coalMaxHeight = builder
                .comment("Set Coal Max Spawn Height (Default = 55)")
                .defineInRange("ore_generation.coal.coalMaxHeight", 55, 12, 75);

        //Gold Ore Values
        goldVeinSize = builder
                .comment("Set Max Gold Vein Size (Default = 9)")
                .defineInRange("ore_generation.gold.goldVeinSize", 9, 0, 64);
        goldPerChunk = builder
                .comment("Set Gold Spawn Chance (Default = 2)")
                .defineInRange("ore_generation.gold.goldChance", 2, 0, 64);
        goldMinHeight = builder
                .comment("Set Gold Min Spawn Height (Default = 30)")
                .defineInRange("ore_generation.gold.goldMinHeight", 30, 12, 75);
        goldMaxHeight = builder
                .comment("Set Gold Max Spawn Height (Default = 60)")
                .defineInRange("ore_generation.gold.goldMaxHeight", 60, 12, 75);

        //Silver Ore Values
        silverVeinSize = builder
                .comment("Set Max Silver Vein Size (Default = 9)")
                .defineInRange("ore_generation.silver.silverVeinSize", 9, 0, 64);
        silverPerChunk = builder
                .comment("Set Silver Spawn Chance (Default = 4)")
                .defineInRange("ore_generation.silver.silverChance", 4, 0, 64);
        silverMinHeight = builder
                .comment("Set Silver Min Spawn Height (Default = 30)")
                .defineInRange("ore_generation.silver.silverMinHeight", 30, 12, 75);
        silverMaxHeight = builder
                .comment("Set Silver Max Spawn Height (Default = 60)")
                .defineInRange("ore_generation.silver.silverMaxHeight", 60, 12, 75);
        
        //Iron Ore Values
        ironVeinSize = builder
                .comment("Set Max Iron Vein Size (Default = 8)")
                .defineInRange("ore_generation.iron.ironVeinSize", 8, 0, 32);
        ironPerChunk = builder
                .comment("Set Iron Spawn Chance (Default = 10)")
                .defineInRange("ore_generation.iron.ironChance", 10, 0, 64);
        ironMinHeight = builder
                .comment("Set Iron Min Spawn Height (Default = 40)")
                .defineInRange("ore_generation.iron.ironMinHeight", 40, 12, 75);
        ironMaxHeight = builder
                .comment("Set Iron Max Spawn Height (Default = 65)")
                .defineInRange("ore_generation.iron.ironMaxHeight", 65, 12, 75);

        //Lead Ore Values
        leadVeinSize = builder
                .comment("Set Max Lead Vein Size (Default = 8)")
                .defineInRange("ore_generation.lead.leadVeinSize", 8, 0, 32);
        leadPerChunk = builder
                .comment("Set Lead Spawn Chance (Default = 8)")
                .defineInRange("ore_generation.lead.leadChance", 8, 0, 64);
        leadMinHeight = builder
                .comment("Set Lead Min Spawn Height (Default = 40)")
                .defineInRange("ore_generation.lead.leadMinHeight", 40, 12, 75);
        leadMaxHeight = builder
                .comment("Set Lead Max Spawn Height (Default = 65)")
                .defineInRange("ore_generation.lead.leadMaxHeight", 65, 12, 75);

        //nickel Ore Values
        nickelVeinSize = builder
                .comment("Set Max Nickel Vein Size (Default = 8)")
                .defineInRange("ore_generation.nickel.nickelVeinSize", 8, 0, 32);
        nickelPerChunk = builder
                .comment("Set Nickel Spawn Chance (Default = 4)")
                .defineInRange("ore_generation.nickel.nickelChance", 4, 0, 64);
        nickelMinHeight = builder
                .comment("Set Nickel Min Spawn Height (Default = 30)")
                .defineInRange("ore_generation.nickel.nickelMinHeight", 30, 12, 75);
        nickelMaxHeight = builder
                .comment("Set Nickel Max Spawn Height (Default = 50)")
                .defineInRange("ore_generation.nickel.nickelMaxHeight", 50, 12, 75);

        //Copper Ore Values
        copperVeinSize = builder
                .comment("Set Max Copper Vein Size (Default = 8)")
                .defineInRange("ore_generation.copper.copperVeinSize", 8, 0, 32);
        copperPerChunk = builder
                .comment("Set Copper Spawn Chance (Default = 20)")
                .defineInRange("ore_generation.copper.copperChance", 20, 0, 64);
        copperMinHeight = builder
                .comment("Set Copper Min Spawn Height (Default = 35)")
                .defineInRange("ore_generation.copper.copperMinHeight", 35, 12, 75);
        copperMaxHeight = builder
                .comment("Set Copper Max Spawn Height (Default = 70)")
                .defineInRange("ore_generation.copper.copperMaxHeight", 70, 12, 75);

        //Aluminum Ore Values
        aluminumVeinSize = builder
                .comment("Set Max Aluminum Vein Size (Default = 8)")
                .defineInRange("ore_generation.aluminum.aluminumVeinSize", 8, 0, 32);
        aluminumPerChunk = builder
                .comment("Set Aluminum Spawn Chance (Default = 10)")
                .defineInRange("ore_generation.aluminum.aluminumChance", 10, 0, 64);
        aluminumMinHeight = builder
                .comment("Set Aluminum Min Spawn Height (Default = 45")
                .defineInRange("ore_generation.aluminum.aluminumMinHeight", 45, 12, 75);
        aluminumMaxHeight = builder
                .comment("Set Aluminum Max Spawn Height (Default = 65)")
                .defineInRange("ore_generation.aluminum.aluminumMaxHeight", 65, 12, 75);

        //Tin Ore Values
        tinVeinSize = builder
                .comment("Set Max Tin Vein Size (Default = 8)")
                .defineInRange("ore_generation.tin.tinVeinSize", 8, 0, 32);
        tinPerChunk = builder
                .comment("Set Tin Spawn Chance (Default = 20)")
                .defineInRange("ore_generation.tin.tinChance", 20, 0, 64);
        tinMinHeight = builder
                .comment("Set Tin Min Spawn Height (Default = 40)")
                .defineInRange("ore_generation.tin.tinMinHeight", 40, 12, 75);
        tinMaxHeight = builder
                .comment("Set Tin Max Spawn Height (Default = 65)")
                .defineInRange("ore_generation.tin.tinMaxHeight", 65, 12, 75);

        //Osmium Ore Values
        osmiumVeinSize = builder
                .comment("Set Max Osmium Vein Size (Default = 8)")
                .defineInRange("ore_generation.osmium.osmiumVeinSize", 8, 0, 32);
        osmiumPerChunk = builder
                .comment("Set Osmium Spawn Chance (Default = 8)")
                .defineInRange("ore_generation.osmium.osmiumChance", 8, 0, 64);
        osmiumMinHeight = builder
                .comment("Set Osmium Min Spawn Height (Default = 30)")
                .defineInRange("ore_generation.osmium.osmiumMinHeight", 30, 12, 75);
        osmiumMaxHeight = builder
                .comment("Set Osmium Max Spawn Height (Default = 75)")
                .defineInRange("ore_generation.osmium.osmiumMaxHeight", 75, 12, 75);

        //Uranium Ore Values
        uraniumVeinSize = builder
                .comment("Set Max Uranium Vein Size (Default = 4)")
                .defineInRange("ore_generation.uranium.uraniumVeinSize", 4, 0, 32);
        uraniumPerChunk = builder
                .comment("Set Uranium Spawn Chance (Default = 6)")
                .defineInRange("ore_generation.uranium.uraniumChance", 6, 0, 64);
        uraniumMinHeight = builder
                .comment("Set Uranium Min Spawn Height (Default = 90)")
                .defineInRange("ore_generation.uranium.uraniumMinHeight", 30, 12, 75);
        uraniumMaxHeight = builder
                .comment("Set Uranium Max Spawn Height (Default = 125)")
                .defineInRange("ore_generation.uranium.uraniumMaxHeight", 65, 12, 75);

        //Zinc Ore Values
        zincVeinSize = builder
                .comment("Set Max Zinc Vein Size (Default = 12)")
                .defineInRange("ore_generation.zinc.zincVeinSize", 12, 0, 32);
        zincPerChunk = builder
                .comment("Set Zinc Spawn Chance (Default = 8)")
                .defineInRange("ore_generation.zinc.zincChance", 8, 0, 64);
        zincMinHeight = builder
                .comment("Set Zinc Min Spawn Height (Default = 55)")
                .defineInRange("ore_generation.zinc.zincMinHeight", 55, 0, 250);
        zincMaxHeight = builder
                .comment("Set Zinc Max Spawn Height (Default = 100)")
                .defineInRange("ore_generation.zinc.zincMaxHeight", 100, 0, 256);

        //World Ore Generation
        emeraldGeneration = builder
                .comment("Generate Emerald Ore")
                .define("ore_generation.world_generation.emerald", true);
        diamondGeneration = builder
                .comment("Generate Diamond Ore")
                .define("ore_generation.world_generation.diamond", true);
        redstoneGeneration = builder
                .comment("Generate Redstone Ore")
                .define("ore_generation.world_generation.redstone", true);
        lapisGeneration = builder
                .comment("Generate Lapis Ore")
                .define("ore_generation.world_generation.lapis", true);
        coalGeneration = builder
                .comment("Generate Coal Ore")
                .define("ore_generation.world_generation.coal", true);
        goldGeneration = builder
                .comment("Generate Gold Ore")
                .define("ore_generation.world_generation.gold", true);
        silverGeneration = builder
                .comment("Generate Silver Ore")
                .define("ore_generation.world_generation.silver", false);
        ironGeneration = builder
                .comment("Generate Iron Ore")
                .define("ore_generation.world_generation.iron", true);
        leadGeneration = builder
                .comment("Generate Lead Ore")
                .define("ore_generation.world_generation.lead", false);
        nickelGeneration = builder
                .comment("Generate Nickel Ore")
                .define("ore_generation.world_generation.nickel", false);
        copperGeneration = builder
                .comment("Generate Copper Ore")
                .define("ore_generation.world_generation.copper", false);
        aluminumGeneration = builder
                .comment("Generate Aluminum Ore")
                .define("ore_generation.world_generation.aluminum", false);
        tinGeneration = builder
                .comment("Generate Tin Ore")
                .define("ore_generation.world_generation.tin", false);
        osmiumGeneration = builder
                .comment("Generate Osmium Ore")
                .define("ore_generation.world_generation.osmium", false);
        uraniumGeneration = builder
                .comment("Generate Uranium Ore")
                .define("ore_generation.world_generation.uranium", false);
        zincGeneration = builder
                .comment("Generate Zinc Ore")
                .define("ore_generation.world_generation.zinc", false);
    }
}
