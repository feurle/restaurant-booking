package com.campus.restaurant.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "t_table")
public class Table implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer fromTime;

    private Integer toTime;

    private Integer numberOfPersons;

    @Column(length = 25)
    private String personName;

    @Column(length = 25)
    private String contactData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromTime() {
        return fromTime;
    }

    public void setFromTime(Integer fromTime) {
        this.fromTime = fromTime;
    }

    public Integer getToTime() {
        return toTime;
    }

    public void setToTime(Integer toTime) {
        this.toTime = toTime;
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

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getContactData() {
        return contactData;
    }

    public void setContactData(String contactData) {
        this.contactData = contactData;
    }
}
