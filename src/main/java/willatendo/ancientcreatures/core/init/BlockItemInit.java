package willatendo.ancientcreatures.core.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ScaffoldingItem;
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
	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_FLAT_PAVEMENT = ModRegistry.ITEM_TYPES.register("jurassic_park_era_flat_pavement", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_FLAT_PAVEMENT.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_RAISED_PAVEMENT = ModRegistry.ITEM_TYPES.register("jurassic_park_era_raised_pavement", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_RAISED_PAVEMENT.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_STEEP_RAISED_PAVEMENT = ModRegistry.ITEM_TYPES.register("jurassic_park_era_steep_raised_pavement", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_STEEP_RAISED_PAVEMENT.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_FLAT_ROAD = ModRegistry.ITEM_TYPES.register("jurassic_park_era_flat_road", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_FLAT_ROAD.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_RAISED_ROAD = ModRegistry.ITEM_TYPES.register("jurassic_park_era_raised_road", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_RAISED_ROAD.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_FENCE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_fence", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_FENCE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	

	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_CLEAR_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_park_era_clear_glass", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CLEAR_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_CLEAR_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_clear_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CLEAR_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	

	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_TINTED_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_park_era_tinted_glass", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_TINTED_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_TINTED_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_tinted_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_TINTED_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	

	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_TOILET_DOOR = ModRegistry.ITEM_TYPES.register("jurassic_park_era_toilet_door", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_TOILET_DOOR.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JRUASSIC_PARK_ERA_VISITOR_CENTRE_DOOR = ModRegistry.ITEM_TYPES.register("jruassic_park_era_visitor_centre_door", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_VISITOR_CENTRE_DOOR.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_SECURITY_DOOR = ModRegistry.ITEM_TYPES.register("jurassic_park_era_security_door", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_SECURITY_DOOR.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<ScaffoldingItem> JURASSIC_PARK_ERA_METAL_SCAFFOLDING = ModRegistry.ITEM_TYPES.register("jurassic_park_era_metal_scaffolding", () -> new ScaffoldingItem(BlockInit.JURASSIC_PARK_ERA_METAL_SCAFFOLDING.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_THATCH_BUNDLE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_thatch_bundle", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_THATCH_BUNDLE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	//Registry
	public static void registerBlockItems() { }
}
