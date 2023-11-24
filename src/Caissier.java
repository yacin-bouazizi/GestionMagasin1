

public class Caissier extends employes {
    int numdeCaisse;
    public Caissier(int indentifant, int nbr_heures, String nom, String adress, int numdeCaisse) {
        super(indentifant, nbr_heures, nom, adress);
        this.numdeCaisse = numdeCaisse;
        type="Caissier";

    }

    public Caissier(int numdeCaisse) {
        this.numdeCaisse = numdeCaisse;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(
                "    num de caisse "+numdeCaisse
        );

    }
    @Override
    public double calculerSalary() {
        double salary = nbr_heures*5;
        if (nbr_heures > 180) {
            return salary + (salary * 0.15);
        } else {
            return salary;
        }
    }
}
