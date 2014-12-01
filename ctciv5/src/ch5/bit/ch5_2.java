package ch5.bit;

public class ch5_2 {
	public static void main(String[] args){
		double d= 0.75;
		try {
			System.out.println("Float Calc:"+FloatStats.Calc(d));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static class FloatStats{
		public static String Calc(double num) throws Exception{
			if(num>=1 || num<0){
				throw new Exception("Wrong Value");
			}
			String s="";
			if(num==1){
				return "1";
			}
			int counter = 0;
			s+="0.";
			while(counter<32){
				num*=2;
				if(num >=1){
					s+="1";
					num-=1;
				}else{
					s+="0";
				}
				counter ++;
			}
			return s;
		}
	}
}
