//numbers_inverted_half_pyramid
public class numbers_inverted_half_pyramid{
    public static void main(String args[]){
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            for (int j=1; j<=n; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}