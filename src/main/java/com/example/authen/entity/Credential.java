package com.example.authen.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Credential {
    @Id
    private int tokenKey;
    private Date createdAt;
    private Date expiredAt;
    private int userId;
}