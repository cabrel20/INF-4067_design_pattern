public class CommandeGabon extends Commande{

    private double montantPrestationHt;
    private double montantMaterielHt;

    // constructeur
    public CommandeGabon(double montantPrestationHt, double montantMaterielHt) {
         super();
        this.montantPrestationHt = montantPrestationHt;
        this.montantMaterielHt = montantMaterielHt;
    }

    // methode calculeTva
    public void calculeTva(){
        montantTva = (montantPrestationHt * 0.12)+(montantMaterielHt * 0.15);
    }
}
