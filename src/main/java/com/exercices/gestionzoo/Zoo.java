package com.exercices.gestionzoo;

import com.exercices.gestionzoo.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un zoo qui contient des animaux.
 */
public class Zoo {

    private List<Animal> animaux;

    public Zoo() {
        animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param animal l'animal à ajouter
     */
    public void ajouterAnimal(Animal animal) {
        if (animal != null) {
            animaux.add(animal);
        } else {
            throw new IllegalArgumentException("L'animal ne peut pas être null.");
        }
    }

    /**
     * Affiche tous les animaux présents dans le zoo.
     */
    public void afficherAnimaux() {
        if (animaux.isEmpty()) {
            System.out.println("Le zoo ne contient aucun animal.");
        } else {
            for (Animal animal : animaux) {
                System.out.println(animal);
            }
        }
    }

    /**
     * Fait faire du bruit à tous les animaux présents dans le zoo.
     */
    public void faireFaireDuBruitAuxAnimaux() {
        for (Animal animal : animaux) {
            animal.faireDuBruit();
        }
    }
}
