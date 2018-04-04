package com.assistanceinformatiquetoulouse.roulezrose.staff;

// Class Staffeur
public class Staffeur {
    // Attributs privés
    private String pNom;
    private int pId;
    private String pPresence;
    private String pStat;
    private int pConducteur;
    private int pJaune;
    private int pEclaireur;
    private int pMeneur;
    private int pLanterne;
    private int pPresent;

    // Constructeur
    public Staffeur()
    {
        this.pNom = "";
        this.pId = 0;
        this.pPresence = "";
        this.pStat = "";
        this.pConducteur = 0;
        this.pJaune = 0;
        this.pEclaireur = 0;
        this.pMeneur = 0;
        this.pLanterne = 0;
        this.pPresent = 0;
    }

    // Constructeur
    public Staffeur(String nom, int id, String presence, int conducteur, int jaune, int eclaireur, int meneur, int lanterne, int present)
    {
        float pourcentage;
        this.pNom = nom;
        this.pId = id;
        this.pPresence = presence;
        this.pConducteur = conducteur;
        this.pJaune = jaune;
        this.pEclaireur = eclaireur;
        this.pMeneur = meneur;
        this.pLanterne = lanterne;
        this.pPresent = present;
        if ((conducteur != 0) && (present != 0)) {
            pourcentage = (float) 100.0 * (float) conducteur / (float) present;
            this.pStat = String.valueOf(conducteur) +
                         " / " +
                         String.valueOf(present) +
                         " (" + String.valueOf((int) pourcentage) +
                         "%)";
        }
        else {
            this.pStat = String.valueOf(conducteur) +
                         " / " +
                         String.valueOf(present);
        }
    }

    // Méthode lireNom
    public String lireNom()
    {
        return(this.pNom);
    }

    // Methode lireId
    public int lireId() {
        return(this.pId);
    }

    // Méthode lirePresence
    public String lirePresence()
    {
        return(this.pPresence);
    }

    // Méthode lireConducteur
    public int lireConducteur() {
        return(this.pConducteur);
    }

    // Méthode lireStat
    public String lireStat()
    {
        return(this.pStat);
    }

    // Méthode lireJaune
    public int lireJaune() {
        return(this.pJaune);
    }

    // Méthode lireEclaireur
    public int lireEclaireur() {
        return(this.pEclaireur);
    }

    // Méthode lireMeneur
    public int lireMeneur() {
        return(this.pMeneur);
    }

    // Méthode lireLanterne
    public int lireLanterne() {
        return(this.pLanterne);
    }

    // Méthode lirePrésent
    public int lirePresent () {
        return(this.pPresent);
    }
}
