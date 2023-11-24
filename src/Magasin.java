
public class Magasin {
    public int identifiant;
    public String adresse;
    public String name;
    public int capacite=50;
    public Produit[] produits=new Produit[capacite];
    public int nombreDeProduit=0;
    public int nombreDeEmployes=0;
    public employes[] t_emp=new employes[20] ;

    public Magasin(int identifiant, String adresse, String name) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.name = name;
    }

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
    }
    public Magasin() {}
    public void ajoutProduit(Produit produit){
        if(nombreDeProduit<=capacite){
            produits[nombreDeProduit]=produit;
            nombreDeProduit++;
        }else {
            System.out.println("le contene maximale de la magasin est 50");
        }
    }
    public void ajoutEmployes(employes e){
        if (nombreDeEmployes<=20){
            t_emp[nombreDeEmployes]=e;
            nombreDeEmployes++;
        }
        else {
            System.out.println("no place for another 'employes'!");
        }
    }
    public void afficher(){
        System.out.println("nom :"+name
                +"\nidentifiant de magasin est :"+identifiant
                +"\n Adresse :"+adresse
                +"\ncapacite :"+capacite
                +"\nLes produits de magasin sont:"
                +"\nnombre de employes:"+nombreDeEmployes
        );
        if (nombreDeEmployes>0){
            for (int i = 0; i < nombreDeEmployes; i++) {
                t_emp[i].afficher();
            }
        }
        for (int i = 0; i < nombreDeProduit; i++) {
            System.out.println(
                    "le nom de la produit n°"+(i+1)+"est :"+produits[i].getLibelle()
                            +"\nle prix de la produit n°"+(i+1)+"est :"+produits[i].getPrix()
            );
        }

    }
}
