package ro.itschool.first;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class FormaTrig {
    public static WebView createWebViewFormaTrig(){
        WebView webView = new WebView();
        webView.setMinWidth(900);
        webView.setMinHeight(850);

        WebEngine engine = webView.getEngine();
        engine.loadContent(
                """
                <html lang="ro">
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
                                   justify-content: center;
                                   align-items: center;
                                   height: 100vh;
                               }
                               .container {
                                   display: flex;
                                   max-width: 900px;
                                   width: 100%;
                                   height: 600px;
                                   margin-top: 10px;
                               }
                               .left {
                                   width: 75%;
                                   display: flex;
                                   flex-direction: column;
                                   gap: 20px;
                               }
                               .right {
                                   width: 23%;
                                   display: flex;
                                   align-items: center;
                               }
                               .section {
                                   background-color: rgba(255, 255, 255, 0.8);
                                   border-radius: 15px;
                                   padding: 15px;
                                   box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1);
                                   transition: transform 0.3s ease-in-out;
                               }
                               .section-title {
                                   font-size: 22px;
                                   font-weight: bold;
                                   color: #2C3E50;
                                   margin-bottom: 8px;
                               }
                               ul {
                                   list-style: none;
                                   padding: 0;
                                   text-align: left;
                               }
                               ul li {
                                   background-color: #E3FDFD;
                                   color: #2C3E50;
                                   margin: 5px 0;
                                   padding: 8px;
                                   border-radius: 6px;
                                   font-weight: bold;
                               }
                               h1 {
                                   position: absolute;
                                   top: 20px;
                                   width: 100%;
                                   font-size: 34px;
                                   font-weight: bold;
                                   color: #2C3E50;
                                   text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
                               }
                           </style>
                       </head>
                       <body>
                           <h1 style="justify-content: center; margin: 0; display: flex; align-items: center; gap: 10px;">Forma Trigonometrică
                           <dotlottie-player
                             src="https://lottie.host/278d25f4-b96c-473c-ade9-b3f468e3d6b4/GczUYjKm0Z.lottie"
                             background="transparent"
                             speed="1"
                             style="width: 200px; height: 200px;"
                             loop
                             autoplay>
                           </dotlottie-player>
                           </h1>
                           <div class="container">
                               <!-- Coloana din stânga -->
                               <div class="left">
                                   <div class="section">
                                       <p class="section-title">Definiție</p>
                                       <p>Un număr complex poate fi exprimat în forma trigonometrică:</p>
                                       \\[
                                       z = |z| (\\cos \\theta + i \\sin \\theta)
                                       \\]
                                       <p>
                                           unde \\( \\theta \\) este argumentul, adică unghiul format de vector cu axa reală, \s
                                           notat \\( \\arg z = \\theta, \\quad \\theta \\in [0,2\\pi) \\).
                                       </p>
                                   </div>
                
                                   <div class="section">
                                       <p class="section-title">Argumentul în diferite cadrane</p>
                                       <ul>
                                           <li>În primul cadran: \\( \\arg z = \\arctan(\\frac{b}{a}) \\)</li>
                                           <li>În cadranul II și III: \\( \\arg z = \\pi + \\arctan(\\frac{b}{a}) \\)</li>
                                           <li>În cadranul IV: \\( \\arg z = 2\\pi + \\arctan(\\frac{b}{a}) \\)</li>
                                       </ul>
                                   </div>
                               </div>
                
                               <div class="right">
                                   <div class="section" style="width: 90%;">
                                       <p class="section-title">Conversia între forme</p>
                                       <ul>
                                           <li>\\( a = |z| \\cos \\theta \\)</li>
                                           <li>\\( b = |z| \\sin \\theta \\)</li>
                                       </ul>
                                   </div>
                               </div>
                           </div>
                
                       </body>
                       </html>
                """
        );
        VBox.setMargin(webView, new Insets(-30, 0, 0, 0));
        return webView;
    }
}
