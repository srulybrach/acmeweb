package com.acme.info;

public class FakeInfoFacade implements InfoInterface {
    @Override
    public long getMemoryFreeJVM() {
        return 127268272;
    }

    @Override
    public long getMemoryTotalJVM() {
        return 159383552;
    }

    @Override
    public String versionJRE() {
        return "15.0.2+7-27";
    }

    @Override
    public int processorsAvailable() {
        return 4;
    }

    @Override
    public String tempLocation() {
        return "M:\\\\AppData\\\\Local\\\\Temp";
    }
}
