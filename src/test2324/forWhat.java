package test2324;

public class forWhat {
    public static void main(String[] args) {
        int a ;
        for (a=1;a<151;a--){
           System.out.print(a);
           if(a%3==0){
               System.out.print("foo");
           }
            if(a%5==0){
                System.out.print("biz");
            }
            if(a%7==0){
                System.out.print("baz");
            }
            System.out.println();
        }
    }
}
