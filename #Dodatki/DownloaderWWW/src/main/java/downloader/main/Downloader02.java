package downloader.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Downloader02 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.wykop.pl").get();
        Elements h2Elements = document.select("h2");
        for(Element h2 : h2Elements){
            //  Zapis h2.select("a").first().attr("href") oznacza, znajdź pierwszy element <a>
            //  wewnątrz danego elementu <h2> i wyciągnij z niego wartość atrybutu href.
            String h2Url = h2.select("a").first().attr("href");
            String h2Text = h2.text();
            System.out.println(h2Text + ":::"+h2Url);
        }
    }
}
