package com.example.applocationvoiture.beans;

public class Voiture {
    private int id;
    private String matricule;
    private String nom;
    private String prix;
    private int photo;
    private String duree;
    private String description;
    private static int comp=0;

    public Voiture(int id, String nom, String matricule, String prix, int photo, String duree, String description) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prix = prix;
        this.photo = photo;
        this.duree = duree;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int getComp() {
        return comp;
    }

    public static void setComp(int comp) {
        Voiture.comp = comp;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "id=" + id +
                ", matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", photo=" + photo +
                ", duree='" + duree + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
