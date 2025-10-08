import java.util.ArrayList;
import java.util.Scanner;

public class app {
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

        ArrayList<ArrayList<String>> gelak = new ArrayList<ArrayList<String>>();
        ArrayList<String> gelenIzena = new ArrayList<>();

        // Lista de las gelas
        // Primera gela 1Umeen gela
        ArrayList<String> umeengela = new ArrayList<>();
        umeengela.add(ANSI_CYAN + "Lilo y Stitch" + ANSI_RESET);
        umeengela.add(ANSI_CYAN + "Una pelicula de Minecraft" + ANSI_RESET);
        umeengela.add(ANSI_CYAN + "Mufasa:El rey leon" + ANSI_RESET);
        umeengela.add(ANSI_CYAN + "Como entrenar a tu dragon" + ANSI_RESET);
        umeengela.add(ANSI_CYAN + "Sonic 3: La pelicula" + ANSI_RESET);
        umeengela.add(ANSI_CYAN + "Blancanieves" + ANSI_RESET);
        gelak.add(umeengela);
        gelenIzena.add(ANSI_CYAN + "Umeen gela" + ANSI_RESET);

        // Segunda gela Superheroien gela
        ArrayList<String> superheroigela = new ArrayList<String>();
        superheroigela.add(ANSI_GREEN + "Capitán América: Brave New World" + ANSI_RESET);
        superheroigela.add(ANSI_GREEN + "Thunderbolt" + ANSI_RESET);
        gelak.add(superheroigela);
        gelenIzena.add(ANSI_GREEN + "Superheroien gela" + ANSI_RESET);

        // Tercera gela Thriller gela
        ArrayList<String> thrillergela = new ArrayList<String>();
        thrillergela.add(ANSI_RED + "Conclave" + ANSI_RESET);
        thrillergela.add(ANSI_RED + "Misión: Imposible. Sentencia Final" + ANSI_RESET);
        thrillergela.add(ANSI_RED + "Sirāt" + ANSI_RESET);
        gelak.add(thrillergela);
        gelenIzena.add(ANSI_RED + "Thriller gela" + ANSI_RESET);

        // Cuarta gela Zientzia fikzio gela
        ArrayList<String> zientziafikziogela = new ArrayList<String>();
        zientziafikziogela.add(ANSI_YELLOW + "Wolfgang" + ANSI_RESET);
        gelak.add(zientziafikziogela);
        gelenIzena.add(ANSI_YELLOW + "Zientzia fikzio gela" + ANSI_RESET);

        // Quinta gela Komedia gela
        ArrayList<String> komediagela = new ArrayList<String>();
        komediagela.add(ANSI_PURPLE + "Padre no hay más que uno 5" + ANSI_RESET);
        komediagela.add(ANSI_PURPLE + "El casoplon" + ANSI_RESET);
        komediagela.add(ANSI_PURPLE + "Un funeral de locos" + ANSI_RESET);
        gelak.add(komediagela);
        gelenIzena.add(ANSI_PURPLE + "Komedia gela" + ANSI_RESET);

        ArrayList<String> hasierakomenua = new ArrayList<String>();
        hasierakomenua.add("Asteko egunak");
        hasierakomenua.add("Informazio orokorra");
        hasierakomenua.add("Kokapena");
        hasierakomenua.add("Ordutegia");
        hasierakomenua.add("Itxi");

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

            // Egunetan filmak egoteko asignatuta
            // Lo de random quitao que vaya movida
            if (astekoegunaaukeratuta.equals("Astelehena")) {
                System.out.println(astekoegunaaukeratuta + "ko gelak eta pelikulak hauek dira:");
                System.out.println(gelenIzena.get(4) + ":");
                for (String p : komediagela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(2) + ":");
                for (String p : thrillergela)
                    System.out.println("- " + p);
            }

            else if (astekoegunaaukeratuta.equals("Asteartea")) {
                System.out.println(astekoegunaaukeratuta + "ko gelak eta pelikulak hauek dira:");
                System.out.println(gelenIzena.get(0) + ":");
                for (String p : umeengela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(1) + ":");
                for (String p : superheroigela)
                    System.out.println("- " + p);
            }

            else if (astekoegunaaukeratuta.equals("Asteazkena")) {
                System.out.println(astekoegunaaukeratuta + "ko gelak eta pelikulak hauek dira:");
                System.out.println(gelenIzena.get(3) + ":");
                for (String p : zientziafikziogela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(2) + ":");
                for (String p : thrillergela)
                    System.out.println("- " + p);

            } else if (astekoegunaaukeratuta.equals("Osteguna")) {
                System.out.println(astekoegunaaukeratuta + "ko gelak eta pelikulak hauek dira:");
                System.out.println(gelenIzena.get(1) + ":");
                for (String p : superheroigela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(4) + ":");
                for (String p : komediagela)
                    System.out.println("- " + p);

            } else if (astekoegunaaukeratuta.equals("Ostirala")) {
                System.out.println(astekoegunaaukeratuta + "ko gelak eta pelikulak hauek dira:");
                System.out.println(gelenIzena.get(0) + " :");
                for (String p : umeengela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(3) + ": ");
                for (String p : zientziafikziogela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(4) + ":");
                for (String p : komediagela)
                    System.out.println("- " + p);

            } else if (astekoegunaaukeratuta.equals("Larunbata")) {
                System.out.println(astekoegunaaukeratuta + "ko gelak eta pelikulak hauek dira:");
                System.out.println(gelenIzena.get(1) + ":");
                for (String p : superheroigela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(2) + ":");
                for (String p : thrillergela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(4) + ":");
                for (String p : komediagela)
                    System.out.println("- " + p);

            } else if (astekoegunaaukeratuta.equals("Igandea")) {
                System.out.println(astekoegunaaukeratuta + "ko gelak eta pelikulak hauek dira:");
                System.out.println(gelenIzena.get(0) + ":");
                for (String p : umeengela)
                    System.out.println("- " + p);
                System.out.println(gelenIzena.get(4) + ":");
                for (String p : komediagela)
                    System.out.println("- " + p);
            }

            else {
                System.out.println("Egun honetan ez dago pelikularik proiektatzeko.");
            }

            System.out.println("Aukeratu filma");


            int aukeratutakofilmaeguneko =sc.nextInt();
                        ArrayList<ArrayList<String>> egunekogela = new ArrayList<>();
            ArrayList<String> egunekogelenizena = new ArrayList<>();
            ArrayList<ArrayList<Integer>> egunekogelenstocka = new ArrayList<>();

        }

        // Informazio orokorra aukeratuta
        if (hasierakomenuaaukera.equals("Informazio orokorra")) {
            ArrayList<String> informazioorokorra = new ArrayList<String>();
            informazioorokorra.add(ANSI_CYAN + "Lilo y Stitch" + ANSI_RESET);
            informazioorokorra.add(ANSI_CYAN + "Una pelicula de Minecraft" + ANSI_RESET);
            informazioorokorra.add(ANSI_CYAN + "Mufasa:El rey leon" + ANSI_RESET);
            informazioorokorra.add(ANSI_CYAN + "Como entrenar a tu dragon" + ANSI_RESET);
            informazioorokorra.add(ANSI_CYAN + "Sonic 3: La pelicula" + ANSI_RESET);
            informazioorokorra.add(ANSI_CYAN + "Blancanieves" + ANSI_RESET);
            informazioorokorra.add(ANSI_GREEN + "Capitán América: Brave New World" + ANSI_RESET);
            informazioorokorra.add(ANSI_GREEN + "Thunderbolt" + ANSI_RESET);
            informazioorokorra.add(ANSI_RED + "Conclave" + ANSI_RESET);
            informazioorokorra.add(ANSI_RED + "Misión: Imposible. Sentencia Final" + ANSI_RESET);
            informazioorokorra.add(ANSI_RED + "Sirāt" + ANSI_RESET);
            informazioorokorra.add(ANSI_YELLOW + "Wolfgang" + ANSI_RESET);
            informazioorokorra.add(ANSI_PURPLE + "Padre no hay más que uno 5" + ANSI_RESET);
            informazioorokorra.add(ANSI_PURPLE + "El casoplon" + ANSI_RESET);
            informazioorokorra.add(ANSI_PURPLE + "Un funeral de locos" + ANSI_RESET);
            System.out.println("Huaek dira gaurko filmak:");
            System.out.println(informazioorokorra);
            System.out.println("Filma kopurua:" + informazioorokorra.size());
            System.out.println("Gela kopurua: " + gelak.size());
            System.out.println("Gelen izenak:");
            for (String izena : gelenIzena) {
                System.out.println("- " + izena);

                /*
                 * LAS GELAS PARA ACORDARME:UMEENGELA superheroigela THRILLER GELA zientzia
                 * fikzio gela komediagela
                 */
                ArrayList<ArrayList<Integer>> gelenstocka = new ArrayList<>();

                ArrayList<Integer> umeengelakostocka = new ArrayList<>();
                for (int i = 0; i < umeengela.size(); i++) {
                    umeengelakostocka.add(4);
                }
                gelenstocka.add(umeengelakostocka);

                ArrayList<Integer> superheroigelastocka = new ArrayList<>();
                for (int i = 0; i < superheroigela.size(); i++) {
                    superheroigelastocka.add(4);
                }
                gelenstocka.add(superheroigelastocka);

                ArrayList<Integer> thrillergelastocka = new ArrayList<>();
                for (int i = 0; i < thrillergela.size(); i++) {
                    thrillergelastocka.add(4);
                }
                gelenstocka.add(thrillergelastocka);

                ArrayList<Integer> zientziafikziogelastocka = new ArrayList<>();
                for (int i = 0; i < zientziafikziogela.size(); i++) {
                    zientziafikziogelastocka.add(4);
                }
                gelenstocka.add(zientziafikziogelastocka);

                ArrayList<Integer> komediagelastocka = new ArrayList<>();
                for (int i = 0; i < komediagela.size(); i++) {
                    komediagelastocka.add(4);
                }
                gelenstocka.add(komediagelastocka);

                // filma eta gela aukeratzeko gauza

                System.out.println("Aukeratu gela");

                for (int i = 0; i < gelenIzena.size(); i++) {
                    System.out.println((i + 1) + "." + gelenIzena.get(i));
                }
                int aukeratutakogela = sc.nextInt() - 1;

                System.out.println(" Aukeratu filma ");
                ArrayList<String> filmak = gelak.get(aukeratutakogela);
                ArrayList<Integer> filmenstocka = gelenstocka.get(aukeratutakogela);
                for (int i = 0; i < filmak.size(); i++) {
                    System.out.println((i + 1) + "." + filmak.get(i) + "   Stock:" + filmenstocka.get(i) + ")");
                }
                int aukeratutakofilma = sc.nextInt() - 1;
                // lo de comprar sarreras

                System.out.println("Zenbat sarrera nahi dituzu");
                int sarrerak = sc.nextInt();

                if (sarrerak <= filmenstocka.get(aukeratutakofilma) || sarrerak >= 1) {
                    filmenstocka.set(aukeratutakofilma, filmenstocka.get(aukeratutakofilma) - sarrerak);
                    System.out.println("Erosketa ondo egin da");
                    System.out.println("Geratzen den stocka:" + filmenstocka.get(aukeratutakofilma));

                } else {
                    System.out.println("Sartutako sarrera kantitatea ez dugu disponible");

                }

//Parte 4 lo de el horario

if (hasierakomenua.toString().equals("Ordutegia")) {
    System.out.println("Informazioa\n");
    System.out.println("Asteleheneko ordutegia:#\n");
    System.out.println("Astearteko ordutegia:#\n");
    System.out.println("Asteazkeneko ordutegia:#\n");
    System.out.println("Osteguneko ordutegia:#\n");
    System.out.println("Ostiraleko ordutegia:#\n");
    System.out.println("Larunbateko ordutegia:#\n");
    System.out.println("Igandeko ordutegia:#\n");
}


                // Parte 5 del meu lo de cerrar

                if (hasierakomenua.toString().equals("Itxi")) {

                    System.exit(0);
                    sc.close();
                }
            }
        }
    }
}