
public class TMain {
	public static void main(String[] args){
		System.out.println("program start...");
		
		TEuclidean obj = new TEuclidean();
		
		obj.setValue( 130,2500);
		while(!obj.isEnd()){
			obj.doOneTime();
			TValuePair ret = obj.getValue();
			ret.printValueStdout();
			
		}
		
		System.out.println("program terminated.");
	}
}
