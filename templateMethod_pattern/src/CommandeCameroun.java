public class CommandeCameroun extends Commande{

    // methode calculeTva
    protected void calculeTva(){
        montantTva = montantHt * 0.196;
    }

    // constructeur
    public CommandeCameroun(double montantHt) {
        super(montantHt);
    }
}
