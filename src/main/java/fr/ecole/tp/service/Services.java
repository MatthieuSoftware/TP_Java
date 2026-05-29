package fr.ecole.tp.service;

import fr.ecole.tp.model.Commande;
import fr.ecole.tp.model.LigneCommande;
import fr.ecole.tp.model.Produit;

import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class Services {




    public void afficherProduit(List<Produit> produits) {
        produits.forEach(System.out::println);
    }


        //
    Function<Produit, String> formatProduit = p -> {
        return "[" + p.getCategorie().toUpperCase() + "] "
                + p.getNom()
                + " — "
                + String.format("%.2f €", p.getPrix());
    };

  // fonctionalité 3
    Predicate<Produit> estEnPromotion;
    Predicate<Produit> prixSuperieurA100;
    Predicate<Produit> categorieInformatique;

    // fonctionalité 4

    public void filtrage(List<Produit> produits) {
        produits.stream()
                .filter(p -> p.getPrix() > 100)
                .filter(p -> p.isPromotion())
                .forEach(System.out::println);
    }

    // fonctionalité 7

    public void catDistinct(List<Produit> produits) {
        produits.stream()
                .map(Produit::getCategorie)
                .distinct()
                .forEach(System.out::println);
    }


    public void cateToSet(List<Produit> produits) {
        Set<String> categories = produits.stream()
                .map(Produit::getCategorie)
                .collect(Collectors.toSet());

        categories.forEach(System.out::println);
    }


    // fonctionalité 10

    public void reduc(List<Produit> produits) {

        double total =  produits.stream()
                .map(Produit::getPrix)
                .reduce (0.0,(a, b) -> a + b);
    }

    // fonctialité  11

    public void  somme(List<Produit> produits) {
        double prixTotal = produits.stream()
                .mapToDouble(Produit::getPrix)
                .sum();
        System.out.println("Prix total du toto est -> :"+ prixTotal +"€");

    }

    //fonct 13


    public void flatMap(List<Commande> commandes) {

        commandes.stream()
                .flatMap(c -> c.getLignes().stream())
                .map(LigneCommande::getProduit)
                .forEach(System.out::println);
    }







}
