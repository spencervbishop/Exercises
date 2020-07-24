package com.ex.datademo.model;


import javax.persistence.*;

@Entity
@Table(name="DROID")
public class Droid {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", updatable=false, nullable=false)
    private int id;

    @Column
    private String name;

    @Column(name="DROID_TYPE")
    @Enumerated(EnumType.STRING)
    private DroidType droidType;

    public Droid(){}

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

    public DroidType getDroidType() {
        return droidType;
    }

    public void setDroidType(DroidType droidType) {
        this.droidType = droidType;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", droidType=" + droidType +
                '}';
    }
}
