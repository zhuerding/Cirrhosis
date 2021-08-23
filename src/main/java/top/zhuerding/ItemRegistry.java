package top.zhuerding;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.zhuerding.config.CirrhosisItemTier_armor;
import top.zhuerding.mods.group.ModGroup;
import top.zhuerding.object.item.*;
import top.zhuerding.object.item.lithium_rod;
import top.zhuerding.mods.Utils;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> rubber = ITEMS.register("rubber", top.zhuerding.object.item.rubber::new);
    public static final RegistryObject<Item> copper_spindle = ITEMS.register("copper_spindle", copper_spindle::new);
    public static final RegistryObject<Item> ingot = ITEMS.register("ingot", top.zhuerding.object.item.ingot::new);
    public static final RegistryObject<Item> lithium_rod = ITEMS.register("lithium_rod", lithium_rod::new);
    public static final RegistryObject<Item> boron_particle =ITEMS.register("boron_particle", top.zhuerding.object.item.boron_particle::new);
    public static final RegistryObject<Item> aluminum_ingot =ITEMS.register("aluminum_ingot", top.zhuerding.object.item.aluminum_ingot::new);
    public static final RegistryObject<Item> silica_fume =ITEMS.register("silica_fume", top.zhuerding.object.item.silica_fume::new);
    public static final RegistryObject<Item> compressed_biscuit = ITEMS.register("compressed_biscuit", top.zhuerding.object.food.compressed_biscuit::new);
    public static final RegistryObject<Item> bronze_sword = ITEMS.register("bronze_sword", top.zhuerding.object.combat.bronze_sword::new);
    public static final RegistryObject<Item> bronze_pickaxe =ITEMS.register("bronze_pickaxe", top.zhuerding.object.tool.bronze_pickaxe::new);
    public static final RegistryObject<Item> obsidianHelmet = ITEMS.register("obsidian_helmet", () -> new ArmorItem(CirrhosisItemTier_armor.BRONZE, EquipmentSlotType.HEAD, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianChestplate = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(CirrhosisItemTier_armor.BRONZE, EquipmentSlotType.CHEST, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianLeggings = ITEMS.register("obsidian_leggings", () -> new ArmorItem(CirrhosisItemTier_armor.BRONZE, EquipmentSlotType.LEGS, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianBoots = ITEMS.register("obsidian_boots", () -> new ArmorItem(CirrhosisItemTier_armor.BRONZE, EquipmentSlotType.FEET, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> uranium_nugget = ITEMS.register("uranium_nugget", top.zhuerding.object.item.uranium_nugget::new);
    public static final RegistryObject<Item> reinforced_stone = ITEMS.register("reinforced_stone", () -> new BlockItem(BlockRegistry.reinforced_stone.get(), new Item.Properties().group(ModGroup.itemGroup)));

}

