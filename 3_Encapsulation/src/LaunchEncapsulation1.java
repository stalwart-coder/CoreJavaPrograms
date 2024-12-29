//in java encapsulation whole purpose is to provide data security using getters and setters ,data hiding ,manipulating the data.
class House{
	private int price;
	private String address;
	//setters
	void setPrice(int price) {
		this.price=price;
	}
	void setAddress(String address) {
		this.address=address;
	}
	//getters
	int getPrice() {
		return price;
	}
	String getAddress() {
		return address;
	}
}
public class LaunchEncapsulation1 {

	public static void main(String[] args) {
		House h=new House();
		h.setAddress("ratanpur");
		String addr=h.getAddress();
		System.out.println(addr);
		h.setPrice(10000);
		int p=h.getPrice();
		System.out.println(p);
		
	}

}
