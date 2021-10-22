import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam4 {

	//김대욱
	
	public static void main(String[] args) {
		int count = 1;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000000");
		int[] coord = new int[22];
		//0,1 // 2.3 // 4,5// 6,7
		for(int i = 0 ; i < coord.length ; i++) {
				if(i < 2) {
					
					if(i % 2 == 0) System.out.println("내 좌표 x값을 입력해 주세요.");
					if(i % 2 == 1) System.out.println("내 좌표 y값을 입력해 주세요.");
					coord[i] = sc.nextInt();
				}else {
					if(i % 2 == 0) {
						System.out.println(count + "/10 번째 입력");
						System.out.println("임의의 좌표 x값을 입력해 주세요.");
						count ++;
					}
					if(i % 2 == 1) {
						System.out.println("임의의 좌표 y값을 입력해 주세요.");
					}
					coord[i] = sc.nextInt();
					//xy입력 1회 끝
					//중복좌표 검사
					if(i > 3 && i%2 == 1) {//i가 5부터 홀수일 때
						for(int j = 2; j < i ; j++) {
							if(coord[i-1] == coord[j-1] && coord[i] == coord[j]) {
								System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해주세요");
								i-=2;
								count--;
							}
						}
					}
					//검사 끝
				}
				
		}
		//입력 끝
		double min = 9999999d;
		int minCoord = 0;
		//가장 가까운 거리 저장
		for(int i = 2; i < coord.length-1 ; i++) {
			if(i % 2 == 0) {
				if(min > distance(coord[0],coord[1],coord[i],coord[i+1])) {
				min = distance(coord[0],coord[1],coord[i],coord[i+1]);
				}
			}
		}
		//입력 좌표, 내좌표와의 거리 출력
		for(int i = 2; i < coord.length-1 ; i++) {
			if(i % 2 == 0) {
				System.out.print("(" + coord[i] +", " + coord[i+1] + ") => " + df.format(distance(coord[0],coord[1],coord[i],coord[i+1]))+"\n");
				if(min == distance(coord[0],coord[1],coord[i],coord[i+1])) {
					minCoord = i;
				}
			}
		}
		System.out.println("제일 가까운 좌표 :");
		System.out.print("(" + coord[minCoord] +", " + coord[minCoord+1] + ") => " + df.format(min));
		
	}
	
	public static double distance(int x, int y, int x1, int y1) {
		
		double a = Math.pow((x-x1), 2); // a제곱
		double b = Math.pow((y-y1), 2); // b제곱
		double distance = Math.sqrt(a+b); // c
		
		return distance;
	}
	
}
