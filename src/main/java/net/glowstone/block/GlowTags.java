package net.glowstone.block;

import com.destroystokyo.paper.MaterialSetTag;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Predicate;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.bukkit.block.data.Bisected;

/**
 * Useful constant groups of materials, many of which were just 1 or 2 materials pre-Flattening.
 */
public class GlowTags {
    private static NamespacedKey keyFor(String key) {
        //noinspection deprecation
        return new NamespacedKey("glowstone", key + "_settag");
    }
    public static final Tag<Material> WOODS = new MaterialSetTag(keyFor("woods"))
        .endsWith("_WOOD")
        .notStartsWith("STRIPPED_")
        .ensureSize("WOODS", 6);

    public static final Tag<Material> AIR_VARIANTS = new MaterialSetTag(keyFor("air_variants"))
        .endsWith("_AIR")
        .add(Material.AIR)
        .add(Material.STRUCTURE_VOID)
        .ensureSize("AIR_VARIANTS", 4);

    public static final Tag<Material> BISECTED_BLOCKS = new MaterialSetTag(keyFor("bisected_blocks"))
        .add(mat -> Bisected.class.isAssignableFrom(mat.getData()));
}
