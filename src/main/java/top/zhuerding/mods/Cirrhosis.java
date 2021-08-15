package top.zhuerding.mods;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.zhuerding.ItemRegistry;
import top.zhuerding.mods.Utils;

@Mod(Utils.MOD_ID)
public class Cirrhosis {
    public Cirrhosis(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
