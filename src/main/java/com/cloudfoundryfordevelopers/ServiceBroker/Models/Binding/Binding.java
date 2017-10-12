package com.cloudfoundryfordevelopers.ServiceBroker.Models.Binding;

public class Binding
{
    private String credentials;
    private String syslog_drain_url;
    private String route_service_url;
    // volume_mounts -- Need to add support for this, for volume mount support

    public Binding(String credentials, String syslogDrainUrl, String routeServiceUrl)
    {
        this.credentials = credentials;
        this.syslog_drain_url = syslogDrainUrl;
        this.route_service_url = routeServiceUrl;
    }
}