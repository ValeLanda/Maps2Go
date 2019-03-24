package maave.maps2go.modelo;

import java.util.List;


public class ComentarioDAO extends AbstractDAO<Comentario>{
    
    public ComentarioDAO() {
        super();
    }
    
    @Override
    public void agregar(Comentario comentario) {
        super.agregar(comentario);
    }

    @Override
    public void actualizar(Comentario comentario) {
        super.actualizar(comentario);
    }

    @Override
    public void borrar(Comentario comentario) {
        super.borrar(comentario);
    }

    public Comentario consultar(int id) {
        return super.consultarInt(Marcador.class, id);
    }

    public List<Comentario> consultarTodos() {
        return super.consultarTodos(Marcador.class);
    }

}
