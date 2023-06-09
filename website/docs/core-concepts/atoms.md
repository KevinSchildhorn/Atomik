---
sidebar_position: 2
---

# Atoms

Atoms are the defining feature in Atomic Design. In Atomik, Atoms are an abstract class that contain information about a UI Element. These Atoms can implement 


 * An abstract class that represents an Atom. While interfaces are used to specify what Atoms conform to,
 * the [Atom] class provides the UI details. In Atomic Design, components contain subcomponents
 * that are related to the parent component. For example Organisms contain Molecules, which contain Atoms.
 *


 * A common interface that represents an Atom. These interfaces are used to specify what the
 * Atoms must contain, and can be used to get specific information about an atom.
 * This is the basis of Atomik. Other Atoms inherit from this interface to add UI details to the
 * Atom, such as [ColorAtom] or [TextAtom]. Then a UI representation such as a [ButtonAtom]
 * implements these interfaces and provides the details to correctly display the UI.
 * AtomInterface

Atomik contains both pre-made atom classes as well as interfaces to create custom atoms. 

### Presets

One example of a preset is the `FigmaShapeAtom` which contains data entered in a Figma component.

```kotlin
val color = AtomikColor(r = 100, g = 100, b = 100, a = null)

val sampleAtom = FigmaShapeAtom(
    constraintX = AtomikConstraintX.ALIGN_LEFT,
    constraintY = AtomikConstraintY.ALIGN_TOP,
    color = color,
)
```