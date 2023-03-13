package Hotel.hibernate;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class PERSON {
    protected String name;
    protected String surname;
    protected LocalDate date_of_birth;

    public PERSON(){

    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }


    public LocalDate getDate_of_birth(){
        return this.date_of_birth;
    }
    public void setDate_of_birth(LocalDate date_of_birth){
        this.date_of_birth = date_of_birth;
    }

}
