package projet;

import java.util.Scanner;

public class Plat {

    static int i = 0;// nb de plats total
    static Plat[] tab_p = new Plat[99];//tab static de tout les plats
    
    protected String nom;//salade, soupe
    protected String éspéce;//entree, viande
    protected String type;//chaud, froid  
    
    protected double temps;
    protected double prix;

    Plat(String nom_plat, double temps, double prix) {
        this.nom = nom_plat;
        this.temps = temps;
        this.prix = prix;

    }

    public void affiche() {
        System.out.println(nom + " " + type + " " + temps + "min " + prix + "tnd");
    }
}

class entree extends Plat {

    final String x = "chaud";
    final String y = "froid";

    entree(String nom_plat, double temps, double prix) {
        super(nom_plat, temps, prix);
        this.éspéce = "entree";
        System.out.println("Créeation de " + this.nom + " de type:");
        choisir();
        tab_p[i] = this;
        i++;
    }

    private void choisir() {  //fonction qui attribue a ce type de plat son espece possible
        Scanner myObj = new Scanner(System.in);
        System.out.println("1." + x);
        System.out.println("2." + y);
        System.out.println("Sélectionnez choix");
        String choice = myObj.nextLine();

        switch (choice) {
            case "1":
                System.out.println(this.nom + " creé de type : " + x);
                type = x;
                break;
            case "2":
                System.out.println(this.nom + " creé de type : " + y);
                type = y;
                break;
            default:
                System.out.println("no match");// et affichera null
        }
    }
}

class poisson extends Plat {

    String x = "eau douce";
    String y = "eau de mer";

    poisson(String nom_plat, double temps, double prix) {
        super(nom_plat, temps, prix);
        this.éspéce = "poisson";
        System.out.println("Créeation de " + this.nom + " de type:");
        choisir();
        tab_p[i] = this;
        i++;
    }

    private void choisir() {

        System.out.println("1." + x);
        System.out.println("2." + y);
        System.out.println("Sélectionnez choix");
        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();

        switch (choice) {
            case "1":
                System.out.println(this.nom + " creé de type : " + x);
                type = x;
                break;
            case "2":
                System.out.println(this.nom + " creé de type : " + y);
                type = y;
                break;
            default:
                System.out.println("no match");
        }
    }
}

class legume extends Plat {

    String x = "printemps";
    String y = "été";
    String z = "automne";
    String t = "hiver";

    legume(String nom_plat, double temps, double prix) {
        super(nom_plat, temps, prix);
        this.éspéce = "legume";
        System.out.println("Créeation de " + this.nom + " de type:");
        choisir();
        tab_p[i] = this;
        i++;
    }

    private void choisir() {

        System.out.println("1." + x);
        System.out.println("2." + y);
        System.out.println("3." + z);
        System.out.println("4." + t);
        System.out.println("Sélectionnez choix");
        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();

        switch (choice) {
            case "1":
                System.out.println(this.nom + " creé de type : " + x);
                type = x;
                break;
            case "2":
                System.out.println(this.nom + " creé de type : " + y);
                type = y;
                break;
            case "3":
                System.out.println(this.nom + " creé de type : " + z);
                type = z;
                break;
            case "4":
                System.out.println(this.nom + " creé de type : " + t);
                type = t;
                break;

        }
    }
}

class desert extends Plat {

    String x = "vanille";
    String y = "fraise";
    String z = "chocolat";

    desert(String nom_plat, double temps, double prix) {
        super(nom_plat, temps, prix);
        this.éspéce = "desert";
        System.out.println("Créeation de " + this.nom + " de type:");
        choisir();
        tab_p[i] = this;
        i++;
    }

    private void choisir() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("1." + x);
        System.out.println("2." + y);
        System.out.println("3." + z);
        System.out.println("Sélectionnez choix");
        String choice = myObj.nextLine();

        switch (choice) {
            case "1":
                System.out.println(this.nom + " creé de type : " + x);
                type = x;
                break;
            case "2":
                System.out.println(this.nom + " creé de type : " + y);
                type = y;
                break;
            case "3":
                System.out.println(this.nom + " creé de type : " + z);
                type = z;
                break;
            default:
                System.out.println("no match");
        }
    }
}

class viande extends Plat {

    String x = "saignant";
    String y = "à point";
    String z = "bien cuit";

    viande(String nom_plat, double temps, double prix) {
        super(nom_plat, temps, prix);
        this.éspéce = "viande";
        System.out.println("Créeation de " + this.nom + " de type:");
        choisir();
        tab_p[i] = this;
        i++;
    }

    private void choisir() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("1." + x);
        System.out.println("2." + y);
        System.out.println("3." + z);
        System.out.println("Sélectionnez choix");
        String choice = myObj.nextLine();

        switch (choice) {
            case "1":
                System.out.println(this.nom + " creé de type : " + x);
                type = x;
                break;
            case "2":
                System.out.println(this.nom + " creé de type : " + y);
                type = y;
                break;
            case "3":
                System.out.println(this.nom + " creé de type : " + z);
                type = z;
                break;
            default:
                System.out.println("no match");
        }
    }
}
