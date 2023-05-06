package Abbah.Ahmed;

public class AddNewClientExpression implements Expression {
	Client client;
	public AddNewClientExpression(String param1, String param2, String param3){
        this.client = new Client(param1, param2, param3);
        }
	@Override
	public String interpret(Context context){
		if(context.addClient(this.client)){
			return "Client Liste : "+""+this.client.toString()+ " has been added successfully .";
		}
		return "Error while adding the client ! .";

	}	
}	
