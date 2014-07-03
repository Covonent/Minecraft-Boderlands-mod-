package com.FlynnKillen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

	 



@Mod(modid="Pandora Craft", name="The Borderlands Mod", version="1")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class Pandoracraft {
		public static Item eridInstance;
		public static Block eriduimBlock;
		public static Block Block1;
		public static Item EriduimPic;
		public static Item EriduimSword;
		public static Item EriduimAxe; 
		public static Item EriduimSpade;
		public static Item EriduimHoe;
		
        // The instance of your mod that Forge uses.
        @Instance(value = "GenericModID")
        public static Pandoracraft instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.FlynnKillen.client.ClientProxy", serverSide="com.FlynnKillen.CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler // used in 1.6.2
        public void preInit(FMLPreInitializationEvent event) {
        	 // Stub Method
        	eridInstance = new Eriduim()
        	.setUnlocalizedName("Eriduim")
        	.setTextureName("generic:Eriduim");
            GameRegistry.registerItem(eridInstance, "Eriduim");
            
            
            Block1 = new genericOre(Material.ground)
            .setCreativeTab(CreativeTabs.tabBlock)
            .setBlockTextureName("pandoracraft:eriduimOre");
            GameRegistry.registerBlock(Block1, "eriduimOre");
            LanguageRegistry.addName(Block1, "Eriduim Ore");
            
            
            eriduimBlock = new genericOre(Material.ground)
            .setCreativeTab(CreativeTabs.tabBlock)
            .setBlockTextureName("pandoracraft:EriduimBlock");
            GameRegistry.registerBlock(eriduimBlock, "eriduimBlock");
            LanguageRegistry.addName(eriduimBlock, "Eriduim Block");            
            
            
            EriduimPic = new EriduimPic(Item.ToolMaterial.EMERALD)
            .setUnlocalizedName("EriduimPic")
        	.setTextureName("generic:EriduimPic");
            GameRegistry.registerItem(EriduimPic, "EriduimPic");
            LanguageRegistry.addName(EriduimPic, "Eriduim Pickaxe"); 
            
            
            EriduimSword = new EriduimSword(Item.ToolMaterial.EMERALD)
            .setUnlocalizedName("EriduimSword")
        	.setTextureName("generic:EriduimSword");
            GameRegistry.registerItem(EriduimSword, "EriduimSword");
            LanguageRegistry.addName(EriduimSword, "Eriduim Sword"); 
            
            EriduimAxe = new EriduimSword(Item.ToolMaterial.IRON)
            .setUnlocalizedName("EriduimAxe")
        	.setTextureName("generic:EriduimAxe");
            GameRegistry.registerItem(EriduimAxe, "EriduimAxe");
            LanguageRegistry.addName(EriduimAxe, "Eriduim Axe"); 
            
            
            EriduimSpade = new EriduimSpade(Item.ToolMaterial.EMERALD)
            .setUnlocalizedName("EriduimSpade")
            .setTextureName("generic:EriduimSpade");
            GameRegistry.registerItem(EriduimSpade, "EriduimSpade");
            LanguageRegistry.addName(EriduimSpade, "Eriduim Spade");
            
            
            EriduimHoe = new EriduimHoe(Item.ToolMaterial.EMERALD)
            .setUnlocalizedName("EriduimHoe")
            .setTextureName("generic:EriduimHoe");
            GameRegistry.registerItem(EriduimHoe, "EriduimHoe");
            LanguageRegistry.addName(EriduimHoe, "Eriduim Hoe");
            
            GameRegistry.registerWorldGenerator(new WorldGenerator(), 0);
        }
        
        @EventHandler // used in 1.6.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                GameRegistry.registerBlock(Testblock.genericDirt, "genericDirt");
                Testblock.genericDirt.setHarvestLevel("pickaxe", 3);
               // GameRegistry.registerBlock(genericOre.genericOre, "genericOre");
                //MyCode Recipes
                MyCode.MyRecipes();
                
        }
        
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}
