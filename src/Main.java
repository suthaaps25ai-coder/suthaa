class student{
    String name;
    int registerNo;
    int mathsMark;
    int physicsMark;
    int chemistryMark;
    student (String name,int registerNo){
        this.name=name;
        this.registerNo=registerNo;
    }
    void updateMarks(int mathsMarks){
        this.mathsMark=mathsMarks;
    }
    void updateMarks(int mathsMark,int physicsMark){
        this.mathsMark=mathsMark;
        this.physicsMark=physicsMark;
    }

    void updateMarks(int mathsMark,int physicsMark,int chemistryMark) {
        this.mathsMark=mathsMark;
        this.physicsMark=physicsMark;
        this.chemistryMark = chemistryMark;
    }
    void display(){
        System.out.println("Name:+name");
        System.out.println("registerNo:+registerNo");
        System.out.println("mathsMark:+mathaMark");
        System.out.println("physicsMark:+physicsMark");
        System.out.println("chemistryMark:+chemistryMark");
        System.out.println("---------");
    }
    public class studentDemo{
        public static void main(String[]args){
            student s1=new student("suthaa",102);
            s1.updateMarks(85);
            student s2=new student("siva",109);
            s2.updateMarks(85,90);
            student s3=new student("arul",111);
            s3.updateMarks(85,90,99);
            s1.display();
            s2.display();
            s3.display();
        }

    }
}