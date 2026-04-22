import java.util.ArrayList;

public class Campeonato {
    static void main(String[] args) {
        ArrayList<CocheDeCarreras> coches = new ArrayList<>();

        coches.add(new PrototipoLM("SUSHI", "SASHIMI", 240, true));
        coches.add(new PrototipoLM("XD", "XP", 210, false));

        coches.add(new GranTurismo("GTX", "ASD", 275, 60));
        coches.add(new GranTurismo("NISSAN", "GTR", 300, 45));

        int i = 0;

        for (CocheDeCarreras c : coches) {
            i=i+1;
            System.out.println("...:::: COCHE NÚMERO " + (i) + " ::::...");
            c.mostrarDatos();
            c.competir();
            System.out.println("------------------------------");
        }
    }
}
