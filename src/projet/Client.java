package projet;

import java.util.Scanner;

class Client extends Personne {

    Client(String nom_plat, String nom_type) {
        super(nom_plat, nom_type);
    }

    public void consulter() {
        System.out.println("Voudriez vous des plats de type ");
        System.out.println("1.Standard ");
        System.out.println("2.Vegan");
        System.out.println("3.enfant");
        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();

        System.out.println("entrée : ");
        for (int j = 0; j <Plat.i; j++) {
            if ("entree".equals(Plat.tab_p[j].éspéce)) {
                Plat.tab_p[j].affiche();
            }
        }

        System.out.println("dessert : ");
        for (int j = 0; j <Plat.i; j++) {
            if ("desert".equals(Plat.tab_p[j].éspéce)) {
                Plat.tab_p[j].affiche();
            }
        }
        switch (choice) {
            case "1":
                System.out.println("viande : ");
                for (int j = 0; j <Plat.i; j++) {
                    if ("viande".equals(Plat.tab_p[j].éspéce)) {
                        Plat.tab_p[j].affiche();
                    }
                }
                System.out.println("legume : ");
                for (int j = 0; j <Plat.i; j++) {
                    if ("legume".equals(Plat.tab_p[j].éspéce)) {
                        Plat.tab_p[j].affiche();
                    }
                }
                break;
            case "2":
                System.out.println("legume : ");
                for (int j = 0; j <Plat.i; j++) {
                    if ("legume".equals(Plat.tab_p[j].éspéce)) {
                        Plat.tab_p[j].affiche();
                    }
                }
                System.out.println("poisson : ");
                for (int j = 0; j <Plat.i; j++) {
                    if ("poisson".equals(Plat.tab_p[j].éspéce)) {
                        Plat.tab_p[j].affiche();
                    }
                }
                break;
            case "3":

                break;

            default:
                System.out.println("no match");
        }

    }
    
    
    
    
    

    public Commande commander() {

        Commande c = new Commande();

        System.out.println("Voudriez vous des plats de type ");
        System.out.println("1.Standard ");
        System.out.println("2.Vegan");
        System.out.println("3.enfant");
        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();

        System.out.println("Sélectionner l entree a commander");
        for (int j = 0; j <Plat.i; j++) {
            if ("entree".equals(Plat.tab_p[j].éspéce)) {
                System.out.println("Appuyez sur " + j + " pour commander :");
                Plat.tab_p[j].affiche();
            }
        }

        String choix1 = myObj.nextLine();
        int d = Integer.parseInt(choix1);
        for (int j = 0; j <Plat.i; j++) {
            if (d == j) {
                c.ajoutPlat(Plat.tab_p[j]);
            }
        }

        System.out.println("Sélectionner le dessert a commander");
        for (int j = 0; j <Plat.i; j++) {
            if ("desert".equals(Plat.tab_p[j].éspéce)) {
                System.out.println("Appuyez sur " + j + " pour commander :");
                Plat.tab_p[j].affiche();
            }
        }

        String choix2 = myObj.nextLine();
        int d2 = Integer.parseInt(choix2);
        for (int j = 0; j <Plat.i; j++) {
            if (d2 == j) {
                c.ajoutPlat(Plat.tab_p[j]);
            }
        }

        switch (choice) {
            case "1":
                System.out.println("Sélectionner le viande a commander");
                for (int j = 0; j <Plat.i; j++) {
                    if ("viande".equals(Plat.tab_p[j].éspéce)) {
                        System.out.println("Appuyez sur " + j + " pour commander :");
                        Plat.tab_p[j].affiche();
                    }
                }

                String choix3 = myObj.nextLine();
                int d3 = Integer.parseInt(choix3);
                for (int j = 0; j <Plat.i; j++) {
                    if (d3 == j) {
                        c.ajoutPlat(Plat.tab_p[j]);
                    }
                }

                System.out.println("Sélectionner le legume a commander");
                for (int j = 0; j <Plat.i; j++) {
                    if ("legume".equals(Plat.tab_p[j].éspéce)) {
                        System.out.println("Appuyez sur " + j + " pour commander :");
                        Plat.tab_p[j].affiche();
                    }
                }

                String choix4 = myObj.nextLine();
                int a = Integer.parseInt(choix4);
                for (int j = 0; j <Plat.i; j++) {
                    if (a == j) {
                        c.ajoutPlat(Plat.tab_p[j]);
                    }
                }

                break;

            case "2":

                System.out.println("Sélectionner le legume a commander");
                for (int j = 0; j <Plat.i; j++) {
                    if ("legume".equals(Plat.tab_p[j].éspéce)) {
                        System.out.println("Appuyez sur " + j + " pour commander :");
                        Plat.tab_p[j].affiche();
                    }
                }

                String choix6 = myObj.nextLine();
                int b = Integer.parseInt(choix6);
                for (int j = 0; j <Plat.i; j++) {
                    if (b == j) {
                        c.ajoutPlat(Plat.tab_p[j]);
                    }
                }

                System.out.println("Sélectionner le poisson a commander");
                for (int j = 0; j <Plat.i; j++) {
                    if ("poisson".equals(Plat.tab_p[j].éspéce)) {
                        System.out.println("Appuyez sur " + j + " pour commander :");
                        Plat.tab_p[j].affiche();
                    }
                }

                String choix5 = myObj.nextLine();
                int d5 = Integer.parseInt(choix5);
                for (int j = 0; j <Plat.i; j++) {
                    if (d5 == j) {
                        c.ajoutPlat(Plat.tab_p[j]);
                    }
                }

                break;

            case "3":

                break;

            default:
                System.out.println("no match");

        }

        return c;
    }

    public void payer(Commande c) {
        c.Payé = true;
    }
}
