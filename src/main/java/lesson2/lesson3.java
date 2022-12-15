package lesson2;
import java.util.*;
public class lesson3 {
    public static void main(String[] args) {
        //ex1();
        ex2_1();
       // ex2_2();
        //ex2_3();
    }
    //Заполнить список 10 случайными числами и отсортировать их методом sort
    private static void ex1() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

 list.sort(Comparator.naturalOrder());
// Collections.sort(list);
// list.sort(Integer::compare);

        System.out.println(list);
    }

    //Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    //Вывести название каждой планеты и количество его повторений в списке.
    private static void ex2_1() {
        List<String> planets =Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        List<String> distinctPlanets = new ArrayList<>();

        for (int i = 0; i < planets.size(); i++) {
            String planet = planets.get(i);
            if (!distinctPlanets.contains(planet)) {
                int count = 1;
                distinctPlanets.add(planet);
                for (int j = i + 1; j < planets.size(); j++) {
                    if (planet.equals(planets.get(j))) {
                        count++;
                    }
                }
                System.out.printf("%s\t-\t%s раз%n", planet, count);
            }
        }
    }
    private static void ex2_2() {
        List<String> planets =Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        planets.stream().distinct()
                .forEach(planet -> System.out.printf("%s\t-\t%s раз%n", planet,
                        planets.stream().filter(planet::equals).count()));
    }

    private static void ex2_3() {
        List<String> planets =Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        Map<String, Integer> frequencyByPlanet = new HashMap<>();
        for (String planet : planets) {
            Integer frequency = frequencyByPlanet.getOrDefault(planet, 0);
/* if (frequency == null) {
frequency = 0;
}*/

            frequencyByPlanet.put(planet, ++frequency);
        }

        frequencyByPlanet.forEach((planet, frequency) -> System.out.printf("%s\t-\t%s раз%n", planet, frequency));
    }
}
