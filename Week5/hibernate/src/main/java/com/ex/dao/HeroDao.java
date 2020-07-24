package com.ex.dao;

import com.ex.bean.Hero;
import com.ex.helper.HibernateUtils;
import org.hibernate.*;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.*;
import java.util.List;


public class HeroDao {
Session session = HibernateUtils.getSessionFactory().openSession();

    public Hero save(Hero hero){ //get a session
        Transaction tx = session.beginTransaction();                        //begin a new transaction
        Integer id = (Integer) session.save(hero);                          //generate SQL to INSERT object
        tx.commit();                                                        //COMMIT statement
        return hero;
    }

    public Hero findOne(int pk){
        return (Hero) session.get(Hero.class,pk); //close sessions
        //IF DOESNT FIND THE RECORD => RETURN NULL
        //GOOD IF YOU DONT KNOW WHETHER OR NOT SUCH HERO EXISTS

        //return (Hero) session.load(Hero.class, pk);

        //THROWS OBJECT NOT FOUND EXCEPTION AND RETURNS PROXY
    }

    public Hero update(Hero hero){
        //USE THE SESSION THAT WAS PASSED IN
        Transaction tx = session.beginTransaction();                        //begin a new transaction
        session.saveOrUpdate(hero);                          //generate SQL to INSERT object
        tx.commit();                                                        //COMMIT statement
        return hero;
    }

    //HQL = Hibernate Query Language, object-oriented SQL
    public List<Hero> findAll(){
        String hql = "FROM Hero";
        Query query =  session.createQuery(hql);
        return query.list();
    }

    public List<Hero> findWeaklings(double hp){
        String hql="FROM Hero WHERE hitPoints < :namedParameter";
        Query query = session.createQuery(hql);
        query.setDouble("namedParameter", hp); //binding a val to a parameter
        return query.list();
        session.
    }

    @Deprecated
    public List<Hero> findHPBetweenValues(double low, double high){
        String hql = "from Hero where hitPoints between :l and :h";
        Query query = session.createQuery(hql);
        query.setDouble("l", low);
        query.setDouble("h", high);
        return query.list();
    }

    public List<Hero> findHPBetween(double low, double high){
        //Restrictions -- WHERE clauses; Projections --aggregate functions
         Criteria crit = session.createCriteria(Hero.class);
         crit.add(Restrictions.between("hitPoints", low, high));
         return session.createCriteria(Hero.class)
                 .add(Restrictions.between("hitPoints", low, high))
                 .list();
    }

    public int count(){
        //select count(hero_id) from heroes
        return (int) session.createCriteria(Hero.class)
                .setProjection(Projections.count("id")).uniqueResult();
    }

    public List<Hero> findFallenHeroes(){
        return session.getNamedQuery("findFallen").list();
    }

    public void reviveHero(int heroId){
        //option to use native SQL
        Transaction tx = session.beginTransaction();
        String sql = "UPDATE heroes SET is_alive=true WHERE hero_id= :id";
        SQLQuery query = session.createSQLQuery(sql);
        query.setInteger("id", heroId);
        query.executeUpdate();
        tx.commit();
    }

    public Hero find(int id){
        SQLQuery query = (SQLQuery) session.getNamedQuery("bossSQLStatement");
        query.setInteger("id", id);
        query.addEntity(Hero.class);
        return (Hero)query.uniqueResult();
    }

}
