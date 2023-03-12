package Hotel.hibernate;

import javax.persistence.*;

public class AppROOM {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence-Hotel");
        EntityManager em = emf.createEntityManager();

        System.out.println("Test started");
        em.getTransaction().begin();
        ROOM st = new ROOM(123);
        st.setCapacity(100);
        em.persist(st);
        em.getTransaction().commit();

        System.out.println("New REPORT ID is " + st.getIdROOM());
    }

}