package bookmarket_Person;

public abstract class Person 
{
    private String name;
    private String password;
    private String id;
    
    public Person(String name, String email, String id) 
    {
        this.name = name;
        this.password = email;
        this.id = id;
    }
    

    public String getName() 
    {
        return name;
    }
    

    public String getEmail() 
    {
        return password;
    }
    
    public String getId()
    {
    	return id;
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Email: " + password);
        System.out.println("Id: " + id);
    }
}