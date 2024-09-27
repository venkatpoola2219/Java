package Java.Mouritech.venkat;

class PrimeNumber {

    public static void main(String[] args) {int s=0;
        for (int num = 1; num <= 100; num++) {
            int count = 0; 
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
            	s++;
                System.out.print(num+" ");
            } 
        }
        System.out.println("\nTotal no.of prime no's in 1 to 100 is ="+s);    
    }
}
