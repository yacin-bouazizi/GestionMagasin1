

public class Responsable extends employes {
    public int prime;
    public Responsable(int indentifant, int nbr_heures, String nom, String adress, int prime) {
        super(indentifant, nbr_heures, nom, adress);
        this.prime = prime;
        type="Responsable";
    }

    public Responsable(int prime) {
        this.prime = prime;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("le prime de presponsable est:"+prime);
    }
    @Override
    public double calculerSalary() {
        double salary = nbr_heures*10;
        if (nbr_heures > 160) {
            return salary + (salary * 0.2);
        } else {
            return salary;
        }
    }
}
