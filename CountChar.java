import java.util.*;
class CountChar{
	Map<String,Integer> words=new HashMap<String,Integer>();
	
	void count(){
		char[] letters="sangmyung university".toCharArray();
		
		for(char c:letters){
			String s=Character.toString(c);
			if(words.containsKey(s)){
				words.put(s,words.get(s)+1);
			}else{
				words.put(s,1);
			}
		}
		System.out.println(words);
	}
	
	public static void main(String[] args){
		
		CountChar c=new CountChar();
		c.count();
	}

}