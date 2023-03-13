package Hotel.hibernate;

import javax.persistence.*;

public class AppCLIENT {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence-Hotel");
        EntityManager em = emf.createEntityManager();

        System.out.println("Test started");
        em.getTransaction().begin();
        ROOM sst = new ROOM(11);
        System.out.println("11111111111111111111");
        em.persist(sst);
        System.out.println("22222222222222222222");
        CLIENT st = new CLIENT(sst);

        st.setLength_of_stay(99);
        em.persist(st);
        em.getTransaction().commit();

        System.out.println("New CLIENT ID is " + st.getIdCLIENT());
    }

}