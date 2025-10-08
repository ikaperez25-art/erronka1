import java.util.ArrayList;
import java.util.Scanner;

public class appreestructurar {
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

    ArrayList<ArrayList<String>> gelak = new ArrayList<ArrayList<String>>();
    ArrayList<String> gelenIzena = new ArrayList<>();
    ArrayList<ArrayList<Integer>> gelenstocka = new ArrayList<>();


    
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

        ArrayList<Integer>umeengelakostocka=new ArrayList<>();
        for(int i = 0;i<umeengelakostocka;i++){
        umeengelakostocka.add(4);  
        }
        gelenstocka.add(umeengelakostocka);
        // Segunda gela Superheroien gela

        ArrayList<String> superheroigela = new ArrayList<String>();
        superheroigela.add(ANSI_GREEN + "Capitán América: Brave New World" + ANSI_RESET);
        superheroigela.add(ANSI_GREEN + "Thunderbolt" + ANSI_RESET);
        gelak.add(superheroigela);
        gelenIzena.add(ANSI_GREEN + "Superheroien gela" + ANSI_RESET);
        ArrayList<Integer>superheroigelakostocka=new ArrayList<>();
        for(int i = 0;i<superheroigelakostocka;i++){
        umeengelakostocka.add(4);  
        }
        gelenstocka.add(umeengelakostocka);

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

}