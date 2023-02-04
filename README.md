# Atomik

Atomik is a Kotlin Multiplatform library that acts as an implementation of a design system in your shared code. It's in an experimental early stage, and should be used for testing purposes only.


## Getting Started

To start using `Atomik`, follow these docs:
1. [Creating a Design System](CREATING_A_DESIGN_SYSTEM.MD)
2. [Creating an atom](CREATING_AN_ATOM.MD)
3. [Using an atom](USING_AN_ATOM.MD)

## What is a Design System

A design system is a collection of reusable components, guided by clear standards, that can be assembled together to build any number of applications.
(This collection of reusable components can also be referred to as a Pattern Library). The design system for developer purposes consists of five major sections:
* Layout - The spacing and organization of components
* Typography - The font and styling of text
* Color - The colors used in the design
* Components - UI elements used in the design
* Iconography - logos and images used in the design
* 
## What is Atomic Design
Atomic design is methodology for creating design systems, described by [Brad Frost](https://bradfrost.com/blog/post/atomic-web-design/), in which you create components that can be made up of sub-components, similar to atoms.

For example a Search Bar Molecule can contain a Button atom and a Text Field atom together.

The five layers are:
* Atoms
* Molecules
* Organisms
* Templates
* Pages