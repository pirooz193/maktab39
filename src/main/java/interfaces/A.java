package interfaces;

public interface A {

    default void start(){
        System.out.println("start A");
    }
}
