package mods.MagicItems.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class FRecipeRegister {
	public void addRecipe(){

		GameRegistry.addRecipe(new ItemStack(MagicItems.magicorbItem),
				new Object[]{	"GDG",
								"DED",
								"GDG",
				Character.valueOf('G'),Item.ingotGold
				,Character.valueOf('D'),Item.diamond
				,Character.valueOf('E'),Item.eyeOfEnder});

		GameRegistry.addRecipe(new ItemStack(MagicItems.assassinbootsItem),
				new Object[]{	"G G",
								"GMG",
								"CCC",
				Character.valueOf('G'),Item.ingotGold
				,Character.valueOf('M'),MagicItems.magicorbItem
				,Character.valueOf('C'),Block.cloth});

		GameRegistry.addRecipe(new ItemStack(MagicItems.azusayumiItem),
				new Object[]{	"X X",
								"X X",
								" M ",
				Character.valueOf('X'),Item.ingotIron
				,Character.valueOf('M'),MagicItems.magicorbItem});

		GameRegistry.addRecipe(new ItemStack(MagicItems.nightvisionscubaItem),
				new Object[]{	"KCI",
								"GMG",
								"I I",
				Character.valueOf('I'),Item.ingotIron
				,Character.valueOf('G'),Block.glass
				,Character.valueOf('K'),Item.goldenCarrot
				,Character.valueOf('C'),Item.magmaCream
				,Character.valueOf('M'),MagicItems.magicorbItem});

		GameRegistry.addRecipe(new ItemStack(MagicItems.firerodItem),
				new Object[]{	"PMP",
								" B ",
								" B ",
				Character.valueOf('P'),Item.blazePowder
				,Character.valueOf('B'),Item.blazeRod
				,Character.valueOf('M'),MagicItems.magicorbItem});

		GameRegistry.addRecipe(new ItemStack(MagicItems.icerodItem),
				new Object[]{	"WMW",
								" I ",
								" I ",
				Character.valueOf('W'),Item.bucketWater
				,Character.valueOf('I'),Block.ice
				,Character.valueOf('M'),MagicItems.magicorbItem});

		GameRegistry.addRecipe(new ItemStack(MagicItems.shootingstarItem),
				new Object[]{	" DD",
								" MD",
								"B  ",
				Character.valueOf('D'),Item.diamond
				,Character.valueOf('B'),Item.blazeRod
				,Character.valueOf('M'),MagicItems.magicorbItem});

		GameRegistry.addRecipe(new ItemStack(MagicItems.fireswordItem),
				new Object[]{	"BDB",
								"BDB",
								" F ",
				Character.valueOf('D'),Item.diamond
				,Character.valueOf('B'),Item.bucketLava
				,Character.valueOf('F'),MagicItems.firerodItem});

		GameRegistry.addRecipe(new ItemStack(MagicItems.iceswordItem),
				new Object[]{	"IDI",
								"IDI",
								" R ",
				Character.valueOf('D'),Item.diamond
				,Character.valueOf('I'),Block.ice
				,Character.valueOf('R'),MagicItems.icerodItem});

		GameRegistry.addRecipe(new ItemStack(MagicItems.dualswordItem),
				new Object[]{	"FI",
				Character.valueOf('F'),MagicItems.fireswordItem
				,Character.valueOf('I'),MagicItems.iceswordItem});
	}
}
