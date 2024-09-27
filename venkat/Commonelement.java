package Java.Mouritech.venkat;

public class Commonelement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2,3};

        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                	 System.out.println(array[i]);
                }
            }
        }
    }


}
