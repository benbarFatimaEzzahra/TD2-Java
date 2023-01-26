public class Personnel extends Estien {
     // atributs 
    protected String Lab ;
    protected double salaire;

     //methodes 

     public Personnel(String name,int aneee,String lab, double sal) {
         super(name, aneee);
         Lab=lab;
         salaire=sal;
     }

    @Override public void Affiche() {
         super.Affiche();
         System.out.println("le laboratoire est :"+this.Lab);
         System.out.println("le salaire est  :"+this.salaire);
     }
     public String toString(){
        return super.toString()+"\nle laboratoire est :"+this.Lab+"\n"+"le salaire est  :"+this.salaire+"\n";
    }
}
