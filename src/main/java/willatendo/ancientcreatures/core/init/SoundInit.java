package willatendo.ancientcreatures.core.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import willatendo.ancientcreatures.core.util.reference.Reference;
import willatendo.ancientcreatures.core.util.registry.ModRegistry;

public class SoundInit 
{
	//Jurassic Park Theme
	public static final Lazy<SoundEvent> LAZY_JURASSIC_PARK_DISC = Lazy.of(() -> new SoundEvent(new ResourceLocation(Reference.ID, "disc.jurassic_park_theme")));
	public static final RegistryObject<SoundEvent> JURASSIC_PARK_DISC = ModRegistry.SOUND_EVENTS.register("jurassic_park_disc", LAZY_JURASSIC_PARK_DISC);

	//Registry
	public static void registerSoundEvents() { }
}
