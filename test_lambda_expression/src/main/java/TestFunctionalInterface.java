import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.*;

public class TestFunctionalInterface {
    public static void main(String[] args){
        //Consumer
        //List<String> s = Arrays.asList("aaa", "bbb");

        /*
        s.stream().forEach((s1) -> {
            System.out.println(s1);
        });*/

        //s.stream().forEach(System.out::println);

        /*
        Consumer<String> c1 = s -> System.out.println(s + " stevn1");

        Consumer<String> c2 = s -> System.out.println(s + " stevn2");

        Consumer<String> c3 = s -> System.out.println(s + " stevn3");

        c1.andThen(c2).andThen(c3).accept("hello");

        BiConsumer<String, String> b1 = (a, b) -> System.out.println(a + " stevn1 ," + b + " stevn1");
        b1.accept("aaa", "bbb");

         */

        //Supplier
        //List<String> s = Arrays.asList("aaa", "bbb");

//        s.forEach((x) -> {
//            print(() -> x);
//        });

        //s.forEach(x -> print(() -> x));


        //Predicate
        List<String> s = Arrays.asList("aaac", "bbb", "ccc");
        //s.stream().filter(x -> x.startsWith("a"))
        //        .forEach(System.out::println);

        //Predicate<String> p1 = x -> x.startsWith("a");
        //Predicate<String> p2 = x -> x.endsWith("c");

//        s.stream()
//                .filter(p1.and(p2))
//                .forEach(x -> System.out.println(x));


//        s.stream()
//                .filter(p1.or(p2))
//                .forEach(System.out::println);

//        s.stream()
//                .filter(p1.negate())
//                .forEach(System.out::println);

            //s.stream().map((x) -> x.length())
            //        .forEach(System.out::println);

        //Function<String, String> f1 = s1 -> s1.substring(0,2);
        //Function<String, String> f2 = s2 -> s2.toUpperCase(Locale.ROOT);


        Function<String, String> f1 = s1 -> String.valueOf(s1.length());
        Function<String, String> f2 = s2 -> String.valueOf(s2 + 1);

        //s.stream().map(f1.andThen(f2)).forEach(System.out::println);

        s.stream().map(Function.identity()).forEach(System.out::println);




    }

    private static void print(Supplier supplier){
        System.out.println(supplier.get());
    }
}
