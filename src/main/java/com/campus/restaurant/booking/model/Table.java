package com.campus.restaurant.booking.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "t_table")
public class Table implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "from_time")
    private Integer from;

    @Column(name = "to_time")
    private Integer to;

    @Column
    private Integer numberOfPersons;

    @Column(length = 25)
    private String personName;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Integer getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(Integer numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String name) {
        this.personName = name;
    }
}
