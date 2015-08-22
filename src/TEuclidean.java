
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
		
	}
	
	public void doOneTime( ){
		if (value1 == value2)	return;
		if(value1>value2){
				value1=value1-value2;
		}else{
				value2=value2-value1;
		}
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
