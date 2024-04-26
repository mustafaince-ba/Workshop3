package KodlamaIo;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
        courses.add(new Course(1, "(2022)Yazılım Geliştirici Kampı-Java", "Engin Demiroğ", "Yazılım", "fdgsdfg", 400 ));
        courses.add(new Course(2, "(2023) Yazılım Geliştirici Yetiştirme Kampı (Python & Selenium)", "Halit Kalaycı", "Yazılım", "sdfgdsfgh", 250));
        courses.add(new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", "Engin Demiroğ", "Yazılım", "fdgdsfgh", 300));


    }

    // Listeleme
    public List<Course> getAll() {
        return courses;
    }

    // Ekleme
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Güncelleme
    public void updateCourse(int id, Course updatedCourse) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == id) {
                courses.set(i, updatedCourse);
                break;
            }
        }
    }

    // Silme
    public void deleteCourse(int id) {
        for (Course course: courses) {
            if (course.getId() == id) {
                courses.remove(course);
                break;
            }
        }
    }

    // Id'ye göre getirme
    public Course getCourseById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
}
