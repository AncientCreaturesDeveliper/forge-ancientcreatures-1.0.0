package willatendo.ancientcreatures.core.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import willatendo.ancientcreatures.core.init.ItemInit;
import willatendo.ancientcreatures.core.util.reference.Reference;

public class CreativeTab 
{
	//Tab Thing
	public static final ItemGroup ANCIENT_TAB = new AncientCreaturesTab(Reference.ID).setBackgroundImageName("item_search.png");
	
	//Tab Class
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
	}
}
