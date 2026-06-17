import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class day11 {
/*        public static void main(String[] args) {
            Set<String>Set=new HashSet<>();
            Set.add("student 1");
            Set.add("student 2");
            Set.add("student 1");
            Set.add("student 2");
            Set.add("student 1");
            Set.add("student 2");

            for (String s : Set) {
                System.out.println(s);
            }
        }
    }

*/
static void main() {

    Map<String, Integer> person = new HashMap<>();
    person.put("ram",89);
    person.put("john",78);
    person.put("aravindh",67);
    person.put("ramesh",90);
    System.out.println(person.get("percent"));
    person.entrySet().forEach(entry ->{
        System.out.println(entry.getKey() + " : " + entry.getValue());
    });
}
}
