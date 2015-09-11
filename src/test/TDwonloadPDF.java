package test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TDwonloadPDF {
	public String strURL =null;
	public String strSavePathFilename;
	
	public TDwonloadPDF( String param){
		strURL = param;
		
	}
	
	public void done(){
		URL url = null;
		try {
			url = new URL(strURL);
			HttpURLConnection urlcon =null;
			urlcon = (HttpURLConnection) url.openConnection();
			File fw = null;
			fw = new File( strSavePathFilename);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
