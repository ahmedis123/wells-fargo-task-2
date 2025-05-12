package com.example.yourproject.entities;

import jakarta.persistence.*;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer financialAdvisorID;

    private String name;
    private String email;
    private String phone;
    private String businessHours;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String name, String email, String phone, String businessHours) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.businessHours = businessHours;
    }

    public Integer getFinancialAdvisorID() { return financialAdvisorID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getBusinessHours() { return businessHours; }
    public void setBusinessHours(String businessHours) { this.businessHours = businessHours; }
}
