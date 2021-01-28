package willatendo.ancientcreatures.core.init;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import willatendo.ancientcreatures.common.entity.NautilusEntity;
import willatendo.ancientcreatures.core.util.reference.Reference;
import willatendo.ancientcreatures.core.util.registry.ModRegistry;

public class EntityInit 
{
	//Nautilus
	public static final RegistryObject<EntityType<NautilusEntity>> NAUTILUS_ENTITY = ModRegistry.ENTITY_TYPES.register("nautilus_entity", () -> EntityType.Builder.<NautilusEntity>create(NautilusEntity::new, EntityClassification.WATER_CREATURE).size(1.0F, 1.0F).build(new ResourceLocation(Reference.ID, "nautilus_entity").toString()));
	
	//Registry
	public static void initEntities() { }
}
