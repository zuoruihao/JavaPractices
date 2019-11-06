import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	//0到99
	//用户有四次猜的机会,如果猜的大,就说大,如果小就说小
    Random random = new Random(20191030);
	Scanner scanner = new Scanner (System.in);
	int n = random.nexInt(100);
	int times = 4;
	for(int i = 1;i <= times; i++){
		int input = scanner.nexInt();
		if(input == n){
			System.out.println("猜测成功,用了" + i +"次机会");
			return;
		}
		else if(input < n){
			System.out.println("猜小了,用了" + i +"次机会");
			return;
		}
		else{
			System.out.println("猜大了,用了" + i +"次机会");
		}
	}
	System.out.println("机会用完了,可惜");
	System.out.println("数字是" +n);
}
			
		