package Business.concrete;

import Business.abstracts.CategoryService;
import DataAccess.abstracts.CategoryDao;
import Entity.concrete.Category;
import Entity.concrete.Course;

import java.util.List;

public class CategoryManager implements CategoryService {
    CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void addCategory(Category category) {
        boolean check = true;
        for (Category categoryDB : categoryDao.getCategorys()){
            if (category.getName().equals(categoryDB.getName()))
                check = false;
        }
        if (check){
            categoryDao.add(category);
        }else {
            System.out.println("Kategori zaten mevcut");
        }
    }

    //Devre Dısı
 /*   @Override
    public void addCourse(Category category, Course course) {

    }

  */
}
