package com.multithreading.udemy.forkjoin2;

import java.util.concurrent.ForkJoinPool;

public class App {

	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(20);
		System.out.println( forkJoinPool.invoke(simpleRecursiveAction) );
		
		
	}
}
