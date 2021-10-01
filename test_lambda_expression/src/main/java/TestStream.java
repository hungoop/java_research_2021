import test2.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args){
        /*
        List<String> s = Arrays.asList("aaaa", "bbbbb", "ccccc", "asdf");

        s.stream()
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
*/

        /*
        List<Student> names = Arrays.asList(
                new Student("Khanh", "VN"),
                new Student("Peter", "US"),
                new Student("Thanh", "VN"),
                new Student("Khanh", "VN"));
*/
        //Map<String, List<Student>> result = names.stream().collect(Collectors.groupingBy(Student::getCountry));

//        Map<String, Long> result = names.stream().collect(
//                Collectors.groupingBy(Student::getCountry, Collectors.counting())
//        );
//
//        result.entrySet().stream().forEach((r) -> System.out.println(r.getKey() + " - " + r.getValue()));


        List<String> lst1 = new ArrayList<>();
        lst1.add("aaaaas");

        List<String> lst2 = new ArrayList<>();
        lst2.add("bbbd");
        lst2.add("ccc");

        List<List<String>> lstAll = Arrays.asList(lst1, lst2);

        Stream<List<String>> stream = lstAll.stream();


        /*
        stream.filter(s -> "bbbd".equals(s.toString()))
                .forEach(o -> System.out.println(o.toString()));

        Stream<String> flatMap = stream.flatMap(l -> l.stream());

         */

        stream.flatMap(l -> l.stream())
                .filter(s -> "bbbd".equals(s.toString()))
                .forEach(o -> System.out.println(o.toString()));

    }

}
