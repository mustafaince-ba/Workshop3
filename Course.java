package KodlamaIo;
public class Course
{
    private int id;
    private String name;
    private String instructor;
    private String category;
    private String description;
    private double price;

    public Course(int id, String name, String instructor, String category, String description, double price) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.category = category;
        this.description = description;
        this.price = price;

    }
    public Course(){}

    // Getter ve Setter metotları
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getInstructor()
    {
        return instructor;
    }

    public String getCategory()
    {
        return category;
    }

    public String getDescription()
    {
        return description;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

}
