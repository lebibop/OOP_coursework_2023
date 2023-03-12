package Hotel.hibernate;

import javax.persistence.*;

public class AppCLIENT {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence-Hotel");
        EntityManager em = emf.createEntityManager();

        System.out.println("Test started");
        em.getTransaction().begin();
        ROOM sst = new ROOM(11);
        System.out.println("1111111111111111111111");
        CLIENT st = new CLIENT(sst);

        st.setLength_of_stay(99);
        em.persist(st);
        em.getTransaction().commit();

        System.out.println("New REPORT ID is " + st.getIdCLIENT());
    }

}