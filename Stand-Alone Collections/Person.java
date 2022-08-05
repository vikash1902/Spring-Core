package standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friend;
	
	private Map<String,Integer> feestructure;
	
	private Properties properties;

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}
	
	
	

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + ", feestructure=" + feestructure + ", properties=" + properties + "]";
	}
}
