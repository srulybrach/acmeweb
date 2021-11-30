package com.acme.decorators;

public class JVMMemoryFree extends DetailsDecorator{
    public JVMMemoryFree(Detail detail){
        this.detail = detail;
    }

    public String getDetails() {
        return detail.getDetails() + ", and there are " + Runtime.getRuntime().freeMemory() + " bytes of JVM memory free";
    }
}
