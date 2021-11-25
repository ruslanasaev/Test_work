package com.asaev.code.lbtest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "lab_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "position")
    private String position;

}
