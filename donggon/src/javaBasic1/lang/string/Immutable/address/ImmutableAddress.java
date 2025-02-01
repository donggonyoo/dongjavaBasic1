package javaBasic1.lang.string.Immutable.address;

import java.util.Objects;

public class ImmutableAddress {
	final private String address;
	
	public ImmutableAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ImmutableAddress [address=" + address + "]";
	}

	public String getAddress() {
		return address;
	}

	
	

}
