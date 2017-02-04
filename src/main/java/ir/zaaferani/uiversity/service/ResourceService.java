
package ir.zaaferani.uiversity.service;

import ir.zaaferani.uiversity.models.ElementModel;
import ir.zaaferani.uiversity.models.ServiceResult;

import java.util.UUID;

public interface ResourceService {

    ServiceResult addRecord(ElementModel elementRecord);
    ServiceResult updateRecord(ElementModel elementRecord);
    ServiceResult deleteRecord(ElementModel elementRecord);
//    ServiceResult getRecord(ElementModel elementRecord);
//    ServiceResult getParents(ResourceModel resourceModel);
//    ServiceResult getChild(ElementModel elementModel);
    ServiceResult getResource(UUID serviceId, UUID elementId);
}
