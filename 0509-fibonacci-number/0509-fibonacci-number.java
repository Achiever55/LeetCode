class Solution {
    public int fib(int n) {
        int fib0 = 0;
        int fib1 = 1;
        if( n ==0 ) return 0;
        if(n == 1) return 1;
        int fibonacci = fib(n -1) + fib( n-2);
        return fibonacci;
    }
}