package hog.frayonores.overridedstructures.Structures;

import com.mojang.serialization.Codec;
import hog.frayonores.overridedstructures.Overrided_Structures;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModStructures {
    public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(Registry.STRUCTURE_TYPE_REGISTRY, Overrided_Structures.MODID);
    private static <S extends Structure> StructureType<S> typeConvert(Codec<S> codec) {
        return () -> codec;
    }

    public static void register(IEventBus bus) {
        DEFERRED_REGISTRY_STRUCTURE.register(bus);
    }
}
