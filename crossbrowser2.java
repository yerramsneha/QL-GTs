package selwebdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class crossbrowser2 {
	public static void main(String[] args) {

		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SaiKrishnaKumarKomma\\Downloads.exe");
		WebDriver driver_Msedge= new EdgeDriver();  
	
		 driver_Msedge.navigate().to("http://www.google.com/"); 
		 driver_Msedge.navigate().to("https://www.amazon.in/"); 
		 driver_Msedge.navigate().to("https://www.amazon.in/Bellaxia-Highball-Drinking-Lead-Free-Glassware/dp/B09QPKD8H7/?_encoding=UTF8&pd_rd_w=5Sn5d&content-id=amzn1.sym.58cd7ce3-1957-410e-bd7b-b01bf0cdbcf0&pf_rd_p=58cd7ce3-1957-410e-bd7b-b01bf0cdbcf0&pf_rd_r=BGPK5Z9BP0XSGDSKFPS8&pd_rd_wg=NRKYU&pd_rd_r=74bd3c32-e84c-40a0-8c07-cfed4a00dbb9&ref_=pd_gw_unk");
		 driver_Msedge.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		 
		 driver_Msedge.navigate().to(" https://www.youtube.com/"); 
	
		 
		 driver_Msedge.navigate().to("https://www.flipkart.com/");
	
       
			 
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\new.exe");
			WebDriver driver_Chrome= new ChromeDriver();
			 driver_Chrome.navigate().to("http://www.google.com/"); 
			 driver_Chrome.close();
			 driver_Msedge.close();
	}
	 
}

