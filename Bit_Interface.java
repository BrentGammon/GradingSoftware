import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
/**
 * displays the interface for stage 1 or stage 2 BIT modules
 * @author Brent Gammon 
 * @version 3/1/16
 */
public class Bit_Interface extends ProgrammeInterface
{
    private JLabel grade,percent;
    /**
     * Constructor for objects of class Bit_Interface
     */
    public Bit_Interface(String stage)
    {
        super(stage);
    }

    /**
     * creates cont aindepending on the stage the user is on
     * @param JFrame frame the frame that the content is being added to
     * @param JPanel panel items are going to be added to
     * @param JPanel centerPanel panel items are going to be added to
     * @param String stage the stage of the student
     */
    public void makeWindow(JFrame frame,JPanel panel,JPanel centerPanel,String stage)
    {
        super.makeWindow(frame,panel,centerPanel,stage);
        Container contentPane = frame.getContentPane();
        if(stage.equals("b1")){
            bit1Modules(contentPane);
        }else{
            bit2Modules(contentPane);
        }
        frame.revalidate();
        frame.repaint();
        //frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * adds BIT stage 1 modules onto the container 
     * @param Container contentPane is the element where the items are going to be added to
     */
    public void bit1Modules(Container contentPane)
    {
        JLabel info;

        JPanel CB366 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CB366 - Management Principles: ");
        CB366.add(info);

        info = new JLabel(" Essay:");
        JTextField man1 = new JTextField();
        input.add(man1);
        man1.setColumns(2);
        CB366.add(info);
        CB366.add(man1); 

        info = new JLabel(" Presentation:");
        JTextField man2 = new JTextField();
        input.add(man2);
        man2.setColumns(2);
        CB366.add(info);
        CB366.add(man2); 

        info = new JLabel(" Exam:");
        JTextField man3 = new JTextField();
        input.add(man3);
        man3.setColumns(2);
        CB366.add(info);
        CB366.add(man3); 

        contentPane.add(CB366);
        JPanel CB714 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CB714 - Marketing Principles: ");
        CB714.add(info);

        info = new JLabel(" Presentation:");
        JTextField mark1 = new JTextField();
        input.add(mark1);
        mark1.setColumns(2);
        CB714.add(info);
        CB714.add(mark1); 

        info = new JLabel(" Project:");
        JTextField mark2 = new JTextField();
        input.add(mark2);
        mark2.setColumns(2);
        CB714.add(info);
        CB714.add(mark2); 

        info = new JLabel("  Participation:");
        JTextField mark3 = new JTextField();
        input.add(mark3);
        mark3.setColumns(2);
        CB714.add(info);
        CB714.add(mark3); 

        info = new JLabel(" Exam:");
        JTextField mark4 = new JTextField();
        input.add(mark4);
        mark4.setColumns(2);
        CB714.add(info);
        CB714.add(mark4); 

        contentPane.add(CB714);

        JPanel grade = new JPanel();
        JButton cal = new JButton("Calculate Grade");
        cal.addActionListener(new cal1ActionListener());
        percent = new JLabel("");
        grade.add(cal);
        grade.add(percent);
        contentPane.add(grade);
    }
    
    /**
     * adds BIT stage 2 modules onto the container 
     * @param Container contentPane is the element where the items are going to be added to
     */
    public void bit2Modules(Container contentPane)
    {
        JLabel info;
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

        
        JPanel CB330 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CB330 - Fundamentals of Financial Accounting: ");
        CB330.add(info);

        info = new JLabel(" Essay:");
        JTextField account1 = new JTextField();
        input.add(account1);
        account1.setColumns(2);
        CB330.add(info);
        CB330.add(account1); 

        info = new JLabel(" In class Test:");
        JTextField account2 = new JTextField();
        input.add(account2);
        account2.setColumns(2);
        CB330.add(info);
        CB330.add(account2);

        info = new JLabel(" Exam:");
        JTextField account3 = new JTextField();
        input.add(account3);
        account3.setColumns(2);
        CB330.add(info);
        CB330.add(account3);

        contentPane.add(CB330);

        
        JPanel CB740 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CB740 - The Management of Operations: ");
        CB740.add(info);

        info = new JLabel(" Test 1:");
        JTextField test1 = new JTextField();
        input.add(test1);
        test1.setColumns(2);
        CB740.add(info);
        CB740.add(test1); 

        info = new JLabel(" Test 2:");
        JTextField test2 = new JTextField();
        input.add(test2);
        test2.setColumns(2);
        CB740.add(info);
        CB740.add(test2);

        info = new JLabel(" Exam:");
        JTextField operExam = new JTextField();
        input.add(operExam);
        operExam.setColumns(2);
        CB740.add(info);
        CB740.add(operExam);

        contentPane.add(CB740);

        
        JPanel CB731 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CB731 - Strategy Theory and Practice: ");
        CB731.add(info);

        info = new JLabel(" In class Test:");
        JTextField theoryTest = new JTextField();
        input.add(theoryTest);
        theoryTest.setColumns(2);
        CB731.add(info);
        CB731.add(theoryTest); 

        info = new JLabel(" Exam:");
        JTextField theoryExam = new JTextField();
        input.add(theoryExam);
        theoryExam.setColumns(2);
        CB731.add(info);
        CB731.add(theoryExam);

        contentPane.add(CB731);
        
        
        JPanel CB729 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CB729 - Enterprise and Entrepreneurship: ");
        CB729.add(info);

        info = new JLabel(" Proposal Report:");
        report = new JTextField();
        input.add(report);
        report.setColumns(2);
        CB729.add(info);
        CB729.add(report); 

        info = new JLabel(" Essay:");
        JTextField enterEssay = new JTextField();
        input.add(enterEssay);
        enterEssay.setColumns(2);
        CB729.add(info);
        CB729.add(enterEssay);

        info = new JLabel(" Presentation:");
        JTextField presentation = new JTextField();
        input.add(presentation);
        presentation.setColumns(2);
        CB729.add(info);
        CB729.add(presentation);

        info = new JLabel(" Journal:");
        JTextField journal = new JTextField();
        input.add(journal);
        journal.setColumns(2);
        CB729.add(info);
        CB729.add(journal);

        contentPane.add(CB729);

        JPanel grade = new JPanel();
        JButton cal = new JButton("Calculate Grade");
        cal.addActionListener(new cal2ActionListener());
        percent = new JLabel("");
        grade.add(cal);
        grade.add(percent);
        contentPane.add(grade);
    }
    
    /**
     * loads data stored from the save 
     * @param String file is the file that is going to be loaded
     */
    public void load(String file){
        try{
            Scanner sc = new Scanner(new FileReader(file));
            ArrayList <String> saving = new ArrayList<String>();
            boolean line = sc.hasNext();
            while(line ==true ){
                String x = sc.next();
                if(!(x.contains("CO")||x.contains("CB"))){
                    saving.add(x);
                    line = sc.hasNext();
                }
            }
            sc.close();
            setValues(saving);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "error in reading file", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * saves the results of the stage 1 modules
     * @param String format is the file formate that it is going to be saved in
     */
    public void saveStage1(String format)
    {
        super.saveStage1(format);
        try{
            writer.write("CB336");
            writer.write("\t");
            writer.write(checkValue(input.get(33).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(34).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(35).getText()));
            writer.write("\r\n");

            writer.write("CB714");
            writer.write("\t");
            writer.write(checkValue(input.get(36).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(37).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(38).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(39).getText()));          
            writer.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error in exporting file", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
     public void saveStage2(String format)
    {
        super.saveStage2(format);
        try{
            writer.write("CO329");
            writer.write("\t");
            writer.write(checkValue(input.get(14).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(15).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(16).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(17).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(18).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(19).getText()));
            writer.write("\r\n");

            writer.write("CB330");
            writer.write("\t");
            writer.write(checkValue(input.get(20).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(21).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(22).getText()));
            writer.write("\r\n");

            writer.write("CB740");
            writer.write("\t");
            writer.write(checkValue(input.get(23).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(24).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(25).getText()));
            writer.write("\r\n");

            writer.write("CB731");
            writer.write("\t");
            writer.write(checkValue(input.get(26).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(27).getText()));
            writer.write("\t");
            writer.write("\r\n");

            writer.write("CB729");
            writer.write("\t");
            writer.write(checkValue(input.get(28).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(29).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(30).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(31).getText()));
            writer.close();
        }
        catch(IOException e){

        }

    }

    class cal1ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {                 
            BIT_Grade bitg = new BIT_Grade();

            double introJava = bitg.introJava(
                    Double.parseDouble(checkValue(input.get(0).getText())),
                    Double.parseDouble(checkValue(input.get(1).getText())),
                    Double.parseDouble(checkValue(input.get(2).getText())),
                    Double.parseDouble(checkValue(input.get(3).getText())),
                    Double.parseDouble(checkValue(input.get(4).getText()))
                );
            double maths = bitg.maths(
                    Double.parseDouble(checkValue(input.get(5).getText())),
                    Double.parseDouble(checkValue(input.get(6).getText())),
                    Double.parseDouble(checkValue(input.get(7).getText())),
                    Double.parseDouble(checkValue(input.get(8).getText())),
                    Double.parseDouble(checkValue(input.get(9).getText()))
                );
            double web = bitg.web(
                    Double.parseDouble(checkValue(input.get(10).getText())),
                    Double.parseDouble(checkValue(input.get(11).getText())),
                    Double.parseDouble(checkValue(input.get(12).getText())),
                    Double.parseDouble(checkValue(input.get(13).getText())),
                    Double.parseDouble(checkValue(input.get(14).getText()))
                );
            double comp = bitg.computer(
                    Double.parseDouble(checkValue(input.get(15).getText())),
                    Double.parseDouble(checkValue(input.get(16).getText())),
                    Double.parseDouble(checkValue(input.get(17).getText())),
                    Double.parseDouble(checkValue(input.get(18).getText())),
                    Double.parseDouble(checkValue(input.get(19).getText()))
                );
            double hci = bitg.hci(
                    Double.parseDouble(checkValue(input.get(20).getText())),
                    Double.parseDouble(checkValue(input.get(21).getText())),
                    Double.parseDouble(checkValue(input.get(22).getText())),
                    Double.parseDouble(checkValue(input.get(23).getText()))
                );
            double people = bitg.people(
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
            double mark = bitg.management(
                    Double.parseDouble(checkValue(input.get(33).getText())),
                    Double.parseDouble(checkValue(input.get(34).getText())),
                    Double.parseDouble(checkValue(input.get(35).getText())),
                    Double.parseDouble(checkValue(input.get(36).getText()))
                );
            double man = bitg.marketing(
                    Double.parseDouble(checkValue(input.get(37).getText())),
                    Double.parseDouble(checkValue(input.get(38).getText())),
                    Double.parseDouble(checkValue(input.get(39).getText()))
                );    
            percent.setText(Double.toString(man + mark+introJava+maths+web+hci+people+comp)+"%");

        }

    }

    class cal2ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {                 
            BIT_Grade bitg = new BIT_Grade();
            Computing_Grade cg = new Computing_Grade();
            double agile = bitg.agile(
                    Double.parseDouble(checkValue(input.get(0).getText())),
                    Double.parseDouble(checkValue(input.get(1).getText())),
                    Double.parseDouble(checkValue(input.get(2).getText())),
                    Double.parseDouble(checkValue(input.get(3).getText()))

                );
            double infoSys = bitg.infoSys(
                    Double.parseDouble(checkValue(input.get(4).getText())),
                    Double.parseDouble(checkValue(input.get(5).getText())),
                    Double.parseDouble(checkValue(input.get(6).getText())),
                    Double.parseDouble(checkValue(input.get(7).getText())),
                    Double.parseDouble(checkValue(input.get(8).getText()))
                );
            double data = bitg.database(
                    Double.parseDouble(checkValue(input.get(9).getText())),
                    Double.parseDouble(checkValue(input.get(10).getText())),
                    Double.parseDouble(checkValue(input.get(11).getText())),
                    Double.parseDouble(checkValue(input.get(12).getText())),
                    Double.parseDouble(checkValue(input.get(13).getText()))

                );
            double comp = cg.computerAppAverage(
                    Double.parseDouble(checkValue(input.get(14).getText())),
                    Double.parseDouble(checkValue(input.get(15).getText())),
                    Double.parseDouble(checkValue(input.get(16).getText())),
                    Double.parseDouble(checkValue(input.get(17).getText())),
                    Double.parseDouble(checkValue(input.get(18).getText())),
                    Double.parseDouble(checkValue(input.get(19).getText()))
                );
            double financial = bitg.financial(
                    Double.parseDouble(checkValue(input.get(20).getText())),
                    Double.parseDouble(checkValue(input.get(21).getText())),
                    Double.parseDouble(checkValue(input.get(22).getText()))
                );
            double operation = bitg.operation(
                    Double.parseDouble(checkValue(input.get(23).getText())),
                    Double.parseDouble(checkValue(input.get(24).getText())),
                    Double.parseDouble(checkValue(input.get(25).getText()))
                );
            double theory = bitg.theory(
                    Double.parseDouble(checkValue(input.get(26).getText())),
                    Double.parseDouble(checkValue(input.get(27).getText()))

                );
            double enterprise = bitg.enterprise(
                    Double.parseDouble(checkValue(input.get(28).getText())),
                    Double.parseDouble(checkValue(input.get(29).getText())),
                    Double.parseDouble(checkValue(input.get(30).getText())),
                    Double.parseDouble(checkValue(input.get(31).getText()))
                );    
            percent.setText(Double.toString(agile + infoSys+data+comp+financial+operation+theory+enterprise)+"%");

        }

    }
}
