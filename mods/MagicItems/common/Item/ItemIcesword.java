package mods.MagicItems.common.Item;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIcesword extends ItemSword
{
    public ItemIcesword(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        setMaxDamage(0);
    }

    @Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
    {
    	par2EntityLiving.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600, 6));
    	par2EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 9));
        return true;
    }

    @Override
   	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityPlayer)
    {
    	Entity entity = null;
    	List list = world.getEntitiesWithinAABBExcludingEntity(entityPlayer, entityPlayer.boundingBox.expand(15.0D, 15.0D,15.0D));
    	double ax, ay, az, dx, dy, dz, power;

        if (list != null && list.size() > 0)
        {
            for (int j1 = 0; j1 < list.size(); j1++)
            {
                entity = (Entity)list.get(j1);
            	if ( entity instanceof EntityLiving)
            	{
            		EntityLiving entityLiving = (EntityLiving)entity;
            		entityLiving.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600, 6));
            		entityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 9));
            	}
            }
            	}
    	return itemstack;
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

	@SideOnly(Side.CLIENT)
	@Override
    public boolean hasEffect(ItemStack itemstack)
    {
		return true;
    }

}
