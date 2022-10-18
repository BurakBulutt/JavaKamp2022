import Business.abstracts.CategoryService;
import Business.abstracts.CourseService;
import Business.abstracts.EducatorService;
import Business.concrete.CategoryManager;
import Business.concrete.CourseManager;
import Business.concrete.EducatorManager;
import Core.DataBaseLogger;
import Core.EmailLogger;
import Core.FileLogger;
import Core.Logger;
import DataAccess.abstracts.EducatorDao;
import DataAccess.concrete.HibernateCategoryDao;
import DataAccess.concrete.HibernateCourseDao;
import DataAccess.concrete.HibernateEducatorDao;
import Entity.concrete.Category;
import Entity.concrete.Course;
import Entity.concrete.Educator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Logger> loggerList = new ArrayList<>();
        loggerList.add(new FileLogger());
        loggerList.add(new DataBaseLogger());
        loggerList.add(new EmailLogger());


        Educator educator =new Educator(1,"Engin","Demirog");
        Educator educator1 = new Educator(2,"Burak","Bulut");

        Course course =new Course(1,"2022 Java Kampı","Java",educator,50.0);
        Course course1 = new Course(2,"2022 C++ Kampı","C++",educator1,20.0);

        Category category = new Category(1,"Java Kampları");
        Category category1 = new Category(2,"Ücretsiz Kamplar");

        EducatorService educatorService = new EducatorManager(new HibernateEducatorDao(),loggerList);
        CategoryService categoryService = new CategoryManager(new HibernateCategoryDao(),loggerList);
        CourseService courseService = new CourseManager(new HibernateCourseDao(),loggerList);

        educatorService.addEducator(educator);
        System.out.println("----------------------");

        educatorService.addEducator(educator1);
        System.out.println("----------------------");


        categoryService.addCategory(category);
        System.out.println("----------------------");

        categoryService.addCategory(category1);
        System.out.println("----------------------");


        courseService.addCourse(course);
        System.out.println("----------------------");

        courseService.addCourse(course1);
        System.out.println("----------------------");


    }
}