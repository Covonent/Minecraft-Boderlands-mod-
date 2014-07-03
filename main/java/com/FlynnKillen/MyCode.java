package com.FlynnKillen;

//Recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MyCode {
    
	public static void MyBlocks(){		
		
	}
	public static void MyRecipes(){
		GameRegistry.addShapelessRecipe( new ItemStack(Blocks.sand), new Object [] {new ItemStack(Blocks.cobblestone)});	
		GameRegistry.addShapelessRecipe( new ItemStack(Blocks.gravel), new Object [] {new ItemStack(Blocks.sand)});
		GameRegistry.addShapelessRecipe( new ItemStack(Items.clay_ball), new Object [] {new ItemStack(Blocks.gravel)});
		GameRegistry.addShapelessRecipe( new ItemStack(Blocks.brick_block), new Object [] {new ItemStack(Blocks.clay)});
		GameRegistry.addRecipe(new ItemStack(Items.slime_ball), new Object []
				 {
							"AB ",
							"   ",
							"   ",
							'A', (Items.clay_ball),
							'B', (Items.rotten_flesh)
						}); 

		GameRegistry.addRecipe(new ItemStack(Blocks.hardened_clay), new Object []
				 {
							"AAA",
							"AAA",
							"AAA",
							'A', (Blocks.clay)
						}); 

		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 100.0f); 	
		
		ItemStack newEnchantment = new ItemStack(Items.cooked_beef, 1);
		newEnchantment.addEnchantment(Enchantment.sharpness, 10);
		GameRegistry.addSmelting(Items.cookie, newEnchantment, 100.01F);
		
		ItemStack newEnchantment2 = new ItemStack(Items.cooked_beef, 1);
		newEnchantment2.addEnchantment(Enchantment.sharpness, 20);
		GameRegistry.addRecipe(newEnchantment2, new Object []
				 {
							"AA ",
							"   ",
							"   ",
							'A', (newEnchantment)
						}); 
		// Note not only Block -> Blocks but stoneBrick -> stonebrick
		
		GameRegistry.addSmelting(Pandoracraft.Block1, new ItemStack(Pandoracraft.eridInstance), 0.1f);
		
		
		GameRegistry.addRecipe(new ItemStack(Pandoracraft.eriduimBlock), new Object []
				 {
							"AAA",
							"AAA",
							"AAA",
							'A', (Pandoracraft.eridInstance),
						}); 
		GameRegistry.addRecipe(new ItemStack(Pandoracraft.EriduimPic), new Object []
				 {
							"AAA",
							" B ",
							" B ",
							'A', (Pandoracraft.eridInstance),
							'B', (Items.stick)
						}); 
		GameRegistry.addRecipe(new ItemStack(Pandoracraft.EriduimAxe), new Object []
				 {
							" AA",
							" BA",
							" B ",
							'A', (Pandoracraft.eridInstance),
							'B', (Items.stick)
						}); 
		GameRegistry.addRecipe(new ItemStack(Pandoracraft.EriduimHoe), new Object []
				 {
							" AA",
							" B ",
							" B ",
							'A', (Pandoracraft.eridInstance),
							'B', (Items.stick)
						}); 
		GameRegistry.addRecipe(new ItemStack(Pandoracraft.EriduimSpade), new Object []
				 {
							" A ",
							" B ",
							" B ",
							'A', (Pandoracraft.eridInstance),
							'B', (Items.stick)
						}); 
		GameRegistry.addRecipe(new ItemStack(Pandoracraft.EriduimSword), new Object []
				 {
							" A ",
							" A ",
							" B ",
							'A', (Pandoracraft.eridInstance),
							'B', (Items.stick)
						}); 
		
		
	}
	public static void MyItems(){
		
	}
}