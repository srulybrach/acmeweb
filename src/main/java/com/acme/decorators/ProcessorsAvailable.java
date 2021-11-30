package com.acme.decorators;

public class ProcessorsAvailable extends DetailsDecorator {
    public ProcessorsAvailable(Detail detail){
        this.detail = detail;
    }

    public String getDetails() {
        return detail.getDetails() + ", and there are " + Runtime.getRuntime().availableProcessors() + " processors available";
    }
}
