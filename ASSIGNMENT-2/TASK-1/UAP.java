package first;

public class UAP {
    public String studentName;
    public int studentId;
    public double studentCgpa;

    public void addCourse(){
        System.out.println("Add Course");
        System.out.println("----------");
        System.out.println("\t1. CSE-201");
        System.out.println("\t2. MTH-205");
        System.out.println("\t3. CHEM-203");
    }

    public void dropCourse(){
        System.out.println("Drop Course");
        System.out.println("-----------");
        System.out.println("\t1. CSE-201");
        System.out.println("\t2. MTH-205");
        System.out.println("\t3. CHEM-203");
    }
}
