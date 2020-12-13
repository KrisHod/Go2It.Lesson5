package Task5_4;

public interface Promotionable {
    default void makeCareer(){
        System.out.println("The employee is actively working on the promotion");
    }
}
