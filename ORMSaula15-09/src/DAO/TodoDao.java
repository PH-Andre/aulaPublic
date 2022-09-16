package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Todo;

public class TodoDao implements iDAO<Todo>{

    private EntityManager getEntityManager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);



        return factory.createEntityManager();

    }



}