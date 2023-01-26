public class Estien {
    // atributs 
    protected String nom;
    protected int Annee;
    // methods
    
    public Estien(String name,int aneee) {
        this.nom=name;
        this.Annee=aneee;
    }

    public void Affiche() {
        System.out.println("nom: "+this.nom);
        System.out.println("Annee d'arrive: "+this.Annee);
    }
    public int getan(){return Annee;}
   
    public String toString(){
        return "nom: "+this.nom+"\n"+"Annee d'arrive: "+this.Annee;
    }

}