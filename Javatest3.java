public class Javatest3 {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            int value;

            
            if (i % 2 == 0) {
                value = 0;
            } else {
                value = 1;
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(value + " ");

                
                if (value == 0) {
                    value = 1;
                } else {
                    value = 0;
                }
            }

            System.out.println();
        }
    }
}