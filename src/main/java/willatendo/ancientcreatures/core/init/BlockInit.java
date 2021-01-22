package willatendo.ancientcreatures.core.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import willatendo.ancientcreatures.core.util.registry.ModRegistry;

public class BlockInit 
{
	//Copper Ore
	public static final RegistryObject<Block> COPPER_ORE = ModRegistry.BLOCK_TYPES.register("copper_ore", () -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool().hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	
	//Registry
	public static void registerBlocks() { } 
}
