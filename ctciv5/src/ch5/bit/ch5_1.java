package ch5.bit;

public class ch5_1 {
		public static void main(String[] a ){
			int num =0b010000;
			int toPut= 0b0110;
			System.out.println("num: "+num + ", toPut: "+toPut);
			num = BitUtils.setBitsInNumber(num, 0, 2, toPut);
			System.out.println("Result:"+num);

		}
		public static class BitUtils{
			public static int setBit(int num, int pos, int v){
				return num & ~(0b01<<pos) | (v<<pos);
			}
			public static int getBit(int num, int pos){
				return (num>>pos & 0b01)==1 ? 1:0;
			}
			public static int setBitsInNumber(int num, int start, int end, int toPut){
				int counter=start; 
				while(counter <=end){
					int bit = BitUtils.getBit(toPut, counter-start);
					System.out.println("b:"+bit);
					num = BitUtils.setBit(num, counter, bit);
					counter++;
				}
				return num;
			}
		}

}
