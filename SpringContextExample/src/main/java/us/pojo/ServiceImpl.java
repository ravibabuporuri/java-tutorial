package us.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceImpl implements Service {

	private static final Logger log = LoggerFactory.getLogger(ServiceImpl.class);
	
	private String toSay;
	
	public ServiceImpl(String toSay) {
		this.toSay = toSay;
	}
	
	@Override
	public String doSomething() {
		log.info("ServiceImpl says: {}", toSay);
		return toSay;
	}

}
