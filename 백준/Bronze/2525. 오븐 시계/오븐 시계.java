import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nowTime = scanner.nextInt();
		int nowMinute = scanner.nextInt();
		int needT = scanner.nextInt();
		
		scanner.close();
		
		int needTime = needT/60;
		int needMinute = needT%60;
		
		if (needMinute >= 60) {
			needTime = needTime + (needT/60);
			needMinute = (needT/60)%60;
		}
		
		int resultTime = 0;
		int resultMinute = 0;
		
		if (nowTime + needTime == 24) {
			resultTime = 0;
			resultMinute = nowMinute + needMinute;
			
			if (resultMinute >= 60) {
				resultTime = resultTime + (nowMinute + needMinute) / 60;
				resultMinute = (resultMinute%60) % 60;
				
				if (resultTime == 24) {
					resultTime = 0;
				} else if (resultTime > 24) {
					resultTime = resultTime - 24;
				}
				
				if (resultMinute == 60) {
					resultMinute = 0;
				} else if (resultMinute > 60) {
					resultMinute = (resultMinute%60) % 60;
				}
			}
		} else if (nowTime + needTime > 24) {
			resultTime = (nowTime + needTime) - 24;
			resultMinute = nowMinute + needMinute;
			
			if (resultMinute >= 60) {
				resultTime = resultTime + ((nowMinute + needMinute) / 60);
				resultMinute = (resultMinute%60) % 60;
				
				if (resultTime == 24) {
					resultTime = 0;
				} else if (resultTime > 24) {
					resultTime = resultTime - 24;
				}
				
				if (resultMinute == 60) {
					resultMinute = 0;
				} else if (resultMinute > 60) {
					resultMinute = (resultMinute%60) % 60;
				}
			}
		} else if (nowTime + needTime < 24) {
			resultTime = nowTime + needTime;
			resultMinute = nowMinute + needMinute;
			
			if (resultMinute >= 60) {
				resultTime = resultTime + (nowMinute + needMinute) / 60;
				resultMinute = (resultMinute%60) % 60;

				if (resultTime == 24) {
					resultTime = 0;
				} else if (resultTime > 24) {
					resultTime = resultTime - 24;
				}
				
				if (resultMinute == 60) {
					resultMinute = 0;
				} else if (resultMinute > 60) {
					resultMinute = (resultMinute%60) % 60;

				}
			}
		}
		
		System.out.println(resultTime + " " + resultMinute);

	}

}
