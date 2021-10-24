package lambda.class1;

@FunctionalInterface
public interface ConsumerInterface<T> {
    void  accept(T t);
}
