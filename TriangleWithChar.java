class TriangleWithChar{
	int height;
	String symbol;
	
	void drawTriangleWithChar(int height, String symbol){
		StringBuffer sbuf=new StringBuffer();
		String white=" ";
		for(int i=0;i<height;i++){
			for(int j=0;j<height-i;j++){
				sbuf.append(white);
			}
			for(int z=0;z<i*2+1;z++){
				sbuf.append(symbol);
			}

			
			System.out.printf("%s\n",sbuf.toString());
			sbuf.delete(0,sbuf.length());
		}
	}
	public static void main(String[] args){
		TriangleWithChar t=new TriangleWithChar();
		t.drawTriangleWithChar(10,"*");
	} 

}