package com.oandv.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sessionorder")
public class SessionOrder {
    private int idOrder;
    private Integer amountDue;
    private Integer amountPaid;
    private Byte durationOfSession;
    private Integer amountOfPhotos;
    private List<Session> sessionsByIdOrder;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idOrder")
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "AmountDue")
    public Integer getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(Integer amountDue) {
        this.amountDue = amountDue;
    }

    @Basic
    @Column(name = "AmountPaid")
    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }

    @Basic
    @Column(name = "DurationOfSession")
    public Byte getDurationOfSession() {
        return durationOfSession;
    }

    public void setDurationOfSession(Byte durationOfSession) {
        this.durationOfSession = durationOfSession;
    }

    @Basic
    @Column(name = "AmountOfPhotos")
    public Integer getAmountOfPhotos() {
        return amountOfPhotos;
    }

    public void setAmountOfPhotos(Integer amountOfPhotos) {
        this.amountOfPhotos = amountOfPhotos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SessionOrder sessionOrder = (SessionOrder) o;

        if (idOrder != sessionOrder.idOrder) return false;
        if (amountDue != null ? !amountDue.equals(sessionOrder.amountDue) : sessionOrder.amountDue != null) return false;
        if (amountPaid != null ? !amountPaid.equals(sessionOrder.amountPaid) : sessionOrder.amountPaid != null) return false;
        if (durationOfSession != null ? !durationOfSession.equals(sessionOrder.durationOfSession) : sessionOrder.durationOfSession != null)
            return false;
        if (amountOfPhotos != null ? !amountOfPhotos.equals(sessionOrder.amountOfPhotos) : sessionOrder.amountOfPhotos != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + (amountDue != null ? amountDue.hashCode() : 0);
        result = 31 * result + (amountPaid != null ? amountPaid.hashCode() : 0);
        result = 31 * result + (durationOfSession != null ? durationOfSession.hashCode() : 0);
        result = 31 * result + (amountOfPhotos != null ? amountOfPhotos.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "orderBySessionOrderId")
    public List<Session> getSessionsByIdOrder() {
        return sessionsByIdOrder;
    }

    public void setSessionsByIdOrder(List<Session> sessionsByIdOrder) {
        this.sessionsByIdOrder = sessionsByIdOrder;
    }
}
