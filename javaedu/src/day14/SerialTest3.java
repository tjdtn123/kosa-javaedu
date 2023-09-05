package day14;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import day7.Student2;

public class SerialTest3 {
   public static void main(String[] args) throws Exception{ 
      FileOutputStream fos = 
    		  new FileOutputStream("c:/iotest/test2.ser"); 
      ObjectOutputStream oos = 
    		  new ObjectOutputStream(fos);
      oos.writeObject(new Date());
      Thread.sleep(3000);
      oos.writeObject(new Date()); 
      Student2 st = new Student2("duke", 27, "Java프로그래밍");
      oos.writeObject(st); // Student2는 Serializable을 상속 하고 있지 않기 때문에
      oos.close();
      fos.close();
      System.out.println("직렬화 출력 완료");      
   }
}



