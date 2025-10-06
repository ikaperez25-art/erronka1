import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
        if (opzioa >= 1 && opzioa <= hasierakomenua.size()) {
            String hasierakomenuaaukera = hasierakomenua.get(opzioa - 1);
            System.out.println("Aukeratu duzu " + hasierakomenuaaukera);
//Aukeratu el dia de la semana
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
                if (aukera >= 1 && aukera <= astekoegunak.size()) {
                    String astekoegunaaukeratuta = astekoegunak.get(aukera - 1);
                    System.out.println("Aukeratu duzu " + astekoegunaaukeratuta);

                    switch (astekoegunaaukeratuta) {
                        case "Astelehena":
                            System.out.println("Asteleheneko gelak hauek dira");
                            break;
                        case "Asteartea":
                            System.out.println("Astearteko gelak hauek dira");
                            break;
                        case "Asteazkena":
                            System.out.println("Asteazkeneko gelak hauek dira");
                            break;
                        case "Osteguna":
                            System.out.println("Osteguneko gelak hauek dira");
                            break;
                        case "Ostirala":
                            System.out.println("Ostiraleko gelak hauek dira");
                            break;
                        case "Larunbata":
                            System.out.println("Larunbateko gelak hauek dira");
                            break;
                        case "Igandea":
                            System.out.println("Igandeko gelak hauek dira");
                            break;
                        default:
                            System.out.println("Ezin da aukeratu eguna");
                    }
                } else {
                    System.out.println("Sartutako zenbakia baliogabea da");
                }
            }
        } else {
            System.out.println("Zenbakia ez da baliozkoa");
        }
//Nose si se hace asi
        ArrayList<ArrayList<String>> gelak = new ArrayList<ArrayList<String>>();
//Primeragela
        ArrayList<String> umeengela = new ArrayList<>();
        umeengela.add("Lilo y Stitch");
        umeengela.add("Una pelicula de Minecraft");
        umeengela.add("Mufasa:El rey leon");
        umeengela.add("Como entrenar a tu dragon");
        umeengela.add("Sonic 3: La pelicula");
        umeengela.add("Blancanieves");
        gelak.add(umeengela);
//Segunda gela
        ArrayList<String> superheroigela = new ArrayList<String>();
        superheroigela.add("Capitán América: Brave New World");
        superheroigela.add("Thunderbolt");
        gelak.add(superheroigela);
//Tercera gela
        ArrayList<String> thrillergela = new ArrayList<String>();
        thrillergela.add("Conclave");
        thrillergela.add("Misión: Imposible. Sentencia Final");
        thrillergela.add("Sirāt");
        gelak.add(thrillergela);
//Cuarta gela
        ArrayList<String> zientziafikziogela = new ArrayList<String>();
        zientziafikziogela.add("Wolfgang");
        gelak.add(zientziafikziogela);
//Quintagela
        ArrayList<String> komediagela = new ArrayList<String>();
        komediagela.add("Padre no hay más que uno 5");
        komediagela.add("El casoplon");
        komediagela.add("Un funeral de locos");
        gelak.add(komediagela);

        


        //Prueba de lo de que salga aleatoriamente la gela

        Random rand =new Random();
        int zenbakialeatorioa =rand.nextInt(gelak.size());
        ArrayList<String> gelaaleatorioa = gelak.get(zenbakialeatorioa);

        System.out.println(astekoegunaaukeratuta+"Hau da gel:");
        for(String filma: gelaaleatorioa){
            System.out.println(filma);
        }
        sc.close();

    }
}
