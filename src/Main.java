import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Voiture> listeVoitures = Arrays.asList(
            new Voiture("Peugeot", "Traveller"),
            new Voiture("Peugeot", "Rifter"),
            new Voiture("Peugeot", "Partner"),
            new Voiture("Renault", "Megane"),
            new Voiture("Renault", "Kangoo"),
            new Voiture("Renault", "Clio"),
            new Voiture("Renault", "Zoe"),
            new Voiture("Citroën", "Berlingo"),
            new Voiture("Audi", "Q8"),
            new Voiture("Volkswagen", "Tiguan")
        );

        listeVoitures.stream()
            .map(Voiture::getMarque)
            .filter(v -> !v.equals("Peugeot"))
            .distinct()
            .forEach(System.out::println);

        listeVoitures.stream()
            .map(Voiture::getMarque)
            .filter(v -> v.startsWith("P"))
            .distinct()
            .forEach(System.out::println);
    }
}