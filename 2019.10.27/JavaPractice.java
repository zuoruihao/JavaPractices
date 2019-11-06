public class JavaPractice {
	public static void main(String[] args) {
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args.length);
		*/
				if (args.length < 2) {
			System.out.println("请输入两个数字");
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int result = x + y;
		System.out.println(
		    "" + x + " + " + y + " 相加的结果是 " + result);
	}
}