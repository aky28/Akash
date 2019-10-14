package concept;

import java.util.ArrayList;

public class finalkeyword {

	public static void main(String[] args) {
		final int a=10;
		final int array[]=new int[] {1,2,3,4};
		final ArrayList<Integer> c =new ArrayList<Integer>();
		for(int i=0;i<100;i++)
			c.add(i);
		c.remove(50);
		System.out.println(a);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]);
		for(int i=0;i<99;i++)
			System.out.println(c.get(i));
	}

}
