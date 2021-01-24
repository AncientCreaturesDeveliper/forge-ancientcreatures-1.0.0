package willatendo.ancientcreatures.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SandPathBlock extends FallingBlock
{
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
	
	public SandPathBlock(Properties properties) 
	{
		super(properties);
	}
	
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public int getDustColor(BlockState state, IBlockReader reader, BlockPos pos) 
	{
		return 14406560;
	}
	
	public boolean isTransparent(BlockState state) 
	{
		return true;
	}
	
	public BlockState getStateForPlacement(BlockItemUseContext context) 
	{
		return !this.getDefaultState().isValidPosition(context.getWorld(), context.getPos()) ? Block.nudgeEntitiesWithNewState(this.getDefaultState(), Blocks.SAND.getDefaultState(), context.getWorld(), context.getPos()) : super.getStateForPlacement(context);
	}
	
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) 
	{
		if (facing == Direction.UP && !stateIn.isValidPosition(worldIn, currentPos)) 
		{
			worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 1);
		}
		
		return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) 
	{
		turnToBlock(state, worldIn, pos);
	}
	
	public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) 
	{
		BlockState blockstate = worldIn.getBlockState(pos.up());
		return !blockstate.getMaterial().isSolid() || blockstate.getBlock() instanceof FenceGateBlock;
	}
	
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 
	{
		return SHAPE;
	}
	
	public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) 
	{
		return false;
	}
	
	public static void turnToBlock(BlockState state, World worldIn, BlockPos pos) 
	{
		worldIn.setBlockState(pos, nudgeEntitiesWithNewState(state, Blocks.SAND.getDefaultState(), worldIn, pos));
	}
}
