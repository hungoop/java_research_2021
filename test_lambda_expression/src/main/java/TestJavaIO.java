import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestJavaIO {

    public static void main(String[] args){

    }


    public static void createNewFile(){
        File file = new File("/Users/gemi/Documents/GitHub/git_st_research/test_lambda_expression/src/main/resources/note.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(){
        try {
            Path path = Paths.get("/Users/gemi/Documents/GitHub/git_st_research/test_lambda_expression/src/main/resources/test.txt");
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(){
        File file = new File("/Users/gemi/Documents/GitHub/git_st_research/test_lambda_expression/src/main/resources/note.txt");
        if (file.exists() && file.delete()) {
            System.out.println("File deleted successfully");
        }
    }

    public static void deletePath(){
        try {
            Path path = Paths.get("/Users/gemi/Documents/GitHub/git_st_research/test_lambda_expression/src/main/resources/test.txt");
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
