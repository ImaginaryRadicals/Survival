import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class StartApplet extends JApplet implements ActionListener
{
    JTextArea main = new JTextArea("Welcome to the jungle.", 37, 40);
    JTextArea events = new JTextArea("This is where events will be displayed. . . .", 37, 40);
    JLabel updates = new JLabel("");
    
    JButton addPerson = new JButton(" ADD PERSON ");
    JButton nextDay = new JButton(" NEXT DAY ");
    JButton nextWeek = new JButton(" NEXT WEEK ");
    JButton hunt = new JButton(" HUNT ");
    
    private Jungle jungle;
    
    public void init()
    {
        JPanel fields = new JPanel(new FlowLayout());
        fields.add(main);
        fields.add(events);
        fields.add(updates);
        
        JPanel buttons = new JPanel(new FlowLayout());
        buttons.add(addPerson);
        buttons.add(nextDay);
        buttons.add(nextWeek);
        buttons.add(hunt);
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add("North", fields);
        getContentPane().add("Center", buttons);
        
        addPerson.addActionListener(this);
        nextDay.addActionListener(this);
        nextWeek.addActionListener(this);
        hunt.addActionListener(this);
        
        jungle = new Jungle();
        
        main.setText("Welcome to the Jungle\n\n" + jungle.stats());
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == addPerson)
        {
            jungle.addPerson();
            events.setText( "" );
            main.setText(jungle.stats());
        }
        if (e.getSource() == nextDay)
        {
            jungle.nextDay();
            main.setText(jungle.stats());
        }
        if (e.getSource() == nextWeek)
        {
            jungle.nextWeek();
            main.setText(jungle.stats());
        }
        if (e.getSource() == hunt)
        {
            main.setText(jungle.stats());
        }
    }
    
    private double round( double number )
    {
        number = number*100;
        number = Math.round(number);
        number = number/100;
        return number;
    }
    
}