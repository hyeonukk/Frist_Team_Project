package Kiosk.Version1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChickenMain {
   
   public static void main(String[] args) {

      
      // 처음 자판기를 초기화 하는 함수
        SimpleDateFormat asd = new SimpleDateFormat("yyyy년-MM월-dd일 HH:mm:ss");
         Date now = new Date();
         
         String nowTime1 = asd.format(now);
          System.out.println(nowTime1);
      
          
        Chicken b = new Chicken();
      b.initialize();
      b.user();
      return;
      
      
      
   
   }
}