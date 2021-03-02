package calculator;



public class Calculator {
	 int num1;
	 int num2;
    public static int resault;
	
	public int get_num1() {
		return num1;
		
	}
    public  int cal() {
		resault=num1+num2;
		return resault;
	}

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.num1=9;
		obj.num2=7;
		obj.cal();
		System.out.println(obj.cal());
		

	}

}
