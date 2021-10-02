import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import st.test2.HelloWorld;
import st.test3.Clazz;

public class AppTest {

    public static void main(String[] args) {
        // Call Spring container
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring_bk_t1t2.xml___bk");

        // Request to get Drawing object
        //Drawing drawing = (Drawing) context.getBean("drawing");

        //drawing.draw();


        //Clazz clazzA = (Clazz) context.getBean("clazzA");

        //System.out.println("\n" + clazzA.getSchoolName());

        //Clazz generalClazz = (Clazz) context.getBean("generalClazz");

        //System.out.println("\n" + generalClazz.getSchoolName());


        //ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        //ApplicationContext context = new ClassPathXmlApplicationContext("spring_bk_t2.xml_bk");

        //HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        //helloWorld.print();

        // Call Spring container
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Request to get Clazz object
       // Clazz clazz= (Clazz) context.getBean("clazz");

        // Do anything
        //System.out.println(clazz.getStudent().toString());

        // Call Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Request to get Clazz object
        Clazz clazz = (Clazz) context.getBean("clazz");

        // Do anything
        System.out.println(clazz.getStudents().size());
    }
}
