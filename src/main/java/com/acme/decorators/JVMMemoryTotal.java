package com.acme.decorators;

public class JVMMemoryTotal extends DetailsDecorator{
    InfoInterface maker;
    public JVMMemoryTotal(Detail detail, InfoInterface maker){
        this.detail = detail;
        this.maker = maker;
    }

    public String getDetails() {
        return detail.getDetails() + ", and there is a total of " + maker.getMemoryTotalJVM() + " bytes of JVM memory";
    }
}
