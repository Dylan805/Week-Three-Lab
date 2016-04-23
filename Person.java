
/**
 * @author Dylan Stai 
 */
public class Person
{
    // instance variables - replace the example below with your own
    private int Age;
    private String Name;
    private String Gender;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age, String gender)
    {
        setAge(age);
        setName(name);
        setGender(gender);
    }
    
    //Public Methods
    
    public int getAge()
    {
        return Age;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getGender()
    {
        return Gender;
    }
    
    public String toString()
    {
        return (Name + " is a " + Age + " year old " + Gender);
    }
    
    public void printInfo()
    {
        String info = toString();
        System.out.println(info);
    }
    
    //Private Methods
    
    private void setName(String name)
    {
        assert (name != "");
        
        Name = name;
    }
    
    private void setAge(int age)
    {
        assert (age > 0);
        
        Age = age;
    }
    
    private void setGender(String gender)
    {
        assert (gender == "male" || gender == "female");
        
        Gender = gender;
    }
}
