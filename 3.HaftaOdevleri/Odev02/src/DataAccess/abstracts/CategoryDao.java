package DataAccess.abstracts;

import Entity.concrete.Category;
import Entity.concrete.Course;

import java.util.List;

public interface CategoryDao {
    List<Category> getCategorys();
    void add(Category category);
}
