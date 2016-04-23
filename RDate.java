import java.util.Date;
import java.util.Calendar;
/**
 * @author Dylan Stai 
 */
public class RDate
{
    Date when;
    Calendar cal;
    String where;
    Person person1;
    Person person2;
    
    /**
     * Constructor for objects of class RDate
     */
    public RDate()
    {
        when = getWhen();
        System.out.println(when);
        where = "Here";
        person1 = null;
        person2 = null;
    }
    
    RDate(Date When, String Where)
    {
        setWhen(When);
        setWhere(Where);
        person1 = null;
        person2 = null;
    }
    
    RDate(Date when, String where, Person person1, Person person2)
    {
        setWhen(when);
        setWhere(where);
        setPerson1(person1);
        setPerson2(person2);
    }
    
    //Public Methods
    
    public Date getWhen()
    {
        cal = Calendar.getInstance();
        when = cal.getTime();
        return when;
    }
    
    public String getWhere()
    {
        return where;
    }
    
    public Person getPerson1()
    {
        return person1;
    }
    
    public Person getPerson2()
    {
        return person2;
    }
    
    public String toString()
    {
        return ("This is a date between " + person1.toString() + " and " + person2.toString() 
        + " at " + where + " at " + when + ".");
    }
    
    public void printInfo()
    {
        String info = toString();
        System.out.println(info);
    }
        
    public void setWhen(Date When)
    {
        when = When;
    }
    
    public void setWhere(String Where)
    {
        where = Where;
    }
    
    public void setPerson1(Person person)
    {
        assert (thisIsIWU(person, person2) == true);
        person1 = person;
    }
    
    public void setPerson2(Person person)
    {
        assert (thisIsIWU(person1, person) == true);
        person2 = person;
    }
    
    //Private Methods
    
    private boolean thisIsIWU(Person person1, Person person2)
    {
        if (person1.getGender() != person2.getGender())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
