package com.example.damo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Sample1 implements Supplier<Integer> {
	int a1=0;
	int a2=1;
	
	@Override
	public Integer get() {
		int a3=a2+a1;
		a1=a2;
		a2=a3;
		return a3;
	}
	
	
	public static void main(String[] args) {
		
	   Stream.generate(new Sample1()).limit(20).forEach(System.out::println);
	
	}
	
	
	
	//斐波那契数列
	public void Fibonacci(int n) {
	    int a=1,b=1,c=0;
		System.out.println("斐波那契数列前"+n+"项：");
		System.out.print(a+"\t"+b+"\t");
		for(int i=1;i<=n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
			//每五个输出一行
			if((i+2)%5==0)
				System.out.println();
		}
		System.out.println();
		

  }

	
}
