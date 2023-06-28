package Viernes;

public class Pino {
	 public static void main(String[] args) {
	        int niveles = 8;

	        for (int i = 0; i < niveles; i++) {

	        	for (int j = 0; j < niveles - i - 1; j++) {
	                System.out.print(" ");
	            }

	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("+");
	            }

	            System.out.println();
	        }
            System.out.println("      |||\n      |||\n      |||\n");

	        }
	    }
