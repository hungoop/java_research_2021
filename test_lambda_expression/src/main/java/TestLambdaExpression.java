import test1.SayHello;
import test1.SayHello1;
import test1.SayHelloImpl;

import java.util.*;

public class TestLambdaExpression {

    public static void main(String[] args){
       // SayHello sh = new SayHelloImpl();
       // sh.say();

//        SayHello sh = new SayHello() {
//            @Override
//            public void say() {
//                System.out.println("Hello");
//            }
//        };
//        sh.say();

        /*
        SayHello sh = () -> System.out.println("Hello");
        sh.say();
        sh.print();*/

        /*
        SayHello1 sh1 = (name) -> {
            System.out.println("Hello : " + name);
        };
        sh1.say("stsven");*/


        //method reference
        //SayHello1 sh = System.out::println;
        //sh.say("stsven");



        /*
        Map<String, String> students = new HashMap<>();
        students.put("name", "Khanh");
        students.put("age", "20");
        students.put("dateofBirth", "24-06-1997");

        students.forEach((k, v) -> System.out.println(k + " : " +v));
         */

        List<String> names = new ArrayList<>();
        names.add("Thanh");
        names.add("Khanh");
        names.add("Tan");

        /*
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        names.forEach(System.out::println);*/

        names.sort((s1, s2) -> s1.compareTo(s2));

        names.forEach(System.out::println);

    }

}
