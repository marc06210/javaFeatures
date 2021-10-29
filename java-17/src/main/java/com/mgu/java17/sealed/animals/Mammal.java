package com.mgu.java17.sealed.animals;

/**
 * Mammal is a finite group wih only Dogs and Cats.
 *
 */
public sealed class Mammal extends Animal permits Dog, Cat {}

final class Dog extends Mammal {}

final class Cat extends Mammal {}
