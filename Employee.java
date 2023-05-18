package com.qspider.employeeApi.Model;
import javax.persistence.*;

@Entity
@Table(name = "user1")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;


    public Employee() {
    }

    public Employee(int id, String name, String email,String role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }


}
