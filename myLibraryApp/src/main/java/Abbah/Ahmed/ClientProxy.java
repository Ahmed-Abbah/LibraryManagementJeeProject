package Abbah.Ahmed;

public class ClientProxy implements ClientInterface {
    private ClientInterface client;
    
    public ClientProxy(ClientInterface client) {
        this.client = client;
    }
    @Override
    public int getId() {
        return client.getId();
    }
    @Override
    public String getNom() {
        return client.getNom();
    }
    
    @Override
    public String getPrenom() {
        return client.getPrenom();
    }
    
    @Override
    public String getEmail() {
        return client.getEmail();
    }
    
    @Override
    public String getMot_de_passe() {
        return client.getMot_de_passe();
    }
    
    @Override
    public String getNumTel() {
        return client.getNumTel();
    }
    
    @Override
    public boolean getMembre() {
        return client.getMembre();
    }
    
    @Override
    public int getIsAdmin() {
        return client.getIsAdmin();
    }
    
    public boolean isAdmin() {
        // Check if the user is an admin or a regular user
        return client.getIsAdmin() == 1;
    }
}

