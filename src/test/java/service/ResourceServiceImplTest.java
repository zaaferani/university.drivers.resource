package service;

import ir.zaaferani.uiversity.models.ElementModel;
import ir.zaaferani.uiversity.models.ServiceResult;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Zaaferani on 01/02/2017.
 *
 */
public class ResourceServiceImplTest {
    @org.junit.Test
    public void addRecord() throws Exception {
        Map<String, String> f = new HashMap<>();
        f.put("url.resource_controller.add", "http://localhost:8081/university.rc1/add");
        ResourceService service = new ResourceServiceImpl(f);
        ServiceResult m = service.addRecord(
                new ElementModel(UUID.randomUUID(), UUID.randomUUID(),"jTest", null, null)
        );
        System.out.print(m.getModel().toString());
    }

}