package com.acme.decorators;

public class LocationTemp extends DetailsDecorator{
    public LocationTemp(Detail detail){
        this.detail = detail;
    }

    public String getDetails() {
        return detail.getDetails() + ", and the server's temp file location is " + System.getenv("TEMP");
    }
}
