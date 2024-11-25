class EvenAndOddNumber {
    public static void main(String[] args) {
    	int num = Integer.parseInt(args[0]);
    	
        if (num % 2 == 0) {
            System.out.print("It's an even number.");
        } else {
            System.out.print("It's an odd number.");
        }
    }
}