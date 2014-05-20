package mods.MagicItems.common;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabFMI extends CreativeTabs {

	//クリエイティブタブのアイコン画像や名称の登録クラス
	public CreativeTabFMI(String type)
	{
		super(type);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return MagicItems.magicorbItem.itemID;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return "MagicItems";
	}


}
