package com.iqmsoft.webservice;

import javax.jws.WebService;

import org.springframework.stereotype.Component;


@WebService(serviceName = "CommonService", //
		targetNamespace = "http://webservice.leftso.com/", 
		endpointInterface = "com.iqmsoft.webservice.CommonService"
)
@Component
public class CommonServiceImp implements CommonService {

	@Override
	public String sayHello(String name) {

		return "Hello ," + name;
	}

}
