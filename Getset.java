package s.p.r;
    //-----   encapculation----
class B{
	private int amount;
	private String name;
	private int password;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}


public class Getset {

	public static void main(String[] args) {
       B ao=new B();
         ao.setAmount(10000);
         System.out.println(ao.getAmount());
         
         ao.setName("Mansi");
         System.out.println(ao.getName());
         
         ao.setPassword(805537);
         System.out.println(ao.getPassword());
	}

}
