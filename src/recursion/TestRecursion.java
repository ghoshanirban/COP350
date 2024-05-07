package recursion;

public class TestRecursion {
    public static int doSomething(int i){
        if( i == 0 )
            return 1;
        else if ( i % 2 == 0 )
            return 2 + doSomething(i-1);
        else
            return 1 + doSomething(i-1);

    }

    public static int mystery( int a, int b ) {
        return (a == 0) ?  b :  mystery(a - 1, b + 1);
    }

    public static void main(String[] args) {
        //for(int i = 0; i < 10; i++)
            System.out.println( mystery(2,4) );
    }
}
