package com.acme.decorators;

public interface InfoInterface {
    long getMemoryFreeJVM();
    long getMemoryTotalJVM();
    String versionJRE();
    int processorsAvailable();
    String tempLocation();
}
