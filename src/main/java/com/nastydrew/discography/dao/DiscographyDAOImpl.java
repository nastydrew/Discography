package com.nastydrew.discography.dao;

import com.nastydrew.discography.model.Discography;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiscographyDAOImpl implements DiscographyDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Discography> allDiscography() {
        return sessionFactory.getCurrentSession().createQuery("from Discography").list();
    }

    @Override
    public void add(Discography discography) {
        sessionFactory.getCurrentSession().persist(discography);
    }

    @Override
    public void delete(Discography discography) {
        sessionFactory.getCurrentSession().delete(discography);
    }

    @Override
    public void edit(Discography discography) {
        sessionFactory.getCurrentSession().update(discography);
    }

    @Override
    public Discography getById(int id) {
        return sessionFactory.getCurrentSession().get(Discography.class, id);
    }
}
