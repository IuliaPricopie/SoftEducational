package ro.itschool.first;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class FormaTrig2 {
    public static WebView createWebViewFormaTrig(){
        WebView webView=new WebView();
        webView.setMinWidth(900);
        webView.setMinHeight(1150);

        WebEngine engine2 = webView.getEngine();
        engine2.loadContent(
                """
                        <html>
                        <head>
                            <script type="text/javascript" async src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                            <script type="text/javascript" id="MathJax-script" async\s
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                            <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                            <style>
                                body {
                                    font-family: 'Arial', sans-serif;
                                    font-size: 18px;
                                    padding: 20px;
                                    margin: 0;
                                    background: linear-gradient(135deg, #FFDEE9, #B5FFFC);
                                    text-align: center;
                                    display: flex;
                                    flex-direction: column;
                                    justify-content: center;
                                    align-items: center;
                                    height: 100vh;
                                }
                        
                                .container {
                                    width: 90%;
                                    max-width: 800px;
                                }
                        
                                .section {
                                    background-color: rgba(255, 255, 255, 0.8);
                                    border-radius: 15px;
                                    padding: 15px;
                                    margin-bottom: 15px;
                                    box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1);
                                    transition: transform 0.3s ease-in-out;
                                }
                        
                                .section-title {
                                    font-size: 22px;
                                    font-weight: bold;
                                    color: #2C3E50;
                                    margin-bottom: 8px;
                                }
                        
                                h1 {
                                    font-size: 34px;
                                    font-weight: bold;
                                    color: #2C3E50;
                                    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
                                    margin-bottom: 20px;
                                }
                            </style>
                        </head>
                        <body>
                        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                            <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                              <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                              Proprietăți ale Formei Trigonometrice
                              <dotlottie-player
                              src="https://lottie.host/6dea93cd-c8e3-4ac2-a14b-d5017787f6e8/06WhqxGGCS.lottie"
                              background="transparent"
                              speed="1"
                              style="width: 300px; height: 300px"
                              loop
                              autoplay
                              ></dotlottie-player>
                            </h1>
                            </div>
                            <div class="container">
                                <div class="section">
                                    <p class="section-title">✨ Înmulțirea</p>
                                    <p>
                                        \\[
                                        z_1 \\cdot z_2 = |z_1| |z_2| [\\cos(\\theta_1 + \\theta_2) + i \\sin(\\theta_1 + \\theta_2)]
                                        \\]
                                    </p>
                                </div>
                        
                                <div class="section">
                                    <p class="section-title">✨ Împărțirea</p>
                                    <p>
                                        \\[
                                        \\frac{|z_1|}{|z_2|} =\s
                                        \\frac{|z_1| ( \\cos \\theta_1 + i \\sin \\theta_1 )}{ |z_2| ( \\cos \\theta_2 + i \\sin \\theta_2 )} = \\frac{|z_1|}{|z_2|} [\\cos( \\theta_1 - \\theta_2) + i \\sin(\\theta_1 - \\theta_2)]
                                        \\]
                                    </p>
                                </div>
                        
                                <div class="section">
                                    <p class="section-title">✨ Ridicarea la putere</p>
                                    <p>
                                        \\[
                                        z^n = |z|^n ( \\cos \\theta + i \\sin \\theta )^n = |z|^n [\\cos(n\\theta) + i \\sin(n\\theta)]
                                        \\]
                                    </p>
                                </div>
                            </div>
                        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                        </body>
                        </html>"""
        );
        VBox.setMargin(webView, new Insets(-100, 0, 0, 0));
        return webView;
    }
}
