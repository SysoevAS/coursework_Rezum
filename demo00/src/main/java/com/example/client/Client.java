package com.example.client;
import jakarta.persistence.*;

@Entity
@Table(name = "client")// позволяет Джава-класс представлять, как объект базы данных. defines that a class can be mapped to a table.
public class Client {
    private Long id;
    private String full_name;
    private String edu;
    private String service;
    private String self;

    protected Client() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    @Override
    public String toString() {
        return "performance [id=" + id + ", full name=" + full_name + ", edu=" + edu + ", service=" + service + ", self=" + self + "]";
    }
}







