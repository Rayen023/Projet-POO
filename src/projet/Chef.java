package projet;

import java.util.Scanner;

class Chef extends Personne {

    Chef(String nom_plat, String nom_type) {
        super(nom_plat, nom_type);
    }

    public void ajout(Menu m, String éspece_plat, String nom_plat, double temps_prep, double price) {

        if (null != m.type) {
            switch (m.type) {
                case "standard":
                    switch (éspece_plat) {
                        case "entree":
                            entree e = new entree(nom_plat, temps_prep, price);
                            m.Entree = e;
                            break;

                        case "legume":
                            legume l = new legume(nom_plat, temps_prep, price);
                            m.Legume = l;
                            break;

                        case "desert":
                            desert d = new desert(nom_plat, temps_prep, price);
                            m.Desert = d;
                            break;

                        case "viande":
                            viande p = new viande(nom_plat, temps_prep, price);
                            m.Viande = p;
                            break;
                        default:
                            System.out.println("no matcha3");

                    }
                    break;
                case "vegan":
                    switch (éspece_plat) {
                        case "entree":
                            entree e = new entree(nom_plat, temps_prep, price);
                            m.Entree = e;
                            break;

                        case "legume":
                            legume l = new legume(nom_plat, temps_prep, price);
                            m.Legume = l;
                            break;

                        case "desert":
                            desert d = new desert(nom_plat, temps_prep, price);
                            m.Desert = d;
                            break;

                        case "poisson":
                            poisson p = new poisson(nom_plat, temps_prep, price);
                            m.Poisson = p;
                            break;
                        default:
                            System.out.println("no matcha2");

                    }
                    break;
                case "enfant":
                    switch (éspece_plat) {
                        case "entree":
                            entree e = new entree(nom_plat, temps_prep, price);
                            m.Entree = e;
                            break;

                        case "desert":
                            desert d = new desert(nom_plat, temps_prep, price);
                            m.Desert = d;
                            break;
                        default:
                            System.out.println("no matcha1");
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println();
System.out.println(nom_plat + " ajoutée au menu "+m.nom);
    }

    public void modifier(Menu m, Plat p, double prix) {//modifie le prix du plat selectionné
        switch (p.éspéce) {
            case "entree":

                m.Entree.prix = prix;
                break;

            case "legume":

                m.Legume.prix = prix;
                break;

            case "desert":

                m.Desert.prix = prix;
                break;

            case "viande":

                m.Viande.prix = prix;
                break;

            case "poisson":
                m.Poisson.prix = prix;
                break;

            default:
                System.out.println("Ce plat n'appartient pas a ce menu");

        }
        System.out.println();
    System.out.println(p.nom + " du menu "+m.nom +" est modifiée");
    }

    public void supprimer(Menu m,Plat p) { // le plat doit apartenir au menu

        switch (p.éspéce) {
            case "entree":

                m.Entree = null;
                break;

            case "legume":

                m.Legume = null;
                break;

            case "desert":

                m.Desert = null;
                break;

            case "viande":

                m.Viande = null;
                break;

            case "poisson":
                m.Poisson = null;
                break;

            default:
                System.out.println("Ce plat n'appartient pas a ce menu");

        }
        System.out.println();
        System.out.println(p.nom + "supprimée du menu "+m.nom);

    }

    public void affiche_demandées() {

        System.out.println("commandes demandées  : ");
        for (int j = 0; j <Commande.j; j++) {
            {
                if (Commande.tab_c[j].reçue) {
                    Commande.tab_c[j].affiche();
                }
                System.out.println("Pour commancer commande type 1 Pour l'annuler type 2");
                Scanner myObj = new Scanner(System.in);
                String choice = myObj.nextLine();
                switch (choice) {
                    case "1":
                        Commande.tab_c[j].en_cours = true;
                        break;
                    case "2":
                        Commande.tab_c[j].en_cours = false;
                        break;
                    default:
                        System.out.println("no match");
                }
            }
        }
    }

    public void affiche_en_cours() {

        System.out.println("commandes en cours : ");
        for (int j = 0; j <Commande.j; j++) {
            if (Commande.tab_c[j].en_cours) {
                Commande.tab_c[j].affiche();
            }
        }
    }

    public void affiche_servi() {

        System.out.println("commandes servies  : ");
        for (int j = 0; j <Commande.j; j++) {
            if (Commande.tab_c[j].Payé) {
                Commande.tab_c[j].affiche();
            }
        }
    }
}
