package repository;

import model.GroupTrainings;
import model.Member;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryMember {

    private EntityManager em;

    public RepositoryMember() {
        this.em = DbUtil.getEntityManager();
    }

    public void addMember(Member member) {

        try {
            this.em.getTransaction().begin();
            this.em.persist(member);
            this.em.getTransaction().commit();
        }
        catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void updateMember(Member member) {

        try {
            this.em.getTransaction().begin();
            this.em.merge(member);
            this.em.getTransaction().commit();
        }
        catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void deleteMember(Member member) {
        try {
            this.em.getTransaction().begin();
            this.em.remove(em.merge(member));
            this.em.getTransaction().commit();
        }
        catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public List<Member> listAllMembers() {
        return this.em.createQuery("FROM Member", Member.class).getResultList();
    }

    public List<GroupTrainings> listAllMemberGroupTrainingsById() {
        String sql = "SELECT gt.name FROM GroupTrainings gt";

        return this.em.createQuery(sql, GroupTrainings.class)
                .getResultList();
    }
}
