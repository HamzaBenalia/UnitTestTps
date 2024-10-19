package com.exercices.banque;

/**
 * Représente un compte courant.
 */
public class CompteCourant extends CompteBancaire {

    private double decouvert;

    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void debiterMontant(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant à débiter ne peut pas être négatif.");
        }
        if (solde - montant < -decouvert) {
            throw new IllegalArgumentException("Montant dépasse le découvert autorisé.");
        }
        solde -= montant;
    }

    @Override
    public void appliquerRemunerationAnnuelle() {
        // Pas de rémunération annuelle pour les comptes courants
    }

    @Override
    public double getDecouvert() {
        return decouvert;
    }

    @Override
    public double getTauxRemuneration() {
        return 0; // Pas de taux de rémunération pour les comptes courants
    }

    @Override
    public String getType() {
        return "CC";
    }
}
