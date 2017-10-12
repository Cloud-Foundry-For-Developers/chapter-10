package com.cloudfoundryfordevelopers.ServiceBroker.Models.LastOperation;

public class LastOperationStatus
{
    private String state;
    private String description;

    public LastOperationStatus(String state, String description)
    {
        this.state = state;
        this.description = description;
    }
}