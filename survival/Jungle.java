import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;

public class Jungle
{
    public ArrayList<Person> people = new ArrayList<Person>();
    
    public Jungle()
    {
        people.add(new Person());
    }
    
    public String stats()
    {
        String text = "";
        
        for (int i = 0; i < people.size(); ++i)
        {
            Person p = people.get(i);
            text = text + p.name + ":\n";
            text = text + "Health: " + p.health + "\n";
            text = text + "Food: " + p.food + "\n";
            text = text + "\n-------------------------------------------------" + "\n";
        }
        
        return text;
    }
    
    void addPerson()
    {
         people.add(new Person());
    }
    
    void nextDay()
    {
        for (int i = 0; i < people.size(); ++i)
        {
            Person p = people.get(i);
            p.nextDay();
            
            if (p.health <= 0)
            {
                JOptionPane.showMessageDialog(null, p.name + " died :(", "DEATH!!!!!", JOptionPane.INFORMATION_MESSAGE);
                people.remove(i);;
            }
        }
    }
    
    void nextWeek()
    {
        for (int i = 0; i < 7; ++i)
        {
            nextDay();
        }
    }
    
    public String events()
    {
        String text = "";
        Random r = new Random();
        
        return text;
    }
}
