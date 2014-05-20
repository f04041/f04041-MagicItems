package mods.MagicItems.common.Item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemShootingstar extends ItemSword
{
    public ItemShootingstar(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        setMaxDamage(0);
    }

    @Override
   	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityPlayer)
    {
    	if(entityPlayer.isSneaking()&&entityPlayer.experienceLevel >= 10)
    	{
    		entityPlayer.addExperienceLevel(-10);

    		entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 9));
    		entityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1200, 9));
    		entityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1200, 149));
    	}
    	return itemstack;
    }


}
