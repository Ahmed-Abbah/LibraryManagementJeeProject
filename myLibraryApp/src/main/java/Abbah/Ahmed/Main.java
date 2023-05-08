package Abbah.Ahmed;



import org.hibernate.Session;

import jakarta.transaction.SystemException;

public class Main {
	public static void main(String[] args) throws IllegalStateException, SystemException {
        // Initialiser le stock
//        Stock stock = new Stock();
//        ClientListe clientListe = new ClientListe();
//        stock.ajouterDocument(new Document("Computer"));
//        stock.ajouterDocument(new Document("Telephone"));
//        stock.ajouterDocument(new Document("Stylo"));
//        stock.ajouterDocument(new Document("Ballon"));
//
//        clientListe.ajouterClient(1,"Ahmed");
//        clientListe.ajouterClient(2,"Alex");
//        clientListe.ajouterClient(3,"Abbah");
//        clientListe.ajouterClient(4,"Klims");
//
//
//        // Initialiser le système d'interpréteur
//        Interpreter interpreter = new Interpreter(stock,clientListe);
//
//        // Boucle de lecture des commandes de l'utilisateur
//        Scanner scanner = new Scanner(System.in);
//        String input;
//        do {
//            System.out.print("> ");
//            input = scanner.nextLine();
//            interpreter.interpret(input);
//        } while (!input.equals("Sortie"));
		// create a new Client object
		Client client = new Client();
		client.setNom("John");
		client.setPrenom("Doe");
		client.setEmail("hi@email.com");
		client.setMot_de_passe("mypassword");
		client.setNumTel("555-1234");
		client.setMembre(false);
		// get a Hibernate session
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		    // start a new transaction
			   session.beginTransaction();
//			   Client client2 = session.createQuery("select c from Client c where c.id = :clientId", Client.class)
//	                    .setParameter("clientId", 1)
//	                    .uniqueResult();
//			   System.out.println(client2.toString());
			   //client2.setStatutBloque();
			   session.persist(client);
			   session.getTransaction().commit();
			   session.close();
		} catch (Exception e) {
		    // rollback the transaction if an error occurs
		    e.printStackTrace();
		} finally {
		    // close the Hibernate session
		    session.close();
		}
    }
}
