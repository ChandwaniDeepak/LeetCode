public class Pow50 {
    public double myPow(double x, int n) {

        long N = n;
        if(n < 0){
            x = 1/x;
            N=-N;
        }

        double res = myHalf(x, N);
        return res;
    }

    public double myHalf(double x, long n){
        if(n == 0){
            return 1;
        }

        if(x == 1.0){
            return 1;
        }

        double half = myHalf(x, n/2);

        if(n%2 ==0){
            return half * half;
        }else{
            return half * half * x;
        }
    }
}
