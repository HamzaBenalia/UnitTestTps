package com.exercices.gestionzoo;

/**
 * Classe de test pour le zoo.
 */
public class ZooApplication {

    public static void main(String[] args) {
        // Créer un zoo
        Zoo zoo = new Zoo();

        // Ajouter des animaux au zoo
        zoo.ajouterAnimal(new Lion("Simba", 5));
        zoo.ajouterAnimal(new Elephant("Dumbo", 10));

        // Afficher les animaux
        System.out.println("Les animaux dans le zoo :");
        zoo.afficherAnimaux();

        // Faire faire du bruit aux animaux
        System.out.println("\nLes animaux font du bruit :");
        zoo.faireFaireDuBruitAuxAnimaux();
    }
}
