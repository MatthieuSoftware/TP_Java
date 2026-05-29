package fr.ecole.tp;

import fr.ecole.tp.model.Produit;
import fr.ecole.tp.service.DataFactory;
import fr.ecole.tp.service.Services;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));
        DataFactory myDataFactory = new DataFactory();
        myDataFactory.init();
        ArrayList<Produit> produits = myDataFactory.getProduits();

        Services myServices = new Services();
        myServices.afficherProduit(produits);
        myServices.somme(produits);
    }
}
