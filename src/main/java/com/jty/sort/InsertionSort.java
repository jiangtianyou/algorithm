package com.jty.sort;

import java.util.Arrays;

public class InsertionSort {
	static int[] insertion(int[] data) {
		int len = data.length;
		for (int i = 1; i < len; i++) {

			int key = data[i];
			int j = i -1;
			// 进行位置移动
			while (j >= 0 && data[j] > key) {
				data[j+1] = data[j];
				j--;
			}
			// 将最左的无序元素插入到合适位置
			data[j+1] = key;
		}
		return data;
	}


	public static void main(String[] args) {
		String p = Arrays.toString(insertion(new int[]{12, 2, 3, 1, -1, 0, -2, -100}));
		System.out.println(p);
	}


}
