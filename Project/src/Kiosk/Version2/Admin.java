package Kiosk.Version2;

import java.util.Arrays;
import java.util.Scanner;

public class Admin {

   User u = new User();
   
   
   public void admin() {
      
      
      Scanner sc = new Scanner(System.in);
     
         while(true) {
         
            
            
            System.out.println("==================================================");
            System.out.println("관리자 페이지 입니다.");
            System.out.println("1: 메뉴 변경 2: 가격 변경 3: 재고 추가 4: 메뉴 추가 5: 수익 확인 (종료는 -1)");
            System.out.print("번호를 입력하세요: ");
            int num = sc.nextInt();
            System.out.println("==================================================");

            // 1. 메뉴 변경
            if(num == 1) {
               System.out.print("변경하실 메뉴의 번호를 입력하세요(1~" + Binfo.menu + ") :");
               int i = sc.nextInt();
               System.out.print(Binfo.menuName[i-1] + "를(을) 무엇으로 바꾸시겠습니까? :");
               sc.nextLine();
           
               String name = sc.next();
               System.out.print(name + "의 가격은 얼마입니까? ");
               int v = sc.nextInt();
               System.out.print(name + "의 재고를 몇 개 등록하시겠습니까? : ");
               int n = sc.nextInt();

               Binfo.menuName[i-1] = name;
//               test2 = b.arr.get(i-1).box;
               Binfo.menuPrice[i-1] = v;
               Binfo.menuStock[i-1] = n;
               
               System.out.println("메뉴 변경이 완료되었습니다!");
               System.out.println("메뉴: " + Arrays.toString(Binfo.menuName));
               System.out.println("가격: " + Arrays.toString(Binfo.menuPrice));
               System.out.println("재고: " + Arrays.toString(Binfo.menuStock));
            }
            // 2. 가격 변경
            else if(num == 2) {
               System.out.print("가격을 변경하실 메뉴의 번호를 입력하세요(1~" + Binfo.menu + ") :");
               int i = sc.nextInt();
               System.out.print(Binfo.menuName[i-1] + "의 가격을 얼마로 바꾸시겠습니까? :");
               int j = sc.nextInt();
               Binfo.menuPrice[i-1] = j;
               System.out.println("가격 변경이 완료되었습니다!");
               System.out.println("메뉴: " + Arrays.toString(Binfo.menuName));
               System.out.println("가격: " + Arrays.toString(Binfo.menuPrice));
               System.out.println("재고: " + Arrays.toString(Binfo.menuStock));
            }
            // 3. 재고 추가
            else if(num == 3) {
               System.out.print("재고를 추가하실 메뉴의 번호를 입력하세요(1~" + Binfo.menu + ") :");
               int i = sc.nextInt();
               System.out.print(Binfo.menuName[i-1]+ "를(을) 몇 개 추가 하시겠습니까? :");
               int j = sc.nextInt();
               Binfo.menuStock[i-1] += j;
               System.out.println("재고 추가가 완료되었습니다!");
               System.out.println("메뉴: " + Arrays.toString(Binfo.menuName));
               System.out.println("가격: " + Arrays.toString(Binfo.menuPrice));
               System.out.println("재고: " + Arrays.toString(Binfo.menuStock));
            }
            // 4. 메뉴 추가
//            else if(num == 4) {
//               if(Binfo.menu >= Binfo.MAX - 1) {
//                  System.out.println("더 이상 메뉴가 들어갈 자리가 없습니다!");
//                  continue;
//               }
//               else {
//                  System.out.print("추가하실 메뉴의 가격을 입력하세요 : ");
//                  int i = sc.nextInt();
//                  System.out.print("추가하실 메뉴의 이름을 입력하세요 : ");
//                  sc.nextLine();
//                  String name = sc.next();
//                  System.out.print(name + "의 재고는 몇 개 입니까? : ");
//                  int j = sc.nextInt();
//
//                  b.arr.get(Binfo.menu).box = name;
//                  b.arr.get(Binfo.menu).price = i;
//                  b.arr.get(Binfo.menu).stock = j;
//                  Binfo.menu++;
//                  System.out.println("메뉴 추가가 완료되었습니다!");
//               }
//            }

            // 5. 수익 확인
            else if(num == 5) {
               System.out.println("현재까지의 수익은 " + Binfo.profit + "입니다.");
            }
            // -1을 입력하면 다시 자판기 메뉴로 돌아감
            else if(num == -1) {
               User.user();
               return;
            }
         }
      }

   
   
}