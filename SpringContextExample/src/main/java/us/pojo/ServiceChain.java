package us.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServiceChain implements Service {

	private List<Service> services;
	
	public ServiceChain(List<Service> services) {
		this.services = new ArrayList<Service>(services);
	}
	
	public String doSomething() {
		StringBuilder buf = new StringBuilder();
		for (Service service : services) {
			buf.append(service.doSomething());
		}

		return buf.toString();
	}

}
