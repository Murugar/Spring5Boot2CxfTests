package com.iqmsoft.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.iqmsoft.webservice.CommonService;

public class CxfClient {
	public static void main(String[] args) {
		cl1();
		cl2();
	}

	
	public static void cl1() {
		try {
		
			String address = "http://localhost:8080/services/CommonService?wsdl";
			
			JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
			
			jaxWsProxyFactoryBean.setAddress(address);
		
			jaxWsProxyFactoryBean.setServiceClass(CommonService.class);
			
			CommonService cs = (CommonService) jaxWsProxyFactoryBean.create();
			
			String userName = "iqmsoft";
			
			String result = cs.sayHello(userName);
			System.out.println("Result :" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void cl2() {
		
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient("http://localhost:8080/services/CommonService?wsdl");
		
		Object[] objects = new Object[0];
		try {
			
			objects = client.invoke("sayHello", "iqmsoft");
			System.out.println("Test Result : " + objects[0]);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}
}
