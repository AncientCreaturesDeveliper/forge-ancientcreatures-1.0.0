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
	}
}
