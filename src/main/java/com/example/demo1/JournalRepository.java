package com.example.demo1;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Stateless
public class JournalRepository {

    @PersistenceContext(unitName = "demo1")
    private EntityManager em;


    public Mark findById(Long id){
        return em.find(Mark.class, id);
    }

    public boolean isHibernateConnectedToDatabase() {
        try {
            em.createNativeQuery("SELECT table_name \n" +
                    "FROM information_schema.tables \n" +
                    "WHERE table_schema = 'public'").getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
