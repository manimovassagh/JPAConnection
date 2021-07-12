package io.mani;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaStarterMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("mani");
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
       EntityManager entityManager= entityManagerFactory.createEntityManager();
       entityManager.persist(employee);

    }
}
