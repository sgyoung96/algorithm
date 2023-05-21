package bak_bronze.setp03;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 백준 알고리즘
 * - 클래스명은 Main 으로 바꿀 것
 * @author gayeong
 *
 */
public class ExitRactangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sc_point_x = sc.nextInt();
		int sc_point_y = sc.nextInt();
		int sc_point_w = sc.nextInt();
		int sc_point_h = sc.nextInt();
		
		if (sc_point_w >= 1 && sc_point_w <= 1000 && 
				sc_point_h >= 1 && sc_point_h <= 1000 &&
				sc_point_x >= 1 && sc_point_x <= sc_point_w - 1 &&
				sc_point_y >= 1 && sc_point_y <= sc_point_h - 1) {
			
//			Point hPoint = new Point(sc_point_x, sc_point_y);
//			Point rPoint0 = new Point(0, 0);
//			Point rPoint1 = new Point(sc_point_w, sc_point_y);
//			
//			int distance0 = distance(hPoint, rPoint0);
//			int distance1 = distance(hPoint, rPoint1);
//			
//			if (distance0 >= distance1) {
//				System.out.println(distance0);
//			} else {
//				System.out.println(distance1);
//			}
			
			ArrayList<Integer> distanceArrs = new ArrayList<Integer>();
			distanceArrs.add(sc_point_x);
			distanceArrs.add(sc_point_y);
			distanceArrs.add(sc_point_w - sc_point_x);
			distanceArrs.add(sc_point_h - sc_point_y);
			
			Collections.sort(distanceArrs);
			int shortestDistance = distanceArrs.get(0);
			
			System.out.println(shortestDistance);
			
		} else {
			System.out.println("좌표값이 제한 범위를 벗어남");
		}
	}
	
	public static int distance(Point inputP1, Point inputP2) {
		int x1 = (int) inputP1.getX();
		int y1 = (int) inputP1.getY();
		
		int x2 = (int) inputP2.getX();
		int y2 = (int) inputP2.getY();
		
		int rX = x1 - x2;
		int rY = y1 - y2;
		
		double result = Math.sqrt((rX * rX) * (rY * rY));
		
		return (int) Math.round(result);
	}
	
}
