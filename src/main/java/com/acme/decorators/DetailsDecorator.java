package com.acme.decorators;

public abstract class DetailsDecorator extends Detail {
    Detail detail;

    public abstract String getDetails();
}
