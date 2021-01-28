package willatendo.ancientcreatures.client.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import willatendo.ancientcreatures.client.entity.model.NautilusModel;
import willatendo.ancientcreatures.common.entity.NautilusEntity;
import willatendo.ancientcreatures.core.util.reference.Reference;

public class NautilusRender extends MobRenderer<NautilusEntity, NautilusModel<NautilusEntity>>
{
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Reference.ID, "textures/entity/nautilus/nautilus.png");
	
	public NautilusRender(EntityRendererManager renderManagerIn) 
	{
		super(renderManagerIn, new NautilusModel<NautilusEntity>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(NautilusEntity entity) 
	{
		return TEXTURE;
	}
}
