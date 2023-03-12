package Hotel.hibernate;

import javax.persistence.*;


@Entity
@Table(name = "worker")
public class WORKER extends PERSON {
    @Id
    @Column(name = "idWORKER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idWORKER;
    @Column(name = "position")
    private String position;
    @Column(name = "experience")
    private int experience;

    public WORKER(){

    }

    public int getIdWORKER(){
        return this.idWORKER;
    }
    public void setIdWORKER(int idWORKER){
        this.idWORKER = idWORKER;
    }


    public String getPosition(){
        return this.position;
    }
    public void setPosition(String position){
        this.position = position;
    }



    public int getExperience(){
        return this.experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
}

