package DSA;

public class movieticket {
	
	private int movticketprice;
	private String movname;

	public int getmovticketprice() {
		return movticketprice;
	}

	public void setmovticketprice(int movticketprice) {
		this.movticketprice = movticketprice;
	}
	public String getmovname() {
		return movname;
	}
	
	public void setmovname(String movname) {
		this.movname = movname;
	}
	
		public static void main(String args[]) {
			movieticket mov = new movieticket();
			
			mov.setmovticketprice(500);
			mov.setmovname("pushpa");
			
			System.out.println("enter movie ticket price: " + mov.getmovticketprice());
			System.out.println("enter movie name: " + mov.getmovname());

			
			
		}
	}

