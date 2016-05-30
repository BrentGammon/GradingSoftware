import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
/**
 * Displays shared modules on stage 1 or stage 2 
 * 
 * @author Brent Gammon 
 * @version 3/1/16
 */
abstract public class ProgrammeInterface
{
    //private JPanel outgrid;
    private JPanel CO320,CO322;
    protected JMenuBar menubar;
    protected JMenu menu;
    protected JMenuItem submenu,menuItem;
    protected FileWriter writer;
    private String stage;
    protected ArrayList<JTextField> input;
    /**
     * Constructor for objects of class ProgrammeInterface
     */
    public ProgrammeInterface(String stage)
    {
        this.stage = stage;
        input = new ArrayList<JTextField>();
    }
    
    /**
     * creates content depending on the stage the user is on
     * @param JFrame frame the frame that the content is being added to
     * @param JPanel panel items are going to be added to
     * @param JPanel centerPanel panel items are going to be added to
     * @param String stage the stage of the student
     */
    public void makeWindow(JFrame frame,JPanel panel,JPanel centerPanel,String stage)
    {
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        menu = new JMenu("Menu");
        menubar.add(menu);

        submenu = new JMenu("Load");

        menuItem = new JMenuItem("Excel");
        menuItem.addActionListener(new loadActionListener());
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JMenuItem("Text");
        menuItem.addActionListener(new loadActionListener());
        submenu.add(menuItem);
        menu.add(submenu);

      

        menu.addSeparator();
        submenu = new JMenu("Export");
        menuItem = new JMenuItem("Excel");
        menuItem.setActionCommand("Excel");
        menuItem.addActionListener(new saveActionListener());
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JMenuItem("Text");
        menuItem.setActionCommand("Text");
        menuItem.addActionListener(new saveActionListener());
        submenu.add(menuItem);
        menu.add(submenu);

        frame.remove(centerPanel);
        frame.remove(panel);

        if(stage.equals("c1")||stage.equals("b1")){
            stage1Modules(contentPane);
        }else{
            stage2Modules(contentPane);
        }

        frame.revalidate();
        frame.repaint();
        //frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Adds the shared stage 1 modules onto the contentPane
     * @param Container contentPane is what the elements are going to be added on
     */
    public void stage1Modules(Container contentPane)
    {
        JLabel info;
        CO320 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO320 - Introduction to Object-Oriented Programming: ");
        CO320.add(info);

        info = new JLabel(" Attendance and Efforts");
        JTextField ass1 = new JTextField();
        input.add(ass1);
        ass1.setColumns(2);
        CO320.add(info);
        CO320.add(ass1);

        info = new JLabel(" Class Exercises:");
        JTextField ass2 = new JTextField();
        input.add(ass2);
        ass2.setColumns(2);
        CO320.add(info);
        CO320.add(ass2);

        info = new JLabel(" Writing Classes:");
        JTextField ass3 = new JTextField();
        input.add(ass3);
        ass3.setColumns(2); 
        CO320.add(info);
        CO320.add(ass3); 

        info = new JLabel(" Collection and Testing:");
        JTextField ass4 = new JTextField();
        input.add(ass4);
        ass4.setColumns(2);
        CO320.add(info);
        CO320.add(ass4);

        info = new JLabel(" In-class Test:");
        JTextField ass5 = new JTextField();
        input.add(ass5);
        ass5.setColumns(2);
        CO320.add(info);
        CO320.add(ass5);

        contentPane.add(CO320);

        CO322 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO322 - Foundations of Computing I: ");
        CO322.add(info);

        info = new JLabel(" Algebra:");
        JTextField algebra = new JTextField();
        input.add(algebra);
        algebra.setColumns(2);
        CO322.add(info);
        CO322.add(algebra); 

        info = new JLabel(" Stats:");
        JTextField stats = new JTextField();
        input.add(stats);
        stats.setColumns(2);
        CO322.add(info);
        CO322.add(stats); 

        info = new JLabel(" Proof:");
        JTextField proof = new JTextField();
        input.add(proof);
        proof.setColumns(2);
        CO322.add(info);
        CO322.add(proof); 

        info = new JLabel(" Set Theory:");
        JTextField setTheory = new JTextField();
        input.add(setTheory);
        setTheory.setColumns(2);
        CO322.add(info);
        CO322.add(setTheory); 

        info = new JLabel(" Exam:");
        JTextField mathExam = new JTextField();
        input.add(mathExam);
        mathExam.setColumns(2);
        CO322.add(info);
        CO322.add(mathExam); 
   
        contentPane.add(CO322);

        JPanel CO323 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO323 - Databases and the Web: ");
        CO323.add(info);

        info = new JLabel(" HTML:");
        JTextField html = new JTextField();
        input.add(html);
        html.setColumns(2);
        CO323.add(info);
        CO323.add(html); 

        info = new JLabel(" Javascript:");
        JTextField javascript = new JTextField();
        input.add(javascript);
        javascript.setColumns(2);
        CO323.add(info);
        CO323.add(javascript); 

        info = new JLabel(" Databases:");
        JTextField mySQL = new JTextField();
        input.add(mySQL);
        mySQL.setColumns(2);
        CO323.add(info);
        CO323.add(mySQL); 

        info = new JLabel(" PHP:");
        JTextField php = new JTextField();
        input.add(php);
        php.setColumns(2);
        CO323.add(info);
        CO323.add(php); 

        info = new JLabel(" Exam:");
        JTextField webExam = new JTextField();
        input.add(webExam);
        webExam.setColumns(2);
        CO323.add(info);
        CO323.add(webExam); 
   
        contentPane.add(CO323);

        JPanel CO324 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO324 - Computer Systems: ");
        CO324.add(info);

        info = new JLabel(" Test 1:");
        JTextField test1 = new JTextField();
        input.add(test1);
        test1.setColumns(2);
        CO324.add(info);
        CO324.add(test1); 

        info = new JLabel(" Test 2:");
        JTextField test2 = new JTextField();
        input.add(test2);
        test2.setColumns(2);
        CO324.add(info);
        CO324.add(test2); 

        info = new JLabel(" Test 3:");
        JTextField test3 = new JTextField();
        input.add(test3);
        test3.setColumns(2);
        CO324.add(info);
        CO324.add(test3); 

        info = new JLabel(" Test 4:");
        JTextField test4 = new JTextField();
        input.add(test4);
        test4.setColumns(2);
        CO324.add(info);
        CO324.add(test4); 

        info = new JLabel(" Exam:");
        JTextField computerExam = new JTextField();
        input.add(computerExam);
        computerExam.setColumns(2);
        CO324.add(info);
        CO324.add(computerExam); 

        contentPane.add(CO324);

        JPanel CO328 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        info = new JLabel(" CO328 - Human Computer Interaction: ");
        CO328.add(info);

        info = new JLabel(" Out in the World:");
        JTextField out = new JTextField();
        input.add(out);
        out.setColumns(2);
        CO328.add(info);
        CO328.add(out); 

        info = new JLabel(" Device Analysis:");
        JTextField device = new JTextField();
        input.add(device);
        device.setColumns(2);
        CO328.add(info);
        CO328.add(device); 

        info = new JLabel(" Interface Design:");
        JTextField design = new JTextField();
        input.add(design);
        design.setColumns(2);
        CO328.add(info);
        CO328.add(design); 

        info = new JLabel(" Exam:");
        JTextField hciExam = new JTextField();
        input.add(hciExam);
        hciExam.setColumns(2);
        CO328.add(info);
        CO328.add(hciExam); 

        contentPane.add(CO328);

        JPanel CO334 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        info = new JLabel(" CO334 - People and Computing ");
        CO334.add(info);

        info = new JLabel(" Precis:");
        JTextField precis = new JTextField();
        input.add(precis);
        precis.setColumns(2);
        CO334.add(info);
        CO334.add(precis); 

        info = new JLabel(" Plagiarism:");
        JTextField plagiarism = new JTextField();
        input.add(plagiarism);
        plagiarism.setColumns(2);
        CO334.add(info);
        CO334.add(plagiarism); 

        info = new JLabel(" Poster:");
        JTextField poster = new JTextField();
        input.add(poster);
        poster.setColumns(2);
        CO334.add(info);
        CO334.add(poster); 

        info = new JLabel(" Video:");
        JTextField video = new JTextField();
        input.add(video);
        video.setColumns(2);
        CO334.add(info);
        CO334.add(video); 

        info = new JLabel(" Presentation:");
        JTextField presentation = new JTextField();
        input.add(presentation);
        presentation.setColumns(2);
        CO334.add(info);
        CO334.add(presentation); 

        info = new JLabel(" Portfolio:");
        JTextField portfolio = new JTextField();
        input.add(portfolio);
        portfolio.setColumns(2);
        CO334.add(info);
        CO334.add(portfolio); 

        info = new JLabel(" Reflection:");
        JTextField reflection = new JTextField();
        input.add(reflection);
        reflection.setColumns(2);
        CO334.add(info);
        CO334.add(reflection); 

        info = new JLabel(" Examination:");
        JTextField examination = new JTextField();
        input.add(examination);
        examination.setColumns(2);
        CO334.add(info);
        CO334.add(examination); 

        info = new JLabel(" Killer Robot:");
        JTextField killerRobot = new JTextField();
        input.add(killerRobot);
        killerRobot.setColumns(2);
        CO334.add(info);
        CO334.add(killerRobot); 
        
        contentPane.add(CO334);
    }
    
    /**
     * Adds the shared stage 2 modules onto the contentPane
     * @param Container contentPane is what the elements are going to be added on
     */
    public void stage2Modules(Container contentPane)
    {
        JLabel info;
        JPanel CO547 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO547 - Agile Software Development: ");
        CO547.add(info);

        info = new JLabel(" Group Scrum");
        JTextField scrum = new JTextField();
        input.add(scrum);
        scrum.setColumns(2);
        CO547.add(info);
        CO547.add(scrum);

        info = new JLabel(" Subversion:");
        JTextField sub = new JTextField();
        input.add(sub);
        sub.setColumns(2);
        CO547.add(info);
        CO547.add(sub);

        info = new JLabel(" Essay:");
        JTextField essay = new JTextField();
        input.add(essay);
        essay.setColumns(2); 
        CO547.add(info);
        CO547.add(essay); 

        info = new JLabel(" Exam:");
        JTextField agileExam = new JTextField();
        input.add(agileExam);
        agileExam.setColumns(2);
        CO547.add(info);
        CO547.add(agileExam);

        contentPane.add(CO547);

        JPanel CO546 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO546 - Information Systems Analysis: ");
        CO546.add(info);

        info = new JLabel(" Use Case Diagram:");
        JTextField caseDiagram = new JTextField();
        input.add(caseDiagram);
        caseDiagram.setColumns(2);
        CO546.add(info);
        CO546.add(caseDiagram); 

        info = new JLabel(" Use Case Description:");
        JTextField caseDescription = new JTextField();
        input.add(caseDescription);
        caseDescription.setColumns(2);
        CO546.add(info);
        CO546.add(caseDescription); 

        info = new JLabel(" Class Diagram:");
        JTextField classDiagram = new JTextField();
        input.add(classDiagram);
        classDiagram.setColumns(2);
        CO546.add(info);
        CO546.add(classDiagram); 

        info = new JLabel(" Sequence Diagram:");
        JTextField sequence = new JTextField();
        input.add(sequence);
        sequence.setColumns(2);
        CO546.add(info);
        CO546.add(sequence); 

        info = new JLabel(" Case Study:");
        JTextField caseStudy = new JTextField();
        input.add(caseStudy);
        caseStudy.setColumns(2);
        CO546.add(info);
        CO546.add(caseStudy); 
    
        contentPane.add(CO546);

        JPanel CO532 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        info = new JLabel(" CO532 - Database Systems: ");
        CO532.add(info);

        info = new JLabel(" Class Exercises:");
        JTextField classExcercise = new JTextField();
        input.add(classExcercise);
        classExcercise.setColumns(2);
        CO532.add(info);
        CO532.add(classExcercise); 

        info = new JLabel(" Conceptual data model:");
        JTextField conceptual = new JTextField();
        input.add(conceptual);
        conceptual.setColumns(2);
        CO532.add(info);
        CO532.add(conceptual); 

        info = new JLabel(" Logical data model:");
        JTextField logical = new JTextField();
        input.add(logical);
        logical.setColumns(2);
        CO532.add(info);
        CO532.add(logical); 

        info = new JLabel(" Implementation:");
        JTextField implementation = new JTextField();
        input.add(implementation);
        implementation.setColumns(2);
        CO532.add(info);
        CO532.add(implementation); 

        info = new JLabel(" Exam:");
        JTextField dataExam = new JTextField();
        input.add(dataExam);
        dataExam.setColumns(2);
        CO532.add(info);
        CO532.add(dataExam); 

        contentPane.add(CO532);

    }
        
    /**
     * Loops through an arraylist to get each element to added to the arraylist of textfields
     * @param ArrayList String
     */
    public void setValues(ArrayList<String>values)
    {
        for(int i = 0; i<values.size();i++){
            input.get(i).setText(values.get(i));
        }
    }
    
    /**
     * checks if the paramter is valid for the application saving and caluations
     * @param String value is the item that is going to be checked
     */
    public String checkValue(String value)
    {
        if(value.equals("")||value==null ||value.length()>3){
            return "0";
        }
        for(int i = 0; i<value.length();i++){
            char x = value.charAt(i);
            if(!(Character.isDigit(x))){
                return "0";
            }
        }
        if(!(Integer.parseInt(value)>=0 && Integer.parseInt(value)<=100)){
            return "0";
        }
        return value;
    }
    
    /**
     * saves the results of the shared stage 1 modules
     * @param String format is the file formate that it is going to be saved in
     */
    public void saveStage1(String format)
    {
        try{
            writer = new FileWriter(format);
            writer.write("CO320");
            writer.write("\t");
            writer.write(checkValue(input.get(0).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(1).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(2).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(3).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(4).getText()));
            writer.write("\r\n");

            writer.write("CO322");
            writer.write("\t");
            writer.write(checkValue(input.get(5).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(6).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(7).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(8).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(9).getText()));
            writer.write("\r\n");

            writer.write("CO323");
            writer.write("\t");
            writer.write(checkValue(input.get(10).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(11).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(12).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(13).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(14).getText()));
            writer.write("\r\n");

            writer.write("CO324");
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

            writer.write("CO328");
            writer.write("\t");
            writer.write(checkValue(input.get(20).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(21).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(22).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(23).getText()));
            writer.write("\r\n");

            writer.write("CO334");
            writer.write("\t");
            writer.write(checkValue(input.get(24).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(25).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(26).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(27).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(28).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(29).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(30).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(31).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(32).getText()));
            writer.write("\r\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in exporting file", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * saves the results of the shared stage 2 modules
     * @param String format is the file formate that it is going to be saved in
     */
    public void saveStage2(String format)
    {
        try{
            writer = new FileWriter(format);
            writer.write("CO547");
            writer.write("\t");
            writer.write(checkValue(input.get(0).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(1).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(2).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(3).getText()));
            writer.write("\r\n");

            writer.write("CO546");
            writer.write("\t");
            writer.write(checkValue(input.get(4).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(5).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(6).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(7).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(8).getText()));
            writer.write("\r\n");

            writer.write("CO532");
            writer.write("\t");
            writer.write(checkValue(input.get(9).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(10).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(11).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(12).getText()));
            writer.write("\t");
            writer.write(checkValue(input.get(13).getText()));
            writer.write("\r\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in exporting file", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
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
    
    class saveActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {                 
            String value = e.getActionCommand();
            String fileType ="";
            switch(value){
                case "Excel": fileType =stage+".xls";
                break;
                case "Word": fileType = stage+".docx";
                break;
                case "Text": fileType = stage+".txt";
                break;
            }
            if(stage.equals("c1")||stage.equals("b1")){
                saveStage1(fileType);
            }else{
                saveStage2(fileType);
            }
        }
    }
    class loadActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {                 
            String value = e.getActionCommand();
            String fileType ="";
            switch(value){
                case "Excel": fileType = stage+".xls";
                break;
                case "Word": fileType = stage+".docx";
                break;
                case "Text": fileType = stage+".txt";
                break;
            }
            load(fileType);
        }
    }

}
