import javax.swing.JOptionPane;

public class Person
{
    public String name;
    public int health = 100;
    public int food = 100;
    
    public Person()
    {
        boolean correctData;
        do
        {
            correctData = true;
            try
            {
                name = JOptionPane.showInputDialog( "Please enter your person's name:" );
            }
            catch ( NumberFormatException e )
            {
                correctData = false;
            }
        }
        while ( !correctData );
    }
    
    void nextDay()
    {
        food = food - 1;
        
        if (food < 0)
        {
            health -= 10;
        }
        else if (food < 50)
        {
            health -= 1;
        }
    }
    
    void nextWeek()
    {
        for (int i = 0; i < 7; ++i)
        {
            nextDay();
        }
    }
}
