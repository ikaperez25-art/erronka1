import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        


ArrayList<String> astekoegunak=new ArrayList<String>();

System.out.println("Kaixo ongi etorria ZinemaUsurbilera:")
astekoegunak.add("Astelehena");
astekoegunak.add("Asteartea");
astekoegunak.add("Asteazkena");
astekoegunak.add("Osteguna");
astekoegunak.add("Ostirala");
astekoegunak.add("Larunbata");


Scanner sc=new Scanner(System.in);
System.out.println("Aukeratu asteko eguna");




for(int i=0;i<astekoegunak.size();i++){
System.out.println(i+1+". "+astekoegunak.get(i));
}
int aukera=sc.nextInt();
if (aukera>=1 && aukera<=astekoegunak.size()) {
    String astekoegunaaukeratuta= astekoegunak.get(aukera-1);
    System.out.println("Aukeratu duzu "+astekoegunaaukeratuta);

switch (astekoegunaaukeratuta) {
    case "Astelehena":
    System.out.println("Asteleheneko filmak hauek dira");
        System.out.println("Laspelis");
        break; 
         case "Asteartea":
    System.out.println("Astearteko filmak hauek dira");

        System.out.println("Laspelis");
        
        break;
          case "Asteazkena":
    System.out.println("Asteazkeneko filmak hauek dira");

        System.out.println("Laspelis");
        
        break; 
         case "Osteguna":
    System.out.println("Osteguneko filmak hauek dira");

        System.out.println("Laspelis");
        
        break;  
        case "Ostirala":
    System.out.println("Ostiraleko filmak hauek dira");

        System.out.println("Laspelis");
        
        break;  
        case "Larunbata":
    System.out.println("Larunbateko filmak hauek dira");

        System.out.println("Laspelis");

        
        break;

    default:
    System.out.println("Ezin da aukeratu eguna");
        break;

}
}else{
    System.out.println("Sartutako zenbakia baliogabea da");
}

    }
}