package Entity.concrete;

import Entity.abstracts.Entity;
import Entity.concrete.Educator;

public class Course implements Entity {
    private int ID;
    private String name;
    private String langueage;
    private Educator educator;
    private double coursePrice;

    public Course(int ID, String name, String langueage, Educator educator, double coursePrice) {
        this.ID = ID;
        this.name = name;
        this.langueage = langueage;
        this.educator = educator;
        this.coursePrice = coursePrice;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLangueage() {
        return langueage;
    }

    public void setLangueage(String langueage) {
        this.langueage = langueage;
    }

    public Educator getEducator() {
        return educator;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
