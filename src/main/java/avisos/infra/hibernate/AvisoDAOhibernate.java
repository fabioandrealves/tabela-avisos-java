/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avisos.infra.hibernate;

import avisos.infra.interfaces.IAvisoDAO;
import avisos.model.Aviso;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ht300810x
 */
public class AvisoDAOhibernate implements IAvisoDAO {

    @Override
    public void inserir(Aviso aviso) {
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();
   
        try {   
            em.getTransaction().begin(); 
            em.persist(aviso); 
            em.getTransaction().commit(); 
        } catch(Exception e) {
            e.printStackTrace();
        } finally { 
            if (em != null) { 
                em.close(); 
            }
        }
    }

    @Override
    public List<Aviso> recuperarTodos() {
        EntityManager em = ConnectionFactoryHibernate
                .getEntityManager();
        List<Aviso> avisos = null;
        
        Query q = em.createQuery(
         "select object(o) from Aviso as o ");
        avisos = q.getResultList();
   
        return avisos;
    }    
}
