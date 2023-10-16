// class Computer {
//     public void playMusic() {
//         System.out.println("Playing Music...");
//     }

//     public String getMeAPen(int cost) {
//         if(cost>=10)
//           return "Pen";
//         else
//             return "Nothing";
        
        
//     }
// }

public class Hello {
    public static void main(String  a[] ) {
        int nums[][] = new int[3][]; // Jagged Arrays  
          nums[0]= new int[3];
          nums[1] = new int[4];
          nums[2] = new int[2];
         
        for(int i=0; i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++){
            nums[i][j] =(int)(Math.random()* 100);   
        }
    }
        for (int n[]: nums){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
       
        // int nums[] = new int[12];
        // nums[0] = 1;
        // nums[3] = 3;
        // nums[11] = 88;
        // nums[10] = 17;
        // nums[9] = 5;
        // nums[8]= 14;
        // nums[2]=8;
        // for( int i=0; i<=13;i++){
        //     System.out.println(nums[i]);
        // }
        // Computer obj = new Computer();
        // obj.playMusic();
        // String str = obj.getMeAPen(20);
        // System.out.println(str);

        // int num1 = 23;
        // int num2 = 21;
        // Calculator calc = new Calculator();
        // int result = calc.add(num1, num2);

        // int result = num1 + num2;

        // System.out.println();

        // for(int i = 1; i <= 4; i++) {
        //     System.out.println("Day " + i);
        //     for(int j = 1; j <= 9; j++) {
        //         System.out.println(" " + (j + 8) + "-" + (j + 9));
        //     }
        // }
    }
}
