package Hotel.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class ROOM {
    @Id
    @Column(name = "idROOM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idROOM;
    @Column(name = "number")
    private String number;
    @Column(name = "status")
    private String status;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "price")
    private int price;


    @OneToMany(mappedBy = "client_room")
    private List<CLIENT> room_clients;

    @OneToOne
    @JoinColumn(name = "REPORT_idREPORT")
    private REPORT report;


    /*
    Композиция – это когда двигатель не существует отдельно от автомобиля.
    Он создается при создании автомобиля и полностью управляется автомобилем.
    В типичном примере, экземпляр двигателя будет создаваться в конструкторе автомобиля.
     */
    public ROOM(int EXAMPLE){
        this.capacity = EXAMPLE;
        this.report = new REPORT(987);
    }

    public ROOM() {

    }

    public REPORT getReport(){
        return this.report;
    }
    public void setReport(REPORT Info){
        this.report = Info;
    }

    public List<CLIENT> getRoom_clients(){
        return this.room_clients;
    }
    public void setRoom_clients(List<CLIENT> Info){
        this.room_clients = Info;
    }



    public int getIdROOM(){
        return this.idROOM;
    }
    public void setIdROOM(int idROOM){
        this.idROOM = idROOM;
    }


    public String getNumber(){
        return this.number;
    }
    public void setNumber(String number){
        this.number = number;
    }


    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }


    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }


    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }


}
