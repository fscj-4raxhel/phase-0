package com.atguigu.java;

public class EcmDef {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			int result = ecm(i,j);
			
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EcDef e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int ecm(int i, int j) throws EcDef{
		 if(i < 0 || j < 0) {
			 throw new EcDef("Negative denominator or numberator");
		 }
		 return i / j;
	}
}
