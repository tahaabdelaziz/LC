package unitn.introsde.lifecoach.utils.fatsecretAPI;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import unitn.introsde.lifecoach.utils.fatsecretAPI.fatsecret.platform.FatSecretAPI;
import unitn.introsde.lifecoach.utils.fatsecretAPI.fatsecret.platform.FatSecretException;


public class FatsecretAPIExample {
public static void main(String[] args) {
	try {
		FatSecretAPI api = new FatSecretAPI("b9d0e5229f0b482f91c68d86c509b560","04dbf50b9bc547729d8d85938dd37d12");
		
		System.out.println(api.getFoodById("4384"));
		
	} catch (FatSecretException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
