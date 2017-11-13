package com.skorniychuk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "hobby")
public class Hobby implements Serializable {
    @Id
    @Column(name = "HOBBY_ID")
    private String hobbyId;

    public Hobby(String hobbyId) {
    }

    public String getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(String hobbyId) {
        this.hobbyId = hobbyId;
    }
}
