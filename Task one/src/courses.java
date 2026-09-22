public class courses {
    String coursename;
    int numberOfStudents;
    static int totalStudents;
    public courses(String c,int n,int t){
        coursename=c;
        numberOfStudents=n;
        totalStudents=t;
    }
    public void display(){
        System.out.println("course name "+coursename);
        System.out.println("Number of students "+numberOfStudents);
        System.out.println("Total number of students "+totalStudents);
    }
}
