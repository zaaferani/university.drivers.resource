package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ResourceModel {

    private UUID serviceId;
    private UUID elementId;
    private String elementName;
    private List<ParentModel> parents;

    public ResourceModel() {
    }

    public ResourceModel(ElementModel elementModel) {
        this.serviceId = elementModel.getServiceId();
        this.elementId = elementModel.getElementId();
        this.elementName = elementModel.getElementName();
        if (elementModel.getParentElementId() != null) {
            this.parents = new ArrayList<>();
            this.parents.add(new ParentModel(this,
                    elementModel.getParentServiceId(), elementModel.getParentElementId())
            );
        }
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


    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }


    /**
     * @return the parents
     */
    public List<ParentModel> getParents() {
        return parents;
    }

    /**
     * @param parents the parents to set
     */
    public void setParents(List<ParentModel> parents) {
        this.parents = parents;
    }

    public ElementModel getElementModel() {

        if (getParents() != null && getParents().size() > 0) {
            ParentModel p = getParents().get(getParents().size() - 1);
            return new ElementModel(getServiceId(), getElementId(), getElementName(),
                    p.getServiceId(), p.getElementId());
        }
        return new ElementModel(getServiceId(), getElementId(), getElementName(), null, null);
    }
}