package com.ex.bean;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {

    @Id
    private int id;
    private String name;
    @OneToOne
    private Person spouse; //fk -> Person

    @OneToOne(fetch=FetchType.EAGER) //LAZY is default strategy
    @JoinColumn(name="LAPTOP_ID")
    private Laptop laptop;

    @OneToMany(mappedBy="owner")//property name in the other class
    private Set<Pencil> pencils;

    @ManyToMany()
    @JoinTable(name="MAP_OF_SKILLS",
            joinColumns={@JoinColumn(name="PERSON_ID")},
            inverseJoinColumns= {@JoinColumn(name = "SKILL_ID")})
    private Set<Skill> skills;

    public Person() {
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

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Set<Pencil> getPencils() {
        return pencils;
    }

    public void setPencils(Set<Pencil> pencils) {
        this.pencils = pencils;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }
}
