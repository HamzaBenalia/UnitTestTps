package com.exercices.gestionentreprises;

import java.time.LocalDate;

/**
 * Représente une entreprise avec des attributs de base et des méthodes pour afficher son statut.
 */
public class Entreprise {

    /** Constante représentant le capital maximum autorisé. */
    public static final int CAPITAL_MAX = 3_000_000;

    /** Numéro SIRET de l'entreprise. */
    private final int siret;

    /** Nom de l'entreprise. */
    private String nom;

    /** Adresse de l'entreprise. */
    private String adresse;

    /** Date de création de l'entreprise. */
    private LocalDate dateCreation;

    /**
     * Constructeur pour initialiser les attributs de l'entreprise.
     *
     * @param siret Le numéro SIRET de l'entreprise (doit être positif).
     * @param nom Le nom de l'entreprise (ne doit pas être null ou vide).
     * @param adresse L'adresse de l'entreprise (ne doit pas être null ou vide).
     * @param dateCreation La date de création de l'entreprise (ne doit pas être null).
     */
    public Entreprise(int siret, String nom, String adresse, LocalDate dateCreation) {
        if (siret <= 0) {
            throw new IllegalArgumentException("Le numéro SIRET doit être positif.");
        }
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'entreprise ne peut pas être null ou vide.");
        }
        if (adresse == null || adresse.trim().isEmpty()) {
            throw new IllegalArgumentException("L'adresse de l'entreprise ne peut pas être null ou vide.");
        }
        if (dateCreation == null) {
            throw new IllegalArgumentException("La date de création ne peut pas être null.");
        }

        this.siret = siret;
        this.nom = nom;
        this.adresse = adresse;
        this.dateCreation = dateCreation;
    }

    // Getters
    public int getSiret() {
        return siret;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    // Setters
    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'entreprise ne peut pas être null ou vide.");
        }
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        if (adresse == null || adresse.trim().isEmpty()) {
            throw new IllegalArgumentException("L'adresse de l'entreprise ne peut pas être null ou vide.");
        }
        this.adresse = adresse;
    }

    public void setDateCreation(LocalDate dateCreation) {
        if (dateCreation == null) {
            throw new IllegalArgumentException("La date de création ne peut pas être null.");
        }
        this.dateCreation = dateCreation;
    }

    /**
     * Affiche les informations de l'entreprise.
     */
    public void afficherStatut() {
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Date de Création: " + dateCreation);
        System.out.println("SIRET: " + siret);
    }
}
