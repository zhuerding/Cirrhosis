package top.zhuerding.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import top.zhuerding.mods.group.ModGroup;

public class compressed_biscuit extends Item {
    private static final Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .build();
    public compressed_biscuit(){
        super(new Properties().food(food).group(ModGroup.itemGroup));
    }

}
