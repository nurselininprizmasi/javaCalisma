	package bolum1;
	
	
	public class Dikdortgen {
		int i,j;
	//	public static void main(String[] args) {
	//		Dikdortgen dik = new Dikdortgen();
	//		dik.dortgendesen();
	//	}
		public void ddortgendesen(){
			for (i = 0; i < 3; i++) { //satýr sayýsý
				System.out.print("     *");
				if (i==2){
					for (j = 0; j <7; j++) {
						System.out.print("*");
				}}
					else{
				for (j = 0; j <7; j++) {
				System.out.print(" ");
				}
			}
				System.out.println("*");
			}
		}
	}
