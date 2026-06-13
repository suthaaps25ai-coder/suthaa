public class day8 {
    record CourseRecord(String AI,String CS){
    }
    static void main() {
    CourseRecord courserecord = new CourseRecord("AI","CS");
    System.out.println(courserecord.AI());
    System.out.println(courserecord.CS());
  }
}
