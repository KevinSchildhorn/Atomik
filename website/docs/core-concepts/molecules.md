---
sidebar_position: 2
---

# Molecules and Beyond

## Molecules

`Molecules` are made up of multiple atoms.

```kotlin
abstract class BaseMolecule {
    abstract val atoms: List<Atom>
}
```

`Molecules` can also implement Atom interfaces. You can either hold all the atoms in the `List`, or hold references to specific atoms. For example:

```kotlin
class TextButtonMolecule(
    color: AtomikColor,
    disabledColor: AtomikColor,
    radius: Int = 0,
    height: Int?,
    textColor: AtomikColor,
    typography: AtomikTypography,
    fontFamily: AtomikFontFamily?,
) : BaseMolecule() {

    val buttonAtom = ButtonAtom(
        enabledColor = AtomikEnabledColor(color, disabledColor),
        radius = radius,
        height = height
    )

    val textAtom = TextViewAtom(
        textColor = textColor,
        typography = typography,
        fontFamily = fontFamily,
    )


    override val atoms: List<Atom> = listOf(buttonAtom, textAtom)
}
```