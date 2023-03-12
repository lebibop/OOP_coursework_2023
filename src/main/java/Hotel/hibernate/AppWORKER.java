package Hotel.hibernate;

import javax.persistence.*;

public class AppWORKER {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence-Hotel");
        EntityManager em = emf.createEntityManager();

        System.out.println("Test started");
        em.getTransaction().begin();
        WORKER st = new WORKER();
        st.setPosition("Junior");
        st.setName("ALEX");
        em.persist(st);
        em.getTransaction().commit();

        System.out.println("New WORKER ID is " + st.getIdWORKER());
    }

}
