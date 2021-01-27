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
	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_POLISHED_CONCRETE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_polished_concrete", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_POLISHED_CONCRETE_SLAB = ModRegistry.ITEM_TYPES.register("jurassic_park_era_polished_concrete_slab", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_SLAB.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_POLISHED_CONCRETE_STAIRS = ModRegistry.ITEM_TYPES.register("jurassic_park_era_polished_concrete_stairs", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_STAIRS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_POLISHED_CONCRETE_WALL = ModRegistry.ITEM_TYPES.register("jurassic_park_era_polished_concrete_wall", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_WALL.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_POLISHED_CONCRETE_BUTTON = ModRegistry.ITEM_TYPES.register("jurassic_park_era_polished_concrete_button", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_BUTTON.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_POLISHED_CONCRETE_PRESSURE_PLATE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_polished_concrete_pressure_plate", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_CONCRETE_PRESSURE_PLATE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	
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
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_VISITOR_CENTRE_DOOR = ModRegistry.ITEM_TYPES.register("jurassic_park_era_visitor_centre_door", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_VISITOR_CENTRE_DOOR.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_SECURITY_DOOR = ModRegistry.ITEM_TYPES.register("jurassic_park_era_security_door", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_SECURITY_DOOR.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<ScaffoldingItem> JURASSIC_PARK_ERA_METAL_SCAFFOLDING = ModRegistry.ITEM_TYPES.register("jurassic_park_era_metal_scaffolding", () -> new ScaffoldingItem(BlockInit.JURASSIC_PARK_ERA_METAL_SCAFFOLDING.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_PARK_ERA_THATCH_BUNDLE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_thatch_bundle", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_THATCH_BUNDLE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CONCRETE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_concrete", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CONCRETE_SLAB = ModRegistry.ITEM_TYPES.register("jurassic_world_era_concrete_slab", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_SLAB.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CONCRETE_STAIRS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_concrete_stairs", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_STAIRS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CONCRETE_WALL = ModRegistry.ITEM_TYPES.register("jurassic_world_era_concrete_wall", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_WALL.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CONCRETE_BUTTON = ModRegistry.ITEM_TYPES.register("jurassic_world_era_concrete_button", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_BUTTON.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CONCRETE_PRESSURE_PLATE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_concrete_pressure_plate", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_PRESSURE_PLATE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_POLISHED_CONCRETE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_polished_concrete", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_POLISHED_CONCRETE_SLAB = ModRegistry.ITEM_TYPES.register("jurassic_world_era_polished_concrete_slab", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_SLAB.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_POLISHED_CONCRETE_STAIRS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_polished_concrete_stairs", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_STAIRS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_POLISHED_CONCRETE_WALL = ModRegistry.ITEM_TYPES.register("jurassic_world_era_polished_concrete_wall", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_WALL.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_POLISHED_CONCRETE_BUTTON = ModRegistry.ITEM_TYPES.register("jurassic_world_era_polished_concrete_button", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_BUTTON.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_POLISHED_CONCRETE_PRESSURE_PLATE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_polished_concrete_pressure_plate", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CONCRETE_PRESSURE_PLATE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB))); 
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WOOD = ModRegistry.ITEM_TYPES.register("jurassic_world_era_wood", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WOOD.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WOOD_SLAB = ModRegistry.ITEM_TYPES.register("jurassic_world_era_wood_slab", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WOOD_SLAB.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WOOD_STAIRS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_wood_stairs", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WOOD_STAIRS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WOOD_FENCE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_wood_fence", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WOOD_FENCE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WOOD_FENCE_GATE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_wood_fence_gate", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WOOD_FENCE_GATE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WOOD_BUTTON = ModRegistry.ITEM_TYPES.register("jurassic_world_era_wood_button", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WOOD_BUTTON.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WOOD_PRESSURE_PLATE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_wood_pressure_plate", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WOOD_PRESSURE_PLATE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_FLAT_PAVEMENT = ModRegistry.ITEM_TYPES.register("jurassic_world_era_flat_pavement", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_FLAT_PAVEMENT.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_RAISED_PAVEMENT = ModRegistry.ITEM_TYPES.register("jurassic_world_era_raised_pavement", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_RAISED_PAVEMENT.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_STEEP_RAISED_PAVEMENT = ModRegistry.ITEM_TYPES.register("jurassic_world_era_steep_raised_pavement", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_STEEP_RAISED_PAVEMENT.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_TILE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_tile", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_TILE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_TILE_SLAB = ModRegistry.ITEM_TYPES.register("jurassic_world_era_tile_slab", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_TILE_SLAB.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_TILE_STAIRS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_tile_stairs", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_TILE_STAIRS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CLEAR_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_clear_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CLEAR_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CLEAR_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_clear_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CLEAR_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_RED_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_red_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_RED_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_RED_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_red_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_RED_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_ORANGE_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_orange_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_ORANGE_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_ORANGE_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_orange_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_ORANGE_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_YELLOW_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_yellow_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_YELLOW_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_YELLOW_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_yellow_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_YELLOW_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIME_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_lime_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIME_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIME_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_lime_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIME_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_GREEN_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_green_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_GREEN_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_GREEN_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_green_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_GREEN_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CYAN_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_cyan_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CYAN_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CYAN_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_cyan_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CYAN_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BLUE_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_blue_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BLUE_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BLUE_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_blue_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BLUE_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIGHT_BLUE_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_light_blue_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIGHT_BLUE_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIGHT_BLUE_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_light_blue_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIGHT_BLUE_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_PURPLE_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_purple_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_PURPLE_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_PURPLE_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_purple_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_PURPLE_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_MAGENTA_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_magenta_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_MAGENTA_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_MAGENTA_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_magenta_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_MAGENTA_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_PINK_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_pink_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_PINK_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_PINK_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_pink_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_PINK_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BROWN_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_brown_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BROWN_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BROWN_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_brown_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BROWN_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_GREY_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_grey_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_GREY_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_GREY_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_grey_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_GREY_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIGHT_GREY_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_light_grey_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIGHT_GREY_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIGHT_GREY_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_light_grey_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIGHT_GREY_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WHITE_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_white_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WHITE_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WHITE_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_white_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WHITE_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BLACK_GLASS = ModRegistry.ITEM_TYPES.register("jurassic_world_era_black_glass", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BLACK_GLASS.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BLACK_GLASS_PANE = ModRegistry.ITEM_TYPES.register("jurassic_world_era_black_glass_pane", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BLACK_GLASS_PANE.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_INNOVATION_CENTRE = ModRegistry.ITEM_TYPES.register("jurassic_park_era_toilet_door", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_TOILET_DOOR.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_GLASS_DOOR = ModRegistry.ITEM_TYPES.register("jurassic_park_era_visitor_centre_door", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_VISITOR_CENTRE_DOOR.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BACK_DOOR = ModRegistry.ITEM_TYPES.register("jurassic_park_era_security_door", () -> new BlockItem(BlockInit.JURASSIC_PARK_ERA_SECURITY_DOOR.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_RED_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_red_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_RED_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_ORANGE_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_orange_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_ORANGE_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_YELLOW_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_yellow_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_YELLOW_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIME_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_lime_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIME_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_GREEN_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_green_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_GREEN_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_CYAN_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_cyan_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_CYAN_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BLUE_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_blue_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BLUE_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIGHT_BLUE_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_light_blue_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIGHT_BLUE_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_PURPLE_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_purple_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_PURPLE_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_MAGENTA_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_magenta_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_MAGENTA_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_PINK_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_pink_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_PINK_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BROWN_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_brown_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BROWN_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_GREY_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_grey_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_GREY_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_LIGHT_GREY_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_light_grey_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_LIGHT_GREY_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_WHITE_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_white_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_WHITE_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	public static final RegistryObject<BlockItem> JURASSIC_WORLD_ERA_BLACK_DECORATION_BLOCK = ModRegistry.ITEM_TYPES.register("jurassic_world_era_black_decoration_block", () -> new BlockItem(BlockInit.JURASSIC_WORLD_ERA_BLACK_DECORATION_BLOCK.get(), new Item.Properties().group(CreativeTab.ANCIENT_TAB)));	
	
	//Registry
	public static void registerBlockItems() { }
}
