package com.ex.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Skill {

    @Id
    private int id;
    private String name;

    @ManyToMany(mappedBy="skills")
    private Set<Person> withSkills; //bidirectional relationship

    public Skill() {
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

    public Set<Person> getWithSkills() {
        return withSkills;
    }

    public void setWithSkills(Set<Person> withSkills) {
        this.withSkills = withSkills;
    }
}
//look up table

