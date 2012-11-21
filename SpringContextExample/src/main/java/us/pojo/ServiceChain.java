package us.pojo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceChain implements Service {

	private static final Logger log = LoggerFactory.getLogger(ServiceChain.class);
	
	private List<Service> services;
	
	public ServiceChain(List<Service> services) {
		this.services = new ArrayList<Service>(services);
	}
	
	public String doSomething() {
		log.info("Service Chain starting.");
		StringBuilder buf = new StringBuilder();
		for (Service service : services) {
			buf.append(service.doSomething());
		}

		log.info("Service Chain finished.");
		return buf.toString();
	}

}
