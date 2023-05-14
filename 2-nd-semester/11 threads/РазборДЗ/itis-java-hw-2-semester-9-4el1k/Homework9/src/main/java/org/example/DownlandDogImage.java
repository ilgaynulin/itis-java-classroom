package org.example;


import java.beans.PropertyEditorSupport;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class DownlandDogImage extends DownlandPhoto{
    private String urlAddress;
    DownlandDogImage(){
        urlAddress = "https://shibe.online/";
    }

    @Override
    public String[] downlandPhotoInQuality(String directory, int quantity) throws IOException {
        if (!(quantity>=1 && quantity<=100)){
            throw new IllegalArgumentException();
        }
        // Чтобы создать каталог(директорию) нужно создать у экземпляра класса File вызвать метод mkdir.
        // И file.name станет новым каталгом.
        File directoryFile = new File(directory);
        directoryFile.mkdir();
        String api = String.format(urlAddress + String.format("api/shibes?count=%d&urls=true&httpsUrls=true",quantity));
        URL url = new URL(api);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        InputStream io = connection.getInputStream();
        String imagesAddress = new String(io.readAllBytes(), StandardCharsets.UTF_8); //поулчили ссылки на фото
        io.close();

        HttpURLConnection connectionToImageURL;
        URL imageURL;
        String[] imagesURL = parsing(imagesAddress);
        FileOutputStream outputStream;
        for (int i = 0; i < imagesURL.length; i++) {
            imageURL = new URL(imagesURL[i]);
            connectionToImageURL = (HttpURLConnection) imageURL.openConnection(); //открыли поток, типа открыли фото в интернете
            io = connectionToImageURL.getInputStream();
            outputStream = new FileOutputStream(new File(directoryFile,i+".jpg"));
            outputStream.write(io.readAllBytes());
            io.close();
        }
        return imagesURL;
    }

    // Извините, регулярки еще не выучил :(
    private String[] parsing(String str){
        str = str.substring(1,str.length()-1);
        String[] result = str.split(",");
        for (int i = 0; i < result.length; i++) {
            result[i] = result[i].substring(1,result[i].length()-1);
        }
        return result;
    }
}
