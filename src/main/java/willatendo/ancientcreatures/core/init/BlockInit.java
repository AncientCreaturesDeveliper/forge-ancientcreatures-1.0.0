package willatendo.ancientcreatures.core.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.OreBlock;
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
import willatendo.ancientcreatures.common.block.PanelBlock;
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
	public static final RegistryObject<StoneButtonBlock> JURASSIC_PARK_ERA_CONCRETE_BUTTON = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_concrete_button", () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<PressurePlateBlock> JURASSIC_PARK_ERA_CONCRETE_PRESSURE_PLATE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_concrete_pressure_plate", () -> new PressurePlateBlock(Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().hardnessAndResistance(6.0F, 10.0F).sound(SoundType.STONE)));
	
	//Wood
	public static final RegistryObject<Block> JURASSIC_PARK_ERA_WOOD = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> JURASSIC_PARK_ERA_WOOD_SLAB = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<StairsBlock> JURASSIC_PARK_ERA_WOOD_STAIRS = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_stairs", () -> new StairsBlock(() -> BlockInit.JURASSIC_PARK_ERA_WOOD.get().getDefaultState(), AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<FenceBlock> JURASSIC_PARK_ERA_WOOD_FENCE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<FenceGateBlock> JURASSIC_PARK_ERA_WOOD_FENCE_GATE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<WoodButtonBlock> JURASSIC_PARK_ERA_WOOD_BUTTON = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_button", () -> new WoodButtonBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<PressurePlateBlock> JURASSIC_PARK_ERA_WOOD_PRESSURE_PLATE = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_wood_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(4.5F, 7.5F).sound(SoundType.WOOD)));
	
	//Panel
	public static final RegistryObject<PanelBlock> JURASSIC_PARK_ERA_FOSSIL_PANEL = ModRegistry.BLOCK_TYPES.register("jurassic_park_era_fossil_panel", () -> new PanelBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().hardnessAndResistance(1.5F, 0.5F).sound(SoundType.STONE)));
	
	//Registry
	public static void registerBlocks() { } 
}
