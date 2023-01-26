public class Secretaire extends Personnel{
     
    public Secretaire(String name,int aneee,String lab, double sal){
        super(name, aneee, lab, sal);
    }
    @Override public void Affiche() {
        super.Affiche();
    }
    public String toString(){
        return "Secretaire : \n"+super.toString();
    }
}
