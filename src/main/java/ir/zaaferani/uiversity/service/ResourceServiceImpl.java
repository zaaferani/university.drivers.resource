package ir.zaaferani.uiversity.service;

import ir.zaaferani.uiversity.models.ElementModel;
import ir.zaaferani.uiversity.models.ServiceResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ResourceServiceImpl implements ResourceService {

	private Map<String, String> urls;

	public ResourceServiceImpl(Map<String, String> urls) {
		this.urls = urls;
	}

	@Override
	public ServiceResult addRecord(ElementModel elementRecord) {
		return doRequest(urls.get("url.resource_controller.add"), elementRecord);
	}

	@Override
	public ServiceResult updateRecord(ElementModel elementRecord) {
		return doRequest(urls.get("url.resource_controller.update"), elementRecord);
	}

	@Override
	public ServiceResult deleteRecord(ElementModel elementRecord) {
		return doRequest(urls.get("url.resource_controller.delete"), elementRecord);
	}

	public ServiceResult getResource(UUID serviceId, UUID elementId) {
		Map<String, Object> params = new HashMap<>();
		params.put("serviceId", serviceId);
		if (elementId != null){
			params.put("elementId", elementId);
		}
		return doRequest(urls.get("url.resource_controller.child"), params);
	}

	private ServiceResult doRequest(String url, Object params){
		ServiceResult result;
		RestTemplate restTemplate = new RestTemplate();
		try {
			result = restTemplate.postForObject(url, params, ServiceResult.class);
		}catch (RestClientException e) {
			result = new ServiceResult(new ArrayList<String>());
		}
		return result;
	}
}
