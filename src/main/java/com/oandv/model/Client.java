package com.oandv.model;

import javax.validation.constraints.Size;

public class Client {

    @Size(min = 10, message = "Enter at least 10 Characters.")
    private String name;
    private Order order;
    private int numOfPeople;
    private String language;

}
