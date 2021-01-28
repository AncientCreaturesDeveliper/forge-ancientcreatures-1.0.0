package willatendo.ancientcreatures.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import willatendo.ancientcreatures.common.entity.NautilusEntity;

public class NautilusModel<T extends NautilusEntity> extends EntityModel<T>
{
	private final ModelRenderer nautilus;
	private final ModelRenderer crown;
	private final ModelRenderer head_and_eye;
	private final ModelRenderer eye;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head;
	private final ModelRenderer cube_r2;
	private final ModelRenderer shell;
	private final ModelRenderer tentacles;
	private final ModelRenderer top;
	private final ModelRenderer tentacle3;
	private final ModelRenderer tentacle4;
	private final ModelRenderer mid;
	private final ModelRenderer tentacle2;
	private final ModelRenderer tentacle5;
	private final ModelRenderer bottom;
	private final ModelRenderer tentacle1;
	private final ModelRenderer tentacle6;

	public NautilusModel() 
	{
		textureWidth = 64;
		textureHeight = 64;

		nautilus = new ModelRenderer(this);
		nautilus.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		crown = new ModelRenderer(this);
		crown.setRotationPoint(0.0F, -6.8571F, -4.1722F);
		nautilus.addChild(crown);
		setRotationAngle(crown, 0.48F, 0.0F, 0.0F);
		crown.setTextureOffset(20, 0).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		crown.setTextureOffset(0, 32).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		head_and_eye = new ModelRenderer(this);
		head_and_eye.setRotationPoint(0.0F, -3.75F, -3.5F);
		nautilus.addChild(head_and_eye);
		

		eye = new ModelRenderer(this);
		eye.setRotationPoint(0.0F, 0.0F, -0.25F);
		head_and_eye.addChild(eye);
		setRotationAngle(eye, -0.1309F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.2057F, 0.5365F);
		eye.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(33, 18).addBox(-2.0F, -0.6998F, -0.9913F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head_and_eye.addChild(head);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.425F, 2.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6981F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(30, 8).addBox(-1.5F, -3.0F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, false);

		shell = new ModelRenderer(this);
		shell.setRotationPoint(0.0F, -6.25F, 3.0F);
		nautilus.addChild(shell);
		setRotationAngle(shell, 0.1745F, 0.0F, 0.0F);
		shell.setTextureOffset(0, 0).addBox(-2.5F, -5.0F, -5.0F, 5.0F, 8.0F, 10.0F, 0.2F, false);
		shell.setTextureOffset(0, 18).addBox(-2.5F, 2.2121F, -6.0013F, 5.0F, 3.0F, 11.0F, 0.4F, false);

		tentacles = new ModelRenderer(this);
		tentacles.setRotationPoint(0.0F, -3.175F, -3.725F);
		nautilus.addChild(tentacles);
		setRotationAngle(tentacles, 0.3927F, 0.0F, 0.0F);
		

		top = new ModelRenderer(this);
		top.setRotationPoint(0.0F, 0.0F, 0.0F);
		tentacles.addChild(top);
		

		tentacle3 = new ModelRenderer(this);
		tentacle3.setRotationPoint(-0.9829F, -1.3401F, 0.3759F);
		top.addChild(tentacle3);
		setRotationAngle(tentacle3, 0.0F, 0.3054F, 0.6109F);
		tentacle3.setTextureOffset(0, 0).addBox(1.0598F, 0.5729F, -4.848F, 0.0F, 1.0F, 5.0F, 0.0F, false);

		tentacle4 = new ModelRenderer(this);
		tentacle4.setRotationPoint(0.9829F, -1.3401F, 0.3759F);
		top.addChild(tentacle4);
		setRotationAngle(tentacle4, 0.0F, -0.3054F, -0.6109F);
		tentacle4.setTextureOffset(21, 13).addBox(-1.0598F, 0.5729F, -5.848F, 0.0F, 1.0F, 6.0F, 0.0F, false);

		mid = new ModelRenderer(this);
		mid.setRotationPoint(0.0F, 0.0F, 0.0F);
		tentacles.addChild(mid);
		

		tentacle2 = new ModelRenderer(this);
		tentacle2.setRotationPoint(-1.0F, 0.025F, -0.5F);
		mid.addChild(tentacle2);
		setRotationAngle(tentacle2, 0.0F, 0.2182F, 0.0F);
		tentacle2.setTextureOffset(20, 2).addBox(-0.2371F, 0.2424F, -6.5307F, 0.0F, 1.0F, 7.0F, 0.0F, false);

		tentacle5 = new ModelRenderer(this);
		tentacle5.setRotationPoint(1.0F, 0.025F, -0.5F);
		mid.addChild(tentacle5);
		setRotationAngle(tentacle5, 0.0F, -0.2182F, 0.0F);
		tentacle5.setTextureOffset(20, 1).addBox(0.2371F, 0.2424F, -6.5307F, 0.0F, 1.0F, 7.0F, 0.0F, false);

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		tentacles.addChild(bottom);
		

		tentacle1 = new ModelRenderer(this);
		tentacle1.setRotationPoint(-1.0F, 1.025F, -0.5F);
		bottom.addChild(tentacle1);
		setRotationAngle(tentacle1, 0.0F, 0.2182F, -0.5236F);
		tentacle1.setTextureOffset(21, 14).addBox(-0.3107F, 0.1338F, -5.4532F, 0.0F, 1.0F, 6.0F, 0.0F, false);

		tentacle6 = new ModelRenderer(this);
		tentacle6.setRotationPoint(1.0F, 1.025F, -0.5F);
		bottom.addChild(tentacle6);
		setRotationAngle(tentacle6, 0.0F, -0.2182F, 0.5236F);
		tentacle6.setTextureOffset(21, 12).addBox(0.3107F, 0.1338F, -5.4532F, 0.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha)
	{
		nautilus.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) 
	{
		
	}
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) 
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) 
	{
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
	}
	
	public ModelRenderer getBottom() 
	{
		return bottom;
	}
	
	public ModelRenderer getCrown() 
	{
		return crown;
	}
	
	public ModelRenderer getCube_r1() 
	{
		return cube_r1;
	}
	
	public ModelRenderer getCube_r2() 
	{
		return cube_r2;
	}
	
	public ModelRenderer getEye() 
	{
		return eye;
	}
	
	public ModelRenderer getHead() 
	{
		return head;
	}
	
	public ModelRenderer getHead_and_eye() 
	{
		return head_and_eye;
	}
	
	public ModelRenderer getMid() 
	{
		return mid;
	}
	
	public ModelRenderer getNautilus() 
	{
		return nautilus;
	}
	
	public ModelRenderer getShell() 
	{
		return shell;
	}
	
	public ModelRenderer getTentacle1() 
	{
		return tentacle1;
	}
	
	public ModelRenderer getTentacle2() 
	{
		return tentacle2;
	}
	
	public ModelRenderer getTentacle3() 
	{
		return tentacle3;
	}
	
	public ModelRenderer getTentacle4() 
	{
		return tentacle4;
	}
	
	public ModelRenderer getTentacle5() 
	{
		return tentacle5;
	}
	
	public ModelRenderer getTentacle6() 
	{
		return tentacle6;
	}
	
	public ModelRenderer getTentacles() 
	{
		return tentacles;
	}
	
	public ModelRenderer getTop() 
	{
		return top;
	}
}