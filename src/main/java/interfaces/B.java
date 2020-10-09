package interfaces;

public interface B {
    default void start() {
        System.out.println("start B");
    }
}
