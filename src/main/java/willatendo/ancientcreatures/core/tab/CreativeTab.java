package willatendo.ancientcreatures.core.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import willatendo.ancientcreatures.core.init.BlockItemInit;
import willatendo.ancientcreatures.core.init.ItemInit;
import willatendo.ancientcreatures.core.util.reference.Reference;

public class CreativeTab 
{
	public static final ItemGroup ANCIENT_TAB = new AncientCreaturesTab(Reference.ID).setBackgroundImageName("item_search.png");
	
	public static class AncientCreaturesTab extends ItemGroup
	{
		public AncientCreaturesTab(String label)
		{
			super(label);
		}
		
		@Override
		public ItemStack createIcon() 
		{
			return ItemInit.PLASTER_AND_BANDAGES.get().getDefaultInstance();
		}
		
		@Override
		public boolean hasSearchBar() 
		{
			return true;
		}
		
		@Override
		public void fill(NonNullList<ItemStack> items) 
		{
			//Items
			items.add(ItemInit.BROKEN_CRYSTAL_SCARAB_GEM.get().getDefaultInstance());
			items.add(ItemInit.COMPACT_DISC.get().getDefaultInstance());
			items.add(ItemInit.COMPUTER_FAN.get().getDefaultInstance());
			items.add(ItemInit.COMPUTER_FRAME.get().getDefaultInstance());
			items.add(ItemInit.COMPUTER_SCREEN.get().getDefaultInstance());
			items.add(ItemInit.COMPUTER_STORAGE_PORT.get().getDefaultInstance());
			items.add(ItemInit.COPPER_INGOT.get().getDefaultInstance());
			items.add(ItemInit.COPPER_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.COPPER_WIRE.get().getDefaultInstance());
			items.add(ItemInit.CPU.get().getDefaultInstance());
			items.add(ItemInit.CRYSTAL_SCARAB_AXE.get().getDefaultInstance());
			items.add(ItemInit.CRYSTAL_SCARAB_GEM.get().getDefaultInstance());
			items.add(ItemInit.CRYSTAL_SCARAB_HOE.get().getDefaultInstance());
			items.add(ItemInit.CRYSTAL_SCARAB_PICKAXE.get().getDefaultInstance());
			items.add(ItemInit.CRYSTAL_SCARAB_SHOVEL.get().getDefaultInstance());
			items.add(ItemInit.CRYSTAL_SCARAB_SWORD.get().getDefaultInstance());
			items.add(ItemInit.CRYSTALISED_OIL_SHARD.get().getDefaultInstance());
			items.add(ItemInit.FLOPPY_DISC.get().getDefaultInstance());
			items.add(ItemInit.MELTED_OIL_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.MOLTEN_PLASTIC_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.MOTHERBOARD.get().getDefaultInstance());
			items.add(ItemInit.MUSIC_DISC_JURASSIC_PARK_THEME.get().getDefaultInstance());
			items.add(ItemInit.OIL_RESIN_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.PLASTER_AND_BANDAGES.get().getDefaultInstance());			
			items.add(ItemInit.PLASTIC_EGG_MOULD.get().getDefaultInstance());			
			items.add(ItemInit.RAM.get().getDefaultInstance());		
			
			//Blocks
			items.add(BlockItemInit.COPPER_ORE.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_CONCRETE.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_CONCRETE_BUTTON.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_CONCRETE_PRESSURE_PLATE.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_CONCRETE_SLAB.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_CONCRETE_STAIRS.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_CONCRETE_WALL.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_FOSSIL_PANEL.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_WOOD.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_WOOD_BUTTON.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_WOOD_FENCE.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_WOOD_FENCE_GATE.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_WOOD_PRESSURE_PLATE.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_WOOD_SLAB.get().getDefaultInstance());
			items.add(BlockItemInit.JURASSIC_PARK_ERA_WOOD_STAIRS.get().getDefaultInstance());
			
			//Eggs
		}
	}
}
