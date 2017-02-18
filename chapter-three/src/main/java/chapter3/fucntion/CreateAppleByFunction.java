package chapter3.fucntion;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

@FunctionalInterface
public interface CreateAppleByFunction<T, U, Z, R> {

    R apply(T t, U u, Z z);
}
