package Kiosk.Version2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class User {

   


   public static void user() {

      int money = 0;
      Scanner sc = new Scanner(System.in);

      Lucky l = new Lucky();
      
      while(true) {   
         try {

            System.out.println("==================================================");
            System.out.println("어서오세요!! 치킨 키오스크 입니다");
            // 번호:메뉴(가격) - 재고 출력
            for(int i = 1 ; i <= Binfo.menu; i++) {


               System.out.print( i + ":" + Binfo.menuName[i-1] + "(" + Binfo.menuPrice[i-1] + "W)-" + Binfo.menuStock[i-1] + "개   ");



            }

            System.out.println();
            System.out.println("==================================================");


            System.out.print("무엇을 구매하시겠습니까?>");
            int num = sc.nextInt();

            if(num == 1) {
               //if(stock[0] ==0) {
               if(Binfo.menuStock[0] == 0) {
                  System.out.println(Binfo.menuName[0] + "의 재고가 부족합니다");

               }else {

                  System.out.println(Binfo.menuName[0] + "를 선택하셨습니다");
                  Binfo.menu1++;
                  Binfo.menuStock[0]--;
                  System.out.println(Binfo.menuName[0] + Binfo.menu1 + "개, " + Binfo.menuName[1] + Binfo.menu2 + "개, " + Binfo.menuName[2] + Binfo.menu3 + "개");
                  System.out.println("주문금액: " + (Binfo.menu1 * Binfo.menuPrice[0] + Binfo.menu2 * Binfo.menuPrice[1] + Binfo.menu3 * Binfo.menuPrice[2]) + "원");
               }
            }else if(num ==2) {
               if(Binfo.menuStock[1] ==0) {
                  System.out.println(Binfo.menuName[1] + "의 재고가 부족합니다");   
               }
               System.out.println(Binfo.menuName[1] + "를 선택하셨습니다");
               Binfo.menu2++;
               Binfo.menuStock[1]--;
               System.out.println(Binfo.menuName[0] + Binfo.menu1 + "개, " + Binfo.menuName[1] + Binfo.menu2 + "개, " + Binfo.menuName[2] + Binfo.menu3 + "개");
               System.out.println("주문금액: " + (Binfo.menu1 * Binfo.menuPrice[0] + Binfo.menu2 * Binfo.menuPrice[1] + Binfo.menu3 * Binfo.menuPrice[2]) + "원");
            }else if(num == 3) {
               if(Binfo.menuStock[2] ==0) {
                  System.out.println(Binfo.menuName[2] + "의 재고가 부족합니다");
                  break;}
               System.out.println(Binfo.menuName[2] + "를 선택하셨습니다.");
               Binfo.menu3++;
               Binfo.menuStock[2]--;
               System.out.println(Binfo.menuName[0] + Binfo.menu1 + "개, " + Binfo.menuName[1] + Binfo.menu2 + "개, " + Binfo.menuName[2] + Binfo.menu3 + "개");
               System.out.println("주문금액: " + (Binfo.menu1 * Binfo.menuPrice[0] + Binfo.menu2 * Binfo.menuPrice[1] + Binfo.menu3 * Binfo.menuPrice[2]) + "원");
            }else if(num == 1004) {
               Admin ad = new Admin();
               ad.admin();
               return;
            }else {
               System.out.println("범위 이탈하였습니다. 1~3번에서만 선택하세요.");
            }


            


            //영수증 출력
            System.out.println("1: 계속 구매하기 2: 결제하기 ");
            System.out.print("번호를 입력하세요: ");
            int num1 = sc.nextInt();

            if(num1 == 1) {
               System.out.println("주문금액: " + (Binfo.menu1 * Binfo.menuPrice[0] + Binfo.menu2 * Binfo.menuPrice[1] + Binfo.menu3 * Binfo.menuPrice[2]) + "원");
               continue;
            }

            else if(num1 == 2) {

               System.out.println();
               System.out.println("=======<영수증>=======");


               SimpleDateFormat asd = new SimpleDateFormat("yyyy년-MM월-dd일 HH:mm:ss");
               Date now = new Date();

               String nowTime1 = asd.format(now);
               System.out.println(nowTime1);
               int sum = (Binfo.menu1 * Binfo.menuPrice[0] + Binfo.menu2 * Binfo.menuPrice[1] + Binfo.menu3 * Binfo.menuPrice[2]);
               System.out.println("-------------------");
               System.out.println(Binfo.menuName[0] + Binfo.menu1 * Binfo.menuPrice[0]);
               System.out.println(Binfo.menuName[1] + Binfo.menu1 * Binfo.menuPrice[0]);
               System.out.println(Binfo.menuName[2] + Binfo.menu1 * Binfo.menuPrice[0]);
                  
               System.out.println("총 금액: " +  (Binfo.menu1 * Binfo.menuPrice[0] + Binfo.menu2 * Binfo.menuPrice[1] + Binfo.menu3 * Binfo.menuPrice[2]));
               System.out.println("-------------------");
               
               Binfo.profit += sum;

               if(sum > 50000) {
                     int lucky = (int) (Math.random() *100) +1;
                     Binfo.luck = lucky;
                  System.out.println("                    추첨번호:" + Binfo.luck);
                  Lucky.lotto();
               }



               System.out.println();
               System.out.println("감사합니다! 다음에 또 이용해주세요!!");
               break;
            }
            else {
               System.out.println("범위 이탈하였습니다. 1~2번에서만 선택하세요.");
            }


         } catch (Exception e) {
            System.out.println("숫자만 입력하세요");
            sc.nextLine();
         }
      }
   }
   
   

}
