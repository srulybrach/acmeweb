package com.acme.decorators;

public class LocationTemp extends DetailsDecorator{
    InfoInterface maker;
    public LocationTemp(Detail detail, InfoInterface maker){
        this.detail = detail;
        this.maker = maker;
    }

    public String getDetails() {
        return detail.getDetails() + ", and the server's temp file location is " + maker.tempLocation();
    }
}
