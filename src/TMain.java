import javax.swing.JFrame;

public class TMain extends JFrame{
	public static void main(String[] args){
		System.out.println("program start...");
		TMain obj = new TMain();
		
		System.out.println("program terminated.");
	}
	
	public TMain(){
		setTitle("ユークリッドの互除法");
		setSize(400,400);
		setVisible(true);
		
		TEuclidean obj = new TEuclidean();
		
		obj.setValue( 130,2500);
		while(!obj.isEnd()){
			obj.doOneTime();
			TValuePair ret = obj.getValue();
			ret.printValueStdout();
			
		}
		
		
	}
}
