
package willatendo.ancientcreatures.core.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.HayBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import willatendo.ancientcreatures.common.block.JPScaffoldingBlock;
import willatendo.ancientcreatures.core.util.registry.ModRegistry;

public class BlockInit 
{
	//Copper Ore
	public static final RegistryObject<OreBlock> COPPER_ORE = ModRegistry.BLOCK_TYPES.register("copper_ore", () -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	
	//Jurassic Park Era Decoration
	
	//Concrete
	public static final RegistryObject<Block> JURASSIC_PARK_ERA_CONCRETE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_concrete", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<SlabBlock> JURASSIC_PARK_ERA_CONCRETE_SLAB = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_concrete_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<StairsBlock> JURASSIC_PARK_ERA_CONCRETE_STAIRS = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_concrete_stairs", () -> new StairsBlock(() -> BlockInit.JURASSIC_PARK_ERA_CONCRETE.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<WallBlock> JURASSIC_PARK_ERA_CONCRETE_WALL = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_concrete_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<StoneButtonBlock> JURASSIC_PARK_ERA_CONCRETE_BUTTON = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_concrete_button", () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE).doesNotBlockMovement()));
	public static final RegistryObject<PressurePlateBlock> JURASSIC_PARK_ERA_CONCRETE_PRESSURE_PLATE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_concrete_pressure_plate", () -> new PressurePlateBlock(Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE).doesNotBlockMovement()));
	
	//Wood
	public static final RegistryObject<Block> JURASSIC_PARK_ERA_WOOD = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> JURASSIC_PARK_ERA_WOOD_SLAB = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<StairsBlock> JURASSIC_PARK_ERA_WOOD_STAIRS = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_stairs", () -> new StairsBlock(() -> BlockInit.JURASSIC_PARK_ERA_WOOD.get().getDefaultState(), AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<FenceBlock> JURASSIC_PARK_ERA_WOOD_FENCE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<FenceGateBlock> JURASSIC_PARK_ERA_WOOD_FENCE_GATE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<WoodButtonBlock> JURASSIC_PARK_ERA_WOOD_BUTTON = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_button", () -> new WoodButtonBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD).doesNotBlockMovement()));
	public static final RegistryObject<PressurePlateBlock> JURASSIC_PARK_ERA_WOOD_PRESSURE_PLATE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD).doesNotBlockMovement()));
		
	//Paths
	public static final RegistryObject<Block> JURASSIC_PARK_ERA_FLAT_PAVEMENT = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_flat_pavement", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(5.0F, 15.0F).sound(SoundType.STONE)));
	public static final RegistryObject<SlabBlock> JURASSIC_PARK_ERA_RAISED_PAVEMENT = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_raised_pavement", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(5.0F, 15.0F).sound(SoundType.STONE)));
	public static final RegistryObject<StairsBlock> JURASSIC_PARK_ERA_STEEP_RAISED_PAVEMENT = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_steep_raised_pavement", () -> new StairsBlock(() -> BlockInit.JURASSIC_PARK_ERA_FLAT_PAVEMENT.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(5.0F, 15.0F).sound(SoundType.STONE)));
	
	//Road
	public static final RegistryObject<Block> JURASSIC_PARK_ERA_FLAT_ROAD = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_flat_road", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<SlabBlock> JURASSIC_PARK_ERA_RAISED_ROAD = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_raised_road", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE)));	
	
	//Fence
	public static final RegistryObject<FenceBlock> JURASSIC_PARK_ERA_FENCE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_fence", () -> new FenceBlock(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));

	//Glass
	public static final RegistryObject<GlassBlock> JURASSIC_PARK_ERA_CLEAR_GLASS = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_clear_glass", () -> new GlassBlock(AbstractBlock.Properties.from(Blocks.GLASS)));
	public static final RegistryObject<PaneBlock> JURASSIC_PARK_ERA_CLEAR_GLASS_PANE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_clear_glass_pane", () -> new PaneBlock(AbstractBlock.Properties.from(Blocks.GLASS_PANE)));
	
	public static final RegistryObject<GlassBlock> JURASSIC_PARK_ERA_TINTED_GLASS = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_tinted_glass", () -> new GlassBlock(AbstractBlock.Properties.from(Blocks.GLASS)));
	public static final RegistryObject<PaneBlock> JURASSIC_PARK_ERA_TINTED_GLASS_PANE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_tinted_glass_pane", () -> new PaneBlock(AbstractBlock.Properties.from(Blocks.GLASS_PANE)));

	//Door
	public static final RegistryObject<DoorBlock> JURASSIC_PARK_ERA_TOILET_DOOR = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_toilet_door", () -> new DoorBlock(AbstractBlock.Properties.from(Blocks.ACACIA_DOOR)));
	public static final RegistryObject<DoorBlock> JURASSIC_PARK_ERA_VISITOR_CENTRE_DOOR = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_visitor_centre_door", () -> new DoorBlock(AbstractBlock.Properties.from(Blocks.ACACIA_DOOR)));	
	public static final RegistryObject<DoorBlock> JURASSIC_PARK_ERA_SECURITY_DOOR = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_security_door", () -> new DoorBlock(AbstractBlock.Properties.from(Blocks.IRON_DOOR)));
	
	//Scafolding
	public static final RegistryObject<JPScaffoldingBlock> JURASSIC_PARK_ERA_METAL_SCAFFOLDING = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_metal_scaffolding", () -> new JPScaffoldingBlock(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
	
	//Thatch Bundle
	public static final RegistryObject<HayBlock> JURASSIC_PARK_ERA_THATCH_BUNDLE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_thatch_bundle", () -> new HayBlock(AbstractBlock.Properties.from(Blocks.HAY_BLOCK)));
	
	//Registry
	public static void registerBlocks() { } 
}
