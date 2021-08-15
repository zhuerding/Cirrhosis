package top.zhuerding;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.zhuerding.item.copper_spindle;
import top.zhuerding.mods.Utils;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> rubber = ITEMS.register("rubber", top.zhuerding.item.rubber::new);
    public static final RegistryObject<Item> copper_spindle = ITEMS.register("copper_spindle", copper_spindle::new);
    public static final RegistryObject<Item> ingot = ITEMS.register("ingot", top.zhuerding.item.ingot::new);
}
