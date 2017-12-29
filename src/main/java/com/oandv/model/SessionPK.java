package com.oandv.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SessionPK implements Serializable {
    private int idSession;
    private int clientId;
    private int locationId;
    private int orderId;
    private int sessionTypeId;

    @Column(name = "idSession")
    @Id
    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    @Column(name = "ClientId")
    @Id
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Column(name = "LocationId")
    @Id
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Column(name = "OrderId")
    @Id
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Column(name = "SessionTypeId")
    @Id
    public int getSessionTypeId() {
        return sessionTypeId;
    }

    public void setSessionTypeId(int sessionTypeId) {
        this.sessionTypeId = sessionTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SessionPK sessionPK = (SessionPK) o;

        if (idSession != sessionPK.idSession) return false;
        if (clientId != sessionPK.clientId) return false;
        if (locationId != sessionPK.locationId) return false;
        if (orderId != sessionPK.orderId) return false;
        if (sessionTypeId != sessionPK.sessionTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSession;
        result = 31 * result + clientId;
        result = 31 * result + locationId;
        result = 31 * result + orderId;
        result = 31 * result + sessionTypeId;
        return result;
    }
}
