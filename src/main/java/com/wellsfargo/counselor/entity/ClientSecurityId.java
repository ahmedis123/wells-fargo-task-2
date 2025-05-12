package com.wellsfargo.softwareengineering.entities;

import java.io.Serializable;
import java.util.Objects;

public class ClientSecurityId implements Serializable {
    private Integer client;
    private Integer security;

    public ClientSecurityId() {}

    public ClientSecurityId(Integer client, Integer security) {
        this.client = client;
        this.security = security;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientSecurityId)) return false;
        ClientSecurityId that = (ClientSecurityId) o;
        return Objects.equals(client, that.client) && Objects.equals(security, that.security);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, security);
    }
}
