 


/**
 * Write a description of class Dropout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dropout extends students {
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private double remainingAmount;
    private boolean hasPaid;

    public Dropout(String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout) {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setEnrollmentID(1);
        super.setCourseName("computing");
        super.setDateOfEnrollment("");
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = true;
    }

    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }

    public int getNumOfMonthsAttended() {
        return numOfMonthsAttended;
    }

    public String getDateOfDropout() {
        return dateOfDropout;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void billsPayable() {
        double remainingAmount = (super.getCourseDuration() - this.getNumOfMonthsAttended()) * super.getTuitionFee();
        this.remainingAmount = remainingAmount;
        if(remainingAmount==0){
            hasPaid=true;
        }else{
            hasPaid=false;
        }
        
    }

    public void removeStudent() {
        if (hasPaid) {
            setdateOfBirth("");
            setCourseName("");
            setstudentName("");
            setEnrollmentID(0);
            setDateOfEnrollment("");
            settuitionFee(0);
            setcourseDuration(0);
            numOfRemainingModules = 0;
            numOfMonthsAttended = 0;
            dateOfDropout = "";
            remainingAmount = 0;
            hasPaid = false;
        } else {
            System.out.println("All bills not cleared");
        }
    }

    public void display() {
        super.display();
        System.out.println("Num of Remaining Modules: " + numOfRemainingModules);
        System.out.println("Num of Months Attended: " + numOfMonthsAttended);
        System.out.println("Date of Dropout: " + dateOfDropout);
        System.out.println("Remaining Amount: " + remainingAmount);
    }
}
