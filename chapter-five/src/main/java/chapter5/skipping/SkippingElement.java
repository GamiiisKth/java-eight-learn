package chapter5.skipping;

import chapter4.core.Dish;

import java.util.Optional;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class SkippingElement {

    public static void main(String[] args) {

        Optional<Dish> dishOptional = Dish.menu.stream()
                .filter((d) -> d.getCalories() > 500)
                .findFirst();

        System.out.println(dishOptional.map(SkippingElement::map).orElse("null"));

    }

    private static String map(Dish dish) {
        return dish.toString();
    }
}