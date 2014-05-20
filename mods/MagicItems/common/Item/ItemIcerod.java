package mods.MagicItems.common.Item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIcerod extends Item
{
    public ItemIcerod(int par1)
	{
		super(par1);
		this.setMaxStackSize(1);
	}

	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
    {
    	par2EntityLiving.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600, 6));
    	par2EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 9));
        return true;
    }

    @Override
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
		if (par3Entity instanceof EntityLiving) {
			EntityLiving par3EntityLiving = (EntityLiving) par3Entity;
		if ( par5 == true){
				par3EntityLiving.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 20, 0));
    		}
		}
		}

	@Override
	public boolean isFull3D()
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
    public boolean hasEffect(ItemStack itemstack)
    {
		return true;
    }

}