package aula05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;


// https://blogs.nasa.gov/

public class ExemploInterferencia {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://blogs.nasa.gov/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));

    }

    public void testar(){

    }
}
