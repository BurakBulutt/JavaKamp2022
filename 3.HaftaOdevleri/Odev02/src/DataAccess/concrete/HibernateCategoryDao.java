package DataAccess.concrete;

import DataAccess.abstracts.CategoryDao;
import Entity.concrete.Category;
import Entity.concrete.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> getCategorys() {
        return categories;
    }

    @Override
    public void add(Category category) {
        System.out.println("Kategori eklendi : " + category.getName());
        categories.add(category);
    }

}
