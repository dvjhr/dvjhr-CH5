/**
 * challenge
 */
public class tugas1 {
    
    public static void main(String[] args) {
        System.out.println(basic(8));
    }

    public static double basic(int x) {
        // 5 jam pertama = 1
        // >5 jam = 5 + 0.5x
        // 24 jam = 15
        double res;

        if (x >= 24) {
            
            if (x == 24) {

                res = 15;
                return res;

            } else {
                
                //using int to automatically get floor rounding
                int a = x / 24;
                double y = x % 24;

                res = (double) a * 15.0 + (y * 0.5);
                
                return res;
                
            }

        }
        
        double y = (x > 5) ? (x - 5) : 0;
        res = 5 + (y * 0.5);
                
        return res;

    }

}