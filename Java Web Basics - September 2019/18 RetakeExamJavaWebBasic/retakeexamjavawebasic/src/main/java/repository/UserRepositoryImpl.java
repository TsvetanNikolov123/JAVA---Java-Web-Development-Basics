package repository;

import domain.entities.User;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;

    @Inject
    public UserRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(User user) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(user);
        this.entityManager.getTransaction().commit();
    }

    @Override
    public User findById(String id) {
        this.entityManager.getTransaction().begin();
        User user = this.entityManager.createQuery("select u from User u where u.id =:id", User.class)
                .setParameter("id", id)
                .getSingleResult();
        this.entityManager.getTransaction().commit();
        return user;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        this.entityManager.getTransaction().begin();
        User user = this.entityManager
                .createQuery("select u from User u where u.username =:username  and u.password =:password", User.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .getSingleResult();
        this.entityManager.getTransaction().commit();
        return user;
    }

    @Override
    public List<User> findUser(String username) {
        this.entityManager.getTransaction().begin();
        List<User> users = this.entityManager.createQuery("select u from User u where u.username =:username", User.class)
                .setParameter("username", username)
                .getResultList();
        this.entityManager.getTransaction().commit();
        return users;
    }
}
