package com.FlynnKillen;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Eriduim extends Item {
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	
	// Constructor Configuration
	public Eriduim(){		
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("Eriduim");
	}
	
	public void registerIcons(IIconRegister par1IconRegister)
	{
			this.itemIcon = par1IconRegister.registerIcon("Pandoracraft:" + (this.getUnlocalizedName().substring(5)));
	}
}
