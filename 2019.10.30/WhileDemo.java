public class InAndOut {
    public static void main(String[] args){
		Sanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String s = scanner.nextLine();
			System.out.println(s);
		}
	}
}