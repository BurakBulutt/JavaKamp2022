package Business.concrete;

import Business.abstracts.CourseService;
import Core.Logger;
import DataAccess.abstracts.CategoryDao;
import DataAccess.abstracts.CourseDao;
import Entity.concrete.Course;

import java.util.List;

public class CourseManager implements CourseService {
    List<Logger> loggers;
    CourseDao courseDao;

    public CourseManager(CourseDao courseDao,List<Logger> loggers) {
        this.loggers = loggers;
        this.courseDao = courseDao;
    }

    @Override
    public boolean checkNameIfAlreadyUse(Course course) {
        boolean check = true;
        List<Course> courses = courseDao.getCourses();
        for (Course courseDB : courses){
            if (courseDB.getName().equals(course.getName()))
                check = false;
        }
        return check;
    }

    @Override
    public boolean checkCoursePrice(Course course) {
        if (course.getCoursePrice() <= 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void addCourse(Course course){
        if (checkNameIfAlreadyUse(course) &&  checkCoursePrice(course)){
            courseDao.add(course);
        }else if (!checkCoursePrice(course)){
            System.out.println("Kurs Eklenemedi : Kurs Ücreti 0 TL ve aşağı olamaz");
        }else if (!checkNameIfAlreadyUse(course)){
            System.out.println("Kurs Eklenemedi : kurs zaten mevcut ");
        }
        for (Logger logger : loggers){
            logger.log(course.getName());
        }
    }

}
