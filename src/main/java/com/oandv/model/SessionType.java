package com.oandv.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sessiontype")
public class SessionType {
    private int idSessionType;
    private String sessionTypeName;
    private Integer sessionRate;
    private Byte isAssistanceRequired;
    private List<Session> sessionsByIdSessionType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSessionType")
    public int getIdSessionType() {
        return idSessionType;
    }

    public void setIdSessionType(int idSessionType) {
        this.idSessionType = idSessionType;
    }

    @Basic
    @Column(name = "SessionTypeName")
    public String getSessionTypeName() {
        return sessionTypeName;
    }

    public void setSessionTypeName(String sessionTypeName) {
        this.sessionTypeName = sessionTypeName;
    }

    @Basic
    @Column(name = "SessionRate")
    public Integer getSessionRate() {
        return sessionRate;
    }

    public void setSessionRate(Integer sessionRate) {
        this.sessionRate = sessionRate;
    }

    @Basic
    @Column(name = "IsAssistanceRequired")
    public Byte getIsAssistanceRequired() {
        return isAssistanceRequired;
    }

    public void setIsAssistanceRequired(Byte isAssistanceRequired) {
        this.isAssistanceRequired = isAssistanceRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SessionType that = (SessionType) o;

        if (idSessionType != that.idSessionType) return false;
        if (sessionTypeName != null ? !sessionTypeName.equals(that.sessionTypeName) : that.sessionTypeName != null)
            return false;
        if (sessionRate != null ? !sessionRate.equals(that.sessionRate) : that.sessionRate != null) return false;
        if (isAssistanceRequired != null ? !isAssistanceRequired.equals(that.isAssistanceRequired) : that.isAssistanceRequired != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSessionType;
        result = 31 * result + (sessionTypeName != null ? sessionTypeName.hashCode() : 0);
        result = 31 * result + (sessionRate != null ? sessionRate.hashCode() : 0);
        result = 31 * result + (isAssistanceRequired != null ? isAssistanceRequired.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sessionTypeBySessionTypeId")
    public List<Session> getSessionsByIdSessionType() {
        return sessionsByIdSessionType;
    }

    public void setSessionsByIdSessionType(List<Session> sessionsByIdSessionType) {
        this.sessionsByIdSessionType = sessionsByIdSessionType;
    }
}
