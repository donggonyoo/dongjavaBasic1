package rock_paper_scissors;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 하나 빼 기(자동)");
		
		Player player1 = new Player("동곤유");
		Player player2 = new AutoPlayer("김진원븅신");
		Player[] players = {player1 , player2};
		
		for (Player player : players) {
			if(player instanceof AutoPlayer) {
				System.out.println("=="+player.getName()+"의 덱(자동) ==");
				player.setHand();
			}
			else {
			System.out.println("=="+player.getName()+"의 덱 고르기 ==");
			System.out.println("가위 : 1 || 바위 : 2 ||  보:3");
			System.out.print("첫번째 덱 : ");
			int a = scan.nextInt();
			System.out.print("두번째 덱 : ");
			int b = scan.nextInt();
			player.setHand(a, b);}
		}
		
		
		player1.view();
		player2.view();
		
		
		System.out.println("무작위 섞기의 결과");
		player1.viewResult();
		player2.viewResult();
		
		Winner.winner(player1, player2);

	}
}
