package top.zhuerding.object.combat;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import top.zhuerding.config.CirrhosisItemTier;
import top.zhuerding.mods.group.ModGroup;

public class bronze_sword extends SwordItem {
    public bronze_sword(){
        super(CirrhosisItemTier.BRONZE_ITEM_TIER,3,-2.4F,new Item.Properties().group(ModGroup.itemGroup));
    }
}
