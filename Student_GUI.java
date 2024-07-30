import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_GUI{
    private JFrame frame;
    private JLabel heading;
    private JButton regularButton,dropoutButton;
    private JPanel homePanel;

    ArrayList<students> StudentsArray = new ArrayList<students>();

    JFrame frame1;
    JPanel regularPanel;
    JLabel regularlb1,enrollmentIdlb2,studentNamelb3,courseDurationlb4,tuitionFeelb5,numOfModuleslb6,numOfCreditHrlb7,daysPresentlb8,DOBlb9,DOElb10,courseNamelb11;
    JTextField enrollmentIdtf1,studentNametf2,courseDurationtf3,tuitionFeetf4,numOfModulestf5,numOfCreditHrtf6,daysPresenttf7,courseNametf8;
    JComboBox regularcb1,regularcb2,regularcb3,regularcb4,regularcb5,regularcb6;
    JButton regularAdd,regularClear,regularDisplay,regularSwitch,regularPresentPercentage,regularGrantCertificate;

    JFrame frame2;
    JPanel dropoutPanel;
    JLabel dropoutlb1,enrollIdlb2,courseNamelb3,studentNamelb4,courseDurationlb5,tuitionFeelb6,numOfRemaininglb7,numOfAttendedlb8,DODlb9,DOBlb10,DOElb11;
    JTextField enrollIdtf1,courseNametf2,studentNametf3,courseDurationtf4,tuitionFeetf5,numOfRemainingtf6,numOfAttendedtf7;
    JComboBox dropoutcb1,dropoutcb2,dropoutcb3,dropoutcb4,dropoutcb5,dropoutcb6,dropoutcb7,dropoutcb8,dropoutcb9;
    JButton dropoutAdd,dropoutClear,dropoutDisplay,dropoutSwitch,removeStudents,billsPayable;   

    public Student_GUI(){
        frame=new JFrame("Students");
        homePanel=new JPanel();

        frame.add(homePanel);
        heading=new JLabel("STUDENTS INFORMATION");
        heading.setFont(new Font("Times Roman", Font.BOLD, 26));
        heading.setBounds(145,68,350,25);
        homePanel.add(heading);

        regularButton= new JButton("REGULAR");
        regularButton.setBounds(73,180,135,50);
        homePanel.add(regularButton);

        dropoutButton= new JButton("DROPOUT");
        dropoutButton.setBounds(406,180,135,50);
        homePanel.add(dropoutButton);

        homePanel.setBackground(Color.decode("#FFFDD0"));

        dropoutButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent dropout)
                {
                    Dropout_GUI();
                    frame.dispose();
                }
            });

        regularButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent regular)
                {
                    Regular_GUI();
                    frame.dispose();
                }
            });

        homePanel.setLayout(null);
        frame.add(homePanel);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(600,340);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    //CODE OF REGULAR GUI
    public void Regular_GUI(){
        frame1= new JFrame("");
        regularPanel = new JPanel();

        regularlb1 = new JLabel("REGULAR STUDENTS");
        enrollmentIdlb2 = new JLabel("Enrollment id: ");
        studentNamelb3 = new JLabel("Student name: ");
        courseDurationlb4 = new JLabel("Course duration: ");
        tuitionFeelb5 = new JLabel("Tuition fee: ");
        numOfModuleslb6 = new JLabel("Number of modules: ");
        numOfCreditHrlb7 = new JLabel("Number of credit hours: ");
        daysPresentlb8 = new JLabel("Days present: ");
        DOBlb9 = new JLabel("Date Of Birth: ");
        DOElb10 = new JLabel("Date Of Enrollment: ");
        courseNamelb11 = new JLabel("Course name: ");

        enrollmentIdtf1 = new JTextField();
        studentNametf2 = new JTextField();
        courseDurationtf3 = new JTextField();
        tuitionFeetf4 = new JTextField();
        numOfModulestf5 = new JTextField();
        numOfCreditHrtf6 = new JTextField();
        daysPresenttf7 = new JTextField();
        courseNametf8 = new JTextField();

        regularlb1.setBounds(425,19,280,40);
        enrollmentIdlb2.setBounds(25,100,97,25);
        studentNamelb3.setBounds(25,156,87,20);
        courseDurationlb4.setBounds(12,213,100,20);
        tuitionFeelb5.setBounds(323,163,76,19);
        numOfModuleslb6.setBounds(628,101,122,17);
        numOfCreditHrlb7.setBounds(608,156,142,20);
        daysPresentlb8.setBounds(644,214,82,20);
        DOBlb9.setBounds(163,297,81,20);
        DOElb10.setBounds(523,297,120,20);
        courseNamelb11.setBounds(315,100,84,20);

        enrollmentIdtf1.setBounds(125,93,180,32);
        studentNametf2.setBounds(125,150,180,32);
        courseDurationtf3.setBounds(125,208,180,32);
        tuitionFeetf4.setBounds(399,156,180,32);
        numOfModulestf5.setBounds(762,93,180,32);
        numOfCreditHrtf6.setBounds(762,150,180,32);
        daysPresenttf7.setBounds(762,207,180,32);
        courseNametf8.setBounds(399,93,180,32);

        String[] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] year = {"1990","1992","1993","1994","1995","1996","1997","1998","1999","2000","2004","2005","2006","2007","2008"};

        regularcb1 = new JComboBox(date);
        regularcb1.setBounds(265,285,57,32);
        frame1.add(regularcb1);

        regularcb2 = new JComboBox(month);
        regularcb2.setBounds(322,285,85,32);
        frame1.add(regularcb2);

        regularcb3 = new JComboBox(year);
        regularcb3.setBounds(402,285,68,32);
        frame1.add(regularcb3);

        regularcb4 = new JComboBox(date);
        regularcb4.setBounds(657,285,57,32);
        frame1.add(regularcb4);

        regularcb5 = new JComboBox(month);
        regularcb5.setBounds(714,285,81,32);
        frame1.add(regularcb5);

        String[] year1 = {"2000","2001","2002","2003","2004","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        regularcb6 = new JComboBox(year1);
        regularcb6.setBounds(795,285,67,32);
        frame1.add(regularcb6);

        regularAdd = new JButton("Add");
        regularAdd.setBounds(267,373,120,32);
        frame1.add(regularAdd);

        regularClear = new JButton("Clear");
        regularClear.setBounds(675,373,120,32);
        frame1.add(regularClear);

        regularDisplay= new JButton("Display");
        regularDisplay.setBounds(471,373,120,32);
        frame1.add(regularDisplay);

        regularSwitch= new JButton("<<Go to dropout");
        regularSwitch.setBounds(32,400,131,32);
        frame1.add(regularSwitch);

        regularPresentPercentage= new JButton("Present Percentage");
        regularPresentPercentage.setBounds(470,207,150,32);
        frame1.add(regularPresentPercentage);

        regularGrantCertificate= new JButton("Grant Certificate");
        regularGrantCertificate.setBounds(325,207,130,32);
        frame1.add(regularGrantCertificate);

        frame1.add(regularlb1);
        frame1.add(enrollmentIdlb2);
        frame1.add(studentNamelb3);
        frame1.add(courseDurationlb4);
        frame1.add(tuitionFeelb5);
        frame1.add(numOfModuleslb6);
        frame1.add(numOfCreditHrlb7);
        frame1.add(daysPresentlb8);
        frame1.add(DOBlb9);
        frame1.add(DOElb10);
        frame1.add(courseNamelb11);

        frame1.add(enrollmentIdtf1);
        frame1.add(studentNametf2);
        frame1.add(courseDurationtf3);
        frame1.add(tuitionFeetf4);
        frame1.add(numOfModulestf5);
        frame1.add(numOfCreditHrtf6);
        frame1.add(daysPresenttf7);
        frame1.add(courseNametf8);

        regularAdd.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent regAdd)
                {
                    if (enrollmentIdtf1.getText().isEmpty() || studentNametf2.getText().isEmpty() || courseDurationtf3.getText().isEmpty() || tuitionFeetf4.getText().isEmpty() || numOfModulestf5.getText().isEmpty() || numOfCreditHrtf6.getText().isEmpty() || daysPresenttf7.getText().isEmpty() || courseNametf8.getText().isEmpty() ){
                        JOptionPane.showMessageDialog(frame2, "Above field are empty!", "Empty field", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    { 
                        try
                        {
                            if(Integer.parseInt(enrollmentIdtf1.getText())>=0 || Integer.parseInt(courseDurationtf3.getText())>=0 ||Integer.parseInt(tuitionFeetf4.getText()) >= 0 || Integer.parseInt(numOfModulestf5.getText()) >= 0 || Integer.parseInt(numOfCreditHrtf6.getText())>=0 || Integer.parseInt(daysPresenttf7.getText())>=0){

                                int enrollmentID = Integer.parseInt(enrollmentIdtf1.getText());
                                String studentName = studentNametf2.getText();
                                int courseDuration= Integer.parseInt(courseDurationtf3.getText());
                                int tuitionFee = Integer.parseInt(tuitionFeetf4.getText());
                                int numOfModules = Integer.parseInt(numOfModulestf5.getText());
                                int numOfCreditHours = Integer.parseInt(numOfCreditHrtf6.getText());
                                int daysPresent = Integer.parseInt(daysPresenttf7.getText());
                                String courseName =  courseNametf8.getText();
                                String day = (String) regularcb1.getSelectedItem();
                                String month = (String) regularcb2.getSelectedItem();
                                String year = (String) regularcb3.getSelectedItem();
                                String dateOfBirth = day + "/" + month + "/" + year;
                                String day2 = (String) regularcb4.getSelectedItem();
                                String month2 = (String) regularcb5.getSelectedItem();
                                String year2 = (String) regularcb6.getSelectedItem();
                                String dateOfEnrollment = day2 + "/" + month2 + "/" + year2;

                                Regular objreg = new Regular (dateOfBirth, studentName, courseDuration , tuitionFee , numOfModules , numOfCreditHours,daysPresent,enrollmentID,courseName,dateOfEnrollment);
                                objreg.setEnrollmentID(enrollmentID);
                                objreg.setCourseName(courseName);
                                objreg.setDateOfEnrollment(dateOfEnrollment);

                                StudentsArray.add(objreg);
                                JOptionPane.showMessageDialog(frame2, "Inputs have been added", "Added Successful", JOptionPane.INFORMATION_MESSAGE);

                            }
                            else
                            {
                                JOptionPane.showMessageDialog(frame2,"The Input You Have Entered Invalid Values", "Input Failure", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        catch(NumberFormatException ram)
                        {
                            JOptionPane.showMessageDialog(frame2,"The Input You Have Entered Invalid Values", "Input Failure", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });

        regularDisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent regDisplay)
                {
                    if(StudentsArray.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame2,"No info has been added", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(students display : StudentsArray)
                        {
                            if (display instanceof Regular)
                            {
                                Regular regular = (Regular) display;
                                System.out.println("Enrollment id: " +regular.getEnrollmentID());
                                System.out.println("Course name:" +regular.getCourseName());
                                System.out.println("Student name:" +regular.getStudentName());
                                System.out.println("Course duration:" +regular.getCourseDuration());
                                System.out.println("Tuition fee:" +regular.getTuitionFee());
                                System.out.println("Number Of Modules:" +regular.getNumOfModules());
                                System.out.println("Number Of CreditHours:"+regular.getNumOfCreditHours());
                                System.out.println("DaysPresent:" +regular.getDaysPresent());
                                System.out.println("Date Of Birth:" +regular.getDateOfBirth());
                                System.out.println("Date Of Enrollment:" +regular.getDateOfEnrollment());
                            }
                        }        
                    }
                }
            });

        regularClear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent regularClear)
                {
                    enrollmentIdtf1.setText("");
                    studentNametf2.setText("");
                    courseDurationtf3.setText("");
                    tuitionFeetf4.setText("");
                    numOfModulestf5.setText("");
                    numOfCreditHrtf6.setText("");
                    daysPresenttf7.setText("");
                    courseNametf8.setText("");
                    JOptionPane.showMessageDialog(frame1, "cleared","Successful",JOptionPane.INFORMATION_MESSAGE);
                }
            });

        regularSwitch.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent regularSwitch)
                {
                    Dropout_GUI();
                    frame.dispose();
                    frame1.dispose();
                }
            });

        regularGrantCertificate.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent grantCertificate)
                {
                    if(StudentsArray.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame1,"No info has been added", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        int enrollmentID = Integer.parseInt(enrollmentIdtf1.getText());
                        String courseName =  courseNametf8.getText();
                        String day2 = (String) regularcb4.getSelectedItem();
                        String month2 = (String) regularcb5.getSelectedItem();
                        String year2 = (String) regularcb6.getSelectedItem();
                        String dateOfEnrollment = day2 + "/" + month2 + "/" + year2;
                        for(students GrantCertificate : StudentsArray)
                        {
                            if (GrantCertificate instanceof Regular)
                            {
                                Regular G = (Regular) GrantCertificate;
                                G.grantCertificate(courseName, enrollmentID, dateOfEnrollment);
                            }
                        }        
                    }
                }
            });

        regularPresentPercentage.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent regularPresentPercentage)
                {
                    boolean pp = true;
                    if(enrollmentIdtf1.getText().isEmpty() ||daysPresenttf7.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame1,"No info has been added", "Error", JOptionPane.ERROR_MESSAGE);
                        pp = false;
                    }
                    if(pp)
                    {
                        try{
                            int enrollmentID = Integer.parseInt(enrollmentIdtf1.getText());
                            double daysPresent = Double.parseDouble(daysPresenttf7.getText());

                            for(students student : StudentsArray)
                            {
                                if(student instanceof Regular)
                                { 

                                    int EnrollmentID = student.getEnrollmentID();

                                    if(enrollmentID == EnrollmentID)
                                    {
                                        Regular regula =(Regular) student;
                                        double per = regula.presentpercentage(daysPresent);

                                        JOptionPane.showMessageDialog(frame1,"Success" + per, "Sucess", JOptionPane.INFORMATION_MESSAGE);

                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(frame1,"Failed", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else
                                {
                                    System.out.println("Not valid name");
                                }
                            }
                        }
                        catch(NullPointerException def)
                        {
                            JOptionPane.showMessageDialog(frame1,"Please enter all the values","Error" ,JOptionPane.ERROR_MESSAGE);
                        }
                        catch(NumberFormatException abc)
                        {
                            enrollmentIdtf1.setText("");
                            JOptionPane.showMessageDialog(frame1,"Please enter the correct input values","Error",JOptionPane.ERROR_MESSAGE);

                        }
                    }

                }

            });

        regularPanel.setLayout(null);
        frame1.add(regularPanel);
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setSize(1000,500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
    }

    //CODE OF DROPOUT GUI
    public void Dropout_GUI(){
        frame2= new JFrame("");
        dropoutPanel = new JPanel();

        dropoutlb1 = new JLabel("DROPOUT STUDENTS");
        enrollIdlb2 = new JLabel("Enrollment id: ");
        courseNamelb3 = new JLabel("Course name: ");
        studentNamelb4 = new JLabel("Student name: ");
        courseDurationlb5 = new JLabel("Course duration: ");
        tuitionFeelb6 = new JLabel("Tuition fee: ");
        numOfRemaininglb7 = new JLabel("Number of remaining modules: ");
        numOfAttendedlb8 = new JLabel("Number of months attended: ");
        DODlb9 = new JLabel("Date Of Dropout: ");
        DOBlb10 = new JLabel("Date Of Birth: ");
        DOElb11 = new JLabel("Date Of Enrollment: ");

        enrollIdtf1 = new JTextField();
        courseNametf2 = new JTextField();
        studentNametf3 = new JTextField();
        courseDurationtf4 = new JTextField();
        tuitionFeetf5 = new JTextField();
        numOfRemainingtf6 = new JTextField();
        numOfAttendedtf7 = new JTextField();

        dropoutlb1.setBounds(430,15,273,36);
        enrollIdlb2.setBounds(28,93,97,25);
        courseNamelb3.setBounds(348,90,84,25);
        studentNamelb4.setBounds(21,148,87,25);
        courseDurationlb5.setBounds(15,200,100,25);
        tuitionFeelb6.setBounds(705,92,80,25);
        numOfRemaininglb7.setBounds(586,152,188,25);
        numOfAttendedlb8.setBounds(603,207,171,25);
        DODlb9.setBounds(568,321,135,25);
        DOBlb10.setBounds(44,275,81,25);
        DOElb11.setBounds(560,276,120,25);

        enrollIdtf1.setBounds(130,85,180,32);
        courseNametf2.setBounds(444,85,180,32);
        studentNametf3.setBounds(130,136,180,32);
        courseDurationtf4.setBounds(130,188,180,32);
        tuitionFeetf5.setBounds(784,85,180,32);
        numOfRemainingtf6.setBounds(784,140,180,32);
        numOfAttendedtf7.setBounds(784,195,180,32);

        String[] date2 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] month2 = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] year2 = {"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1992","1993","1994","1995","1996","1997","1998","1999","2000","2004","2005","2006","2007","2008"};

        dropoutcb1 = new JComboBox(date2);
        dropoutcb1.setBounds(163,269,57,32);
        frame2.add(dropoutcb1);

        dropoutcb2 = new JComboBox(month2);
        dropoutcb2.setBounds(220,269,81,32);
        frame2.add(dropoutcb2);

        dropoutcb3 = new JComboBox(year2);
        dropoutcb3.setBounds(301,269,67,32);
        frame2.add(dropoutcb3);

        dropoutcb4 = new JComboBox(date2);
        dropoutcb4.setBounds(717,264,57,32);
        frame2.add(dropoutcb4);

        dropoutcb5 = new JComboBox(month2);
        dropoutcb5.setBounds(774,264,81,32);
        frame2.add(dropoutcb5);

        String[] year3 = {"2000","2001","2002","2003","2004","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        dropoutcb6 = new JComboBox(year3);
        dropoutcb6.setBounds(855,264,67,32);
        frame2.add(dropoutcb6);

        dropoutcb7 = new JComboBox(date2);
        dropoutcb7.setBounds(717,315,57,32);
        frame2.add(dropoutcb7);

        dropoutcb8 = new JComboBox(month2);
        dropoutcb8.setBounds(774,315,81,32);
        frame2.add(dropoutcb8);

        dropoutcb9 = new JComboBox(year3);
        dropoutcb9.setBounds(855,315,67,32);
        frame2.add(dropoutcb9);

        dropoutAdd = new JButton("Add");
        dropoutAdd.setBounds(267,373,120,32);
        frame2.add(dropoutAdd);

        dropoutClear = new JButton("Clear");
        dropoutClear.setBounds(675,373,120,32);
        frame2.add(dropoutClear);

        dropoutDisplay= new JButton("Display");
        dropoutDisplay.setBounds(471,373,120,32);
        frame2.add(dropoutDisplay);

        dropoutSwitch= new JButton("<<Go to regular");
        dropoutSwitch.setBounds(32,400,131,32);
        frame2.add(dropoutSwitch);

        removeStudents= new JButton("Remove Student");
        removeStudents.setBounds(400,140,140,32);
        frame2.add(removeStudents);

        billsPayable= new JButton("Bills to pay");
        billsPayable.setBounds(413,207,115,32);
        frame2.add(billsPayable);

        frame2.add(dropoutlb1);
        frame2.add(enrollIdlb2);
        frame2.add(courseNamelb3);
        frame2.add(studentNamelb4);
        frame2.add(courseDurationlb5);
        frame2.add(tuitionFeelb6);
        frame2.add(numOfRemaininglb7);
        frame2.add(numOfAttendedlb8);
        frame2.add(DODlb9);
        frame2.add(DOBlb10);
        frame2.add(DOElb11);

        frame2.add(enrollIdtf1);
        frame2.add(courseNametf2);
        frame2.add(studentNametf3);
        frame2.add(courseDurationtf4);
        frame2.add(tuitionFeetf5);
        frame2.add(numOfRemainingtf6);
        frame2.add(numOfAttendedtf7);

        dropoutAdd.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent dropAdd)
                {
                    if (enrollIdtf1.getText().isEmpty() || courseNametf2.getText().isEmpty() || studentNametf3.getText().isEmpty() || courseDurationtf4.getText().isEmpty() || tuitionFeetf5.getText().isEmpty() || numOfRemainingtf6.getText().isEmpty() || numOfAttendedtf7.getText().isEmpty() ){
                        JOptionPane.showMessageDialog(frame2, "Above field are empty!", "Empty field", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    { 
                        try
                        {
                            if(Integer.parseInt(enrollIdtf1.getText())>=0 || Integer.parseInt(courseDurationtf4.getText())>=0 ||Integer.parseInt(numOfRemainingtf6.getText()) >= 0 || Integer.parseInt(tuitionFeetf5.getText()) >= 0){

                                int enrollmentId = Integer.parseInt(enrollIdtf1.getText());
                                String courseName =  courseNametf2.getText();
                                String studentName = studentNametf3.getText();
                                int courseDuration= Integer.parseInt(courseDurationtf4.getText());
                                int tuitionFee = Integer.parseInt(tuitionFeetf5.getText());
                                int numOfRemainingModules = Integer.parseInt(numOfRemainingtf6.getText());
                                int numOfMonthsAttended = Integer.parseInt(numOfAttendedtf7.getText());
                                String day = (String) dropoutcb7.getSelectedItem();
                                String month = (String) dropoutcb8.getSelectedItem();
                                String year = (String) dropoutcb9.getSelectedItem();
                                String dateOfDropout = day + "/" + month + "/" + year;
                                String day2 = (String) dropoutcb1.getSelectedItem();
                                String month2 = (String) dropoutcb2.getSelectedItem();
                                String year2 = (String) dropoutcb3.getSelectedItem();
                                String dateOfBirth = day2 + "/" + month2 + "/" + year2;
                                String day3 = (String) dropoutcb4.getSelectedItem();
                                String month3 = (String) dropoutcb5.getSelectedItem();
                                String year3 = (String) dropoutcb6.getSelectedItem();
                                String dateOfEnrollment = day3 + "/" + month3 + "/" + year3;

                                Dropout objdrop = new Dropout (dateOfBirth, studentName, courseDuration , tuitionFee , numOfRemainingModules , numOfMonthsAttended,dateOfDropout);
                                objdrop.setEnrollmentID(enrollmentId);
                                objdrop.setCourseName(courseName);
                                objdrop.setDateOfEnrollment(dateOfEnrollment);

                                StudentsArray.add(objdrop);
                                JOptionPane.showMessageDialog(frame2, "Inputs have been added", "Added Successful", JOptionPane.INFORMATION_MESSAGE);

                            }
                            else
                            {
                                JOptionPane.showMessageDialog(frame2,"The Input You Have Entered Invalid Values", "Input Failure", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        catch(NumberFormatException ram)
                        {
                            JOptionPane.showMessageDialog(frame2,"The Input You Have Entered Invalid Values", "Input Failure", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });

        dropoutDisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent dropDisplay)
                {
                    if(StudentsArray.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame2,"No info has been added", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(students display : StudentsArray)
                        {
                            if (display instanceof Dropout)
                            {
                                Dropout dropout = (Dropout) display;
                                System.out.println("Enrollment id: " +dropout.getEnrollmentID());
                                System.out.println("Course name:" +dropout.getCourseName());
                                System.out.println("Student name:" +dropout.getStudentName());
                                System.out.println("Course duration:" +dropout.getCourseDuration());
                                System.out.println("Tuition fee:" +dropout.getTuitionFee());
                                System.out.println("Number of remaining modules:" +dropout.getNumOfRemainingModules());
                                System.out.println("Number of months attended:"+dropout.getNumOfMonthsAttended());
                                System.out.println("Date Of Dropout:" +dropout.getDateOfDropout());
                                System.out.println("Date Of Birth:" +dropout.getDateOfBirth());
                                System.out.println("Date Of Enrollment:" +dropout.getDateOfEnrollment());
                            }
                        }        
                    }
                }
            });

        removeStudents.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent dropremove)
                {
                    if(StudentsArray.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame2,"No info has been added", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(students removeStudent : StudentsArray)
                        {
                            if (removeStudent instanceof Dropout)
                            {
                                Dropout r = (Dropout) removeStudent;
                                if(r.isHasPaid())
                                {
                                    r.removeStudent();
                                    JOptionPane.showMessageDialog(frame2,"Student have been removed", "success", JOptionPane.WARNING_MESSAGE);
                                }else {
                                    r.removeStudent();
                                    JOptionPane.showMessageDialog(frame2,"Student cannot be removed. Pay bills first", "INVAlID", JOptionPane.WARNING_MESSAGE);
                                }

                            }
                        }        
                    }
                }
            });

        billsPayable.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent dropbills)
                {
                    if(StudentsArray.isEmpty())          

                    {
                        JOptionPane.showMessageDialog(frame2,"No info has been added", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(students bills : StudentsArray)
                        {
                            if (bills instanceof Dropout)
                            {
                                Dropout b = (Dropout) bills;
                                double remaining = b.getRemainingAmount();
                                JOptionPane.showMessageDialog(frame2, "Bills "+remaining, "Alert", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }        
                    }
                }
            });

        dropoutClear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent dropoutClear)
                {
                    enrollIdtf1.setText("");
                    courseNametf2.setText("");
                    studentNametf3.setText("");
                    courseDurationtf4.setText("");
                    tuitionFeetf5.setText("");
                    numOfRemainingtf6.setText("");
                    numOfAttendedtf7.setText("");
                    JOptionPane.showMessageDialog(frame2, "cleared","Successful",JOptionPane.INFORMATION_MESSAGE);
                }
            });

        dropoutSwitch.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent dropoutSwitch)
                {
                    Regular_GUI();
                    frame.dispose();
                    frame2.dispose();
                }
            });

        dropoutPanel.setLayout(null);
        frame2.add(dropoutPanel);
        frame2.setResizable(false);
        frame2.setVisible(true);
        frame2.setSize(1000,500);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocationRelativeTo(null);

    }
    
    public static void main(String[]args){
        new Student_GUI();
    }
}
