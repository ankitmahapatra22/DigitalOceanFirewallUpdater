package com.ankitmahapatra.dofirewallupdater;

import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DigitalOceanFirewallUpdaterApplication {
    
    public static void main(String[] args){
    	DigitalOceanFirewallUpdaterApplication digitalOceanFireWallUpdaterApplication =
    			new DigitalOceanFirewallUpdaterApplication();
    	System.out.println(" Starting with firewall update ...");
    }
    
    private String getMyPublicIPAddress() throws UnknownHostException
    {
    	String ipify = "https://api.ipify.org/";
	try {
	    Scanner scanner = new Scanner(new URL(ipify).openStream(), "UTF-8").useDelimiter("\\A");
	    return scanner.next();
	} 
        catch (IOException exception) {
	    exception.printStackTrace();
	}
	return "";
    }
}
