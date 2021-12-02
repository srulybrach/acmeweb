package com.acme.decorators;

import com.acme.info.InfoInterface;

public class JVMMemoryFree extends DetailsDecorator{
    InfoInterface maker;
    public JVMMemoryFree(Detail detail, InfoInterface maker){
        this.detail = detail;
        this.maker = maker;
    }

    public String getDetails() {
        return detail.getDetails() + ", and there are " + maker.getMemoryFreeJVM() + " bytes of JVM memory free";
    }
}
