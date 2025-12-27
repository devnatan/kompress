package me.devnatan.skueeze

import kotlin.math.abs

public enum class CompressionLevel(
    private val value: Int,
) {
    NO_COMPRESSION(0),
    FASTEST(1),
    FAST(3),
    DEFAULT(6),
    BEST(9),
    ;

    public companion object {
        public fun fromValue(value: Int): CompressionLevel =
            entries.minByOrNull { level ->
                abs(level.value - value)
            } ?: DEFAULT
    }
}
