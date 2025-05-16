package ro.itschool.first;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ReprGeo {

    public static WebView createWebViewReprGeo(){
        WebView webViewReprGeo = new WebView();
        WebEngine engineReprGeo = webViewReprGeo.getEngine();
        engineReprGeo.loadContent("""
                <html>
                                <head>
                                    <script type="text/javascript" async\s
                                        src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                    <script type="text/javascript" id="MathJax-script" async\s
                                        src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                                    <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                                    <style>
                                        body {
                                            font-family: Arial, sans-serif;
                                            background-color: #F6F6F6;
                                            padding: 40px;
                                        }
                                        h1 {
                                            font-size: 42px;
                                            font-weight: bold;
                                            color: #2C3E50;
                                            text-align: center;
                                            margin-bottom: 30px;
                                        }
                                        .container {
                                            display: flex;
                                            align-items: center;
                                            justify-content: space-between;
                                            gap: 50px;
                                        }
                                        .text-section {
                                            display: flex;
                                            flex-direction: column;
                                            gap: 20px;
                                            width: 50%;
                                        }
                                        .box {
                                            padding: 15px;
                                            font-size: 20px;
                                            border-radius: 15px;
                                            box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                            text-align: left;
                                            width: 90%;
                                        }
                                        .box1 { background-color: #C6D3E3; }
                                        .box2 { background-color: #AAD7D0; }
                                        .box3 { background-color: #E39E9E; }
                                        .image-container {
                                            display: flex;
                                            justify-content: center;
                                            width: 50%;
                                        }
                                        img {
                                            width: 90%;
                                            max-width: 450px;
                                            height: auto;
                                            border-radius: 10px;
                                            box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                        }
                                    </style>
                                </head>
                                <body>
                                <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                                  <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                                  Reprezentarea Geometrică
                                  <dotlottie-player
                                    src="https://lottie.host/5c5e6553-d3e7-456c-8a0d-3aec7447f059/PWElQrErxM.lottie"
                                    background="transparent"
                                    speed="1"
                                    style="width: 200px; height: 200px"
                                    loop
                                    autoplay
                                  ></dotlottie-player>
                                </h1>
                                </div>
                                    <div class="container">
                                        <div class="text-section">
                                            <div class="box box1"><b>Axa Ox</b> reprezintă axa reală, unde se plasează partea reală a numerelor complexe.</div>
                                            <div class="box box2"><b>Axa Oy</b> reprezintă axa imaginară, unde se plasează partea imaginară.</div>
                                            <div class="box box3">Fiecărui punct (a, b) îi corespunde un număr complex numit <b>afix</b>: z = a + b i.</div>
                                        </div>
                                        <div class="image-container">
                                            <img src="file:/C:/Users/iulica/Desktop/reprgeo.jpeg" alt="Reprezentarea geometrică">
                                        </div>
                                    </div>
                                </body>
                                </html>"""

        );
        webViewReprGeo.setPrefHeight(800);
        VBox.setMargin(webViewReprGeo, new Insets(-50, 0, 0, 0));
        return webViewReprGeo;
    }
}
