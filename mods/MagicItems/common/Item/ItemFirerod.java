package mods.MagicItems.common.Item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFirerod extends Item
{
    public ItemFirerod(int par1)
	{
		super(par1);
		this.setMaxStackSize(1);
	}

	public void onUpdate(ItemStack var1, World var2, Entity var3, int var4, boolean var5)
	{
		if (var3 instanceof EntityLiving) {
			EntityLiving par3EntityLiving = (EntityLiving) var3;
		if ( var5 == true){
				par3EntityLiving.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 0));
		}
		}
		super.onUpdate(var1, var2, var3, var4, var5);

		if(!var1.hasTagCompound())
		{
			var1.addEnchantment(Enchantment.fireAspect, 10);
		}
	}

	@Override
	public boolean isFull3D()
	{
		return true;
	}

}