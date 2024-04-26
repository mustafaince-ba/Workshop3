package KodlamaIo;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        InstructorManager instructorManager = new InstructorManager();
        CategoryManager categoryManager = new CategoryManager();

        Course course = new Course();
        course .setId(3);
        course .setName("Yazılım Geliştirici Yetiştirme Kampı (Python)");
        course .setInstructor("Engin Demiroğ");


        List<Course> courses = courseManager.getAll();
        List<Instructor> instructors = instructorManager.getAll();
        List<Category> categories = categoryManager.getAll();


        courseManager.addCourse(course);

        for (Course course1:courses){
            System.out.println(course1.getName());
        }

        System.out.println("---------------------");

        Instructor instructor = new Instructor();

        instructorManager.addInstructor(instructor);

        for (Instructor instructor1:instructors){
            System.out.println(instructor1.getName());
        }

        System.out.println("---------------------");

        Category category = new Category();

        categoryManager.addCategory(category);

        for (Category category1:categories){
            System.out.println(category1.getName());
        }

        System.out.println("---------------------");

        Course updatedCourse = new Course();
        updatedCourse.setId(1);
        updatedCourse.setName("2024 - Yazılım Geliştirici Yetiştirme Kampı C#");
        updatedCourse.setInstructor("Engin Demiroğ");
        courseManager.updateCourse(updatedCourse.getId(), updatedCourse);

        for (Course course1:courses){
            System.out.println(course1.getName());
        }

        System.out.println("---------------------");

        Instructor updatedInstructor = new Instructor();
        updatedInstructor.setId(1);
        updatedInstructor.setName("İrem Balcı");
        instructorManager.updateInstructor(updatedInstructor.getId(), updatedInstructor);

        for (Instructor instructor1:instructors){
            System.out.println(instructor1.getName());
        }

        System.out.println("---------------------");

        Category updatedCategory = new Category();
        updatedCategory.setId(1);
        updatedCategory.setName("Geliştirme");
        categoryManager.updateCategory(updatedCategory.getId(), updatedCategory);

        for (Category category1:categories){
            System.out.println(category1.getName());
        }

        System.out.println("---------------------");

        courseManager.deleteCourse(1);
        System.out.println("---------------------------");

        for (Course course1:courses){
            System.out.println(course1.getName());
        }

        categoryManager.deleteCategory(1);
        System.out.println("---------------------------");

        for (Category category1:categories){
            System.out.println(category1.getName());
        }

    }
}