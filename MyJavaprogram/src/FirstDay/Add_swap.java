package FirstDay;

public class Add_swap {

	int a = 1, b = 4, c;

	public void sum() {
		c = a + b;
		System.out.println("Addition is" + c);
	}

	public void sum1() {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of a = " +a +" || "+ "value of b = " +b );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add_swap add = new Add_swap();
		add.sum();
		add.sum1();

	}

}
