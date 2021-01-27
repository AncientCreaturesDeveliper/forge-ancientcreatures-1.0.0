package willatendo.ancientcreatures.client;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import willatendo.ancientcreatures.core.init.BlockInit;
import willatendo.ancientcreatures.core.util.reference.Reference;

@Mod.EventBusSubscriber(modid = Reference.ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientUtil 
{
	@SubscribeEvent
	public static void init(final FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_PARK_ERA_CLEAR_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_PARK_ERA_CLEAR_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_PARK_ERA_TINTED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_PARK_ERA_TINTED_GLASS_PANE.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_BLACK_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_BLACK_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_BLUE_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_BLUE_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_BROWN_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_BROWN_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_CLEAR_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_CLEAR_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_CYAN_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_CYAN_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_GREEN_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_GREEN_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_GREY_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_GREY_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_LIGHT_BLUE_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_LIGHT_BLUE_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_LIGHT_GREY_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_LIGHT_GREY_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_LIME_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_LIME_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_MAGENTA_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_MAGENTA_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_ORANGE_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_ORANGE_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_PINK_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_PINK_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_PURPLE_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_PURPLE_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_RED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_RED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_WHITE_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_WHITE_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_YELLOW_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_YELLOW_GLASS_PANE.get(), RenderType.getTranslucent());
	
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_PARK_ERA_SECURITY_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_PARK_ERA_TOILET_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_PARK_ERA_VISITOR_CENTRE_DOOR.get(), RenderType.getTranslucent());
	
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_INNOVATION_CENTRE_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_GLASS_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.JURASSIC_WORLD_ERA_BACK_DOOR.get(), RenderType.getTranslucent());
	}
}
