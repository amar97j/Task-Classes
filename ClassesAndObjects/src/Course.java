
public class Course {
  
    String courseName;
    String instructor;
    int numOfStudents;

    Course(String subjectName, String instructorName, int students)
    {
    courseName = subjectName;
    instructor = instructorName;
    numOfStudents = students;
    }

    public String getSubjectName(){
        return courseName;
    } //Getter for courseName

    public void setSubjectName(String newSubject){
        courseName=newSubject;
    } //Setter for courseName



    public String getInstructor(){
        return instructor;
    } //Getter for instructor

    public void setInstructor(String newInstructor){
        instructor=newInstructor;
    } //Setter for instructor


     public int getStudents(){
        return numOfStudents;
    } //Getter for numOfStudents

    public void setStudents(int newStudents){
        numOfStudents=newStudents;
    } //Setter for instructor


    @Override
    public String toString() {
        return "Course Name:" + " " + courseName + "\n Instructor:" + " " + instructor + " Number of students: " + " " + numOfStudents ;
    }





    public static void main(String[] args) throws Exception {
    
        //Creating a new course object
        Course newCourse = new Course("calc", "Ali", 10);
        Course newCourse2 = new Course("C++", "AMAR", 100);
        Course newCourse3 = new Course("Chem", "Omar", 120);

        
        System.out.println(newCourse);
        System.out.println(newCourse2);
        System.out.println(newCourse3);
  
        

    }


}
