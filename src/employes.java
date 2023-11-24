

public abstract class employes {
    int indentifant, nbr_heures,num_emp=0;
    static int index=1;
    String nom,adress;
    String type="";

    public employes(int indentifant, int nbr_heures, String nom, String adress) {
        this.indentifant = indentifant;
        this.nbr_heures = nbr_heures;
        this.nom = nom;
        this.adress = adress;
        num_emp=index;
        index++;

    }

    public employes() {
        num_emp=index;
        index++;
    }
    public void afficher(){
        System.out.println("les données de employes N°"+num_emp+"est"+
                "\n     nom:"+nom
                +"\n    indentifant:"+indentifant
                +"\n    adress:"+adress
                +"\n    nombre de heure:"+nbr_heures
        );
    }


    public abstract double calculerSalary();
}
