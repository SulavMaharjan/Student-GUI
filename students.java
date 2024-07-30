 


/**
 * Write a description of class students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class students
{
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;

    public students(String dateOfBirth, String studentName, int courseDuration, int tuitionFee) {
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
        this.enrollmentID = 0;
        this.courseName = "";
        this.dateOfEnrollment = "";
        
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }
    
    public void setdateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void setcourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }
    
    public void settuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    
    public void display() {
        if (enrollmentID == 0 || courseName == null || dateOfEnrollment == null ) {
            System.out.println("Field must be entered.");
        } else {
            int yearsEnrolled = courseDuration / 12;
            System.out.println("Enrollment ID: " + enrollmentID);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Course Name: " + courseName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Years Enrolled: " + yearsEnrolled);
            System.out.println("Course Duration (months): " + courseDuration);
            System.out.println("Tuition Fee: " + tuitionFee);
        }
    }
}

