package test1;

//@FunctionalInterface
public interface SayHello {
    void say();
    default public void print(){
        System.out.println("print Hello");
    }
}
