package DataAccess.concrete;

import DataAccess.abstracts.CourseDao;
import Entity.concrete.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {
    List<Course> courses = new ArrayList<>();
    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void add(Course course) {
        System.out.println("Kurs eklendi : " + course.getName());
        courses.add(course);
    }
}
