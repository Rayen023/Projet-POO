package projet;

public class Menu {

    protected String nom;
    protected double temps;
    protected double prix;

    entree Entree;
    desert Desert;
    poisson Poisson;
    legume Legume;
    viande Viande;

    protected String type;

    Menu(String nom_menu) {
        this.nom = nom_menu;

    }

    public void affiche() {
        temps = Entree.temps + Desert.temps;
        prix = Entree.prix + Desert.prix;
        if ("standard".equals(type)) {
            prix = prix + Legume.prix + Viande.prix;
            temps = temps + Legume.temps + Viande.temps;
        } else if ("vegan".equals(type)) {
            prix = prix + Legume.prix + Poisson.prix;
            temps = temps + Legume.temps + Poisson.temps;
        }
        System.out.println("le menu "+nom+" contient:");
        
        Entree.affiche();
        Desert.affiche();

        if ("standard".equals(type)) {
            Viande.affiche();
            Legume.affiche();
        } else if ("vegan".equals(type)) {
            Legume.affiche();
            Poisson.affiche();
        }
        
        System.out.println("Temps de preapration du menu: " + temps + "min ");
        System.out.println("Prix du menu: " + prix + "tnd");
        

    }

    public void compare(Menu x, Menu y) {
        if (x.prix > y.prix) {
            System.out.println("le prix de " + x.nom + " est superieur au prix de " + y.nom);
        } else if (x.prix < y.prix) {
            System.out.println("le prix de " + x.nom + " est inferieur au prix de " + y.nom);
        } else {
            System.out.println("les 2 menus ont le même prix.");
        }
    }

}

class enfant extends Menu {

    enfant(String nom_menu) {
        super(nom_menu);
        this.type = "enfant";
    }

}

class vegan extends Menu {

    vegan(String nom_menu, entree Entree, desert Desert) {

        super(nom_menu);
        this.type = "vegan";

    }
}

class standard extends Menu {

    standard(String nom_menu) {

        super(nom_menu);
        this.type = "standard";

    }

}
