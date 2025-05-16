package ro.itschool.first;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class DeltaNeg {
    public static WebView createWebViewDeltaNeg(){
        WebView webViewDeltaNeg = new WebView();
        webViewDeltaNeg.setMinWidth(900);
        webViewDeltaNeg.setMinHeight(850);

        WebEngine engineDeltaNeg = webViewDeltaNeg.getEngine();
        engineDeltaNeg.loadContent("""
                <html>
                    <head>
                        <script type="text/javascript" async\s
                            src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                        <script type="text/javascript" id="MathJax-script" async\s
                            src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                        <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                        <style>
                            body {
                                font-family: 'Arial', sans-serif;
                                text-align: center;
                                padding: 20px;
                                background-image: url('file:/C:/Users/iulica/Desktop/fundalBiblioteca.jpg');
                                background-size: cover;
                                background-position: center;
                                background-repeat: no-repeat;
                                background-attachment: fixed;
                            }
                            .container {
                                width: 80%%;
                                max-width: 600px;
                                background: white;
                                padding: 20px;
                                border-radius: 15px;
                                box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                                margin: auto;
                                margin-bottom: 30px;
                            }
                            h1 {
                                font-size: 28px;
                                color: #FFFFFF;
                            }
                            .text {
                                font-size: 22px;
                                margin-bottom: 15px;
                            }
                        </style>
                    </head>
                    <body>
                    <h1>Te-ai întrebat vreodată ce se întâmplă atunci când delta este mai mică decât zero?</h1>
                    <div class="container">
                        <p class="text">Poate că ți s-a spus că „nu există soluții reale”... dar asta nu înseamnă că nu există soluții!\nSă luăm un exemplu</p>
                            <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                            <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                        <dotlottie-player src="https://lottie.host/15f7e60f-d056-4c59-9f35-0ea007b66898/fmlLb6Lbwe.lottie"
                        background="transparent"
                        speed="1"
                        style="width: 150px; height: 150px"
                        loop autoplay
                        ></dotlottie-player>
                        </h1></div>
                    </div>
                    <div class="container">
                        <p class="text">$$2x^2+2x+5=0$$</p>
                    </div>
                    <div class="container">
                        <p class="text">$$a=2$$ \n $$b=2$$ \n $$c=5$$ \n $$Δ = b^2-4ac = 2^2 - 4 \\cdot 2 \\cdot 5 = 4 - 40 = -36$$</p>
                    </div>
                    <div class="container">
                        <p class="text">Știm că $$i^2=-1$$ deci \n $$Δ=-36=36 \\cdot i^2$$ \n $$ \\sqrt(Δ) = \\sqrt(36 \\cdot i^2) = 6 \\cdot i$$</p>
                    </div>
                    <div class="container">
                        <p class="text">$$x_1 = \\frac{-b+\\sqrt(Δ)}{2 \\cdot a}=\\frac{-2+6i}{4}=\\frac{-2}{4}+\\frac{6}{4}\\cdot i =$$ \n $$= \\frac{-1}{2}+\\frac{3}{2}\\cdot i$$</p>
                        <p class="text">$$x_2 = \\frac{-b-\\sqrt(Δ)}{2 \\cdot a}=\\frac{-2-6i}{4}=\\frac{-2}{4}+\\frac{-6}{4}\\cdot i =$$ \n $$= \\frac{-1}{2}+\\frac{-3}{2}\\cdot i$$</p>
                    </div>
                    <br><br><br><br><br><br><br><br><br><br>
                    </body>
                    </html>
        """);
        return webViewDeltaNeg;
    }
}
