/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.sql.Date;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * En aquesta secció cal accedir a una taula de MySQL amb un camp de cada tipus:
 * 
 * int o long, double o float, boolean, char, String i java.sql.Date
 * 
 * Recòrrer el result set i mostrar-lo per la consola com a instancies de la 
 * classe Registre, que tindrà l'estructura de la teva taula.
 * 
 * Cal usar la llibreria Hibernate.
 * 
 * 
 * @author dvali
 */
public class HibernateMain {
    
   public static Session s = newSession();
    public static RegistreCinema insertPeli;
    public static RegistreCinema updatePeli;
    public static RegistreCinema peli;
    
    public static void main(String[] args) {
        
        insertPeli = new RegistreCinema(null,2.0,false,'B',"Totoro",Date.valueOf("1991-08-11"));
        updatePeli = new RegistreCinema(9,2.4,true,'A',"Cronicas navideñas 2",Date.valueOf("1999-12-10"));
        
        imprimir();
        //insertar(insertPeli);
        //actualizar(updatePeli);
        //eliminar(7);
    }

    public static Session newSession() {
        SessionFactory sf = IniciHibernate.SFactory();
        return sf.openSession();

    }
    
    private static void infoTabla(Iterator<RegistreCinema> i) {
        while (i.hasNext()) {
            peli = i.next();
            System.out.println(peli.toString());
        }
    }

    public static void imprimir() {
       Query query = s.createQuery("from RegistreCinema");
       Iterator i = query.iterate();
       infoTabla(i);
    }
    
    public static void insertar(RegistreCinema peliculas){
        Transaction trans = s.beginTransaction();
            s.save(peliculas);
            trans.commit();
    }
    
    public static void eliminar(int id){
      Transaction tran = s.beginTransaction();
            RegistreCinema cine = (RegistreCinema) s.get(RegistreCinema.class, id);
            s.delete(cine);
            tran.commit();
    }
    
    public static void actualizar(RegistreCinema peli){
       Transaction trans = s.beginTransaction();
            s.get(RegistreCinema.class, peli.getIdPelicula());
            s.merge(peli);

            trans.commit();
    }

    
    
}
