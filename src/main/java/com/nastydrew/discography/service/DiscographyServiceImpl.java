package com.nastydrew.discography.service;

import com.nastydrew.discography.dao.DiscographyDAO;
import com.nastydrew.discography.model.Discography;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiscographyServiceImpl implements DiscographyService {
    private DiscographyDAO discographyDAO;

    @Autowired
    public void setDiscographyDAO(DiscographyDAO discographyDAO) {
        this.discographyDAO = discographyDAO;
    }

    @Override
    @Transactional
    public List<Discography> allDiscography() {
        return discographyDAO.allDiscography();
    }

    @Override
    @Transactional
    public void add(Discography discography) {
        discographyDAO.add(discography);
    }

    @Override
    @Transactional
    public void delete(Discography discography) {
        discographyDAO.delete(discography);
    }

    @Override
    @Transactional
    public void edit(Discography discography) {
        discographyDAO.edit(discography);
    }

    @Override
    @Transactional
    public Discography getById(int id) {
        return discographyDAO.getById(id);
    }
}
