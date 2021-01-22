package willatendo.ancientcreatures.core.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import willatendo.ancientcreatures.core.tab.CreativeTab;
import willatendo.ancientcreatures.core.util.registry.ModRegistry;

public class BlockItemInit 
{
	public static final RegistryObject<BlockItem> COPPER_ORE = ModRegistry.ITEM_TYPES.register("copper_ore", () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	
	//Registry
	public static void registerBlockItems() { }
}
