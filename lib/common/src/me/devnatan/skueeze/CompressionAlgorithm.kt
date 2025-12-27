package me.devnatan.skueeze

public interface CompressionAlgorithm {

    public fun compress(
        input: UByteArray,
        level: CompressionLevel = CompressionLevel.DEFAULT
    ): UByteArray

    public fun decompress(input: UByteArray): UByteArray
}