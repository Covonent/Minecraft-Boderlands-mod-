package com.FlynnKillen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Testblock extends Block 
{
	public final static Block genericDirt = new Testblock(Material.ground);
		public Testblock (Material material) 
        {
			super(material);
			setHardness(0.1F).setStepSound(Block.soundTypeAnvil);
	    	setBlockName("genericDirt").setCreativeTab(CreativeTabs.tabBlock);
			setHarvestLevel("shovel",0);
        }

}