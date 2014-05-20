package mods.MagicItems.common.Item;

import java.util.List;

import net.minecraft.enchantment.Enchantment;
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

public class ItemDualsword extends ItemSword
{
    public ItemDualsword(int par1, EnumToolMaterial par2EnumToolMaterial)
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

	public void onUpdate(ItemStack var1, World var2, Entity var3, int var4, boolean var5)
	{
		if (var3 instanceof EntityLiving) {
			EntityLiving par3EntityLiving = (EntityLiving) var3;
		if ( var5 == true){
				par3EntityLiving.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 0));
				par3EntityLiving.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 20, 0));
				par3EntityLiving.extinguish();
				if(par3EntityLiving.isInWater()){
					par3EntityLiving.addPotionEffect(new PotionEffect(Potion.regeneration.id, 20, 4));
				}
				if(par3EntityLiving.handleLavaMovement()){
					par3EntityLiving.addPotionEffect(new PotionEffect(Potion.resistance.id, 20, 4));
				}
		}
		}
		super.onUpdate(var1, var2, var3, var4, var5);

		if(!var1.hasTagCompound())
		{
			var1.addEnchantment(Enchantment.fireAspect, 10);
		}
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
                	entityLiving.setFire(60);
            		entityLiving.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600, 6));
            		entityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 9));

            	}
            }
            	}
    	return itemstack;
    }
}
