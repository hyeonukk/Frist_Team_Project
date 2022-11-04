package Kiosk;


public class Binfo {


      public static final int MAX = 10; // 메뉴의 최대 갯수 == 10

      // 전역변수 선언

      static int menu = 3; // 메뉴의 총 갯수
      static int menu1 = 0; // 물건1의 수량
      static int menu2 = 0; // 물건2의 수량
      static int menu3 = 0; // 물건3의 수량
      static int[] total =new int[MAX]; 
      static int admin = 1004; // 관리자 메뉴 비밀번호
      static int profit = 0; // 총 수익
      public static int lucky = (int) (Math.random() *20) +1;
//      static Scanner sc = new Scanner(System.in);
     
      static String [] menuName = {"뿌링클", "치바고", "커리퀸"};
      static int [] menuPrice = {19000, 16000, 17000};
      static int [] menuStock = {6, 6, 6};
      static int [] totalPrice = new int[3];
      
      static String menuName2 = "치바고";
      static String menuName3 = "커리퀸";
      
      static int luck = (int) (Math.random() *100) +1;
       
      
}

