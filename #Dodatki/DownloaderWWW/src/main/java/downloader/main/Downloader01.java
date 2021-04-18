package downloader.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Downloader01 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.wykop.pl").get();
        Elements h2Elements = document.select("h2");
        for (Element h2:h2Elements){
            String h2Text = h2.text();
            System.out.println(h2Text);
        }
    }
}
