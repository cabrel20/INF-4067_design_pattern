public abstract class Commande {
    protected double montantHt;
    protected double montantTva;
    protected double montantTtc;

    // constructeur initialisant montantHt
    public Commande(double montantHt) {
        this.montantHt = montantHt;
    }

    // constructeur par défaut
   public Commande(){
        super();
   }

   // methode calculMontantTtc
    public void calculMontantTtc(){
        calculeTva();
        montantTtc = montantHt + montantTva;
    }

    // methode calculeTva
    protected abstract void calculeTva();

    // methode afficher
    public void afficher(){
        System.out.println("Le montant TTC vaut "+montantTtc);
    }

}
