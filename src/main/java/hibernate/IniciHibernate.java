/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;


import org.hibernate.cfg.Configuration;


public class IniciHibernate {
    
    public static org.hibernate.SessionFactory SFactory(){
        return new Configuration().configure().buildSessionFactory();
    }
}
