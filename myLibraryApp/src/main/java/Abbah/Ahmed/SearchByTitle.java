package Abbah.Ahmed;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

class SearchByTitle implements SearchStrategy {
    public String search(String query) {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        
        List<Document>  documents = session.createQuery("FROM Document WHERE  titre=:titre", Document.class)
                .setParameter("titre",query).list();
        
        if(documents.size() > 0){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("recherche des documents").append("\n");
            stringBuilder.append("recherche pour les documents don't le titre est "+query ).append("\n");
            for(Document document : documents){
                stringBuilder.append(document.toString()).append("\n");
            }
            session.getTransaction().commit();
            return stringBuilder.toString();
        }
        session.getTransaction().commit();
    	return null;
    }
}