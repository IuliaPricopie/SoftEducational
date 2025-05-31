package ro.itschool.sapte;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Bibliografie {
    public static WebView createWebViewBibliografie() {
        WebView webView = new WebView();
        webView.setMinWidth(900);
        webView.setMinHeight(1150);

        WebEngine engine2 = webView.getEngine();
        engine2.loadContent("""
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
                                             padding: 40px;
                                             font-size: 16px;
                                             background-image: url('file:/C:/Users/iulica/Desktop/fundalBiblioteca.jpg');
                                             background-size: cover;
                                             background-position: center;
                                             background-repeat: no-repeat;
                                             background-attachment: fixed;
                                         }
                                         h1 {
                                             font-size: 35px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .container {
                                             display: flex;
                                             justify-content: center;
                                             gap: 50px;
                                         }
                                         .input-container.center {
                                             display: flex;
                                             justify-content: center;
                                         }
                                         .column {
                                             flex: 1;
                                             min-width: 340px;
                                             width: 95%;
                                             padding: 20px;
                                             border-radius: 15px;
                                             box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                             background-color: #FFFFFF;
                                              min-height: 1300px;
                                         }
                                         .adunare {
                                             background-color: rgba(192, 236, 255, 0.7);
                                         }
                                         .title {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .formula {
                                             font-size: 35px;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 15px;
                                         }
                                         .input::placeholder {
                                            font-size:20px;
                                            text-align: center;
                                         }
                                         .input-box {
                                             width: 70px;
                                             padding: 5px;
                                             font-size: 20px;
                                             border-radius: 8px;
                                             border: 2px solid #ccc;
                                             text-align: center;
                                             display: inline-block;
                                             margin: 5px auto;
                                             vertical-align: middle;
                                         }
                                         .input-group {
                                            display: inline-flex;
                                            align-items: center;
                                            color: #FFFFFF;
                                         }
                                         .input-group span {
                                            font-size: 20px;
                                            margin: 5px;
                                            vertical-align: middle;
                                         }
                                         .input-container {
                                            display: flex;
                                            justify-content: space-between;
                                            width: 100%;
                                         }
                                     </style>
                                 </head>
                                 <body>
                                 <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                                   <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                                   Bibliografie
                                 </h1>
                                 </div>
                                 <div class="container">
                                            <div class="container">
                                                <div class="column adunare">
                                                    <p class="title">Imagini și animații</p>
                                                    <ul>
                                                    <li>https://lottiefiles.com/</li>
                                                    <li>https://app.lottiefiles.com/animation/67a410a8-a1c6-4d57-9929-02f58bd5010b</li>
                                                    <li>https://app.lottiefiles.com/animation/f3e892b4-a823-492e-a5f8-900806f6dc3c</li>
                                                    <li>https://app.lottiefiles.com/animation/53b10094-d7ca-4daf-a455-f81094763f1b</li>
                                                    <li>https://app.lottiefiles.com/animation/1194345e-2123-4d4b-af5c-68c4df5b6944</li>
                                                    <li>https://app.lottiefiles.com/animation/6601a05b-5b5e-40b8-8c36-f0a355d0769d</li>
                                                    <li>https://app.lottiefiles.com/animation/455b0019-4f97-4e1b-ad84-6944b65908f7</li>
                                                    <li>https://app.lottiefiles.com/animation/d5e50496-4cc6-49f1-ad05-effb33de1cab</li>
                                                    <li>https://dev.to/webdeasy/top-20-css-buttons-animations-f41</li>
                                                    <li>https://ro.pinterest.com/pin/781656079106307859/</li>
                                                    <li>https://www.officedirect.ro/image/cache/catalog/table/tabla-scolara-creta-verde-200x200.jpg</li>
                                                    <li>https://m.media-amazon.com/images/I/616UNIX6bxL._AC_UF1000,1000_QL80_.jpg</li>
                                                    <li>https://img2.labirint.ru/rcimg/715e459aa96edb907a0f80ca9a16055d/1920x1080/books71/705914/ph_01.jpg?1564211200</li>
                                                    <li>https://i0.wp.com/profesorjitaruionel.com/wp-content/uploads/2018/09/nrcomplexe-1.png?resize=391%2C290&ssl=1</li>
                                                    </ul>
                                                    <div class="title">Informații</div>
                                                    <ul>
                                                    <li>Constantin Udriște, Ionel Tevy, Gheorghe Necșuleu, Matematică manual pentru clasa a X-a, Editura Fair Parteners 2005</li>
                                                    <li>Nicolaie Ghiță, Petrică Dicu, Matematică - algebră și analiză matematică, editura MathPress</li>
                                                    </ul>
                
                                                     <div class="title">Versiuni</div>
                                                    <ul>
                                                    <li>Versiune Java: 21.0.7
                                                    <li>Versiune JavaFX: 23.0.1
                                                    <li>Aplicație: Intellij Idea
                                                    </ul>
 
                                                    <div class="title">Realizat de: Pricopie Iulia,
                                                    clasa a X-a,
                                                    Liceul Teoretic „Ioan Slavici” Panciu</div>
                                                    <div class="title">
                                                    Profesori coordonatori: Daniela Gavril, Bogdan Grigoraș</div>
                                                </div>
                                            </div>
                                            </div>
                        </body>
                        </html>
                """);
        VBox.setMargin(webView, new Insets(0, 0, 0, 0));
        return webView;
    }
}
