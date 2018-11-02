package com.jty.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
	static int[] select(int[] data) {
		int len = data.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (data[i] > data[j]) {
					int tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
		return data;
	}

	public static void main(String[] args) {
		int[] bubble = select(new int[]{10, 20, 10234, 7, 23, 100, 200, 1, 3});
		System.out.println(Arrays.toString(bubble));
	}


}
