

class  Calc02
{
	public static void main(String[] args) 
	{
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int div =  a/b;
		System.out.println(div);
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println("ArrayIndexOutOfBoundsException Check args");
		}catch(NumberFormatException b){
			System.out.println("NumberFormatException Check args");
		}catch(ArithmeticException c){
			System.out.println("ArithmeticException Check args");
		}
	}
}
