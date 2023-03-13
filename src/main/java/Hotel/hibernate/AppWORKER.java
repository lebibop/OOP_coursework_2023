package Hotel.hibernate;

import javax.persistence.*;
import java.time.LocalDate;

public class AppWORKER {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence-Hotel");
        EntityManager em = emf.createEntityManager();

        System.out.println("Test started");
        em.getTransaction().begin();
        WORKER st = new WORKER();

        st.setName("Uriy");
        st.setSurname("Gusman");
        st.setDate_of_birth(LocalDate.of(1955, 6, 14));
        st.setPosition("Manager");
        st.setExperience(14);
        em.persist(st);
        em.getTransaction().commit();

        System.out.println("New WORKER ID is " + st.getIdWORKER());
    }

}
