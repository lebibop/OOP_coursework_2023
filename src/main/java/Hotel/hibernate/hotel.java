package Hotel.hibernate;

import java.util.ArrayList;

public class hotel {
    private ArrayList<CLIENT> clients;
    private ArrayList<WORKER> workers;
    private ArrayList<ROOM> rooms;

    public hotel(){

    }

    public ArrayList<CLIENT> getClients(){
        return this.clients;
    }
    public ArrayList<WORKER> getWorkers(){
        return this.workers;
    }
    public ArrayList<ROOM> getRooms(){
        return this.rooms;
    }

    public void setClients(ArrayList<CLIENT> Info){
        this.clients = Info;
    }

    public void setWorkers(ArrayList<WORKER> Info){
        this.workers = Info;
    }

    public void setRooms(ArrayList<ROOM> Info){
        this.rooms = Info;
    }
}
