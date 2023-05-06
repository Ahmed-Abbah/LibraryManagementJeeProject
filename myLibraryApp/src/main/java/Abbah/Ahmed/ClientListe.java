package Abbah.Ahmed;
import java.util.ArrayList;
public class ClientListe {
	ArrayList<Client> Clients = new ArrayList<Client>();
    public Boolean addNewClient(Client client){
        this.Clients.add(client);
        return true;
    }


    public ArrayList<Client> getClients(){
        return this.Clients;
    }
    public String toString(){
    	String Output="********** Clients Liste ********<br>";

        for(int i=0;i<this.Clients.size();i++){
        	Output=Output+" "+i+"  |  "+Clients.get(i).toString()+"  |  ";
        }
        return Output+"*********************************";
    }


}
