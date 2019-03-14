import webCrawler.WebCrawler;

public class MainWebCrawler {

    public static void main(String[] args) {

        /**
         * Web Crawler: use it when not connected to EY network
         */

        WebCrawler webCrawler = new WebCrawler();
        String rootUrl = "http://www.bbc.com";
        webCrawler.discoverWeb(rootUrl);

    }
}
