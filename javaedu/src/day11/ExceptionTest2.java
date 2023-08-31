package day11;
public class ExceptionTest2 {
	public static void main(String[] args){
		System.out.println("수행시작");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("연산 결과 : "+result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 아규먼트를 2 개 전달하세요!!");
		} catch (ArithmeticException e) {
		 System.out.println(e.getMessage());
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달하세요!!");
			return; // main 메서드에서 return 은 프로그램을 종료하겠다는 의미
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("프로그램 아규먼트로 숫자를 전달하세요!!");
		}  catch (Exception e) { //Exception 은 모든 예외의 조상이므로 어떤 예외던 잡을 수 있음 다형성의 일종
			System.out.println("예외 발생!!---"+e);
		}finally { // 무조건 수행
			System.out.println("항상 수행!!");
		}
		System.out.println("수행종료");
	}
}
