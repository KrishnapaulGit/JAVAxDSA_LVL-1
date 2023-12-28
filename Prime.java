// //Number divided by 1 or same number

// import java.util.Scanner;

// class Prime{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();

//         for(int i =1;i<=t;i++){
//             int num = sc.nextInt();

//         //    if only divided only 2 times then prime

//         int count=0;

//         for(int div = 1; div<=num;div++){
//             if(num%div ==0){
//                 count++;
//             }
//         }

//         if(count ==2){
//             System.out.println("Prime");
//         }else{
//             System.out.println("Not Prime");
//         }
//         }

        

//     }
// }

//Number divided by 1 or same number

import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i =1;i<=t;i++){
            int num = sc.nextInt();

        //    if only divided only 2 times then prime

        int count=0;

        for(int div = 2; div*div<=num;div++) // div < root(n)
        {
            if(num%div==0){
                count++;
                break;
            }
        }

        if(count ==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        }

        

    }
}