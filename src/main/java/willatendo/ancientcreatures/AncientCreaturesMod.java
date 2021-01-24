package willatendo.ancientcreatures;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import willatendo.ancientcreatures.core.util.reference.Reference;
import willatendo.ancientcreatures.core.util.registry.ModRegistry;
import willatendo.ancientcreatures.world.generation.OreGeneration;

@Mod(Reference.ID)
public class AncientCreaturesMod
{
	public static final Logger LOGGER = LogManager.getLogger();

    public AncientCreaturesMod() 
    {
    	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        ModRegistry.register();
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
}
