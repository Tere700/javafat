package tw.org.iii.teresaaaaaaapp;

import java.util.ArrayList;
import java.util.List;

public class Lottery {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		while(list.size()<6) {
			int Randamnumber = (int)(Math.random()*49+1);
			if(!list.contains(Randamnumber)) {
				list.add(Randamnumber);
				}
			}for(Integer number: list) { 
				System.out.println(number);
		} 
			
	}
		
}
