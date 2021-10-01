package st.test;

import java.util.function.Supplier;

public class Calculator1 implements Supplier<Integer> {
    private int a;
    private int b;

    public Calculator1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer get() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a + " + " + b);

        return a + b;
    }
}
