package mods.MagicItems.common;

import java.io.IOException;
import java.util.logging.Level;

import mods.MagicItems.common.Item.ItemAssassinboots;
import mods.MagicItems.common.Item.ItemAzusayumi;
import mods.MagicItems.common.Item.ItemDualsword;
import mods.MagicItems.common.Item.ItemFirerod;
import mods.MagicItems.common.Item.ItemFiresword;
import mods.MagicItems.common.Item.ItemIcerod;
import mods.MagicItems.common.Item.ItemIcesword;
import mods.MagicItems.common.Item.ItemNightvisionscuba;
import mods.MagicItems.common.Item.ItemShootingstar;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="f04041-MagicItems", name="MagicItems", version="1.1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MagicItems
{
	@SidedProxy(clientSide = "mods.MagicItems.client.ClientProxy", serverSide = "mods.MagicItems.CommonProxy")
	public static CommonProxy proxy;

	@Mod.Instance("f04041-MagicItems")
	public static MagicItems instance;

	public static final CreativeTabs MagicItems = new CreativeTabFMI("MagicItems");


	private int itemIdBase;

	public static int magicIndex;
	public static int assassinIndex;

	public static Item magicorbItem;
	public static Item assassinbootsItem;
	public static Item azusayumiItem;
	public static Item nightvisionscubaItem;
	public static Item firerodItem;
	public static Item icerodItem;
	public static Item shootingstarItem;
	public static Item fireswordItem;
	public static Item iceswordItem;
	public static Item dualswordItem;

	private int magicorbItemId;
	private int assassinbootsItemId;
	private int azusayumiItemId;
	private int nightvisionscubaItemId;
	private int firerodItemId;
	private int icerodItemId;
	private int shootingstarItemId;
	private int fireswordItemId;
	private int iceswordItemId;
	private int dualswordItemId;

	static EnumArmorMaterial enumArmorMagic;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			cfg.load();
			itemIdBase         = cfg.get("ItemID"  , "ItemID Base", 2005).getInt();
			magicorbItemId      = itemIdBase- 256;
			assassinbootsItemId      = itemIdBase- 255;
			azusayumiItemId      = itemIdBase- 253;
			nightvisionscubaItemId      = itemIdBase- 252;
			firerodItemId      = itemIdBase- 251;
			icerodItemId      = itemIdBase- 250;
			shootingstarItemId	=itemIdBase-249;
			fireswordItemId	=itemIdBase-248;
			iceswordItemId	=itemIdBase-247;
			dualswordItemId	=itemIdBase-246;

		}
		catch (Exception e)
		{

			FMLLog.log(Level.SEVERE, e, "Error Massage");
		}
		finally
		{
			cfg.save();
		}
	}

	@EventHandler
	public void init(FMLInitializationEvent event) throws IOException
	{
		enumArmorMagic = EnumHelper.addArmorMaterial("MAGIC",32767, new int[] {0, 0, 0, 0}, 30);

		magicIndex = proxy.addArmor("MagicArmor");
		assassinIndex = proxy.addArmor("Assassin");

		magicorbItem = new Item(magicorbItemId).setUnlocalizedName("magicOrb").setTextureName("magicitems:magicOrb").setCreativeTab(MagicItems);
		assassinbootsItem = new ItemAssassinboots(assassinbootsItemId, enumArmorMagic, assassinIndex ,3).setUnlocalizedName("assassinBoots").setTextureName("magicitems:assassinBoots").setCreativeTab(MagicItems);
		azusayumiItem = new ItemAzusayumi(azusayumiItemId).setUnlocalizedName("azusaYumi").setTextureName("magicitems:azusaYumi").setCreativeTab(MagicItems);
		nightvisionscubaItem = new ItemNightvisionscuba(nightvisionscubaItemId, enumArmorMagic, magicIndex,0).setUnlocalizedName("nightvisionScuba").setTextureName("magicitems:nightvisionScuba").setCreativeTab(MagicItems);
		firerodItem = new ItemFirerod(firerodItemId).setUnlocalizedName("fireRod").setTextureName("magicitems:fireRod").setCreativeTab(MagicItems);
		icerodItem = new ItemIcerod(icerodItemId).setUnlocalizedName("iceRod").setTextureName("magicitems:iceRod").setCreativeTab(MagicItems);
		shootingstarItem = new ItemShootingstar(shootingstarItemId,EnumToolMaterial.IRON).setUnlocalizedName("shootingStar").setTextureName("magicitems:shootingStar").setCreativeTab(MagicItems);
		fireswordItem = new ItemFiresword(fireswordItemId,EnumToolMaterial.EMERALD).setUnlocalizedName("fireSword").setTextureName("magicitems:fireSword").setCreativeTab(MagicItems);
		iceswordItem = new ItemIcesword(iceswordItemId,EnumToolMaterial.EMERALD).setUnlocalizedName("iceSword").setTextureName("magicitems:iceSword").setCreativeTab(MagicItems);
		dualswordItem = new ItemDualsword(dualswordItemId,EnumToolMaterial.EMERALD).setUnlocalizedName("dualSword").setTextureName("magicitems:dualSword").setCreativeTab(MagicItems);

		(new FlangRegister()).registerLang();
		(new FRecipeRegister()).addRecipe();
	}

}
