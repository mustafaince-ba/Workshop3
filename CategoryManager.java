package KodlamaIo;

import java.util.ArrayList;
import java.util.List;
public class CategoryManager {
    private List<Category> categories;

    public CategoryManager() {
        this.categories = new ArrayList<>();
        categories.add(new Category(1, "Yazılım"));
    }

    // Listeleme
    public List<Category> getAll() {
        return categories;
    }

    // Ekleme
    public void addCategory(Category category) {
        categories.add(category);
    }

    // Güncelleme
    public void updateCategory(int id, Category updatedCategory) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == id) {
                categories.set(i, updatedCategory);
                break;
            }
        }
    }

    // Silme
    public void deleteCategory(int id) {
        for (Category category: categories) {
            if (category.getId() == id) {
                categories.remove(category);
                break;
            }
        }
    }

    // Id'ye göre getirme
    public Category getCategoryById(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
