import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
/**
 * Creates the interface to allow user to input their results for each of the modules on the degree
 * Depending what stage they are on it will load the appropriate modules
 * @author Brent Gammon
 * @version 3/1/16
 */
public class Comp_Interface extends ProgrammeInterface
{
    private JTextField co520Mark,co329mark;
    private JLabel grade,percent;
    private JPanel CO520;
    /**
     * Constructor for objects of class Comp_Interface
     * @param String stage is the stage the user is on
     * makes a call to the superclass passing stage as this will be used to load the shared modules between the different stages
     */
    public Comp_Interface(String stage)
    {
        super(stage);
    }

    /**
     * @param JFrame frame the frame of the software
     * @param JPanel panel is the panel items are going to be placed in
     * @param JPanel centerPanel is the panel items are going to be placed in
     * @param String stage is the stage the user is on
     */
    public void makeWindow(JFrame frame,JPanel panel,JPanel centerPanel,String stage)
    {
        super.makeWindow(frame,panel,centerPanel,stage);
        Container contentPane = frame.getContentPane();
        //JPanel x = super.getPanel();
        if(stage.equals("c1")){
            comp1Modules(contentPane);//,x);
        }else{
            comp2Modules(contentPane);//,x);
        }
        frame.revalidate();
        frame.repaint();
        //frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Loads the stage 1 computing modules 
     * @param Container contentPane is the main area of the software
     */
    public void comp1Modules(Container contentPane)//, JPanel x)
    {
        JLabel info;     

        CO520 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO520 - Further Object-Oriented Programming: ");
        CO520.add(info);

        info = new JLabel(" Class Exercise:");
        JTextField classExercise = new JTextField();
        input.add(classExercise);
        classExercise.setColumns(2);
        CO520.add(info);
        CO520.add(classExercise); 

        info = new JLabel(" Inheritance & Polymorphism:");
        JTextField inheritancePolymorphism = new JTextField();
        input.add(inheritancePolymorphism);
        inheritancePolymorphism.setColumns(2);
        CO520.add(info);
        CO520.add(inheritancePolymorphism); 

        info = new JLabel(" GUI & Exception:");
        JTextField GUIException = new JTextField();
        input.add(GUIException);
        GUIException.setColumns(2);
        CO520.add(info);
        CO520.add(GUIException); 

        info = new JLabel(" In Class Test:");
        JTextField classTest = new JTextField();
        input.add(classTest);
        classTest.setColumns(2);
        CO520.add(info);
        CO520.add(classTest); 

        contentPane.add(CO520);

        JPanel CO329 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO329 - Computer Applications: ");
        CO329.add(info);

        info = new JLabel(" Spreadsheet Fundamentals:");
        JTextField work1 = new JTextField();
        input.add(work1);
        work1.setColumns(2);
        CO329.add(info);
        CO329.add(work1); 

        info = new JLabel(" Tables and what-if Analysis:");
        JTextField work2 = new JTextField();
        input.add(work2);
        work2.setColumns(2);
        CO329.add(info);
        CO329.add(work2); 

        info = new JLabel(" Linear Programming:");
        JTextField work3 = new JTextField();
        input.add(work3);
        work3.setColumns(2);
        CO329.add(info);
        CO329.add(work3); 

        info = new JLabel(" Hypothesis Testing:");
        JTextField work4 = new JTextField();
        input.add(work4);
        work4.setColumns(2);
        CO329.add(info);
        CO329.add(work4); 

        info = new JLabel(" Regression and Testing:");
        JTextField work5 = new JTextField();
        input.add(work5);
        work5.setColumns(2);
        CO329.add(info);
        CO329.add(work5); 

        info = new JLabel(" Data Analysis Project:");
        JTextField report = new JTextField();
        input.add(report);
        report.setColumns(2);
        CO329.add(info);
        CO329.add(report);

        contentPane.add(CO329);

        JPanel grade = new JPanel();
        JButton cal = new JButton("Calculate Grade");
        cal.addActionListener(new cal1ActionListener());
        percent = new JLabel("");
        grade.add(cal);
        grade.add(percent);
        contentPane.add(grade);

        //contentPane.add(x);
    }

    /**
     * Loads the stage 2 computing modules 
     * @param Container contentPane is the main area of the software
     */
    public void comp2Modules(Container contentPane)//, JPanel x)
    {
        JLabel info;     

        CO520 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        info = new JLabel(" CO520 - Further Object-Oriented Programming: ");
        CO520.add(info);

        info = new JLabel(" Class Exercise:");
        JTextField classExercise = new JTextField();
        input.add(classExercise);
        classExercise.setColumns(2);
        CO520.add(info);
        CO520.add(classExercise); 

        info = new JLabel(" Inheritance & Polymorphism:");
        JTextField inheritancePolymorphism = new JTextField();
        input.add(inheritancePolymorphism);
        inheritancePolymorphism.setColumns(2);
        CO520.add(info);
        CO520.add(inheritancePolymorphism); 

        info = new JLabel(" GUI & Exception:");
        JTextField GUIException = new JTextField();
        input.add(GUIException);
        GUIException.setColumns(2);
        CO520.add(info);
        CO520.add(GUIException); 

        info = new JLabel(" In Class Test:");
        JTextField classTest = new JTextField();
        input.add(classTest);
        classTest.setColumns(2);
        CO520.add(info);
        CO520.add(classTest); 

        contentPane.add(CO520);

        JPanel CO544 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO544 - Networking: ");
        CO544.add(info);

        info = new JLabel(" Coursework1:");
        JTextField net1 = new JTextField();
        input.add(net1);
        net1.setColumns(2);
        CO544.add(info);
        CO544.add(net1); 

        info = new JLabel(" Coursework2:");
        JTextField net2 = new JTextField();
        input.add(net2);
        net2.setColumns(2);
        CO544.add(info);
        CO544.add(net2); 

        info = new JLabel(" Exam:");
        JTextField netExam = new JTextField();
        input.add(netExam);
        netExam.setColumns(2);
        CO544.add(info);
        CO544.add(netExam); 

        contentPane.add(CO544);

        JPanel CO548 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO548 - Software Engineering Process: ");
        CO548.add(info);

        info = new JLabel(" Essay 1:");
        JTextField pro1 = new JTextField();
        input.add(pro1);
        pro1.setColumns(2);
        CO548.add(info);
        CO548.add(pro1); 

        info = new JLabel(" Essay 2:");
        JTextField pro2 = new JTextField();
        input.add(pro2);
        pro2.setColumns(2);
        CO548.add(info);
        CO548.add(pro2); 

        info = new JLabel(" Essay 3:");
        JTextField pro3 = new JTextField();
        input.add(pro3);
        pro3.setColumns(2);
        CO548.add(info);
        CO548.add(pro3); 

        info = new JLabel(" Essay 4:");
        JTextField pro4 = new JTextField();
        input.add(pro4);
        pro4.setColumns(2);
        CO548.add(info);
        CO548.add(pro4); 

        info = new JLabel(" Participation:");
        JTextField pro5 = new JTextField();
        input.add(pro5);
        pro5.setColumns(2);
        CO548.add(info);
        CO548.add(pro5); 

        info = new JLabel(" Exam:");
        JTextField pro6 = new JTextField();
        input.add(pro6);
        pro6.setColumns(2);
        CO548.add(info);
        CO548.add(pro6); 

        contentPane.add(CO548);

        JPanel CO655 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO655 - Software Project: ");
        CO655.add(info);

        info = new JLabel(" Group Project:");
        JTextField group1 = new JTextField();
        input.add(group1);
        group1.setColumns(2);
        CO655.add(info);
        CO655.add(group1); 

        info = new JLabel(" Individual report and logbook:");
        JTextField group2 = new JTextField();
        input.add(group2);
        group2.setColumns(2);
        CO655.add(info);
        CO655.add(group2); 

        contentPane.add(CO655);

        JPanel CO539 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO539 - Web Development: ");
        CO539.add(info);

        info = new JLabel(" CodeIgniter:");
        JTextField ci = new JTextField();
        input.add(ci);
        ci.setColumns(2);
        CO539.add(info);
        CO539.add(ci); 

        info = new JLabel(" AJAX:");
        JTextField ajax = new JTextField();
        input.add(ajax);
        ajax.setColumns(2);
        CO539.add(info);
        CO539.add(ajax); 

        info = new JLabel(" Exam:");
        JTextField webExam = new JTextField();
        input.add(webExam);
        webExam.setColumns(2);
        CO539.add(info);
        CO539.add(webExam); 
        contentPane.add(CO539);

        JPanel grade = new JPanel();
        JButton cal = new JButton("Calculate Grade");
        cal.addActionListener(new cal2ActionListener());
        percent = new JLabel("");
        grade.add(cal);
        grade.add(percent);
        contentPane.add(grade);

        //contentPane.add(x);
    }

    /**
     * saves the results of the stage 1 modules
     * @param String format is the file formate that it is going to be saved in
     */
    public void saveStage1(String format)//stage 1 save
    {
        super.saveStage1(format);
        try{
            writer.write("CO520");
            writer.write("\t");
            writer.write(checkValue(input.get(33).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(34).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(35).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(36).getText()));
            writer.write("\r\n");

            writer.write("CO329");
            writer.write("\t");
            writer.write(checkValue(input.get(37).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(38).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(39).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(40).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(41).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(42).getText()));

            writer.close();
        }
        catch(Exception e){

        }

    }

    /**
     * saves the results of the stage 2 modules
     * @param String format is the file formate that it is going to be saved in
     */
    public void saveStage2(String format)//stage 1 save
    {
        super.saveStage2(format);
        try{
            writer.write("CO520");
            writer.write("\t");
            writer.write(checkValue(input.get(14).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(15).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(16).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(17).getText()));
            writer.write("\r\n");

            writer.write("CO544");
            writer.write("\t");
            writer.write(checkValue(input.get(18).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(19).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(20).getText()));
            writer.write("\r\n");

            writer.write("CO548");
            writer.write("\t");
            writer.write(checkValue(input.get(21).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(22).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(23).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(24).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(25).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(26).getText()));
            writer.write("\r\n");

            writer.write("CO655");
            writer.write("\t");
            writer.write(checkValue(input.get(27).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(28).getText()));
            writer.write("\r\n");

            writer.write("CO539");
            writer.write("\t");
            writer.write(checkValue(input.get(29).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(30).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(31).getText()));
            writer.write("\r\n");

            writer.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in exporting file", "Error",
                JOptionPane.ERROR_MESSAGE);
        }

    }

    //     /**
    //      * loads data stored from the save 
    //      * @param String file is the file that is going to be loaded
    //      */
    //     public void load(String file){
    //         try{
    //             Scanner sc = new Scanner(new FileReader(file));
    //             ArrayList <String> saving = new ArrayList<String>();
    //             boolean line = sc.hasNext();
    //             while(line ==true ){
    //                 String x = sc.next();
    //                 if(!(x.contains("CO")||x.contains("CB"))){
    //                     saving.add(x);
    //                     line = sc.hasNext();
    //                 }
    //             }
    //             sc.close();
    //             setValues(saving);
    //         }catch(IOException e){
    //             JOptionPane.showMessageDialog(null, "error in reading file", "Error",
    //                 JOptionPane.ERROR_MESSAGE);
    //         }
    //     }

    class cal1ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {                 
            Computing_Grade cg = new Computing_Grade();

            double introJava = cg.introJava(
                    Double.parseDouble(checkValue(input.get(0).getText())),
                    Double.parseDouble(checkValue(input.get(1).getText())),
                    Double.parseDouble(checkValue(input.get(2).getText())),
                    Double.parseDouble(checkValue(input.get(3).getText())),
                    Double.parseDouble(checkValue(input.get(4).getText()))
                );

            double maths = cg.maths(
                    Double.parseDouble(checkValue(input.get(5).getText())),
                    Double.parseDouble(checkValue(input.get(6).getText())),
                    Double.parseDouble(checkValue(input.get(7).getText())),
                    Double.parseDouble(checkValue(input.get(8).getText())),
                    Double.parseDouble(checkValue(input.get(9).getText()))
                );

            double web = cg.web(
                    Double.parseDouble(checkValue(input.get(10).getText())),
                    Double.parseDouble(checkValue(input.get(11).getText())),
                    Double.parseDouble(checkValue(input.get(12).getText())),
                    Double.parseDouble(checkValue(input.get(13).getText())),
                    Double.parseDouble(checkValue(input.get(14).getText()))
                );

            double comp = cg.computer(
                    Double.parseDouble(checkValue(input.get(15).getText())),
                    Double.parseDouble(checkValue(input.get(16).getText())),
                    Double.parseDouble(checkValue(input.get(17).getText())),
                    Double.parseDouble(checkValue(input.get(18).getText())),
                    Double.parseDouble(checkValue(input.get(19).getText()))
                );

            double hci = cg.hci(
                    Double.parseDouble(checkValue(input.get(20).getText())),
                    Double.parseDouble(checkValue(input.get(21).getText())),
                    Double.parseDouble(checkValue(input.get(22).getText())),
                    Double.parseDouble(checkValue(input.get(23).getText()))
                );

            double people = cg.people(
                    Double.parseDouble(checkValue(input.get(24).getText())),
                    Double.parseDouble(checkValue(input.get(25).getText())),
                    Double.parseDouble(checkValue(input.get(26).getText())),
                    Double.parseDouble(checkValue(input.get(27).getText())),
                    Double.parseDouble(checkValue(input.get(28).getText())),
                    Double.parseDouble(checkValue(input.get(29).getText())),
                    Double.parseDouble(checkValue(input.get(30).getText())),
                    Double.parseDouble(checkValue(input.get(31).getText())),
                    Double.parseDouble(checkValue(input.get(32).getText()))
                );

            double java =  cg.furtherJavaAverage(
                    Double.parseDouble(checkValue(input.get(33).getText())),
                    Double.parseDouble(checkValue(input.get(34).getText())),
                    Double.parseDouble(checkValue(input.get(35).getText())),
                    Double.parseDouble(checkValue(input.get(36).getText()))
                );

            double comApp = cg.computerAppAverage(
                    Double.parseDouble(checkValue(input.get(37).getText())),
                    Double.parseDouble(checkValue(input.get(38).getText())),
                    Double.parseDouble(checkValue(input.get(39).getText())),
                    Double.parseDouble(checkValue(input.get(40).getText())),
                    Double.parseDouble(checkValue(input.get(41).getText())),
                    Double.parseDouble(checkValue(input.get(42).getText()))
                );    
            percent.setText(Double.toString(java + comApp+introJava+maths+web+hci+people+comp)+"%");

        }
    }

    class cal2ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {                 
            //GradeCalculator gc = new GradeCalculator();
            Computing_Grade cg = new Computing_Grade();

            double agile = cg.agile(
                    Double.parseDouble(checkValue(input.get(0).getText())),
                    Double.parseDouble(checkValue(input.get(1).getText())),
                    Double.parseDouble(checkValue(input.get(2).getText())),
                    Double.parseDouble(checkValue(input.get(3).getText()))

                );
            double infoSys = cg.infoSys(
                    Double.parseDouble(checkValue(input.get(4).getText())),
                    Double.parseDouble(checkValue(input.get(5).getText())),
                    Double.parseDouble(checkValue(input.get(6).getText())),
                    Double.parseDouble(checkValue(input.get(7).getText())),
                    Double.parseDouble(checkValue(input.get(8).getText()))
                );
            double data = cg.database(
                    Double.parseDouble(checkValue(input.get(9).getText())),
                    Double.parseDouble(checkValue(input.get(10).getText())),
                    Double.parseDouble(checkValue(input.get(11).getText())),
                    Double.parseDouble(checkValue(input.get(12).getText())),
                    Double.parseDouble(checkValue(input.get(13).getText()))

                );
            double java =  cg.furtherJavaAverage(
                    Double.parseDouble(checkValue(input.get(14).getText())),
                    Double.parseDouble(checkValue(input.get(15).getText())),
                    Double.parseDouble(checkValue(input.get(16).getText())),
                    Double.parseDouble(checkValue(input.get(17).getText()))
                );

            double network =  cg.network(
                    Double.parseDouble(checkValue(input.get(18).getText())),
                    Double.parseDouble(checkValue(input.get(19).getText())),
                    Double.parseDouble(checkValue(input.get(20).getText()))
                );

            double engineering =  cg.engineering(
                    Double.parseDouble(checkValue(input.get(21).getText())),
                    Double.parseDouble(checkValue(input.get(22).getText())),
                    Double.parseDouble(checkValue(input.get(23).getText())),
                    Double.parseDouble(checkValue(input.get(24).getText())),
                    Double.parseDouble(checkValue(input.get(25).getText())),
                    Double.parseDouble(checkValue(input.get(26).getText()))
                );    

            double project =  cg.project(
                    Double.parseDouble(checkValue(input.get(27).getText())),
                    Double.parseDouble(checkValue(input.get(28).getText()))
                );  

            double web =  cg.web(
                    Double.parseDouble(checkValue(input.get(29).getText())),
                    Double.parseDouble(checkValue(input.get(30).getText())),
                    Double.parseDouble(checkValue(input.get(31).getText()))
                );  

            percent.setText(Double.toString(agile+infoSys+data+java+network+engineering+project+web)+"%");
        }
    }
}
