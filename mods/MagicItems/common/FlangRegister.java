package mods.MagicItems.common;

import cpw.mods.fml.common.registry.LanguageRegistry;


public class FlangRegister {

	public void registerLang()
	{

		LanguageRegistry.addName(MagicItems.magicorbItem, "magic orb");
		LanguageRegistry.instance().addNameForObject(MagicItems.magicorbItem, "ja_JP", "魔法球");

		LanguageRegistry.addName(MagicItems.assassinbootsItem, "assassin boots");
		LanguageRegistry.instance().addNameForObject(MagicItems.assassinbootsItem, "ja_JP", "暗殺者の靴");

		LanguageRegistry.addName(MagicItems.azusayumiItem, "azusayumi");
		LanguageRegistry.instance().addNameForObject(MagicItems.azusayumiItem, "ja_JP", "梓弓");

		LanguageRegistry.addName(MagicItems.nightvisionscubaItem, "nightvision scuba");
		LanguageRegistry.instance().addNameForObject(MagicItems.nightvisionscubaItem, "ja_JP", "耐火暗視シュノーケル");

		LanguageRegistry.addName(MagicItems.firerodItem, "fire rod");
		LanguageRegistry.instance().addNameForObject(MagicItems.firerodItem, "ja_JP", "炎の杖");

		LanguageRegistry.addName(MagicItems.icerodItem, "ice rod");
		LanguageRegistry.instance().addNameForObject(MagicItems.icerodItem, "ja_JP", "氷の杖");

		LanguageRegistry.addName(MagicItems.shootingstarItem, "shooting star");
		LanguageRegistry.instance().addNameForObject(MagicItems.shootingstarItem, "ja_JP", "流星槍");

		LanguageRegistry.addName(MagicItems.fireswordItem, "fire sword");
		LanguageRegistry.instance().addNameForObject(MagicItems.fireswordItem, "ja_JP", "炎の剣");

		LanguageRegistry.addName(MagicItems.iceswordItem, "ice sword");
		LanguageRegistry.instance().addNameForObject(MagicItems.iceswordItem, "ja_JP", "氷の剣");

		LanguageRegistry.addName(MagicItems.dualswordItem, "dual sword");
		LanguageRegistry.instance().addNameForObject(MagicItems.dualswordItem, "ja_JP", "超竜剣");
	}
}