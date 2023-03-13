package Hotel.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "report")
public class REPORT {
    @Id
    @Column(name = "idREPORT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idREPORT;
    @Column(name = "clients_per_month")
    private int clients_per_month;
    @Column(name = "occupied_per_month")
    private int occupied_per_month;
    @Column(name = "free_per_month")
    private int free_per_month;


    @OneToOne(mappedBy = "report")
    private ROOM room_report;


    public REPORT(int EXAMPLE){

        this.clients_per_month = EXAMPLE;
    }

    public REPORT() {

    }

    public ROOM getRoom_report(){
        return this.room_report;
    }
    public void setRoom_report(ROOM Info){
        this.room_report = Info;
    }

    public int getIdREPORT(){
        return this.idREPORT;
    }
    public void setIdREPORT(int idREPORT){
        this.idREPORT = idREPORT;
    }


    public int getClients_per_month(){
        return this.clients_per_month;
    }
    public void setClients_per_month(int clients_per_month){
        this.clients_per_month = clients_per_month;
    }


    public int getOccupied_per_month(){
        return this.occupied_per_month;
    }
    public void setOccupied_per_month(int occupied_per_month){
        this.occupied_per_month = occupied_per_month;
    }


    public int getFree_per_month(){
        return this.free_per_month;
    }
    public void setFree_per_month(int free_per_month){
        this.free_per_month = free_per_month;
    }


}
