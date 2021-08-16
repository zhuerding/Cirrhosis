package top.zhuerding.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import top.zhuerding.mods.group.ModGroup;

public class compressed_biscuit extends Item {
    public static final Food food = (new Food.Builder())
            .saturation(10)
            .hunger(10)
            .build();
    public compressed_biscuit(){
        super(new Properties().group(ModGroup.itemGroup));
    }

}
