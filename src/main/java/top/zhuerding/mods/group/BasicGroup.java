package top.zhuerding.mods.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import top.zhuerding.ItemRegistry;

public class BasicGroup extends ItemGroup {
    public BasicGroup(){
        super("basic_group");
    }
    @Override
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistry.rubber.get());
    }
}
