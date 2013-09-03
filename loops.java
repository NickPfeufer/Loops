class loops {
	
	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) { //stopping condition
			System.out.println(x); // print x
			x++; // paradox rectifier			
		};

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		};
		System.out.println("-----------------------------------");
		int y = 45;
		while (y >= 20){
			System.out.println(y);
			y = y-5;
		};
		System.out.println("-----------------------------------");
		for (int j = 24; j <= 68; j = j +2) {
			System.out.println(j);
		};


	}

}