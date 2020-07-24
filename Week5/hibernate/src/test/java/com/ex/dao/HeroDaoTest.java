package com.ex.dao;

import com.ex.bean.Hero;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class HeroDaoTest {

    @Test
    public void testInsert(){
        Hero hero = new Hero("Tyler", new Date(), true, 1500);
        hero = new HeroDao().save(hero);
        System.out.println(hero);
    }

    @Test
    public void testFindOne(){
        Hero hero = new HeroDao().findOne(1);
        System.out.println(hero);
    }

    @Test
    public void testUpdate(){
        HeroDao dao = new HeroDao();
        Hero hero = dao.findOne(2);
        hero.setName("Demon Lord");
        dao.update(hero);
    }

    @Test
    public void testHQL(){
        HeroDao dao = new HeroDao();
        System.out.println(dao.findAll());
    }

    @Test
    public void testWeaklings(){
        Date start = new Date();
        HeroDao dao = new HeroDao();
        System.out.println(dao.findWeaklings(100));
        Date end = new Date();
        System.out.println(end.getTime()-start.getTime());
    }

//    @Test
//    public void testNamedQry(){
//        System.out.println(new HeroDao.findFallenHeroes());
//    }

    @Test
    public void revive(){

    }

    @Test
    public void testSQLQuery(){

    }

}