package projet;

public class Projet {

    public static void main(String[] args) {

        Client c = new Client("rayen", "ghali");
        Chef ch = new Chef("Burak", "CZN");
        Serveur s = new Serveur("farah", "hamraoui");

        standard menu1;
        menu1 = new standard("m");

        entree a = new entree("salade", 4, 3);//(String nom_plat, double temps, double prix) 
        entree e2 = new entree("salade césar", 7, 12);
        entree e3 = new entree("soupe aux crevettes", 10, 15);
        desert e1 = new desert("glace", 5, 6);
        desert e4 = new desert("cocktail", 8, 9);
        poisson p = new poisson("dorade", 15, 20);
        poisson p1 = new poisson("salmon", 15, 23);
        viande v = new viande("viande", 20, 18);
        viande v1 = new viande("steak", 15, 23);

        System.out.println("***************************************");
        ch.ajout(menu1, "legume", "poivron", 10, 9); //(Menu m, String espece_plat, String nom_plat, double temps_prep, double price)
        ch.ajout(menu1, "legume", "tomate", 10, 8);

        System.out.println("***************************************");
        enfant menu = new enfant("m2");
        ch.ajout(menu, "desert", "gateau", 2, 3);//(Menu m, String espece_plat, String nom_plat, double temps_prep, double price)
        menu.Desert = e1;
        menu.Entree = e2;
        menu.affiche();
        ch.modifier(menu, e1,8);//(Menu m, String nom_plat, double prix)
        ch.supprimer(menu, e2);// supprimer ce plat du menu
        menu.compare(menu, menu1);

        System.out.println("***************************************");
        c.consulter();

        Commande commande1 = new Commande();
        commande1.ajoutPlat(p);
        commande1.ajoutPlat(v);
        commande1.affiche();
        System.out.println("***************************************");
        Commande commande2 = new Commande();
        commande2.ajoutPlat(e2);
        commande2.ajoutPlat(e1);
        commande2.affiche();

        System.out.println("***************************************");
        Commande commande3;
        commande3 = c.commander();//tab_p le tableau de plats (defini static), Plat.i le nbre de plats total

        System.out.println("***************************************");
        ch.affiche_demandées();

        System.out.println("***************************************");
        s.affiche_en_cours();
        System.out.println("***************************************");
        s.affiche_facture_consomées();
        System.out.println("***************************************");
        c.payer(commande2);
        s.affiche_facture_consomées();

    }

}
