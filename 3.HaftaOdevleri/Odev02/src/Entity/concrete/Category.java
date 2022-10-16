package Entity.concrete;

import Entity.abstracts.Entity;

import java.util.ArrayList;
import java.util.List;

public class Category implements Entity {
    private int ID;
    private String name;

    public Category(int ID, String name) {
        this.ID = ID;
        this.name = name;
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

}
