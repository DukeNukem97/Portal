package com.user.login.portal.userbean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RolesBean {
    @Id
    @GeneratedValue
    private int id;
    private String roles;
}
