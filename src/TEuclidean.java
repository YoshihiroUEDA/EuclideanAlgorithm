
public class TEuclidean {
	int value1, value2;
	
	public TEuclidean (){
		value1 = 0;
		value2=0;
		
	}
	public void setValue(int i, int j) {
		// TODO Auto-generated method stub
		value1=i;
		value2=j;
		
		System.out.println("setValue: value1="+value1+",value2="+value2);
	}
	
	public void doOneTime( ){
//		System.out.println("doOneTime() start...");
		
		
		if (value1 == value2)	return;
		if(value1>value2){
				value1=value1-value2;
		}else{
				value2=value2-value1;
		}
		
//		System.out.println("doOneTime() end.");
	}
	
	public boolean isEnd(){
		if (value1 == value2){	
			
			return true;
		}else {
			return false;
		}
	}
	public TValuePair getValue(){
		TValuePair obj = new TValuePair(value1, value2);
		return obj;
	}
	
	
	
}
