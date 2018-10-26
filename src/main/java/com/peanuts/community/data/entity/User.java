package com.peanuts.community.data.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name="user")
@Embeddable
@Access(AccessType.PROPERTY)
@EqualsAndHashCode(callSuper=false)
public class User {

    private int id;
    private String name;
    private String mail;
    private String password;
}
