# squeeze

**The Ultimate Multiplatform Data Compression Library**

100% Pure Kotlin Native implementation with zero dependencies. Works everywhere Kotlin runs.

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    [...]
    implementation("me.devnatan:squeeze:0.1.0")
}
```

| Algorithm | RFC | Status | Description |
|-----------|-----|--------|-------------|
| **DEFLATE** | RFC-1951 | ⚠️ In Progress | Core compression (LZ77 + Huffman) |