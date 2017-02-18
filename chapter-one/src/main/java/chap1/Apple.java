package chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Apple implements Comparator<Apple>, Comparable<Apple> {

  public static final List<Apple> apples = Arrays.asList(
            new Apple("green", 100, 2),
            new Apple("red", 130, 1),
            new Apple("green", 160, 3),
            new Apple("black", 43, 4),
            new Apple("weight", 53, 5),
            new Apple("green", 187, 6),
            new Apple("green", 98, 7),
            new Apple("red", 20, 8),
            new Apple("orange", 200, 9)

  );


    private String color;
    private int weight;
    private int id;

    public Apple() {
    }

    public Apple(String color, int weight, int id) {
        this.color = color;
        this.weight = weight;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", id=" + id +
                '}';
    }

    public static boolean isHeavy(Apple a) {
        return a.getWeight() > 150;
    }

    public static boolean isGreen(Apple a) {
        return a.getColor().equals("green");
    }


    public static List<Apple> filterApplesByPassedPredicate(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> filteredApplesByPredicate = new ArrayList<>();

        apples.forEach(apple -> {
            if (predicate.test(apple)) {
                filteredApplesByPredicate.add(apple);
            } else {
                System.out.println(String.format("Apple %s can't pass the predicate condition", apple.getId()));
            }
        });
        return filteredApplesByPredicate;
    }


    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight() > o2.getWeight() ? 1 : o1.getWeight() < o2.getWeight() ? -1 : 0;
    }


    @Override
    public int compareTo(Apple o) {
        return this.getWeight() < o.getWeight() ? -1 : this.getWeight() > o.getWeight() ? 1 : 0;
    }
}
