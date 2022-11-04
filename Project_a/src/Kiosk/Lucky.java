package Kiosk;

public class Lucky {

    public static void lotto() {

         System.out.println("====================");
         System.out.println("추첨을 돌리겠습니다!");

         int luckyAnswer = (int) (Math.random() *20) +1;
         if(Binfo.luck ==  luckyAnswer) {
            System.out.println("당첨되었습니다!!");
         }else {
            System.out.println("꽝입니다");
         }
         System.out.println("====================");
      }

   }
