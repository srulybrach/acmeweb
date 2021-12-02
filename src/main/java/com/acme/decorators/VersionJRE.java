package com.acme.decorators;

import com.acme.info.InfoInterface;

public class VersionJRE extends DetailsDecorator{
    InfoInterface maker;
    public VersionJRE(Detail detail, InfoInterface maker){
        this.detail = detail;
        this.maker = maker;
    }

    public String getDetails() {
        return detail.getDetails() + ", and the JRE version is " + maker.versionJRE();
    }
}
