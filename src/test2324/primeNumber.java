package test2324;

public class primeNumber {
    public static void main(String[] args) {
        boolean gass = true;
        for(int i=2; i<=100000;i++){

            for(int j=2; j<i;j++){
                if(i %j==0){
                    gass = false;

                }

            }
            if(gass==true){
                System.out.println(i);
            }
            gass = true;
        }

    }
}
