package repository;

import model.Member;
import model.Trainer;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryTrainer {

    private EntityManager em;

    public RepositoryTrainer() {
        this.em = DbUtil.getEntityManager();
    }

    public void addTrainer (Trainer trainer){
        try {
            this.em.getTransaction().begin();
            this.em.persist(trainer);
            this.em.getTransaction().commit();
        }
        catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void updateTrainer(Trainer trainer) {

        try {
            this.em.getTransaction().begin();
            this.em.merge(trainer);
            this.em.getTransaction().commit();
        }
        catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void deleteTrainer(Trainer trainer) {
        try {
            this.em.getTransaction().begin();
            this.em.remove(em.merge(trainer));
            this.em.getTransaction().commit();
        }
        catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public List<Trainer> listAllTrainers() {
        return this.em.createQuery("FROM Trainer", Trainer.class).getResultList();
    }
}
