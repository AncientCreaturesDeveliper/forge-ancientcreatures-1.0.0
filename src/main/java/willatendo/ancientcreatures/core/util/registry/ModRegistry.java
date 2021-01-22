package willatendo.ancientcreatures.core.util.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import willatendo.ancientcreatures.core.init.BlockInit;
import willatendo.ancientcreatures.core.init.BlockItemInit;
import willatendo.ancientcreatures.core.init.ItemInit;
import willatendo.ancientcreatures.core.util.reference.Reference;

public class ModRegistry 
{
	public static final DeferredRegister<Item> ITEM_TYPES = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.ID);
	public static final DeferredRegister<Block> BLOCK_TYPES = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.ID);
	
	public static void register() 
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ITEM_TYPES.register(bus);
		BLOCK_TYPES.register(bus);
		
		ItemInit.registerItems();
		BlockItemInit.registerBlockItems();
		BlockInit.registerBlocks();
	}
}
