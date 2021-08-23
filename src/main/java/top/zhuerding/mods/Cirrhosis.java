package top.zhuerding.mods;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.zhuerding.BlockRegistry;
import top.zhuerding.ItemRegistry;

@Mod(Utils.MOD_ID)
public class Cirrhosis {
    public Cirrhosis(){
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
