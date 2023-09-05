package day14;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
public class SerialTest1 {
   public static void main(String[] args) throws Exception{ 
      FileOutputStream fos = 
    		  new FileOutputStream("c:/iotest/test1.ser"); //없으면 새로 만들어줌 폴더는 안만들어줌
      ObjectOutputStream oos = 
    		  new ObjectOutputStream(fos); // 
      oos.writeObject(new Date()); //현재 시간을 가지는 객체
      Thread.sleep(3000);
      oos.writeObject(new Date());      
      oos.close();
      fos.close();
      System.out.println("직렬화 출력 완료");      
   }
}



