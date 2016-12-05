package org.dubbo.test.console.service;

import org.dubbo.test.api.service.RegistApiService;
import org.springframework.stereotype.Service;

@Service
public class RegistApiServiceImpl implements RegistApiService{

	public String registerService(String name) {
		return "this is register service is:"+name;
	}

}
  