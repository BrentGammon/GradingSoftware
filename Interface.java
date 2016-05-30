import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * The interface for the software when it first loads 
 * 
 * @author Brent Gammon
 * @version 3/01/16
 */
public class Interface
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private JPanel panel;
    private JPanel centerPanel;
    /**
     * Constructor for objects of class Interface
     */
    public Interface(){}

    /**
     * Creates the frame for the software to be able to add elements to it
     * Allows the user to select whcih degree programme and stage they are on
     */
    public void makeFrame()
    {
        JButton button;
        panel = new JPanel();
        frame = new JFrame("Grade Calculator");

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));
        
        centerPanel = new JPanel();
        JLabel info = new JLabel("Computing");
        centerPanel.add(info);

        button = new JButton("Stage 1");
        button.addActionListener(new buttonActionListener());
        button.setActionCommand("c1");
        button.setPreferredSize(new Dimension (100,30));
        centerPanel.add(button);

        button = new JButton("Stage 2");
        button.addActionListener(new buttonActionListener());
        button.setActionCommand("c2");
        button.setPreferredSize(new Dimension (100,30));
        centerPanel.add(button);
        
        contentPane.add(centerPanel);
        
        panel = new JPanel();
        info = new JLabel("BIT");
        panel.add(info);

        button = new JButton("Stage 1");
        button.addActionListener(new buttonActionListener());
        button.setActionCommand("b1");
        button.setPreferredSize(new Dimension (100,30));
        panel.add(button);

        button = new JButton("Stage 2");
        button.addActionListener(new buttonActionListener());
        button.setActionCommand("b2");
        button.setPreferredSize(new Dimension (100,30));
        panel.add(button);
        
        contentPane.add(panel);
        frame.setMinimumSize(new Dimension(400,400));
        
        frame.pack();
        frame.setVisible(true);
    }
    class buttonActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {                 
            String value = e.getActionCommand();
            if(value.equals("c1")){
                Comp_Interface i = new Comp_Interface(value);
                i.makeWindow(frame,panel,centerPanel,value);
            } 
            if(value.equals("c2")){
                Comp_Interface i = new Comp_Interface(value);
                i.makeWindow(frame,panel,centerPanel,value);
            } 
            if(value.equals("b1")){
                ProgrammeInterface i = new Bit_Interface(value);
                i.makeWindow(frame,panel,centerPanel,value);
            }
            if(value.equals("b2")){
                ProgrammeInterface i = new Bit_Interface(value);
                i.makeWindow(frame,panel,centerPanel,value);
            }
        }
    }
}


