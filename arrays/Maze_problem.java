//package arrays;
//
//import java.util.Scanner;
//
//public class Maze_problem {
//
//	static boolean Function(int arr[][], int rows, int cols) {
//
//		int a = arr[rows][cols];
//
//		for (int i = 0; i < rows; i++) {
//			int temp[][];
//			for (int j = 0; j < cols; j++) {
//				if (arr[i][j] == 1) {
//					if (temp[i][j] < arr[i][j]) {
//						temp = arr[i][j];
//					}
//				}
//			}
//			if(temp[i][j] == a) return true;
//		}
//		
//		return false;
//	}
//
//	
//	
//	
//	
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter the size of rows : ");
//		int rows = sc.nextInt();
//
//		System.out.print("Enter the size of cols : ");
//		int cols = sc.nextInt();
//
//		int[][] arr = new int[rows][cols];
//
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//
//		System.out.println(Function(arr, rows, cols) ? "Cat can escape" : "Cat cannot escape");
//
//		sc.close();
//	}
//}
