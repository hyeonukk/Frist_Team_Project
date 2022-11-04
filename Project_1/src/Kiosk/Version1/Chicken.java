package Kiosk.Version1;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Chicken {

   public static final int MAX = 10; // 메뉴의 최대 갯수 == 10

   // 전역변수 선언
   static String[] box = new String[MAX];
   static int[] price = new int[MAX];
   static int[] stock = new int[MAX];
   static int count = 3; // 메뉴의 갯수
   static int count1 = 0; // 뿌링클의 수량
   static int count2 = 0; // 치바고의 수량
   static int count3 = 0; // 커리퀸의수량
   static int[] total =new int[MAX]; 
   static int admin = 1004; // 관리자 메뉴로 가는 비밀번호
   static int profit = 0; // 총 수익
   public static int lucky = (int) (Math.random() *5) +1;
   static Scanner sc = new Scanner(System.in);



   public static void initialize() {
      box[0] = "뿌링클";
      price[0] = 19000;
      stock[0] = 6;
      box[1] = "치바고";
      price[1] = 16000;
      stock[1] = 6;
      box[2] = "커리퀸";
      price[2] = 17000;
      stock[2] = 6;
   }

   // 관리자 페이지를 담당하는 함수
   public static void admin() {
      while(true) {
         System.out.println("==================================================");
         System.out.println("관리자 페이지 입니다.");
         System.out.println("1: 메뉴 변경 2: 가격 변경 3: 재고 추가 4: 메뉴 추가 5: 수익 확인 (종료는 -1)");
         System.out.print("번호를 입력하세요: ");
         int num = sc.nextInt();
         System.out.println("==================================================");

         // 1. 메뉴 변경
         if(num == 1) {
            System.out.print("변경하실 메뉴의 번호를 입력하세요(1~" + count + ") :");
            int i = sc.nextInt();
            System.out.print(box[i-1] + "를(을) 무엇으로 바꾸시겠습니까? :");
            sc.nextLine();
            String name = sc.next();
            System.out.print(name + "의 가격은 얼마입니까? ");
            int v = sc.nextInt();
            System.out.print(name + "의 재고를 몇 개 등록하시겠습니까? : ");
            int n = sc.nextInt();

            box[i-1] = name;
            price[i-1] = v;
            stock[i-1] = n;
            System.out.println("메뉴 변경이 완료되었습니다!");
         }
         // 2. 가격 변경
         else if(num == 2) {
            System.out.print("가격을 변경하실 메뉴의 번호를 입력하세요(1~" + count + ") :");
            int i = sc.nextInt();
            System.out.print(box[i-1] + "의 가격을 얼마로 바꾸시겠습니까? :");
            int j = sc.nextInt();
            price[i-1] = j;
            System.out.println("가격 변경이 완료되었습니다!");
         }
         // 3. 재고 추가
         else if(num == 3) {
            System.out.print("재고를 추가하실 메뉴의 번호를 입력하세요(1~" + count + ") :");
            int i = sc.nextInt();
            System.out.print(box[i-1] + "를(을) 몇 개 추가 하시겠습니까? :");
            int j = sc.nextInt();
            stock[i-1] += j;
            System.out.println("재고 추가가 완료되었습니다!");
         }
         // 4. 메뉴 추가
         else if(num == 4) {
            if(count >= MAX - 1) {
               System.out.println("더 이상 메뉴가 들어갈 자리가 없습니다!");
               continue;
            }
            else {
               System.out.print("추가하실 메뉴의 가격을 입력하세요 : ");
               int i = sc.nextInt();
               System.out.print("추가하실 메뉴의 이름을 입력하세요 : ");
               sc.nextLine();
               String name = sc.next();
               System.out.print(name + "의 재고는 몇 개 입니까? : ");
               int j = sc.nextInt();

               box[count] = name;
               price[count] = i;
               stock[count] = j;
               count++;
               System.out.println("메뉴 추가가 완료되었습니다!");
            }
         }

         // 5. 수익 확인
         else if(num == 5) {
            System.out.println("현재까지의 수익은 " + profit + "입니다.");
         }
         // -1을 입력하면 다시 자판기 메뉴로 돌아감
         else if(num == -1) {
            user();
            return;
         }
      }
   }

   // 유저 인터페이스를 담당하는 함수
   public static void user() {
      Boolean first = true;
      int money = 0;

      while(true) {   
         try {

            System.out.println("==================================================");
            System.out.println("어서오세요!! 치킨 키오스크 입니다");
            // 번호:메뉴(가격) - 재고 출력
            for(int i = 0 ; i < count; i++) {
               System.out.print((i+1) + ":" + box[i] + "(" + price[i] + "W)-" + stock[i] + "개   ");
            }

            System.out.println();
            System.out.println("==================================================");


            System.out.print("무엇을 구매하시겠습니까?>");
            int num = sc.nextInt();

            if(num == 1) {
               if(stock[0] == 0) {
                  System.out.println(box[0]+"의 재고가 부족합니다");

               }else {

                  System.out.println("뿌링클를 선택하셨습니다");
                  count1++;
                  stock[0]--;}
            }else if(num ==2) {
               if(stock[1] == 0) {
                  System.out.println(box[1]+"의 재고가 부족합니다");

               }else {

                  System.out.println("치바고를 선택하셨습니다");
                  count2++;
                  stock[1]--;}
            }else if(num == 3) {
               if(stock[2] == 0) {
                  System.out.println(box[2]+"의 재고가 부족합니다");

            }
            System.out.println("커리퀸를 선택하셨습니다.");
            count3++;
            stock[2]--;                
         }else if(num == 1004) {
            admin();
            return;
         }else {
            System.out.println("범위 이탈하였습니다. 1~3번에서만 선택하세요.");
         }


         total[0]=count1;
         total[1]=count2;
         total[2]=count3;



         //영수증 출력
         System.out.println("1: 계속 구매하기 2: 결제하기 ");
         System.out.print("번호를 입력하세요: ");
         int num1 = sc.nextInt();

         if(num1 == 1) {
            continue;
         }

         else if(num1 == 2) {

            System.out.println();
            System.out.println("=======<영수증>=======");


            SimpleDateFormat asd = new SimpleDateFormat("yyyy년-MM월-dd일 HH:mm:ss");
            Date now = new Date();

            String nowTime1 = asd.format(now);
            System.out.println(nowTime1);

            System.out.println("-------------------");
            System.out.println("      메뉴        가격       수량        ");
            System.out.println("-------------------");
            for(int i =0; i < count; i++ ) {
               if( total[i] !=0) {
                  System.out.printf("%8s"  +"%10s" + "%8s", box[i], price[i], total[i]);
                  System.out.println();
               }

            }

            System.out.println("===================");
            int sum = (price[0]*total[0]) + (price[1]*total[1]) + (price[2]*total[2]);


            System.out.printf("                    총 합계" +" %s" , sum);
            System.out.println();

            if(sum >= 50000) {
               //                int lucky = (int) (Math.random() *100) +1;
               System.out.println("                    추첨번호:" + lucky);
               Lucky();
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



public static void Lucky() {

   System.out.println("====================");
   System.out.println("추첨을 돌리겠습니다!");

   int luckyAnswer = (int) (Math.random() *5) +1;
   if(lucky ==  luckyAnswer) {
      System.out.println("당첨되었습니다!!");
   }else {
      System.out.println("꽝입니다");
   }
   System.out.println("====================");
}

}