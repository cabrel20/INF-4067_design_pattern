public class Main {
    public static void main(String[] args) {

        Commande commande = new CommandeCameroun(5000);
        commande.calculMontantTtc();
        commande.afficher();

        commande = new CommandeGabon(3000,2000);
        commande.calculMontantTtc();
        commande.afficher();

    }
}