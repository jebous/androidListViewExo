package com.example.jerome.listviewexo;

public class Personne {

    private String nom;
    private String prenom;
    private int image;

    public Personne()
    {
        setNom("Bousquet");
        setPrenom("Jerome");
        setImage(R.drawable.absent);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
