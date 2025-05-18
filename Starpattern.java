

class Demo{
    public static void main(String[] args) {

        // star pattern 
        //*
        //** 
        //*** 
        for(int i = 1; i <=4 ; i++){
            for(int j = 1 ; j <=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // reverse pattern 
        // ***
        // **
        // *

        int n = 4;

        for(int line = 1 ; line<=n ; line++){
            for(int star = 1 ; star<= n-line+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}


