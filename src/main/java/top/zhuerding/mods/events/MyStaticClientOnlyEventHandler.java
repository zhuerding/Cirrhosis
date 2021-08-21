package top.zhuerding.mods.events;

import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MyStaticClientOnlyEventHandler {
    @SubscribeEvent
    public static void drawLast(RenderWorldLastEvent event) {
        System.out.println("Drawing!");
    }

}
