package org.example.test;



import org.apache.http.*;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

//        //Creating a HttpClient object
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//
//        //Creating a HttpGet object
//        HttpGet httpget = new HttpGet("https://www.tutorialspoint.com/");
//
//        //Printing the method used
//        System.out.println("Request Type: "+httpget.getMethod());
//
//        //Executing the Get request
//        HttpResponse httpresponse = (HttpResponse) httpclient.execute(httpget);
//
//        Scanner sc = new Scanner(httpresponse.getEntity().getContent());
//
//        //Printing the status line
//        System.out.println(httpresponse.getStatusLine());
//        while(sc.hasNext()) {
//            System.out.println(sc.nextLine());
//        }

        //Create an HttpClient object
//        CloseableHttpClient httpclient = HttpClients.createDefault();

        //instantiate the response handler
//        ResponseHandler<String> responseHandler = new MyResponseHandler();
//
//        HttpRequestInterceptor requestInterceptor = new HttpRequestInterceptor() {
//            @Override
//            public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
//
//                if(httpRequest.containsHeader("sample-header")) {
//                    System.out.println("Contains header sample-header, removing it..");
//                    httpRequest.removeHeaders("sample-header");
//                }
//                //Printing remaining list of headers
//                Header[] headers= httpRequest.getAllHeaders();
//                for (int i = 0; i<headers.length;i++) {
//                    System.out.println(headers[i].getName());
//                }
//            }
//        };
//
//        HttpResponseInterceptor responseInterceptor = new HttpResponseInterceptor() {
//            @Override
//            public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
//                System.out.println("Adding header");
//                httpResponse.setHeader("sample-header","my sample header");
//            }
//        };
//
//        CloseableHttpClient httpClient = HttpClients.custom().addInterceptorFirst(requestInterceptor).addInterceptorFirst(responseInterceptor).build();
//
//        //Create an HttpGet object
//        HttpGet httpget = new HttpGet("http://www.tutorialspoint.com/");
//
//        httpget.setHeader(new BasicHeader("sample-header","My first header"));
//        httpget.setHeader(new BasicHeader("demo-header","My second header"));
//        httpget.setHeader(new BasicHeader("test-header","My third header"));
//
//        //Execute the Get request by passing the response handler object and HttpGet object
////        String httpresponse = httpClient.execute(httpget, responseHandler);
//        HttpResponse  httpresponse = httpClient.execute(httpget);
//
////        System.out.println(httpresponse);
//        Header[] headers = httpresponse.getAllHeaders();
//
//        for (int i = 0; i<headers.length;i++) {
//            System.out.println(headers[i].getName());
//        }

    }
    /*
        public static void main(String[] args){System.out.println("main with String[]");}
        public static void main(String args){System.out.println("main with String");}
        public static void main(){System.out.println("main without args");}
    */
}

class MyResponseHandler implements ResponseHandler<String> {

    public String handleResponse(final HttpResponse response) throws IOException{

        //Get the status of the response
        int status = response.getStatusLine().getStatusCode();
        if (status >= 200 && status < 300) {
            HttpEntity entity = response.getEntity();
            if(entity == null) {
                return "";
            } else {
                return EntityUtils.toString(entity);
            }

        } else {
            return ""+status;
        }
    }
}
