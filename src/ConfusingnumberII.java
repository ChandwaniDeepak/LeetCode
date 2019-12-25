public class ConfusingnumberII {
        int sum = 0;
        int[] map = new int[]{0,1,-1,-1,-1,-1,9,-1,8,6};

        public int confusingNumberII(int n) {
            if(n < 6){
                return 0;
            }
            check(n);
            return sum;
        }

        public void check(int n){
            while(n >= 6){
                if(map[n%10] > -1)
                    if(isMirror(n)){
                        sum++;
                    }
                n--;
            }
        }
        public boolean isMirror(int current){
            int mir = 0;
            int temp = current;
            while(current > 0){
                if(map[current%10] > -1){
                    mir = mir*10 + map[current%10];
                    current = current / 10;
                }else{
                    return false;
                }
            }
            return temp != mir;
        }

}
