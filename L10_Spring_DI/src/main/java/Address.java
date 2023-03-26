
public class Address {
	
	private String street;
	private String block;
	private String pinCode;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	

	public void print() {
		System.out.println("Address :"+street+" "+block+" "+pinCode+" ");
	}
}
