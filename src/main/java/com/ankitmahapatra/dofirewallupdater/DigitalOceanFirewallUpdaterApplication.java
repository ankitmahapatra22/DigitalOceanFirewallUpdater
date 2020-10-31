package com.ankitmahapatra.dofirewallupdater;

public class DigitalOceanFirewallUpdaterApplication {
    
    public static void main(String[] args){
    	DigitalOceanFirewallUpdaterApplication digitalOceanFireWallUpdaterApplication =
    			new DigitalOceanFirewallUpdaterApplication();
    	System.out.println(" Starting with firewall update ...");
    }
    
    private String getMyPublicIPAddress() throws UnknownHostException
        {
            String host = "https://api.ipify.org/";

            try {
                InetAddress ip = InetAddress.getByName(new URL(host)
                        .getHost());

               return String.valueOf(ip);
            }
            catch (MalformedURLException e) {
                System.out.println("Invalid URL");
            }
            return "";
        }
}
