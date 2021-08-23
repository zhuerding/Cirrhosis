package top.zhuerding.object.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class reinforced_stone extends Block {
    public reinforced_stone(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }
}
