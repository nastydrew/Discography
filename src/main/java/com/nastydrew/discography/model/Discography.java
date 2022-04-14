package com.nastydrew.discography.model;

import javax.persistence.*;

@Entity
@Table(name = "DISCOGRAPHY")
public class Discography {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "ALBUM_NAME")
    private String albumName;

    @Column(name = "YEAR")
    private int year;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "ALBUM_IMAGE")
    private String albumImage;

    public int getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getYear() {
        return year;
    }

    public String getAlbumImage() {
        return albumImage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAlbumImage(String albumImage) {
        this.albumImage = albumImage;
    }
}
