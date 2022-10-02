public class Factorial {
    static int Fact(int n){
        if(n==1){
            return 1;
        }
        return(Fact(n-1)*n);
    }
    public static void main(String[] args){
        System.out.println(Fact(5));
    }
    
}
