package fr.ecole.tp.model;

import java.util.List;

public class Commande {
    private int id;
    private Client client;
    private List<LigneCommande> lignes;

    public Commande(int id, Client client, List<LigneCommande> lignes) {
        this.id = id;
        this.client = client;
        this.lignes = lignes;
    }

    public Client getClient() {
        return client;
    }

    public int getId() {
        return id;
    }

    public List<LigneCommande> getLignes() {
        return lignes;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLignes(List<LigneCommande> lignes) {
        this.lignes = lignes;
    }
}
