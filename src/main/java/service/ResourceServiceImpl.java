package service;

import models.ElementModel;
import models.ServiceResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Map;

@Service
public class ResourceServiceImpl implements ResourceService {

	private Map<String, String> urls;

	public ResourceServiceImpl(Map<String, String> urls) {
		this.urls = urls;
	}

	@Override
	public ServiceResult addRecord(ElementModel elementModel) {
		ServiceResult res;

		RestTemplate restTemplate = new RestTemplate();
		try{
			res = restTemplate.postForObject(urls.get("url.resource_controller.add"), elementModel, ServiceResult.class);
		} catch (Exception e) {
			e.printStackTrace();
			res = new ServiceResult(new ArrayList<String>());
		}
		return res;
	}
}
