package ro.itschool.second;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ProbRez {
    public static WebView createWebViewProbRez1(){
        WebView webViewRez1 = new WebView();
        WebEngine webEngineRez1 = webViewRez1.getEngine();
        webViewRez1.setMinWidth(900);
        webViewRez1.setMinHeight(850);
        String htmlContentRez1 = """
            <html>
            <head>
                <style>
                    body {
                        font-family: 'Arial Black', sans-serif;
                        text-align: center;
                        background-color: white;
                        margin: 0;
                        padding: 20px;
                    }
                    h1 {
                        font-size: 45px;
                        margin-bottom: 30px;
                    }
                    img {
                        width: 690px;
                        height: 650px;
                        object-fit: cover;
                    }
                </style>
            </head>
            <body>
                <h1>Probleme rezolvate</h1>
                <img src="file:/C:/Users/iulica/Desktop/rezolvare1.jpg" alt="Rezolvare 1" style="max-width: 100%; height: auto;">
            </body>
            </html>""";

        webEngineRez1.loadContent(htmlContentRez1);
        return webViewRez1;
    }

    public static WebView createWebViewProbRez2(){
        WebView webViewRez2 = new WebView();
        WebEngine webEngineRez2 = webViewRez2.getEngine();
        webViewRez2.setMinWidth(900);
        webViewRez2.setMinHeight(850);
        String htmlContentRez2 = """
            <html>
            <head>
                <style>
                    body {
                        font-family: 'Arial Black', sans-serif;
                        text-align: center;
                        background-color: white;
                        margin: 0;
                        padding: 20px;
                    }
                    h1 {
                        font-size: 45px;
                        margin-bottom: 30px;
                    }
                    img {
                        width: 690px;
                        height: 650px;
                        object-fit: cover;
                    }
                </style>
            </head>
            <body>
                <h1>Probleme rezolvate</h1>
                <img src="file:/C:/Users/iulica/Desktop/rezolvare2.jpg" alt="Rezolvare 2" style="max-width: 100%; height: auto;">
            </body>
            </html>""";

        webEngineRez2.loadContent(htmlContentRez2);
        return webViewRez2;
    }

    public static WebView createWebViewProbRez3(){
        WebView webViewRez3 = new WebView();
        WebEngine webEngineRez3 = webViewRez3.getEngine();
        webViewRez3.setMinWidth(900);
        webViewRez3.setMinHeight(850);
        String htmlContentRez3 = """
            <html>
            <head>
                <style>
                    body {
                        font-family: 'Arial Black', sans-serif;
                        text-align: center;
                        background-color: white;
                        margin: 0;
                        padding: 20px;
                    }
                    h1 {
                        font-size: 45px;
                        margin-bottom: 30px;
                    }
                    img {
                        width: 690px;
                        height: 650px;
                        object-fit: cover;
                    }
                </style>
            </head>
            <body>
                <h1>Probleme rezolvate</h1>
                <img src="file:/C:/Users/iulica/Desktop/rezolvare3.jpeg" alt="Rezolvare 3" style="max-width: 100%; height: auto;">
            </body>
            </html>""";

        webEngineRez3.loadContent(htmlContentRez3);
        return webViewRez3;
    }

    public static WebView createWebViewProbRez4(){
        WebView webViewRez4 = new WebView();
        WebEngine webEngineRez4 = webViewRez4.getEngine();
        webViewRez4.setMinWidth(900);
        webViewRez4.setMinHeight(850);
        String htmlContentRez4 = """
            <html>
            <head>
                <style>
                    body {
                        font-family: 'Arial Black', sans-serif;
                        text-align: center;
                        background-color: white;
                        margin: 0;
                        padding: 20px;
                    }
                    h1 {
                        font-size: 45px;
                        margin-bottom: 30px;
                    }
                    img {
                        width: 690px;
                        height: 650px;
                        object-fit: cover;
                    }
                </style>
            </head>
            <body>
                <h1>Probleme rezolvate</h1>
                <img src="file:/C:/Users/iulica/Desktop/rezolvare4.jpeg" alt="Rezolvare 4" style="max-width: 100%; height: auto;">
            </body>
            </html>""";

        webEngineRez4.loadContent(htmlContentRez4);
        return webViewRez4;
    }
}
