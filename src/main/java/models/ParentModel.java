package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class ParentModel {

    private UUID id;

    private UUID elementId;
    private UUID serviceId;
    private ResourceModel resource;

    public ParentModel() {
    }

    public ParentModel(ResourceModel resourceModel, UUID serviceId, UUID elementId) {
        this.resource = resourceModel;
        this.elementId = elementId;
        this.serviceId = serviceId;
    }

    public ParentModel(ResourceModel resourceModel, ParentModel parent) {
        this.resource = resourceModel;
        this.elementId = parent.elementId;
        this.serviceId = parent.serviceId;
    }

    /**
     * @return the id
     */
    @JsonIgnore
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * @return the elementId
     */
    public UUID getElementId() {
        return elementId;
    }

    /**
     * @param elementId the elementId to set
     */
    public void setElementId(UUID elementId) {
        this.elementId = elementId;
    }

    /**
     * @return the serviceId
     */
    public UUID getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId(UUID serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return the resource
     */
    @JsonIgnore
    public ResourceModel getResource() {
        return resource;
    }

    /**
     * @param resource the resource to set
     */
    public void setResource(ResourceModel resource) {
        this.resource = resource;
    }
}
