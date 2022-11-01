package kodlama.io.Devs.PLangueage.entities.concretes;

import kodlama.io.Devs.PLangueage.entities.abstracts.Entity;
import org.springframework.beans.factory.annotation.Autowired;

public class ProgramLanguage implements Entity {
    private int id;
    private String name;

    @Autowired
    public ProgramLanguage(){

    }
    public ProgramLanguage(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
