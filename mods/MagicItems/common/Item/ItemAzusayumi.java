package mods.MagicItems.common.Item;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAzusayumi extends Item
{

	public ItemAzusayumi(int i)
	{
		super(i);
		maxStackSize = 1;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
    	Entity entity = null;
    	List list = world.getEntitiesWithinAABBExcludingEntity(entityPlayer, entityPlayer.boundingBox.expand(30.0D, 30.0D,30.0D));
    	double ax, ay, az, dx, dy, dz, power;

        if (list != null && list.size() > 0)
        {
            for (int j1 = 0; j1 < list.size(); j1++)
            {
                entity = (Entity)list.get(j1);
            	if ( entity instanceof EntityLiving)
            	{
            		EntityLiving entityLiving = (EntityLiving)entity;
            			if(entityLiving.getAttackTarget() == entityPlayer)
            			{
            				entityLiving.setAttackTarget(null);
            			}
                }
            }
        }
 		world.playSoundAtEntity(entityPlayer, "random.orb", 0.5F, 0.4F / (itemRand.nextFloat() * 4F + 0.8F));
    	return itemStack;
    }
}