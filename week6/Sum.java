public class Sum implements Runnable {
	static final int MAX = 400000000;
	static final int NT = 1;
	static int id = 0;
	static long sum = 0;

	public void run() {
		long local_sum = 0;
		long start,end;
		
		// setting start point
		// 쓰레드들이 선착순으로 계산할 구간을 찜한다. 
		synchronized(this) {
			start = (MAX/NT) * id + 1;
			end = MAX/NT * (id + 1);
			id++;
		}

		for (long i=start ; i <= end ; i++) {
			local_sum += i;
		}
	
		sum += local_sum;
	}

	public static void main(String[] args) throws InterruptedException {
		Sum test = new Sum();
		Thread[] at = new Thread[NT];

		for(int i=0; i<NT; i++) {
			at[i]= new Thread(test);
			at[i].start();
		}

		for(Thread t:at)
			t.join();
		
		System.out.println(test.sum);
	}
}			
