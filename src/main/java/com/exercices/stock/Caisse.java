package com.exercices.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une caisse contenant des articles.
 */
public class Caisse {

    private final String nom; // Rendre nom final pour l'immuabilité
    private final List<Item> items; // Rendre items final

    /**
     * Constructeur pour initialiser une caisse avec un nom.
     *
     * @param nom Le nom de la caisse (ne doit pas être null ou vide).
     */
    public Caisse(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de la caisse ne peut pas être null ou vide.");
        }
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut nom.
     *
     * @return Le nom de la caisse.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter pour l'attribut items.
     *
     * @return La liste des articles dans la caisse.
     */
    public List<Item> getItems() {
        return new ArrayList<>(items);  // Retourne une copie de la liste pour éviter les modifications externes
    }

    /**
     * Ajoute un article à la caisse.
     *
     * @param item L'article à ajouter (ne doit pas être null).
     * @throws IllegalArgumentException Si l'article est null.
     */
    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("L'article à ajouter ne peut pas être null.");
        }
        this.items.add(item);
    }

    /**
     * Retire un article de la caisse.
     *
     * @param item L'article à retirer.
     * @return true si l'article a été retiré, false sinon.
     */
    public boolean removeItem(Item item) {
        return this.items.remove(item);
    }

    /**
     * Retourne le nombre d'articles dans la caisse.
     *
     * @return Le nombre d'articles.
     */
    public int getNombreItems() {
        return items.size();
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la caisse.
     *
     * @return Informations sur la caisse.
     */
    @Override
    public String toString() {
        return "Caisse{" +
                "nom='" + nom + '\'' +
                ", nombre d'articles=" + getNombreItems() +
                '}';
    }
}
