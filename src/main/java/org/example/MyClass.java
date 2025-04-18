package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyClass {
    public static void main(String[] args) {
        String url = "https://api.github.com"; // Пример API

        try {
            // Создаем объект URL
            URL obj = new URL(url);
            // Открываем соединение
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // Устанавливаем метод запроса
            con.setRequestMethod("GET");

            // Получаем код ответа
            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Читаем ответ
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Выводим ответ
            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


