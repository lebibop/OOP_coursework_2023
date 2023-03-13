package Hotel.hibernate;

import javax.persistence.*;

public class AppREPORT {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence-Hotel");
        EntityManager em = emf.createEntityManager();

        System.out.println("Test started");
        em.getTransaction().begin();
        REPORT st = new REPORT();

        st.setClients_per_month(15);
        st.setFree_per_month(11);
        st.setOccupied_per_month(20);

        em.persist(st);
        em.getTransaction().commit();

        System.out.println("New REPORT ID is " + st.getIdREPORT());
    }

}