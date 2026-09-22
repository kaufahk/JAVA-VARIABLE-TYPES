public class Main {
    public static void main(String[] args) {
        courses obj1= new courses("COA",5,9);
        courses obj2= new courses("Comp Applications",3,7);
        courses obj3= new courses("DSA",2,6);
        int totalNumberOfStudents= obj1.numberOfStudents+obj2.numberOfStudents+obj3.numberOfStudents;
        int NumberOfCourses= 3;
        int AverageStudents= totalNumberOfStudents/NumberOfCourses;
    }
}
