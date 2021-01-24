package willatendo.ancientcreatures.core.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import willatendo.ancientcreatures.core.tab.CreativeTab;
import willatendo.ancientcreatures.core.util.registry.ModRegistry;

public class BlockItemInit 
{
	public static final RegistryObject<BlockItem> COPPER_ORE = ModRegistry.ITEM_TYPES.register("copper_ore", () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_CONCRETE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_concrete", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_CONCRETE_SLAB = ModRegistry.ITEM_TYPES.register("jurassic_park_era_concrete_slab", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_SLAB.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_CONCRETE_STAIRS = ModRegistry.ITEM_TYPES.register("jurassic_park_era_concrete_stairs", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_STAIRS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_CONCRETE_WALL = ModRegistry.ITEM_TYPES.register("jurassic_park_era_concrete_wall", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_WALL.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_CONCRETE_BUTTON = ModRegistry.ITEM_TYPES.register("jurassic_park_era_concrete_button", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_BUTTON.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_CONCRETE_PRESSURE_PLATE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_concrete_pressure_plate", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_PRESSURE_PLATE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_WOOD = ModRegistry.ITEM_TYPES.register("jurassic_park_era_wood", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_WOOD.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_WOOD_SLAB = ModRegistry.ITEM_TYPES.register("jurassic_park_era_wood_slab", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_WOOD_SLAB.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_WOOD_STAIRS = ModRegistry.ITEM_TYPES.register("jurassic_park_era_wood_stairs", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_WOOD_STAIRS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_WOOD_FENCE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_wood_fence", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_WOOD_FENCE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_WOOD_FENCE_GATE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_wood_fence_gate", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_WOOD_FENCE_GATE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_WOOD_BUTTON = ModRegistry.ITEM_TYPES.register("jurassic_park_era_wood_button", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_WOOD_BUTTON.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_WOOD_PRESSURE_PLATE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_wood_pressure_plate", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_WOOD_PRESSURE_PLATE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_FOSSIL_PANEL = ModRegistry.ITEM_TYPES.register("jurassic_park_era_fossil_panel", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_FOSSIL_PANEL.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	//Registry
	public static void registerBlockItems() { }
}
