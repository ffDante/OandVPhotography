package com.oandv.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="location")
public class Location {
    private int idLocation;
    private String locationName;
    private String locationAddress;
    private String locationType;
    private Byte isPermitRequired;
    private List<Session> sessionsByIdLocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLocation")
    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    @Basic
    @Column(name = "LocationName")
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Basic
    @Column(name = "LocationAddress")
    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    @Basic
    @Column(name = "LocationType")
    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @Basic
    @Column(name = "IsPermitRequired")
    public Byte getIsPermitRequired() {
        return isPermitRequired;
    }

    public void setIsPermitRequired(Byte isPermitRequired) {
        this.isPermitRequired = isPermitRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (idLocation != location.idLocation) return false;
        if (locationName != null ? !locationName.equals(location.locationName) : location.locationName != null)
            return false;
        if (locationAddress != null ? !locationAddress.equals(location.locationAddress) : location.locationAddress != null)
            return false;
        if (locationType != null ? !locationType.equals(location.locationType) : location.locationType != null)
            return false;
        if (isPermitRequired != null ? !isPermitRequired.equals(location.isPermitRequired) : location.isPermitRequired != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLocation;
        result = 31 * result + (locationName != null ? locationName.hashCode() : 0);
        result = 31 * result + (locationAddress != null ? locationAddress.hashCode() : 0);
        result = 31 * result + (locationType != null ? locationType.hashCode() : 0);
        result = 31 * result + (isPermitRequired != null ? isPermitRequired.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "locationByLocationId")
    public List<Session> getSessionsByIdLocation() {
        return sessionsByIdLocation;
    }

    public void setSessionsByIdLocation(List<Session> sessionsByIdLocation) {
        this.sessionsByIdLocation = sessionsByIdLocation;
    }
}
