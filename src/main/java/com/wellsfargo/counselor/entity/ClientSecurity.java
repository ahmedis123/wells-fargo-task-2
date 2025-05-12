package com.wellsfargo.softwareengineering.entities;

import jakarta.persistence.*;

@Entity
@IdClass(ClientSecurityId.class)
public class ClientSecurity {
    @Id
    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;

    @Id
    @ManyToOne
    @JoinColumn(name = "securityID")
    private Security security;

    private Integer quantityOwned;

    public ClientSecurity() {}

    public ClientSecurity(Client client, Security security, Integer quantityOwned) {
        this.client = client;
        this.security = security;
        this.quantityOwned = quantityOwned;
    }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public Security getSecurity() { return security; }
    public void setSecurity(Security security) { this.security = security; }
    public Integer getQuantityOwned() { return quantityOwned; }
    public void setQuantityOwned(Integer quantityOwned) { this.quantityOwned = quantityOwned; }
}
