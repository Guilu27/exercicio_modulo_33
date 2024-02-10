package dao.generics;

import domain.Persistente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDAO<T extends Persistente> implements IGenericDAO<T>{
    @Override
    public T cadastrar(T entity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return entity;
    }
}
