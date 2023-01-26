public class Etu_echange extends Etudiant {
    
    //atributs 
 protected String nom_etablissement;

   //methodes 

 public Etu_echange(String name, int aneee, String section,double n,String nometa) {
     super(name, aneee, section, n);
     this.nom_etablissement=nometa;
 }
 @Override public void Affiche() {
   super.Affiche();
   System.out.println("Nom d'etablissement precedent:  "+this.nom_etablissement);
 }
 @Override public void  classname(){
   System.out.println("Etudiant echange: \n");
 }
 public String toString(){
  return super.toString()+"Nom d'etablissement precedent:  "+this.nom_etablissement+"\n";
}
}
