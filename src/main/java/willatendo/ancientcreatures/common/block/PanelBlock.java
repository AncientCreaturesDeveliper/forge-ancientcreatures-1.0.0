package willatendo.ancientcreatures.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class PanelBlock extends BaseVoxelShapedHorizontalBlock
{	
	private static final VoxelShape SHAPE = Block.makeCuboidShape(0, 0, 14, 16, 16, 16);
	
	public PanelBlock(Properties properties) 
	{
		super(properties);
		runCalculation(SHAPE);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 
	{
		return SHAPES.get(HORIZONTAL_FACING);
	}
}
