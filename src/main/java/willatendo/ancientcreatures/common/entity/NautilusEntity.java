package willatendo.ancientcreatures.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class NautilusEntity extends AbstractFishEntity
{
	public NautilusEntity(EntityType<? extends NautilusEntity> type, World worldIn) 
	{
		super(type, worldIn);
	}

	@Override
	protected ItemStack getFishBucket() 
	{
		return null;
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		return SoundEvents.ENTITY_SQUID_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) 
	{
		return SoundEvents.BLOCK_ANVIL_HIT;
	}
	
	@Override
	protected SoundEvent getDeathSound() 
	{
		return SoundEvents.BLOCK_ANVIL_HIT;
	}

	@Override
	protected SoundEvent getFlopSound() 
	{
		return SoundEvents.BLOCK_ANVIL_DESTROY;
	}	
}
