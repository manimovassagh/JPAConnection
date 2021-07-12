package io.mani;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("sahar");
        employee.setFamily("morattab");
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
       EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        transaction.commit();

    }
}
