package com.exercices.operations.Calcul;

/**
 * Cette classe fournit des méthodes pour effectuer des opérations arithmétiques de base.
 */
public class Calculatrice {

    /**
     * Effectue l'addition de deux entiers.
     *
     * @param a Le premier entier.
     * @param b Le deuxième entier.
     * @return La somme de a et b.
     */
    public int additionner(int a, int b) {
        return a + b;
    }

    /**
     * Effectue la soustraction de deux entiers.
     *
     * @param a Le premier entier.
     * @param b Le deuxième entier.
     * @return La différence entre a et b.
     */
    public int soustraire(int a, int b) {
        return a - b;
    }

    /**
     * Effectue la multiplication de deux entiers.
     *
     * @param a Le premier entier.
     * @param b Le deuxième entier.
     * @return Le produit de a et b.
     */
    public int multiplier(int a, int b) {
        return a * b;
    }

    /**
     * Effectue la division de deux entiers.
     *
     * @param a Le numérateur.
     * @param b Le dénominateur (doit être différent de zéro).
     * @return Le résultat de la division de a par b.
     * @throws IllegalArgumentException Si b est égal à zéro.
     */
    public double diviser(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        return (double) a / b;
    }
}
