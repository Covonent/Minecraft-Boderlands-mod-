package com.FlynnKillen;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraft.util.IIcon;

import com.google.common.collect.Sets;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EriduimSpade extends ItemTool
{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	
	
    private static final Set field_150916_c = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
    private static final String __OBFID = "CL_00000063";

    public EriduimSpade(Item.ToolMaterial p_i45353_1_)
    {
        super(1.0F, p_i45353_1_, field_150916_c);
    }

    public boolean func_150897_b(Block p_150897_1_)
    {
        return p_150897_1_ == Blocks.snow_layer ? true : p_150897_1_ == Blocks.snow;
    }
    
	    public void registerIcons(IIconRegister par1IconRegister)
	  	{
	  			this.itemIcon = par1IconRegister.registerIcon("Pandoracraft:" + (this.getUnlocalizedName().substring(5)));
	  	}
    
}