package com.ex.bean;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="HEROES") //table configuration here instead of Hero.hbm.xml
@NamedQueries({
        @NamedQuery(name="findFallen", query="FROM Hero WHERE alive = FALSE"),
        @NamedQuery(name="findInjured", query="FROM Hero WHERE hitPoints <10")
})

@NamedNativeQueries({
        @NamedNativeQuery(name="bossSQLStatement",
                query="SELECT * FROM heroes WHERE hero_id= :id")
})
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Hero {

    @Id
    @Column(name="HERO_ID")//Optional: if not named, it will take this variable name
    //@SequenceGenerator(name="my_seq", sequenceName="MY_SEQ")
    @GeneratedValue(strategy=GenerationType.AUTO)//HIBERNATE_SEQUENCE
    private int id;

    @Column(name="HERO_NAME", nullable = false)
    private String name;

    @Column(name = "CREATED_DATE")
    private Date created;

    @Column(name="IS_ALIVE")
    private boolean alive;

    @Column(name="HERO_HP")
    private double hitPoints;

    public Hero(){
        super();
    }

    public Hero(String name, Date created, boolean alive, double hitPoints) {
        this.name = name;
        this.created = created;
        this.alive = alive;
        this.hitPoints = hitPoints;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }


}
