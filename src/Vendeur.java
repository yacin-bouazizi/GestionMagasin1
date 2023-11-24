

public class Vendeur extends employes {
    int tauxDeVente;

    public Vendeur(int indentifant, int nbr_heures, String nom, String adress, int tauxDeVente) {
        super(indentifant, nbr_heures, nom, adress);
        this.tauxDeVente = tauxDeVente;
        type="Vendeur";
    }

    public Vendeur(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("" +
                "    taus de vente"+tauxDeVente);
    }
    @Override
    public double calculerSalary() {
        return 450*tauxDeVente;
    }
}
