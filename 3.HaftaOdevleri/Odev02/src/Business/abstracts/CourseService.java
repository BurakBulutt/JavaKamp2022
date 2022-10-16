package Business.abstracts;

import Entity.concrete.Course;

public interface CourseService {

    boolean checkNameIfAlreadyUse(Course course);
    boolean checkCoursePrice(Course course);
    void addCourse(Course course);
}
