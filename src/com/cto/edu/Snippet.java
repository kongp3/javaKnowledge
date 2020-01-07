package com.cto.edu;

// 输出菱形
public class Snippet {
	public static void main(String[] args) {
		int i, j, k;
		/* 控制上半部的行数 */
		for (i = 0; i <= 3; i++) {
			/* 打印*号前面的空格 */
			for (j = 0; j <= 2 - i; j++)
				System.out.print(" ");
			/* 打印每行的 **/
			for (k = 0; k <= 2 * i; k++)
				System.out.print("*");
			System.out.println();
		}
		// 下半部分
		for (i = 0; i <= 2; i++) {
			for (j = 0; j <= i; j++)
				System.out.print(" ");
			for (k = 0; k <= 4 - 2 * i; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
