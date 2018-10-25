package com.jty;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 递归
 * 任何递归都可以用Stack进行实现
 * 例一：遍历文件夹
 * 例二：阶乘
 */
public class Recursion {

	public static void main(String[] args){

	}


	// 遍历显示文件
	static List<String> listFiles(File dir) {
		List<String> li = new ArrayList<String>();
		if (dir.isDirectory()) {
			for (File file : dir.listFiles()) {
				li.addAll(listFiles(file));
			}
		} else {
			li.add(dir.getAbsolutePath());
		}
		return li;
	}

	// BFS
	static List<String> listFilesWithStack(File dir) {
		List<String> li = new ArrayList<String>();
		Stack<File> stack = new Stack<File>();
		stack.push(dir);
		while (!stack.isEmpty()) {
			//dir不为空 将元素进栈
			File pop = stack.pop();
			File[] files = pop.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					stack.push(file);
				} else if (file.isFile()) {
					li.add(file.getAbsolutePath());
				}
			}
		}
		return li;
	}

	static double factorial(double i) {
		if (i == 1){
			return 1;
		}else{
			return i * factorial(i-1);
		}
	}

	static double factorialWithStack(double i) {
		Stack<Double> stack = new Stack<Double>();
		stack.push(i);
		double rtn = -1;
		while(!stack.isEmpty()){
			Double pop = stack.pop();
			if(i != 1){
				stack.push(pop * --i);
			}else{
				rtn = pop;
			}
		}
		return rtn;
	}
}
