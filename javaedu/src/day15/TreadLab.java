package day15;

public class TreadLab {
	public static void main(String[] args) throws Exception {		
		
		Thread1 threadA = new Thread1();
		Thread2 threadB = new Thread2();
		Thread3 threadC = new Thread3();
		Thread4 threadD = new Thread4();
		
		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();
		threadA.join(); 
		threadB.join();
		threadC.join();
		threadD.join();		
		
		System.out.println("MAIN 수행 종료");
	}	
}

class Thread1 extends Thread {
		char A = 'A';
		char L = 'L';
		public Thread1() {
			setName("Thread1");
		}

		public void run() {
			for (int i = 0; i <L-A ; i++) {
				try {
					System.out.println((char)(A+i));
					Thread.sleep(2000);
				} catch (Exception e) {
					
			}
		}		
	}
}
	class Thread2 extends Thread {
		char a = 'a';
		char h = 'h';
		public Thread2() {
			setName("Thread2");
		}

		public void run() {
			for (int i = 0; i <h-a ; i++) {
				try {
					System.out.println((char)(a+i));
					Thread.sleep(3000);
				} catch (Exception e) {
					
				}
			}		
		}
	}
	class Thread3 extends Thread {
		public Thread3() {
			setName("Thread3");
		}

		public void run() {
			for (int i = 1; i <=30 ; i++) {
				try {
					System.out.println(i);
					Thread.sleep(1000);
				} catch (Exception e) {
				
				}
			}		
		}
	}
	class Thread4 extends Thread {		
		public Thread4() {
			setName("Thread4");
		}

		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
				System.out.println("JAVA");
				Thread.sleep(5000);
				} catch (Exception e) {
					
				}
			}		
		}
	}
