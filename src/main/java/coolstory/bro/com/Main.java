package coolstory.bro.com;

/**
 * @author Brian & Nick
 *
 */

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="coolstorybro", version="1.0")
public class Main	{
	public static String MODID = "coolstorybro";
	public static String VERSION = "1.0";

	@EventHandler
	public void preInit(FMLPreInitializationEvent e)	{
	
	}

	@EventHandler
	public void init(FMLInitializationEvent e)	{
		// Add Mob drops
		// MinecraftForge.EVENT_BUS.register(new DropHandler());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e)	{
	
	}
}