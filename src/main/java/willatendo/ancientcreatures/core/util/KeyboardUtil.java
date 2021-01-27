package willatendo.ancientcreatures.core.util;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class KeyboardUtil 
{
	public static final long MINECRAFT_WINDOW = Minecraft.getInstance().getMainWindow().getHandle();
	
	@OnlyIn(Dist.CLIENT)
	public static boolean isLeftShiftInUse()
	{
		return InputMappings.isKeyDown(MINECRAFT_WINDOW, GLFW.GLFW_KEY_LEFT_SHIFT);
	}
}