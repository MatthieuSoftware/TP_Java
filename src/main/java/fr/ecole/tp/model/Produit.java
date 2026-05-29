package fr.ecole.tp.model;

public class Produit {

    private int id;
    private String nom;
    private String categorie;
    private Double prix;
    private boolean promotion;

    public Produit(int id, String nom, String categorie, double prix, boolean promotion) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.prix = prix;
        this.promotion = promotion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", categorie='" + categorie + '\'' +
                ", prix=" + prix +
                ", promotion=" + promotion +
                '}';
    }


}
