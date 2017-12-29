package com.oandv.model;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="session")
@IdClass(SessionPK.class)
public class Session {
    private int idSession;
    private int clientId;
    private int locationId;
    private int orderId;
    private int sessionTypeId;
    private LocalDateTime dateAndTime;
    private String stage;
    private String linkToGallery;
    private String notes;
    private String createdBy;
    private LocalDateTime createdAt;
    private Client clientByClientId;
    private Location locationByLocationId;
    private Order orderByOrderId;
    private SessionType sessionTypeBySessionTypeId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSession")
    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    @Id
    @Column(name = "ClientId")
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Id
    @Column(name = "LocationId")
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Id
    @Column(name = "OrderId")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Id
    @Column(name = "SessionTypeId")
    public int getSessionTypeId() {
        return sessionTypeId;
    }

    public void setSessionTypeId(int sessionTypeId) {
        this.sessionTypeId = sessionTypeId;
    }

    @Basic
    @Column(name = "DateAndTime")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Basic
    @Column(name = "Stage")
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    @Basic
    @Column(name = "LinkToGallery")
    public String getLinkToGallery() {
        return linkToGallery;
    }

    public void setLinkToGallery(String linkToGallery) {
        this.linkToGallery = linkToGallery;
    }

    @Basic
    @Column(name = "Notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "CreatedBy")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CreatedAt")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Session session = (Session) o;

        if (idSession != session.idSession) return false;
        if (clientId != session.clientId) return false;
        if (locationId != session.locationId) return false;
        if (orderId != session.orderId) return false;
        if (sessionTypeId != session.sessionTypeId) return false;
        if (dateAndTime != null ? !dateAndTime.equals(session.dateAndTime) : session.dateAndTime != null) return false;
        if (stage != null ? !stage.equals(session.stage) : session.stage != null) return false;
        if (linkToGallery != null ? !linkToGallery.equals(session.linkToGallery) : session.linkToGallery != null)
            return false;
        if (notes != null ? !notes.equals(session.notes) : session.notes != null) return false;
        if (createdBy != null ? !createdBy.equals(session.createdBy) : session.createdBy != null) return false;
        if (createdAt != null ? !createdAt.equals(session.createdAt) : session.createdAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSession;
        result = 31 * result + clientId;
        result = 31 * result + locationId;
        result = 31 * result + orderId;
        result = 31 * result + sessionTypeId;
        result = 31 * result + (dateAndTime != null ? dateAndTime.hashCode() : 0);
        result = 31 * result + (stage != null ? stage.hashCode() : 0);
        result = 31 * result + (linkToGallery != null ? linkToGallery.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ClientId", referencedColumnName = "idClient", nullable = false)
    public Client getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(Client clientByClientId) {
        this.clientByClientId = clientByClientId;
    }

    @ManyToOne
    @JoinColumn(name = "LocationId", referencedColumnName = "idLocation", nullable = false)
    public Location getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(Location locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }

    @ManyToOne
    @JoinColumn(name = "OrderId", referencedColumnName = "idOrder", nullable = false)
    public Order getOrderByOrderId() {
        return orderByOrderId;
    }

    public void setOrderByOrderId(Order orderByOrderId) {
        this.orderByOrderId = orderByOrderId;
    }

    @ManyToOne
    @JoinColumn(name = "SessionTypeId", referencedColumnName = "idSessionType", nullable = false)
    public SessionType getSessionTypeBySessionTypeId() {
        return sessionTypeBySessionTypeId;
    }

    public void setSessionTypeBySessionTypeId(SessionType sessiontypeBySessionTypeId) {
        this.sessionTypeBySessionTypeId = sessiontypeBySessionTypeId;
    }
}
