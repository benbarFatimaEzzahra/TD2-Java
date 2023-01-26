import java.util.ArrayList;
import java.util.Calendar;

public class EST {
    // tableau  
    public ArrayList <Estien> ESTIENS;
     
    //constructeur  

    EST(){ESTIENS=new ArrayList<Estien>();}
     
    //methodes 

     public void Ajout(Estien E){ if(E!=null) ESTIENS.add(E);}

     void Affichage(){
    for(Estien element :ESTIENS){
        System.out.println(element);
    }}
     void Affichagenombre(){
         int Netu=0;
        for(Estien element :ESTIENS){
            if(element instanceof Etudiant) Netu++;
        }
        System.out.println("Parmi les "+ESTIENS.size()+"Estiens  "+Netu+"sont des etudiants ");
     }

     double  AnneeMoyen(){
        int sommean=0;
        int nbetudiants=0;
        double anm=0;
        for(Estien e:ESTIENS){
            if(e instanceof Etudiant ){
                sommean+=Calendar.getInstance().get(Calendar.YEAR)-e.Annee;
                nbetudiants++;
            }
        }
        if(nbetudiants!=0) anm=sommean/nbetudiants ;
        return anm;
     } 
     
      public static void main(String[] args) {
        EST Est=new EST();
         Est.Ajout(new Etudiant("mohamed nouri" , 2013,"S1GID", 16.36)); 
         Est.Ajout(new Etu_echange("Bjorn borhue ", 2012, "S1MECA",0, "KTH"));          
         Est.Ajout(new Etudiant("CHAIMAE MHISAR" , 2011,"S2GI", 2.5));
         Est.Ajout(new enseignant("ABDELLAH MOSLIH ", 1998, "LABSSIS",30000,"S1PQ")); 
         Est.Ajout(new Secretaire("Najat Tahiri", 2005, "Labssis",5000)); 
         Est.Affichage();
         Est.Affichagenombre();
         System.out.println("\nl'annee moyenne est : "+Est.AnneeMoyen());
     }
}
