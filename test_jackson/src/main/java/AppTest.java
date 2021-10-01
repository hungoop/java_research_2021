import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppTest {
    public static void main(String[] args){

        //objJavaToJson();

        jsonToObjJava();

    }

    private static void jsonToObjJava(){
        String json = "{\"name\":\"asd123\",\"age\":22}";

        ObjectMapper om = new ObjectMapper();

        try {
            Student obj = om.readValue(json, Student.class);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    private static void objJavaToJson(){
        Student student = new Student();
        student.setName("Khanh");
        student.setAge(30);


        ObjectMapper om = new ObjectMapper();

        String json = null;
        try {
            json = om.writeValueAsString(student);

            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
