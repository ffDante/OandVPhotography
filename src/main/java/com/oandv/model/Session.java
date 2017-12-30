package com.oandv.model;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import javax.persistence.*;

@Entity
@Table(name="session")
public class Session {
    private int idSession;
    private LocalDate date;
    private LocalTime time;

    //PLANNED, BOOKED, CAPTURED, RETOUCHED1, PENDING_CONFIRMATION, RETOUCHED2, DONE
    private String stage;

    private String linkToGallery;
    private String notes;
    private String createdBy;
    private LocalDateTime createdAt;
    private Client clientByClientId;
    private Location locationByLocationId;
    private SessionOrder orderBySessionOrderId;
    private SessionType sessionTypeBySessionTypeId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSession")
    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    @Basic
    @Column(name = "Date")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Time")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
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
        if (date != null ? !date.equals(session.date) : session.date != null) return false;
        if (time != null ? !time.equals(session.time) : session.time != null) return false;
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
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
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
    public SessionOrder getOrderBySessionOrderId() {
        return orderBySessionOrderId;
    }

    public void setOrderBySessionOrderId(SessionOrder orderBySessionOrderId) {
        this.orderBySessionOrderId = orderBySessionOrderId;
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
