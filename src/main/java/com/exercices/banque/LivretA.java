package com.exercices.banque;

/**
 * Représente un livret A.
 */
public class LivretA extends CompteBancaire {

    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        if (tauxRemuneration < 0) {
            throw new IllegalArgumentException("Le taux de rémunération ne peut pas être négatif.");
        }
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void debiterMontant(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant à débiter ne peut pas être négatif.");
        }
        if (solde - montant < 0) {
            throw new IllegalArgumentException("Le solde ne peut pas devenir négatif.");
        }
        solde -= montant;
    }

    @Override
    public void appliquerRemunerationAnnuelle() {
        solde += solde * tauxRemuneration / 100;
    }

    @Override
    public double getDecouvert() {
        return 0; // Pas de découvert pour les livrets A
    }

    @Override
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    @Override
    public String getType() {
        return "LA";
    }
}
