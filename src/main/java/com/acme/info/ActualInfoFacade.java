package com.acme.info;

public class ActualInfoFacade implements InfoInterface{

    @Override
    public long getMemoryFreeJVM() {
        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public long getMemoryTotalJVM() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override
    public String versionJRE() {
        return System.getProperty("java.version");
    }

    @Override
    public int processorsAvailable() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public String tempLocation() {
        return System.getenv("TEMP");
    }
}
