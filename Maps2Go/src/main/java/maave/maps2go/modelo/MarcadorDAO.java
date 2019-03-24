package maave.maps2go.modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MarcadorDAO extends AbstractDAO<Marcador>{
    
    public MarcadorDAO() {
        super();
    }
    
    public void agregar(Marcador marcador) {
        super.agregar(marcador);
    }

    public void actualizar(Marcador marcador) {
        super.actualizar(marcador);
    }

    public void borrar(Marcador marcador) {
        super.borrar(marcador);
    }

    public Marcador consultar(int id) {
        return super.consultarInt(Marcador.class, id);
    }

    public List<Marcador> consultarTodos() {
        return super.consultarTodos(Marcador.class);
    }

    public Marcador buscaMarcador(double latitud, double longitud) {
        Marcador m = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "from Marcador where longitud = :lng and latitud = :lat";
            Query query = session.createQuery(hql);
            query.setParameter("lng", longitud);
            query.setParameter("lat", latitud);
            m = (Marcador)query.uniqueResult();
            tx.commit();
            
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();

        }finally{
            session.close();
        }
        return m;
    }

}
