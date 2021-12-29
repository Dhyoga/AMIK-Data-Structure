class InitIntArray2{
	public static void init (int size){
		int[] array=new int[size];
		System.out.printf("%8s%8s\n","Index","Value");
		for(int dy=0;dy<array.length;dy++)
			System.out.printf("%8s%8d\n", dy, array[dy]);
	}
    public static void main(String[] args){
        init(10);
    }
}