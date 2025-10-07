import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class app{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m"; 
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ROSA = "\u001B[38;5;205m"; 


    public static void main(String[] args) {
       

        ArrayList<String> hasierakomenua = new ArrayList<String>();
        hasierakomenua.add("Asteko egunak");
        hasierakomenua.add("Informazio orokorra");
        hasierakomenua.add("Kokapena");
        hasierakomenua.add("Irekiera ordua");
        hasierakomenua.add("Itxi ordua");

        Scanner sc = new Scanner(System.in);

        System.out.println("Aukeratu opzio bat:");
        for (int i = 0; i < hasierakomenua.size(); i++) {
            System.out.println((i + 1) + ". " + hasierakomenua.get(i));
        }

        int opzioa = sc.nextInt();
        if (opzioa < 1 || opzioa > hasierakomenua.size()) {
            System.out.println("Zenbakia ez da baliozkoa");
            sc.close();
            return;
        }

        String hasierakomenuaaukera = hasierakomenua.get(opzioa - 1);
        System.out.println("Aukeratu duzu " + hasierakomenuaaukera);

        if (hasierakomenuaaukera.equals("Asteko egunak")) {
            ArrayList<String> astekoegunak = new ArrayList<String>();
            astekoegunak.add("Astelehena");
            astekoegunak.add("Asteartea");
            astekoegunak.add("Asteazkena");
            astekoegunak.add("Osteguna");
            astekoegunak.add("Ostirala");
            astekoegunak.add("Larunbata");
            astekoegunak.add("Igandea");

            System.out.println("Aukeratu asteko eguna:");
            for (int j = 0; j < astekoegunak.size(); j++) {
                System.out.println((j + 1) + ". " + astekoegunak.get(j));
            }

            int aukera = sc.nextInt();
            if (aukera < 1 || aukera > astekoegunak.size()) {
                System.out.println("Sartutako zenbakia baliogabea da");
                sc.close();
                return;
            }

            String astekoegunaaukeratuta = astekoegunak.get(aukera - 1);
            System.out.println("Aukeratu duzu " + astekoegunaaukeratuta);

            ArrayList<ArrayList<String>> gelak = new ArrayList<ArrayList<String>>();
ArrayList<String> gelenIzena= new ArrayList<>();
            //Lista de las gelas
            //Primera gela 1Umeen gela
            ArrayList<String> umeengela = new ArrayList<>();
            umeengela.add(ANSI_CYAN+"Lilo y Stitch"+ANSI_RESET);
            umeengela.add(ANSI_CYAN+"Una pelicula de Minecraft"+ANSI_RESET);
            umeengela.add(ANSI_CYAN+"Mufasa:El rey leon"+ANSI_RESET);
            umeengela.add(ANSI_CYAN+"Como entrenar a tu dragon"+ANSI_RESET);
            umeengela.add(ANSI_CYAN+"Sonic 3: La pelicula"+ANSI_RESET);
            umeengela.add(ANSI_CYAN+"Blancanieves"+ANSI_RESET);
            gelak.add(umeengela);
            gelenIzena.add("Umeen gela");

            //Segunda gela  Superheroien gela
            ArrayList<String> superheroigela = new ArrayList<String>();
            superheroigela.add(ANSI_GREEN+"Capitán América: Brave New World"+ANSI_RESET);
            superheroigela.add(ANSI_GREEN+"Thunderbolt"+ANSI_RESET);
            gelak.add(superheroigela);
            gelenIzena.add("Superheroien gela");

            //Tercera gela  Thriller gela
            ArrayList<String> thrillergela = new ArrayList<String>();
            thrillergela.add(ANSI_PURPLE+"Conclave"+ANSI_RESET);
            thrillergela.add(ANSI_PURPLE+"Misión: Imposible. Sentencia Final"+ANSI_RESET);
            thrillergela.add(ANSI_PURPLE+"Sirāt"+ANSI_RESET);
            gelak.add(thrillergela);
            gelenIzena.add("Thriller gela");

            //Cuarta gela  Zientzia fikzio gela
            ArrayList<String> zientziafikziogela = new ArrayList<String>();
            zientziafikziogela.add(ANSI_YELLOW+"Wolfgang"+ANSI_RESET);
            gelak.add(zientziafikziogela);
            gelenIzena.add("Zientzia fikzio gela");

            //Quinta gela  Komedia gela
            ArrayList<String> komediagela = new ArrayList<String>();
            komediagela.add(ANSI_BLUE+"Padre no hay más que uno 5"+ANSI_RESET);
            komediagela.add(ANSI_BLUE+"El casoplon"+ANSI_RESET);
            komediagela.add(ANSI_BLUE+"Un funeral de locos"+ANSI_RESET);
            gelak.add(komediagela);
            gelenIzena.add("Komedia gela");

//Prueba de lo del random
            Random rand = new Random();
            int gelaAleatorioa = rand.nextInt(gelak.size());
            ArrayList<String> gelaaaleatoria = gelak.get(gelaAleatorioa);
String izenagela = gelenIzena.get(gelaAleatorioa);

            System.out.println(  astekoegunaaukeratuta + "ko gela hau da: "+izenagela);
            System.out.println("Gela honetako filmak hauek dira:");
            for (String filma : gelaaaleatoria) {
                System.out.println("- " + filma);
            }
        }

//Informazio orokorra aukeratuta 
if (hasierakomenuaaukera.equals("Informazio orokorra")) {
        ArrayList<String>informazioorokorra = new ArrayList<String>();
        informazioorokorra.add(ANSI_CYAN+"Lilo y Stitch"+ANSI_RESET);
        informazioorokorra.add(ANSI_CYAN+"Una pelicula de Minecraft"+ANSI_RESET);
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
        informazioorokorra.add();
System.out.println("Huaek dira gaurko filmak:");
System.out.println(informazioorokorra);
        System.out.println(informazioorokorra.size());

        sc.close();

        





    }
}
}
