public class hw {

	public int add(int a , int b){

		return (a+b);
	}

	public int subtract(int a , int b){

		return (a-b);
	}

	public int multiply(int a , int b){

		return (a*b);
	}

	public int divide(int a , int b){

		return (a/b);
	}

	public int mod(int a , int b){

		return (a%b);
	}
	
	public int bitand(int a , int b){

		return (a&b);
	}
	
	public int bitor(int a , int b){

		return (a|b);
	}
	
	public int shiftleft(int a , int b){

		return (a<<b);
	}
	
		public int shiftright(int a , int b){

		return (a>>b);
	}
	
		public int bitxor(int a , int b){

		return (a^b);
	}
		
		public int increment(int a){
			a = a++;
			return (a);
		}
		
		public int decrement(int a){
			a = a--;
			return (a);
		}
		
		public int unaryminus(int a){

			a = -a;
			return (a);
		}
		
		public int unaryplus(int a){
			a = +a;
			return (a);
		}
		
		public boolean unarynot(boolean a){
			a = !a;
			return (a);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
