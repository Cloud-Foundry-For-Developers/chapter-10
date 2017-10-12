package com.cloudfoundryfordevelopers.ServiceBroker.Models.Provisioning;

import com.google.gson.JsonObject;

public class ProvisioningRequestBody
{
    public String service_id;
    public String plan_id;
    public JsonObject context;
    public String organization_guid;
    public String space_guid;
    public JsonObject parameters;
}