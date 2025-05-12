package com.example.yourproject.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer portfolioID;

    @OneToOne
    @JoinColumn(name = "clientID")
    private Client client;

    private LocalDate creationDate;

    public Portfolio() {}

    public Portfolio(Client client, LocalDate creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Integer getPortfolioID() { return portfolioID; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public LocalDate getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }
}
