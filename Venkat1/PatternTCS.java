package Java.Mouritech.Venkat1;

//public class PatternTCS {
//
//	public static void main(String[] args) {
//		int num=8;
//		
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=num;j++) {
//				if( j>1 && j<num && i>1 && i<num) {
//				 System.out.print(num-1);
//				}
//				else
//				{
//				System.out.print(num);
//				}
//			}
//			System.out.println();
//		}
//
//	}
//
//}

//88888888
//87777778
//87666678
//87655678
//87655678
//87666678
//87777778
//88888888



public class PatternTCS {

    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                // Determine the value to print based on the minimum distance from the edges
                int value = num - Math.min(Math.min(i - 1, j - 1), Math.min(num - i, num - j));
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
