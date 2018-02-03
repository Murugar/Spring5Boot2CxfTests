package com.iqmsoft.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(name = "CommonService", //
		targetNamespace = "http://webservice.leftso.com/"// 
)
public interface CommonService {
	@WebMethod
	@WebResult(name = "String", targetNamespace = "")
	public String sayHello(@WebParam(name = "userName") String name);

}
