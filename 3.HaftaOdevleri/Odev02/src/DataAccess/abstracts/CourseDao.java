package DataAccess.abstracts;

import Entity.concrete.Course;
import java.util.List;

public interface CourseDao {
    List<Course> getCourses();
    void add(Course course);
}
