package com.acme.decorators;

public class JVMMemoryTotal extends DetailsDecorator{
    public JVMMemoryTotal(Detail detail){
        this.detail = detail;
    }

    public String getDetails() {
        return detail.getDetails() + ", and there is a total of " + Runtime.getRuntime().totalMemory() + " bytes of JVM memory";
    }
}
