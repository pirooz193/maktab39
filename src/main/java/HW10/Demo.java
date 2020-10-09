package HW10;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            entityManager.getTransaction().begin();
            Article article =new Article();
            article.setTitle("theory of music");
            entityManager.persist(article);
            entityManager.getTransaction().commit();

        }catch(Exception e){
            entityManager.getTransaction().rollback();
        }
        entityManager.close();


    }
}
