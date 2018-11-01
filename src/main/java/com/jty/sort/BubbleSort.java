package com.jty.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 1.O(n^2)
 * 2.需要n-1趟
 * 3.每趟进行j-1-n次判断交换
 */
public class BubbleSort {
	static int[] bubble(int[] data) {
		int len = data.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; i < len - 1 - j; j++) {
				if (data[j] > data[j + 1]) {
					int tmp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = tmp;
				}
			}
		}
		return data;
	}

	public static void main(String[] args) {
		int[] bubble = bubble(new int[]{10, 20, 5, 7, 23, 100, 2000, 1, 3});
		System.out.println(Arrays.toString(bubble));
	}


}
