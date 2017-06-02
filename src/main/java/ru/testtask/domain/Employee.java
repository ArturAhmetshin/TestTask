package ru.testtask.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Artur on 31.05.2017.
 */
@Entity

public class Employee {
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
    private Long id;

    private String fio;
    private Date birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {return fio;}
}
