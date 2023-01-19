package org.example.test;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {

    public void print() {
        System.out.println("Splendor print");
    }

    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) throws IOException {
//        Bike b = new Splendor();//upcasting
//        b.run();
        URL url = new URL("https://openjdk.java.net/groups/net/httpclient/recipes.html");
        Map<String, String> params = new HashMap<>();
        params.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
//        con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
        DataInputStream out = new DataInputStream(con.getInputStream());
        int count = 0;
        System.out.println("status : " + con.getResponseCode());
        System.out.println("message : " + con.getResponseMessage());
        while (count < 100) {
            System.out.println(out.readLine());
            count++;
        }

        out.close();
        con.disconnect();
    }
}