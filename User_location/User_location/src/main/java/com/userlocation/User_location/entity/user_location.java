package com.userlocation.User_location.entity;

import javax.persistence.*;

@Entity
@Table(name="user_location")
public class user_location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Name",nullable=false)
    private String Name;
    @Column(name="Latitude",nullable=false)
    private String Latitude;
    @Column(name="Longitude",nullable=false)
    private String Longitude;

    public user_location() {
        super();
    }

    public user_location(long id, String name, String latitude, String longitude) {
        this.id = id;
        Name = name;
        Latitude = latitude;
        Longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    @Override
    public String toString() {
        return "user_location{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                '}';
    }
    //        @ManyToOne(fetch=FetchType.LAZY)
//        @JoinColumn(name="post_id",nullable=false)
//        private Post post;
}
