package willatendo.ancientcreatures.core.init;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import willatendo.ancientcreatures.common.item.CompactDiscItem;
import willatendo.ancientcreatures.common.item.FloppyDiscItem;
import willatendo.ancientcreatures.core.tab.CreativeTab;
import willatendo.ancientcreatures.core.util.enums.ModItemTeirs;
import willatendo.ancientcreatures.core.util.registry.ModRegistry;

public class ItemInit 
{
	public static final RegistryObject<Item> PLASTER_AND_BANDAGES = ModRegistry.ITEM_TYPES.register("plaster_and_bandages", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<Item> COPPER_INGOT = ModRegistry.ITEM_TYPES.register("copper_ingot", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<Item> COPPER_NUGGET = ModRegistry.ITEM_TYPES.register("copper_nugget", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<Item> COPPER_WIRE = ModRegistry.ITEM_TYPES.register("copper_wire", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<Item> CRYSTALISED_OIL_SHARD = ModRegistry.ITEM_TYPES.register("crystalised_oil_shard", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB).maxStackSize(16)));
	public static final RegistryObject<Item> MELTED_OIL_BUCKET = ModRegistry.ITEM_TYPES.register("melted_oil_bucket", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB).maxStackSize(1)));
	public static final RegistryObject<Item> OIL_RESIN_BUCKET = ModRegistry.ITEM_TYPES.register("oil_resin_bucket", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB).maxStackSize(1)));
	public static final RegistryObject<Item> MOLTEN_PLASTIC_BUCKET = ModRegistry.ITEM_TYPES.register("molten_plastic_bucket", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB).maxStackSize(1)));

	public static final RegistryObject<FloppyDiscItem> FLOPPY_DISC = ModRegistry.ITEM_TYPES.register("floppy_disc", () -> new FloppyDiscItem(new Item.Properties().group(CreativeTab.ANCIENT_TAB).maxStackSize(1)));
	public static final RegistryObject<CompactDiscItem> COMPACT_DISC = ModRegistry.ITEM_TYPES.register("compact_disc", () -> new CompactDiscItem(new Item.Properties().group(CreativeTab.ANCIENT_TAB).maxStackSize(1)));

	public static final RegistryObject<Item> COMPUTER_FAN = ModRegistry.ITEM_TYPES.register("computer_fan", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<Item> COMPUTER_SCREEN = ModRegistry.ITEM_TYPES.register("computer_screen", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<Item> COMPUTER_FRAME = ModRegistry.ITEM_TYPES.register("computer_frame", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<Item> COMPUTER_STORAGE_PORT = ModRegistry.ITEM_TYPES.register("computer_storage_port", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<Item> CPU = ModRegistry.ITEM_TYPES.register("cpu", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<Item> MOTHERBOARD = ModRegistry.ITEM_TYPES.register("motherboard", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<Item> RAM = ModRegistry.ITEM_TYPES.register("ram", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));

	public static final RegistryObject<Item> PLASTIC_EGG_MOULD = ModRegistry.ITEM_TYPES.register("plastic_egg_mould", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	
	public static final RegistryObject<Item> BROKEN_CRYSTAL_SCARAB_GEM = ModRegistry.ITEM_TYPES.register("broken_crystal_scarab_gem", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_GEM = ModRegistry.ITEM_TYPES.register("crystal_scarab_gem", () -> new Item(new Item.Properties().group(CreativeTab.ANCIENT_TAB)));
		
	public static final RegistryObject<SwordItem> CRYSTAL_SCARAB_SWORD = ModRegistry.ITEM_TYPES.register("crystal_scarab_sword", () -> new SwordItem(ModItemTeirs.SCARAB, 30, -3.0F, (new Item.Properties().group(CreativeTab.ANCIENT_TAB)))); 
	public static final RegistryObject<ShovelItem> CRYSTAL_SCARAB_SHOVEL = ModRegistry.ITEM_TYPES.register("crystal_scarab_shovel", () ->  new ShovelItem(ModItemTeirs.SCARAB, 10.0F, -3.0F, (new Item.Properties().group(CreativeTab.ANCIENT_TAB))));
	public static final RegistryObject<PickaxeItem> CRYSTAL_SCARAB_PICKAXE = ModRegistry.ITEM_TYPES.register("crystal_scarab_pickaxe", () ->  new PickaxeItem(ModItemTeirs.SCARAB, 15, -2.8F, (new Item.Properties().group(CreativeTab.ANCIENT_TAB))));
	public static final RegistryObject<AxeItem> CRYSTAL_SCARAB_AXE = ModRegistry.ITEM_TYPES.register("crystal_scarab_axe", () ->  new AxeItem(ModItemTeirs.SCARAB, 60.0F, -3.2F, (new Item.Properties().group(CreativeTab.ANCIENT_TAB))));
	public static final RegistryObject<HoeItem> CRYSTAL_SCARAB_HOE = ModRegistry.ITEM_TYPES.register("crystal_scarab_hoe", () ->  new HoeItem(ModItemTeirs.SCARAB, 5, -3.0F, (new Item.Properties().group(CreativeTab.ANCIENT_TAB))));
	
	//Registry
	public static void registerItems() { } 
}
