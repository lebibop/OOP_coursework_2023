package Hotel.hibernate;

import javax.persistence.*;

public class AppREPORT {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence-Hotel");
        EntityManager em = emf.createEntityManager();

        System.out.println("Test started");
        em.getTransaction().begin();
        REPORT st = new REPORT(99);
        st.setFree_per_month(800);
        em.persist(st);
        em.getTransaction().commit();

        System.out.println("New REPORT ID is " + st.getIdREPORT());
    }

}