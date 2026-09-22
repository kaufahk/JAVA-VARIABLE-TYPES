public class Main {
    public static void main(String[] args) {
        courses obj1= new courses("COA",5,9);
        courses obj2= new courses("Comp Applications",3,7);
        courses obj3= new courses("DSA",2,6);
        int totalNumberOfStudents= obj1.numberOfStudents+obj2.numberOfStudents+obj3.numberOfStudents;
        int NumberOfCourses= 3;
        int AverageStudents= totalNumberOfStudents/NumberOfCourses;
        System.out.println("Individual course statistics");
        System.out.println("Object one");
        obj1.display();
        System.out.println("Object two");
        obj2.display();
        System.out.println("Object three");
        obj3.display();
        System.out.println("The total number of students is "+totalNumberOfStudents);
        System.out.println("The average students is "+AverageStudents);
    }
}
