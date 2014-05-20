package mods.MagicItems.common.Item;

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

public class ItemAssassinboots extends ItemArmor
{

	public ItemAssassinboots(int i, EnumArmorMaterial enumarmormaterial, int j, int k)
	{
		super(i,enumarmormaterial,j,k);
		setMaxDamage(0);
	}


	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{

		return "magicitems:textures/armor/Assassin_1.png";
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
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20, 4));
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 20, 9));
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 20, 0));
			player.fallDistance = 0.0F;
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
    public boolean hasEffect(ItemStack itemstack)
    {
		return true;
    }

}
