package fr.ecole.tp.model;

public class LigneCommande {
    private Produit produit;
    private  int quantite;

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public LigneCommande(int quantite, Produit produit) {
        this.quantite = quantite;
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
