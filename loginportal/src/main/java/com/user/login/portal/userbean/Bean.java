package com.user.login.portal.userbean;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Bean {
    @Id
    private String userName;
    private String password;
    private String empNo;
    private String emailId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="roles")
    private ArrayList<RolesBean> rolesBean;

    public ArrayList<RolesBean> getRolesBean() {
        return rolesBean;
    }
    public void setRolesBean(ArrayList<RolesBean> rolesBean) {
        this.rolesBean = rolesBean;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
