package com.oandv.model;

import java.time.LocalDateTime;

public class Session {

    private int id;
    private String user;
    private Client client;
    private Location location;
    private LocalDateTime dateTime;
    private enum Stage {
        PLANNED, BOOKED, SHOOTED, PROCESSED, RETOUCHED, DONE
    }
    private String linkToGallery;
    private String notes;

}