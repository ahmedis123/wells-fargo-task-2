package com.wellsfargo.softwareengineering.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientID;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String contactInfo;

    @ManyToOne
    @JoinColumn(name = "financialAdvisorID")
    private FinancialAdvisor financialAdvisor;

    public Client() {}

    public Client(String firstName, String lastName, LocalDate dateOfBirth, String contactInfo, FinancialAdvisor financialAdvisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.contactInfo = contactInfo;
        this.financialAdvisor = financialAdvisor;
    }

    public Integer getClientID() { return clientID; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
    public FinancialAdvisor getFinancialAdvisor() { return financialAdvisor; }
    public void setFinancialAdvisor(FinancialAdvisor advisor) { this.financialAdvisor = advisor; }
}
