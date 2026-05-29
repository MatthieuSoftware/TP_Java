package fr.ecole.tp;

import java.util.List;

public class Commande {
    private String id;
    private  Client client;
    private List<LigneCommande> lignes;

    public Commande(String id, Client client, List<LigneCommande> lignes) {
        this.id = id;
        this.client = client;
        this.lignes = lignes;
    }

    public Client getClient() {
        return client;
    }

    public String getId() {
        return id;
    }

    public List<LigneCommande> getLignes() {
        return lignes;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLignes(List<LigneCommande> lignes) {
        this.lignes = lignes;
    }
}
