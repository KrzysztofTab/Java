package downloader.main.ex01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Downloader {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://example.com/").get();
        String h1 = document.select("h1").first().text();
        String p = document.select("p").first().text();
        System.out.println("Nagłówek <h1>: " + h1);
        System.out.println("Tekst w pierwszym paragrafie <p>: " + p);
    }
}