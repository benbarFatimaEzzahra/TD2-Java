public class Etudiant extends Estien {
    //atributs 
    protected String Section ;
    protected double Note;

    //methodes 
    public Etudiant(String name, int aneee, String section,double n) {
        super(name,aneee);
        this.Section=section;
        this.Note=n;
    }
    
    @Override   public void Affiche() {
       super.Affiche();
       System.out.println("le section est : "+this.Section);
       System.out.println("La note est : "+this.Note);
    }

    public void  classname(){
       System.out.println("Etudiant rgulier: \n"); 
    }
    public String toString(){
        this.classname();
        return super.toString()+"\nle section est : "+this.Section+"\n"+"La note est : "+this.Note+"\n";
    }
}
