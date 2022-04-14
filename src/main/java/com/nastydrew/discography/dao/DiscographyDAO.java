package com.nastydrew.discography.dao;

import com.nastydrew.discography.model.Discography;

import java.util.List;

public interface DiscographyDAO {
    List<Discography> allDiscography();
    void add(Discography discography);
    void delete(Discography discography);
    void edit(Discography discography);
    Discography getById(int id);
}
