class Wallet{
	private double money;
	private int IDnumber;


	public Wallet(double inputMoney, int inputIDnumber){
		money = inputMoney;
		IDnumber = inputIDnumber;

	}

	public void setMoney(double setMoney){
		money = setMoney;
	}

	public void setIDnumber(int setID){
		IDnumber = setID;
	}


	public double getMoney(){
		return money;
	}

	public int getIDnumber(){
		return IDnumber;
	}


	public void payDay(double amountIn){
		money = money + amountIn;

	}

	public void pay(double amountOut){
		money = money - amountOut;


	}

}

class Pset3{
	public static void main(String[] args) {
		Wallet wallet = new Wallet(10000.0, 4837895);

		System.out.println("Initial Money: " + wallet.getMoney());
		System.out.println("Initial ID: " + wallet.getIDnumber());

		wallet.payDay(7000.0);
		System.out.println("After payday: " + wallet.getMoney());

		wallet.pay(5000.0);
		System.out.println("After pay: " + wallet.getMoney());


		Rectangle rectangle = new Rectangle(1.0, 3.0);
		System.out.println("Area of this rectangle is: " + rectangle.area());

		Circle circle = new Circle(3.0);
		System.out.println("Area of this circle is: " + circle.area());
	}
}

class Shape{
	public double area(){
		return 0.0;

	/*
	public Shape(){

	}
	*/
	}
}

class Rectangle extends Shape{
	double length;
	double width;

	public Rectangle(double l, double w){
		length = l;
		width = w;
	}

	public double area(){
		return length*width;
	}
}

class Circle extends Shape{
	double radius;

	public double area(){
		return radius * radius * 3.142;
	}

	public Circle(double r){
		radius = r;
	}


}



