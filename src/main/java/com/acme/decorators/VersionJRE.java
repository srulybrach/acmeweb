package com.acme.decorators;

public class VersionJRE extends DetailsDecorator{
    public VersionJRE(Detail detail){
        this.detail = detail;
    }

    public String getDetails() {
        return detail.getDetails() + ", and the JRE version is " + System.getProperty("java.version");
    }
}
