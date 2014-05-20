package mods.MagicItems.common.Item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNightvisionscuba extends ItemArmor
{
	public ItemNightvisionscuba(int i, EnumArmorMaterial enumarmormaterial, int j, int k)
	{
		super(i,enumarmormaterial,j,k);
		setMaxDamage(0);
	}

	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses()
	{
		return false;
	}

	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 0));
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 20, 0));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 600, 0));

		}
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{

		return "magicitems:textures/armor/MagicArmor_1.png";
	}

	public void onUpdate(ItemStack var1, World var2, Entity var3, int var4, boolean var5)
	{
		super.onUpdate(var1, var2, var3, var4, var5);

		if(!var1.hasTagCompound())
		{
			var1.addEnchantment(Enchantment.aquaAffinity, 1);
		}
	}
}
