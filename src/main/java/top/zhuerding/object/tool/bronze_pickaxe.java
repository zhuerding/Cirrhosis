package top.zhuerding.object.tool;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import top.zhuerding.config.CirrhosisItemTier_tools;
import top.zhuerding.mods.group.ModGroup;

public class bronze_pickaxe extends PickaxeItem {
    public bronze_pickaxe() {
        super(CirrhosisItemTier_tools.BRONZE_ITEM_TIER, 2, -3f, (new Item.Properties()).group(ModGroup.itemGroup));
    }
}