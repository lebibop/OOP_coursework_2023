package Hotel.hibernate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client")
public class CLIENT extends PERSON{
    @Id
    @Column(name = "idCLIENT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCLIENT;
    @Column(name = "arrival_date")
    private Date arrival_date;
    @Column(name = "departure_date")
    private Date departure_date;
    @Column(name = "length_of_stay")
    private int length_of_stay;


    @ManyToOne
    @JoinColumn(name = "ROOM_idROOM")
    private ROOM client_room;


    /*
    Агрегация – это когда экземпляр двигателя создается где-то в другом месте кода,
    и передается в конструктор автомобиля в качестве параметра.
     */
    public CLIENT(ROOM room){
        this.client_room = room;
    }

    public CLIENT() {

    }

    public ROOM getClient_room(){
        return this.client_room;
    }
    public void setClient_room(ROOM Info){
        this.client_room = Info;
    }

    public int getIdCLIENT(){
        return this.idCLIENT;
    }
    public void setIdCLIENT(int idCLIENT){
        this.idCLIENT = idCLIENT;
    }


    public Date getArrival_date(){
        return this.arrival_date;
    }
    public void setArrival_date(Date arrival_date){
        this.arrival_date = arrival_date;
    }


    public Date getDeparture_date(){
        return this.departure_date;
    }
    public void setDeparture_date(Date departure_date){
        this.departure_date = departure_date;
    }


    public int getLength_of_stay(){
        return this.length_of_stay;
    }
    public void setLength_of_stay(int length_of_stay){
        this.length_of_stay = length_of_stay;
    }


}
