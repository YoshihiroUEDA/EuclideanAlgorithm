import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.TDwonloadPDF;

public class TMain extends JFrame {
	public static void main(String[] args) {
		System.out.println("program start...");
//		TMain obj = new TMain();
		//	Download test.
		TDwonloadPDF pdf = new TDwonloadPDF( "http://jken.sgec.or.jp/docs/past_test/150621_mondaijk03.pdf");
		pdf.done();
		System.out.println("program terminated.");
	}
	
	JButton btnOK=null;
	JButton btnCancel=null;
	JTextField txtVal1=null, txtVal2=null;
	
	public TMain() {
		setTitle("ユークリッドの互除法");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		InitGuiParts();
		TEuclidean obj = new TEuclidean();

		obj.setValue(130, 2500);
		while (!obj.isEnd()) {
			obj.doOneTime();
			TValuePair ret = obj.getValue();
			ret.printValueStdout();

		}
		
	}


	private void InitGuiParts() {
		// TODO Auto-generated method stub
		btnOK=new JButton("OK");
		btnCancel=new JButton("Cancel");
		//	イベントリス名の実装
		
		//
		txtVal1=new JTextField();
		txtVal2=new JTextField();
		
	}
}
