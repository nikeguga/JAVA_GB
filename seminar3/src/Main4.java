import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
//        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.

        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Neptun");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Jupiter");
        planets.add("Pluto");
        List<String> withRep = withRep(planets, 17);
        for (String planet : planets
        ) {
            System.out.print(planet + ":");
            System.out.println(Collections.frequency(withRep, planet));
        }
    }

    static List<String> withRep(List<String> planets, int count) {
        List<String> withRep = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            String planet = planets.get(random.nextInt(0, planets.size()));
            withRep.add(planet);
        }
        return withRep;
    }
}
