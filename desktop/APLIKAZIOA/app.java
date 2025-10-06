import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class app {
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
            umeengela.add("Lilo y Stitch");
            umeengela.add("Una pelicula de Minecraft");
            umeengela.add("Mufasa:El rey leon");
            umeengela.add("Como entrenar a tu dragon");
            umeengela.add("Sonic 3: La pelicula");
            umeengela.add("Blancanieves");
            gelak.add(umeengela);
            gelenIzena.add("Umeen gela");

            //Segunda gela  Superheroien gela
            ArrayList<String> superheroigela = new ArrayList<String>();
            superheroigela.add("Capitán América: Brave New World");
            superheroigela.add("Thunderbolt");
            gelak.add(superheroigela);
            gelenIzena.add("Superheroien gela");

            //Tercera gela  Thriller gela
            ArrayList<String> thrillergela = new ArrayList<String>();
            thrillergela.add("Conclave");
            thrillergela.add("Misión: Imposible. Sentencia Final");
            thrillergela.add("Sirāt");
            gelak.add(thrillergela);
            gelenIzena.add("Thriller gela");

            //Cuarta gela  Zientzia fikzio gela
            ArrayList<String> zientziafikziogela = new ArrayList<String>();
            zientziafikziogela.add("Wolfgang");
            gelak.add(zientziafikziogela);
            gelenIzena.add("Zientzia fikzio gela");

            //Quinta gela  Komedia gela
            ArrayList<String> komediagela = new ArrayList<String>();
            komediagela.add("Padre no hay más que uno 5");
            komediagela.add("El casoplon");
            komediagela.add("Un funeral de locos");
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
        ArrayList<String>informazioorokorra = new ArrayList<>();
        informazioorokorra.add("Lilo y Stitch");
        informazioorokorra.add("Una película de Minecraft");
        informazioorokorra.add("Mufasa: El rey león");
        informazioorokorra.add("Cómo entrenar a tu dragón");
        informazioorokorra.add("Capitán América: Brave New World");
        informazioorokorra.add("Conclave");
        informazioorokorra.add("Sonic 3: La película");
        informazioorokorra.add("Misión: Imposible. Sentencia Final");
        informazioorokorra.add("Blancanieves");
        informazioorokorra.add("Thunderbolt");
        informazioorokorra.add("Padre no hay más que uno 5");
        informazioorokorra.add("Wolfgang (Extraordinario)");
        informazioorokorra.add("El casoplón");
        informazioorokorra.add("Un funeral de locos");
        informazioorokorra.add("Sirāt");

        System.out.println(informazioorokorra.size());

        sc.close();






    }
}
