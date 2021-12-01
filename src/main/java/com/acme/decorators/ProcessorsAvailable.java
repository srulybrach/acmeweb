package com.acme.decorators;

public class ProcessorsAvailable extends DetailsDecorator {
    InfoInterface maker;

    public ProcessorsAvailable(Detail detail, InfoInterface maker){
        this.detail = detail;
        this.maker = maker;
    }

    public String getDetails() {
        return detail.getDetails() + ", and there are " + maker.processorsAvailable() + " processors available";
    }
}
