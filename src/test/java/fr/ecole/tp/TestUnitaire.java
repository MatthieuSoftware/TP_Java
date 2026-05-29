package fr.ecole.tp;
import fr.ecole.tp.Produit;
import fr.ecole.tp.Services;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

public class TestUnitaire {

    @Test
    void filtrageProduit() {
        Services services = new Services();
        Produit p1 = new Produit(1, "clavier", "Informatique", 150.0, true);
        Produit p2 = new Produit(2, "souris", "Informatique", 80.0, true);
        Produit p3 = new Produit(3, "ecran", "Informatique", 200.0, false);

        List<Produit> produits = List.of(p1, p2, p3);

        // sauvegarde sortie console
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        try {services.filtrage(produits);
        } finally {
            System.setOut(originalOut);
        }
        String result = out.toString();

        assertTrue(result.contains("clavier"));
        assertFalse(result.contains("souris"));
        assertFalse(result.contains("ecran"));
    }

    @Test
    void filtreProduitsEnPromotion() {

        Predicate<Produit> enPromo = Produit::isPromotion;

        List<Produit> produits = List.of(
                new Produit(1, "clavier", "Informatique", 150.0, true),
                new Produit(2, "souris", "Informatique", 80.0, false)
        );

        List<Produit> result = produits.stream()
                .filter(enPromo)
                .toList();

        assertEquals(1, result.size());
        assertEquals("clavier", result.get(0).getNom());
    }




    
}