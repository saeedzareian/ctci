package ch12.test;

import java.util.ArrayList;

public  class TestSample {
	public static ArrayList<Integer> list =null;
	public static void main(String[] arg){
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Testee t = new Testee();
	}
/*	public static class Tester{
		@Test
		public void testList(){
			assertEquals("first", 1, list.get(0));
		}
	}*/
	public static class Testee{
		@Override
		protected void finalize() throws Throwable{
			System.out.println("End");
		}
	}
	
}
