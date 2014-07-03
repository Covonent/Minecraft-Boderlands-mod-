package com.FlynnKillen;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class EriduimBlock extends Block 
{

		@SideOnly(Side.CLIENT)
		private IIcon[] icons;
		@SideOnly(Side.CLIENT)
	
	        public EriduimBlock (Material material) 
	        {
	                super(material);
	        }
        
        public final static Block genericDirt = new EriduimBlock(Material.ground)
        .setHardness(0.5F).setStepSound(Block.soundTypeStone)
        .setBlockName("Eriduim Block").setCreativeTab(CreativeTabs.tabBlock);
        
        public void registerIcons(IIconRegister par1IconRegister)
    	{
    		this.blockIcon = par1IconRegister.registerIcon(this.getUnlocalizedName().substring(5));
    	}


}