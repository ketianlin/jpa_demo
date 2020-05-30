package top.ke1205.jpa;

import org.junit.Test;
import top.ke1205.jpa.domain.Customer;
import top.ke1205.jpa.utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class JpaTest {
    @Test
    public void create(){
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Customer customer = new Customer();
        customer.setCustName("aaa");
        customer.setCustAddress("bbbbb");
        em.persist(customer);
        tx.commit();
        em.close();
    }
}
