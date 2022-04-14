package com.nastydrew.discography.service;

import com.nastydrew.discography.model.Discography;

import java.util.List;

public interface DiscographyService {
    List<Discography> allDiscography();
    void add(Discography discography);
    void delete(Discography discography);
    void edit(Discography discography);
    Discography getById(int id);
}
