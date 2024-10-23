package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.lang.model.element.NestingKind;


@Getter
@Setter
public class User {
    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private Role role;
    private String proSkill;
    private int expInYear;
    public enum Role{
        EMPLOYEE, ADMIN
    }

}
