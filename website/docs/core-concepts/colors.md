---
sidebar_position: 3
---

# Colors

Atomik has its own custom Color object called `AtomikColor`. It is located in the common code so it can be shared between platforms.

```kotlin
public expect class AtomikColor {

    public val hexString: String
    public val r: Int
    public val g: Int
    public val b: Int
    public val a: Float

    public constructor(hex: Long)
    public constructor(r: Int, g: Int, b: Int, a: Float? = null)
}
```

## Creating a color

AtomikColors can be created either with an RGBA value or with a hex value, represented as a Long. Both support an optional alpha value

```kotlin
AtomikColor(0xFFFFFF)
AtomikColor(r = 255, g = 255, b = 255)
// With Alpha
AtomikColor(0xFFFFFF00)
AtomikColor(r = 255, g = 255, b = 255, a = 0)
```

After creating `AtomikColor` they should be added into your  [Color Set](./design-systems#colorset))