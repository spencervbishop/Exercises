package com.ex.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pencil {

    @Id
    private int id;
    private boolean mechanical;
    private int point;

    @ManyToOne()
    @JoinColumn(name="OWNER_ID") //this goes on the "Many" side
    private Person owner; //bidirectional relationship, fk -->Person

    public Pencil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMechanical() {
        return mechanical;
    }

    public void setMechanical(boolean mechanical) {
        this.mechanical = mechanical;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
