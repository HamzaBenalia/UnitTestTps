package com.exercices.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un inventaire composé de plusieurs caisses.
 */
public class Inventaire {

    private final List<Caisse> caisses; // Rendre la liste des caisses final

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    /**
     * Ajoute un article à la caisse appropriée en fonction de son poids.
     *
     * @param item L'article à ajouter (ne doit pas être null).
     * @throws IllegalArgumentException Si l'article est null ou si son poids est négatif.
     */
    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("L'article ne peut pas être null.");
        }
        if (item.getPoids() < 0) {
            throw new IllegalArgumentException("Le poids de l'article ne peut pas être négatif.");
        }

        Caisse caisse = getCaissePourItem(item);
        if (caisse != null) {
            caisse.addItem(item);
        } else {
            throw new IllegalArgumentException("Aucune caisse appropriée trouvée pour cet article.");
        }
    }

    /**
     * Retourne le nombre total d'articles dans toutes les caisses.
     *
     * @return La taille totale de l'inventaire.
     */
    public int taille() {
        int tailleTotale = 0;
        for (Caisse caisse : caisses) {
            tailleTotale += caisse.getNombreItems();
        }
        return tailleTotale;
    }

    /**
     * Détermine la caisse appropriée pour un article en fonction de son poids.
     *
     * @param item L'article dont le poids détermine la caisse.
     * @return La caisse appropriée pour l'article.
     */
    private Caisse getCaissePourItem(Item item) {
        if (item.getPoids() < 5) {
            return caisses.get(0); // Petits objets
        } else if (item.getPoids() >= 5 && item.getPoids() <= 20) {
            return caisses.get(1); // Moyens objets
        } else if (item.getPoids() > 20) {
            return caisses.get(2); // Grands objets
        }
        return null; // En cas d'erreur, aucune caisse trouvée
    }
}
