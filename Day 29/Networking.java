package com.company;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

public class Networking {
    public static void main(String[] args) throws UnknownHostException {
//        String url = "www.Simplilearn.com
         String url = "www.bangbrosteenporn.com";

          InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));

        System.out.println("Host Address : " + inetAddress.getHostAddress());
        System.out.println("isAnyLocalAdress : " + inetAddress.isAnyLocalAddress());
        System.out.println("isLinkLocalAddress :" + inetAddress.isAnyLocalAddress());
        System.out.println("isLoopbackAddress :" + inetAddress.isLoopbackAddress());
        System.out.println("isSiteLocalAddress :" + inetAddress.isSiteLocalAddress());
        System.out.println("hashCode :" + inetAddress.hashCode());
        System.out.println("isMulticastAddress :" + inetAddress.isMulticastAddress());
    }
}
