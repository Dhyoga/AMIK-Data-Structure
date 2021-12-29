class InitIntArrayB{
	public static void main (String[] x){
		int[] array=new int[10];
		System.out.printf("%8s%8s\n","Index","Value");
		for(int dy=0;dy<array.length;dy++)
			System.out.printf("%8s%8d\n", dy, array[dy]);
	}
}