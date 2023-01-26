public class enseignant extends Personnel {
    // atributs 
    protected String Section ;

    // methodes 
    public enseignant(String name,int aneee,String lab, double sal,String section) {
        super(name, aneee, lab, sal);
        Section=section;
    }

    @Override public void Affiche() {
        super.Affiche();
        System.out.println("La section : "+this.Section);
    }
    public String toString(){
        return "Enseignant:\n"+super.toString()+"\nLa section : "+this.Section+"\n";
    }
}
