package fr.ecole.tp.service;

import fr.ecole.tp.model.Client;
import fr.ecole.tp.model.Commande;
import fr.ecole.tp.model.LigneCommande;
import fr.ecole.tp.model.Produit;

import java.util.ArrayList;

public class DataFactory {

    private ArrayList<Produit> produitsList = new ArrayList<>();
    private ArrayList<Client> clientsList = new ArrayList<>();
    private ArrayList<Commande> commandeList = new ArrayList<>();
    private ArrayList<String> categorieList = new ArrayList<>();

    public void init() {


        categorieList.add("Info");
        categorieList.add("Telephonie");
        categorieList.add("Electromenager");
        categorieList.add("Gaming");


        produitsList.add(new Produit(1, "Laptop Pro", categorieList.get(0), 1200, false));
        produitsList.add(new Produit(2, "Souris", categorieList.get(0), 120, true));
        produitsList.add(new Produit(3, "Clavier", categorieList.get(0), 80, false));

        produitsList.add(new Produit(4, "Smartphone X", categorieList.get(1), 190, true));
        produitsList.add(new Produit(5, "Coque téléphone", categorieList.get(1), 900, false));
        produitsList.add(new Produit(6, "Chargeur rapide", categorieList.get(1), 50, false));

        produitsList.add(new Produit(7, "Réfrigérateur", categorieList.get(2), 300, false));
        produitsList.add(new Produit(8, "Micro-ondes", categorieList.get(2), 400, true));
        produitsList.add(new Produit(9, "Lave-linge", categorieList.get(2), 450, false));

        produitsList.add(new Produit(10, "Console PS5", categorieList.get(3), 500, false));
        produitsList.add(new Produit(11, "Manette PS5", categorieList.get(3), 99, false));
        produitsList.add(new Produit(12, "Jeu AAA", categorieList.get(3), 60, true));


        clientsList.add(new Client(1, "JEAN", "jean@gmail.com"));
        clientsList.add(new Client(2, "DUPONT", "dupont@gmail.com"));
        clientsList.add(new Client(3, "MARTIN", "martin@gmail.com"));
        clientsList.add(new Client(4, "DURAND", "durand@gmail.com"));


        ArrayList<LigneCommande> ligne1 = new ArrayList<>();
        ligne1.add(new LigneCommande(1, produitsList.get(0)));
        ligne1.add(new LigneCommande(2, produitsList.get(1)));

        ArrayList<LigneCommande> ligne2 = new ArrayList<>();
        ligne2.add(new LigneCommande(1, produitsList.get(2)));
        ligne2.add(new LigneCommande(2, produitsList.get(3)));

        ArrayList<LigneCommande> ligne3 = new ArrayList<>();
        ligne3.add(new LigneCommande(1, produitsList.get(4)));
        ligne3.add(new LigneCommande(2, produitsList.get(5)));

        ArrayList<LigneCommande> ligne4 = new ArrayList<>();
        ligne4.add(new LigneCommande(1, produitsList.get(6)));
        ligne4.add(new LigneCommande(2, produitsList.get(7)));

        ArrayList<LigneCommande> ligne5 = new ArrayList<>();
        ligne5.add(new LigneCommande(1, produitsList.get(8)));
        ligne5.add(new LigneCommande(2, produitsList.get(9)));

        commandeList.add(new Commande(1, clientsList.get(0), ligne1));
        commandeList.add(new Commande(2, clientsList.get(1), ligne2));
        commandeList.add(new Commande(3, clientsList.get(2), ligne3));
        commandeList.add(new Commande(4, clientsList.get(3), ligne4));
        commandeList.add(new Commande(5, clientsList.get(0), ligne5));
    }



    public ArrayList<Produit> getProduits() {
        return produitsList;
    }

    public ArrayList<Client> getClients() {
        return clientsList;
    }

    public ArrayList<Commande> getCommandes() {
        return commandeList;
    }

    public ArrayList<String> getCategories() {
        return categorieList;
    }
}