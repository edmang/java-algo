package webCrawler;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

    private Queue<String> queue;  // no need to use Vertex
    private List<String> discoveredWebsites;

    public WebCrawler() {
        this.queue = new LinkedList<>();
        this.discoveredWebsites = new ArrayList<>();
    }

    public void discoverWeb(String root) {

        this.queue.add(root);
        this.discoveredWebsites.add(root);

        while(!queue.isEmpty()) {

            String url = this.queue.remove();
            String rawHtml = readUrl(url);
            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);

            while(matcher.find()) {
                String actualUrl = matcher.group();
                if(!this.discoveredWebsites.contains(actualUrl)) {
                    System.out.println("Website has been found with URL: " + actualUrl);
                    queue.add(actualUrl);
                }
            }

        }
    }

    private String readUrl(String url) {
        String rawHtml = "";
        try {
            URL urlObject = new URL(url);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlObject.openStream()));
            String inputLine = "";
            while(bufferedReader.ready()) {
                rawHtml += inputLine;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rawHtml;
    }
}
