package com.gl.userManagementApp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "my_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    public User(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
