package com.oandv.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="client")
public class Client {
    private int idClient;
    private String clientName;
    private Byte numOfPeople;
    private String language;
    private List<Session> sessionsByIdClient;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idClient")
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Basic
    @Column(name = "ClientName")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "NumOfPeople")
    public Byte getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(Byte numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    @Basic
    @Column(name = "Language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (idClient != client.idClient) return false;
        if (clientName != null ? !clientName.equals(client.clientName) : client.clientName != null) return false;
        if (numOfPeople != null ? !numOfPeople.equals(client.numOfPeople) : client.numOfPeople != null) return false;
        if (language != null ? !language.equals(client.language) : client.language != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (numOfPeople != null ? numOfPeople.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "clientByClientId")
    public List<Session> getSessionsByIdClient() {
        return sessionsByIdClient;
    }

    public void setSessionsByIdClient(List<Session> sessionsByIdClient) {
        this.sessionsByIdClient = sessionsByIdClient;
    }
}
