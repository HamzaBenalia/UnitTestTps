package com.exercices.stock;

/**
 * Représente un article avec un nom et un poids.
 */
public class Item {

    private final String nom; // Rendre l'attribut nom final
    private final int poids;   // Rendre l'attribut poids final

    /**
     * Constructeur pour créer un article avec un nom et un poids.
     *
     * @param nom   Le nom de l'article (ne doit pas être null ou vide).
     * @param poids Le poids de l'article (ne doit pas être négatif).
     */
    public Item(String nom, int poids) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être null ou vide.");
        }
        if (poids < 0) {
            throw new IllegalArgumentException("Le poids ne peut pas être négatif.");
        }

        this.nom = nom;
        this.poids = poids;
    }

    /**
     * Getter pour l'attribut nom.
     *
     * @return Le nom de l'article.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter pour l'attribut poids.
     *
     * @return Le poids de l'article.
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'article.
     *
     * @return Une chaîne contenant le nom et le poids de l'article.
     */
    @Override
    public String toString() {
        return "Item{" +
                "nom='" + nom + '\'' +
                ", poids=" + poids +
                '}';
    }
}
