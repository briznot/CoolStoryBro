package coolstory.bro.tools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid="CoolStoryBro", version="1.0")
public class Main	{
	public static String MODID = "coolstorybro";
	public static String VERSION = "1.0";

	public static CreativeTabs tabName = new CreativeTabs("tabName")	{

	public Item getTabIconItem()	{
		return Items.arrow;
	}
};

public static final Item.ToolMaterial TUTORIALMATERIAL = EnumHelper.addToolMaterial("TUTORIALMATERIAL", 2, 192, 5.0F, 1.5F, 12);

/*You can call the Material whatever you want.
The first number in the brackets is the harvest level.
Level 0 (gold and wood) can't mine iron ore...
Level 1 (stone) can't mine gold ore...
Level 2 (iron) can't mine obsidian.
Level 3 (diamond) can mine every breakable block.
The second number of uses of the Material.
wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32
The third number is the strength against blocks.
wood = 2.0F, stone = 4.0F, iron = 6.0F, diamond = 8.0F, gold 12.0F
The fourth number is the damage against entities.
wood = 0.0F, stone = 1.0F, iron = 2.0F, diamond = 3.0F, gold 0.0F
The last number is enchantability factor of the Material.
wood = 15, stone = 5, iron = 14, diamond = 10, gold 22*/

public static Item coolAxe;
public static Item coolPickaxe;
public static Item coolShovel;
public static Item coolSword;

@EventHandler
public void preInit(FMLPreInitializationEvent e)	{
coolSword = new CoolSword(TUTORIALMATERIAL).setUnlocalizedName("coolSword").setCreativeTab(tabName).setTextureName(MODID + ":" + "coolSword.png");
GameRegistry.registerItem(coolSword, "coolSword");

/*Do the same thing for the rest of them, i.e., tutPickaxe, tutShovel, tutSword, and tutHoe*/
}

@EventHandler
public void init(FMLInitializationEvent e)	{

}

@EventHandler
public void postInit(FMLPostInitializationEvent e)	{

}

}