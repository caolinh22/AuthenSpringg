package com.example.authen.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private int id;
    private String username;
    private String fullName;
    private String passwordHash;
    private int role;
    private int status;
}
