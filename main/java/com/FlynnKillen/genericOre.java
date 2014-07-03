package com.FlynnKillen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class genericOre extends Block {
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	
	
	
    public genericOre(Material material) {
    	super(material);
    	setHardness(1.0F); // 33% harder than diamond
    	setStepSound(Block.soundTypeStone); // sounds got renamed, look in Block class for what blocks have what sounds
    	setCreativeTab(CreativeTabs.tabBlock);
    	}
    	
    	
    	public void registerIcons(IIconRegister par1IconRegister)
    	{
    		//this.blockIcon = par1IconRegisterIcon("Pandoracraft:genericOre");
    		this.blockIcon = par1IconRegister.registerIcon(this.getUnlocalizedName().substring(5));
    	}
    	//If the block's drop is a block.
    	
    	@Override
    		public Item getItemDropped(int metadata, Random random, int fortune) {
    			return Item.getItemFromBlock(Pandoracraft.Block1);
    	}
}