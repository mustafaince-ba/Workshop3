package KodlamaIo;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private List<Instructor> instructors;

    public InstructorManager() {
        this.instructors = new ArrayList<>();
        instructors.add(new Instructor(1, "Engin Demiroğ"));
        instructors.add(new Instructor(2, "Halit Kalaycı"));

    }

    // Listeleme
    public List<Instructor> getAll() {
        return instructors;
    }

    // Ekleme
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    // Güncelleme
    public void updateInstructor(int id, Instructor updatedInstructor) {
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getId() == id) {
                instructors.set(i, updatedInstructor);
                break;
            }
        }
    }

    // Silme
    public void deleteInstructor(int id) {
        for (Instructor instructor: instructors) {
            if (instructor.getId() == id) {
                instructors.remove(instructor);
                break;
            }
        }
    }

    // Id'ye göre getirme
    public Instructor getInstructorById(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }
}
