package dantetc.buildersdelight;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = BuildersDelight.MOD_ID,
        name = BuildersDelight.MOD_NAME,
        version = BuildersDelight.VERSION
)
public class BuildersDelight {

    public static final String MOD_ID = "buildersdelight";
    public static final String MOD_NAME = "Builders Delight";
    public static final String VERSION = "1.1-SNAPSHOT";

    @Mod.Instance BuildersDelight
    public static BuildersDelight instance;


    @EventHandler
    public void preinit(FMLPreInitializationEvent e) {
        System.out.println("Called method: [preinit]");
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.println("Called method: [init]");
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent e) {
        System.out.println("Called method: [postinit]");
    }
}
