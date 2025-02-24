package com.entities;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "studentsDetails")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    @ElementCollection
    @CollectionTable(name = "educationDetails", joinColumns = @JoinColumn(name = "details_id"))
    private List<EducationDetails> eddetails;

    public Details() {
        super();
    }

    public Details(String name, String phone, String email, List<EducationDetails> eddetails) {
        super();
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.eddetails = eddetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<EducationDetails> getEddetails() {
        return eddetails;
    }

    public void setEddetails(List<EducationDetails> eddetails) {
        this.eddetails = eddetails;
    }

    @Override
    public String toString() {
        return "Details [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", eddetails=" + eddetails + "]";
    }
}
