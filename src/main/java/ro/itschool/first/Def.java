package ro.itschool.first;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Def {

    public static WebView createWebViewDef(){
        WebView webViewDef = new WebView();
        WebEngine engineDef = webViewDef.getEngine();
        engineDef.loadContent("""
                <html>
                        <head>
                          <script type='text/javascript' async src='https://polyfill.io/v3/polyfill.min.js?features=es6'></script>
                          <script type='text/javascript' id='MathJax-script' async src='https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js'></script>
                          <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                          <style>
                            body { font-family: Arial, sans-serif; font-size: 22px; text-align: center; padding: 20px; }
                            h1 { font-size: 36px; margin-bottom: 20px; }
                            .center { font-size: 40px; font-weight: bold; margin-top: 30px; }
                            .subtext { font-size: 24px; margin-top: 10px; font-style: italic; }
                            .container { display: flex; justify-content: center; flex-wrap: wrap; gap: 100px; margin-top: 20px; }
                            .box { width: 320px; padding: 15px; font-size: 22px; text-align: center; border-radius: 10px; box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.1); }
                            .box1 { background-color: #88C3CF; }
                            .box2 { background-color: #FBDCDA; }
                            .box3 { background-color: #F3EFAF; margin-top: 20px; }
                          </style>
                        </head>
                        <body>
                        <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                          <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                          Să aflăm ce este un număr complex!
                          <dotlottie-player
                            src="https://lottie.host/278d25f4-b96c-473c-ade9-b3f468e3d6b4/GczUYjKm0Z.lottie"
                            background="transparent"
                            speed="1"
                            style="width: 150px; height: 150px"
                            loop
                            autoplay
                          ></dotlottie-player>
                        </h1>
                        </div>
                          <p><b>DEFINIȚIE:</b> Un număr complex este o extensie a numerelor reale, definit ca o pereche ordonată de numere reale \\((a, b)\\).</p>
                          <div class='center'> \\( z = a + b i \\) </div>
                          <p class='subtext'>unde \\( a, b \\in \\mathbb{R} \\) și \\( i^2 = -1 \\).</p>
                          <p class='subtext'>Această formă se numește <b>forma algebrică</b> a unui număr complex.</p>
                          <div class='container'>
                            <div class='box box1'> \\( a \\) → Partea reală: notată \\( \\operatorname{Re}(z) \\) </div>
                            <div class='box box2'> \\( b \\) → Partea imaginară: notată \\( \\operatorname{Im}(z) \\) </div>
                          </div>
                          <div class='container'>
                            <div class='box box3'> \\( i \\) → Unitatea imaginară, \ndefinită prin relația \\( i^2 = -1 \\) </div>
                        </div>
                        </body></html>"""
        );
        webViewDef.setPrefHeight(800);
        VBox.setMargin(webViewDef, new Insets(-10, 0, 0, 0));
        return webViewDef;
    }

}
