package Giulio_Marra;

import Giulio_Marra.dao.EventoDAO;
import Giulio_Marra.entities.Evento;
import Giulio_Marra.enums.TipoEvento;
import Giulio_Marra.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("s3-l2-be");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);

        Evento fieraDellaCastagna = new Evento("Fiera Della Castagna", LocalDate.of(2024, 10, 01), "Benvenuti alla 12 edizione della sagra della castagna", TipoEvento.PUBBLICO);

        //ed.save(fieraDellaCastagna);

        try {
            System.out.println(ed.getById(2));
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            ed.delete(52);
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
