package first;

public class CSE {
    
    public static void main(String[] args){

        UAP s1 = new UAP();
        UAP s2 = new UAP();
        UAP s3 = new UAP();

        s1.studentName = "Gazi Shahtaz Mohammad";
        s1.studentId = 22201069;
        s1.studentCgpa = 3.67;

        System.out.println("Name:: " + s1.studentName);
        System.out.println("ID  :: " + s1.studentId);
        System.out.println("CGPA:: " + s1.studentCgpa);

        System.out.println("\n");
        s1.addCourse();
        
        System.out.println("\n");
        s1.dropCourse();
    }
}
