import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class day13 {


    static void main(){
        Path path= Path.of("src/files", "student.csv");
        try{
            List<String>data=Files.readAllLines(path);
            for (String line:data){
                System.out.println(line);
            }
            List<String> newData=new ArrayList<>();
            newData.add("student 1");
            newData.add("student 2");
            newData.add("student 3");
            newData.add("student 4");
            newData.add("student 5");

        }catch (IOException io){
            System.out.println("Error reading file");

        }
    }
}

static void main(){
    Path path=Path.of("src/" +
            "files","student.csv");
    try{
        List<String> students = Files.readAllLines(path);

        for (String line : students) {
            String[] row = line.split(",");
            for(int i = 0; i < row.length; i++){
                System.out.print(row[i]+" | ");
            }
            System.out.println();
        }
    } catch (IOException io) {
        io.printStackTrace();
    }
}

