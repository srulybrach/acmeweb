package com.acme.info;

public interface InfoInterface {
    long getMemoryFreeJVM();
    long getMemoryTotalJVM();
    String versionJRE();
    int processorsAvailable();
    String tempLocation();
}
