package projet;

class Serveur extends Personne {

    Serveur(String nom_plat, String nom_type) {
        super(nom_plat, nom_type);
    }

    public void affiche_en_cours() {

        System.out.println("commandes en cours  : ");
        for (int j = 0; j <Commande.j; j++) {
            if (Commande.tab_c[j].en_cours) {
                Commande.tab_c[j].affiche();
            }
        }
    }

    public void affiche_recues() {

        System.out.println("commandes recues : ");
        for (int j = 0; j <Commande.j; j++) {
            if (Commande.tab_c[j].reçue) {
                Commande.tab_c[j].affiche();
            }

        }
    }

    public void affiche_facture_consomées() {

        System.out.println("commandes servies:");
        for (int j = 0; j <Commande.j; j++) {
            if (Commande.tab_c[j].Payé) {
                Commande.tab_c[j].affiche();
            }
        }
    }
}
