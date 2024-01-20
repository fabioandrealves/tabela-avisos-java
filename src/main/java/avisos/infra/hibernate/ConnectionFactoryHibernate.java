/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avisos.infra.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ht300810x
 */
public class ConnectionFactoryHibernate {
    private static EntityManagerFactory emf;
    public static EntityManager getEntityManager() {
       try {
         if (emf == null)
              emf = Persistence.
                      createEntityManagerFactory("prova3");
       } catch(Exception e) {
         e.printStackTrace();
       }
       return emf.createEntityManager();    
    }
}

