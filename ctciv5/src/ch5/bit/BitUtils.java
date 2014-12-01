package ch5.bit;

public class BitUtils {
	public static void main(String[] Args){
		Integer num= 0b00111;
		//System.out.println(BitUtils.getBit(num, 0));
		//System.out.println(BitUtils.setBit(num, 1));
		System.out.println(num);
		//System.out.println(BitUtils.clearBit(num, 0));
		System.out.println(BitUtils.clearItoZero(num, 1));
		System.out.println(BitUtils.updateBit(num, 3, 1));
	}
	
	public static Boolean getBit(int num, int index){
		//return (((byte)num & (0x01 <<num))!=0); //didn't work in Java
		return ((num >>index) & 1) == 1;
	}
	public static Integer setBit(int num, int index){ //set to 1
		 return (num| (1<<index));
	}
	public static Integer updateBit(int num, int index, int value){
		return (num & ~(0b01<<index) | (value<<index) );
	}
	public static Integer clearBit(int num, int index){
		return (num & ~(0b01<<index));
	}
	public static Integer clearMStoI(int num, int index){
		return num & ( (0b01<<index) -1);
	}
	public static Integer clearItoZero(int num, int index){
		return num & ~( (0b01<<(index+1))-1 );
	}
	
}
