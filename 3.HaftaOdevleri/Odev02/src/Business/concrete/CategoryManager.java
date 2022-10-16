package Business.concrete;

import Business.abstracts.CategoryService;
import Core.Logger;
import DataAccess.abstracts.CategoryDao;
import Entity.concrete.Category;
import Entity.concrete.Course;

import java.util.List;

public class CategoryManager implements CategoryService {
    List<Logger> loggers;
    CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao,List<Logger> loggers) {
        this.loggers = loggers;
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
        for (Logger logger : loggers){
            logger.log(category.getName());
        }
    }

    //Devre Dısı
 /*   @Override
    public void addCourse(Category category, Course course) {

    }

  */
}
