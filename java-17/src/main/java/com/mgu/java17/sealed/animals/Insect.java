package com.mgu.java17.sealed.animals;

/*
 * Insect is non-sealed. so we can create as many subclasses
 * as we want.
 */
public non-sealed class Insect extends Animal {
    // ...
}

final class Ant extends Insect {
    // ...
}
