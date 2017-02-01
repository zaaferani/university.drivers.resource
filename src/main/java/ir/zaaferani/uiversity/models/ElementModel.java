package ir.zaaferani.uiversity.models;

import java.util.UUID;

public class ElementModel {

	private UUID elementId;
	private UUID serviceId;
	private String elementName;

	private UUID parentElementId;
	private UUID parentServiceId;

	public ElementModel() {
	}
	public ElementModel(UUID serviceId, UUID elementId, String elementName, UUID pServiceId, UUID pElementId) {
		this.serviceId = serviceId;
		this.elementId = elementId;
		this.parentServiceId = pServiceId;
		this.parentElementId = pElementId;
		this.elementName = elementName;
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
	 * @return the parentElementId
	 */
	public UUID getParentElementId() {
		return parentElementId;
	}
	/**
	 * @param parentElementId the parentElementId to set
	 */
	public void setParentElementId(UUID parentElementId) {
		this.parentElementId = parentElementId;
	}
	/**
	 * @return the parentServiceId
	 */
	public UUID getParentServiceId() {
		return parentServiceId;
	}
	/**
	 * @param parentServiceId the parentServiceId to set
	 */
	public void setParentServiceId(UUID parentServiceId) {
		this.parentServiceId = parentServiceId;
	}
	
	public String getElementName() {
		return elementName;
	}
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	
	
	
}
