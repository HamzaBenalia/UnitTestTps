package com.exercices.gestionzoo;

/**
 * Classe de base représentant un animal.
 */
public abstract class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    /**
     * Affiche le bruit que fait l'animal.
     */
    public abstract void faireDuBruit();

    @Override
    public String toString() {
        return nom + ", " + age + " ans";
    }
}

/**
 * Classe représentant un lion.
 */
class Lion extends Animal {

    public Lion(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Le lion " + nom + " rugit !");
    }
}

/**
 * Classe représentant un éléphant.
 */
class Elephant extends Animal {

    public Elephant(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("L'éléphant " + nom + " barrit !");
    }
}
