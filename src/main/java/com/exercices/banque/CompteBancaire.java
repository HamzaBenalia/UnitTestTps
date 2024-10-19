package com.exercices.banque;

/**
 * Classe abstraite représentant un compte bancaire.
 */
public abstract class CompteBancaire {

    protected double solde;

    public CompteBancaire(double solde) {
        if (solde < 0) {
            throw new IllegalArgumentException("Le solde ne peut pas être négatif.");
        }
        this.solde = solde;
    }

    public void ajouterMontant(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant à ajouter ne peut pas être négatif.");
        }
        this.solde += montant;
    }

    public double getSolde() {
        return solde;
    }

    public abstract void debiterMontant(double montant);

    public abstract void appliquerRemunerationAnnuelle();

    public abstract double getDecouvert();

    public abstract double getTauxRemuneration();

    public abstract String getType();
}
