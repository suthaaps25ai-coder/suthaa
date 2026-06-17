
import java.util.ArrayList;
import java.util.LinkedList;

public class day10 {
    /*  static void main(){
          String[]student={"pradhish","surya","suthaa","poorani","ram"};
          System.out.println(student.length);
          ArrayList<String>list=new ArrayList();
          ArrayList<String>list1=new ArrayList();
          list.add("pradhish");
          list.add("surya");
          list.add("suthaa");
          list.add("poorani");
          list.add("ram");
          for(String s:list){
              System.out.println(s);
          }
          list.remove("ram");
          System.out.println();
          System.out.println(list.getFirst());
          System.out.println(list.getLast());
          System.out.println();
          for(String s:list){
              System.out.println(s);
          }
          list1.add("supriya");
          list1.add("b");
          list1.add("c");
          list1.add("p");
          list1.add("r");
          list.addAll(list1);
          for(String s:list){
              System.out.println(s);
          }

      }
  }
  */
   /* static void process(LinkedList<String> List) {
        System.out.println("removed:" + List.removeFirst());
    }

    static void main() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        while (list.size() > 1) {
            process(list);
        }
    }
}
*/


 /*  static void process(LinkedList<String> list) {
        System.out.println("Removed : " + list.removeFirst());
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Add 5 students
        list.add("101 - poorani- 85");
        list.add("102 - supriya- 78");
        list.add("103 - reymanth- 90");
        list.add("104 - pradhish - 88");
        list.add("105 - madhu- 75");

            System.out.println("Student List:");
            System.out.println(list);

            // Add one student
            list.add("106 - surya - 92");
            System.out.println("\nAfter Adding:");
            System.out.println(list);

            // Remove one student
            process(list);

            System.out.println("\nAfter Removing:");
            System.out.println(list);

            // Update one student
            list.set(2, "104 - abii - 95");

            System.out.println("\nAfter Updating:");
            System.out.println(list);
        }
    }
   */


static void main(){
    String name=null;
    try{
        System.out.println(name.charAt(0));
        System.out.println(24/0);
    }catch(ArithmeticException e){
        System.out.println("Arithmetic Exception");
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Array Index Out OfBounds Exception" );
    }catch(Exception e){
        System.out.println("Exception");
}finally{
        System.out.println("this will always excute");
        name="";
    }
    System.out.println("still running");
    System.out.println("name:"+name);
    }
}