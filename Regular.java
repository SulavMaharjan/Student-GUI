 


/**
 * Write a description of class Regular here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Regular extends students
{
    
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    public Regular(String dateOfBirth, String studentName, int courseDuration, int tuitionFee,
    int numOfModules, int numOfCreditHours, double daysPresent,int enrollmentID,String courseName, String dateOfEnrollment) {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment(dateOfEnrollment);
        super.setCourseName(courseName);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }

    public int getNumOfModules() {
        return numOfModules;
    }

    public int getNumOfCreditHours() {
        return numOfCreditHours;
    }

    public double getDaysPresent() {
        return daysPresent;
    }

    public boolean isGrantedScholarship() {
        return isGrantedScholarship;
    }

    public void setCourseName(String courseName) {
        super.setCourseName(courseName);
        
    }

    public void setEnrollmentID(int enrollmentID) {
        super.setEnrollmentID(enrollmentID);
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        super.setDateOfEnrollment(dateOfEnrollment);
    }

    public double presentpercentage(double daysPresent){
        double courseDuration = getCourseDuration();
        double presentpercentage = ((daysPresent*100)/(courseDuration*30));
        return presentpercentage;
    }
    
    public char presentPercentage(double daysPresent) {
        this.daysPresent=daysPresent;
        if (getCourseDuration()*30 < daysPresent) {
            System.out.println( "The number of days present cannot be greater than the course duration");
        } 
        double presentPercentage = daysPresent / (super.getCourseDuration()*30) * 100;
        System.out.println(presentPercentage);
        if (presentPercentage >= 80 && presentPercentage<=100) {
            this.isGrantedScholarship = true;
            return 'A';
        } else if (presentPercentage >= 60 && presentPercentage <80) {
            return 'B';
        } else if (presentPercentage >= 40 && presentPercentage <60) {
            return 'C';
        } else if (presentPercentage >= 20 && presentPercentage <40) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment) {
        System.out.println(getStudentName() + " has graduated in " + courseName + " (enrollment ID: " + enrollmentID + ", date of enrollment: " + dateOfEnrollment + ")");
        if (isGrantedScholarship) {
            System.out.println("The scholarship has been granted");
        }
    }

    public void display() {
        super.display();
        System.out.println("Number of modules: " + numOfModules);
        System.out.println("Number of credit hours: " + numOfCreditHours);
        System.out.println("Days present: " + daysPresent);
    }
}
