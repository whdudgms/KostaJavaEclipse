package com.kosta.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Translator {

    // API 키를 설정합니다. 실제 사용 시에는 보안을 위해 환경 변수나 다른 안전한 방법을 통해 관리하는 것이 좋습니다.
    private static final String API_KEY = "YOUR_API_KEY";
    private static final String URL_TEMPLATE = "https://translation.googleapis.com/language/translate/v2?key=" + API_KEY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to translate: ");
        String textToTranslate = scanner.nextLine();

        System.out.println("Enter target language (e.g., 'en' for English, 'ko' for Korean): ");
        String targetLanguage = scanner.nextLine();

        try {
            String translatedText = translate(textToTranslate, targetLanguage);
            System.out.println("Translated text: " + translatedText);
        } catch (Exception e) {
            System.err.println("Error during translation: " + e.getMessage());
        }
    }

    private static String translate(String text, String targetLang) throws Exception {
        // URL 인코딩을 통해 텍스트와 타겟 언어를 인코딩합니다.
        String encodedText = URLEncoder.encode(text, "UTF-8");
        String encodedTargetLang = URLEncoder.encode(targetLang, "UTF-8");

        // 번역 요청을 위한 URL을 생성합니다.
        String urlStr = URL_TEMPLATE + "&q=" + encodedText + "&target=" + encodedTargetLang;

        // URL 객체를 생성하고 HTTP 연결을 엽니다.
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        // 응답을 읽습니다.
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // 응답에서 번역된 텍스트를 추출합니다.
        String jsonResponse = response.toString();
        return parseTranslatedText(jsonResponse);
    }

    private static String parseTranslatedText(String jsonResponse) {
        // 간단한 파싱을 통해 번역된 텍스트를 추출합니다.
        int translatedTextStart = jsonResponse.indexOf("\"translatedText\":\"") + 18;
        int translatedTextEnd = jsonResponse.indexOf("\"", translatedTextStart);
        return jsonResponse.substring(translatedTextStart, translatedTextEnd);
    }
}