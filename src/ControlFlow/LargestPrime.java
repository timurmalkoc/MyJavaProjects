package ControlFlow;

public class LargestPrime {
    public static void main(String[] args) {
        //System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        //System.out.println(getLargestPrime(0));
    }
    public static int getLargestPrime(int number){
        if (number >1)
        {
            int prime=2;
            int flag =0;
            int current = number;
            int bigPrime = prime;
            for (int i=2; i<=current;){
                // check prime
                for (int j=2; j<i;j++){
                    if (i % j == 0){
                        flag = 0;
                        break;}
                    else {
                        flag =1;
                    }
                }

                // find largest divisible number
                if (current % i == 0 && flag ==1){
                    current /= i;
                    bigPrime = i;
                    //System.out.println("current "+ current);
                    //System.out.println("divisible prime "+i);
                }
                else
                    i++;

                if (flag == 1)
                    prime = i;
                flag = 0;

            }
            return bigPrime;
        }
        return -1;
    }
}
