package test1;

public class SayHelloImpl implements SayHello{
    @Override
    public void say() {
        System.out.println("Hello");
    }

    @Override
    public void print() {
        System.out.println("print Hello");
    }
}
