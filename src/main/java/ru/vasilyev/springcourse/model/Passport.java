package ru.vasilyev.springcourse.model;


import jakarta.persistence.*;

import java.io.Serializable;

/*
create table Passport(
    human_id int PRIMARY KEY REFERENCES Human(id) on delete cascade,
    passport_number int not null
);
 */
@Entity
@Table(name = "Passport")
public class Passport {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "passport_number")
    private int passportNumber;

    @OneToOne
    @JoinColumn(name = "human_id", referencedColumnName = "id")
    private Human human;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passport() {

    }

    public Passport(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "human=" + human +
                ", passportNumber=" + passportNumber +
                '}';
    }
}
