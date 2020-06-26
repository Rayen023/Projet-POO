package projet;

public class Commande {

    protected boolean Payé = false;
    protected boolean reçue = false;
    protected boolean en_cours = false;

    protected int x = 0; //nb plats par commande
    protected Plat[] t = new Plat[99]; // tab de plats par commande

    static int j = 0; //nb commandes
    static Commande[] tab_c = new Commande[99]; // tab de tout les commandes

    Commande() {
        tab_c[j] = this;
        j++;
        this.reçue = true;

    }

    public void ajoutPlat(Plat p) {
        t[x] = p;
        x++;
    }

    public void affiche() {
        System.out.println();
        System.out.println("cetter commande contient");
        System.out.println();
        for (int z = 0; z < x; z++) {
            t[z].affiche();
        }
        affiche_facture();
    }

    public void affiche_facture() {
        double prix = 0;
        for (int z = 0; z < x; z++) {
            prix = prix + t[z].prix;

        }
        System.out.println("facture= " + prix + "tnd");

    }
}
