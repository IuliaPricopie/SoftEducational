package ro.itschool.fifth;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class AplicatiiGeo {
    public static WebView createWebViewAplicatiiGeo1(){
        WebView webViewAplicatiiGeo = new WebView();
        webViewAplicatiiGeo.setMinWidth(900);
        webViewAplicatiiGeo.setMinHeight(850);

        WebEngine engineAplicatiiGeo = webViewAplicatiiGeo.getEngine();
        engineAplicatiiGeo.loadContent("""
                    <html lang="ro">
                    <head>
                        <meta charset="UTF-8">
                        <style>
                            body {
                                font-family: 'Arial', sans-serif;
                                text-align: center;
                                padding: 20px;
                                background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                                background-size: cover;
                                background-position: center;
                                background-repeat: no-repeat;
                                background-attachment: fixed;
                            }
                            h1 {
                                font-size: 32px;
                                margin-bottom: 25px;
                            }
                            .container {
                                width: 80%;
                                max-width: 700px;
                                background: white;
                                padding: 30px;
                                border-radius: 15px;
                                box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                                margin: auto;
                                text-align: left;
                            }
                            ul {
                                list-style-type: disc;
                                padding-left: 20px;
                            }
                            li {
                                font-size: 20px;
                                margin-bottom: 25px;
                            }
                            .formula-box {
                                margin-top: 8px;
                                padding: 10px;
                                border: 2px solid #0007D1;
                                border-radius: 8px;
                                background-color: #fff;
                                display: inline-block;
                                font-size: 22px;
                            }
                        </style>
                        <script type="text/javascript" id="MathJax-script" async
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                    </head>
                    <body>
                        <h1>Aplicații ale numerelor complexe în geometrie</h1>
                        <div class="container">
                            <ul>
                                <li>
                                    Afixul mijlocului unui segment AB:
                                    <div class="formula-box">\\( z = \\frac{Z_A + Z_B}{2} \\)</div>
                                </li>
                                <li>
                                    Afixul centrului de greutate \\( G \\) al unui triunghi ABC:
                                    <div class="formula-box">\\( Z_G = \\frac{Z_A + Z_B + Z_C}{3} \\)</div>
                                </li>
                                <li>
                                    Punctele \\( M_1, M_2, M_3, M_4 \\) sunt vârfurile unui paralelogram dacă și numai dacă:
                                    <div class="formula-box">\\( Z_1 + Z_3 = Z_2 + Z_4 \\)</div>
                                    deoarece diagonalele \\( M_1M_3 \\) și \\( M_2M_4 \\) au același mijloc.
                                </li>
                            </ul>
                        </div>
                    </body>
                    </html>
        """);
        return webViewAplicatiiGeo;
    }

    public static WebView createWebViewAplicatiiGeo2(){
        WebView webViewAplicatiiGeo2 = new WebView();
        webViewAplicatiiGeo2.setMinWidth(900);
        webViewAplicatiiGeo2.setMinHeight(850);

        WebEngine engineAplicatiiGeo2 = webViewAplicatiiGeo2.getEngine();
        engineAplicatiiGeo2.loadContent("""
                    <html lang="ro">
                    <head>
                        <meta charset="UTF-8">
                        <style>
                            body {
                                font-family: 'Arial', sans-serif;
                                text-align: center;
                                padding: 20px;
                                background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                                background-size: cover;
                                background-position: center;
                                background-repeat: no-repeat;
                                background-attachment: fixed;
                            }
                            h1 {
                                font-size: 32px;
                                margin-bottom: 25px;
                            }
                            .title {
                                font-size: 30px;
                                color: #000000;
                                margin-bottom: 20px;
                            }
                            .container {
                                width: 80%;
                                max-width: 700px;
                                background: white;
                                padding: 30px;
                                border-radius: 15px;
                                box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                                margin: auto;
                                text-align: left;
                            }
                            ul {
                                list-style-type: disc;
                                padding-left: 20px;
                            }
                            li {
                                font-size: 20px;
                                margin-bottom: 25px;
                            }
                            .formula-box {
                                margin-top: 8px;
                                padding: 10px;
                                border: 2px solid #0007D1;
                                border-radius: 8px;
                                background-color: #fff;
                                display: inline-block;
                                font-size: 22px;
                            }
                        </style>
                        <script type="text/javascript" id="MathJax-script" async
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                    </head>
                    <body>
                        <h1>Aplicații ale numerelor complexe în geometrie</h1>
                        <div class="container">
                        <div class="title">Distanțe</div>
                            <ul>
                                <li>Distanța dintre 2 puncte A și B: <span class="math">\\[ AB = |Z_A - Z_B| = |Z_B - Z_A| \\]</span></li>
                                <li>Mulțimea punctelor \\( M(z) \\) pentru care \\( |z - a| = r \\), unde \\( a \\in \\mathbb{C} \\) și \\( r \\in \\mathbb{R}_+^* \\), este un cerc cu centrul în \\( A(a) \\) și rază \\( r \\).</li>
                                <li>Fiind date două puncte A și B, mulțimea punctelor \\( M(z) \\) care satisfac relația \\( |z - Z_A| = |z - Z_B| \\), este mediatoarea segmentului AB.</li>
                            </ul>
                        </div>
                    </body>
                    </html>
        """);
        return webViewAplicatiiGeo2;
    }

    public static WebView createWebViewAplicatiiGeo3(){
        WebView webViewAplicatiiGeo3 = new WebView();
        webViewAplicatiiGeo3.setMinWidth(900);
        webViewAplicatiiGeo3.setMinHeight(850);

        WebEngine engineAplicatiiGeo3 = webViewAplicatiiGeo3.getEngine();
        engineAplicatiiGeo3.loadContent("""
                    <html lang="ro">
                    <head>
                        <meta charset="UTF-8">
                        <style>
                            body {
                                font-family: 'Arial', sans-serif;
                                text-align: center;
                                padding: 20px;
                                background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                                background-size: cover;
                                background-position: center;
                                background-repeat: no-repeat;
                                background-attachment: fixed;
                            }
                            h1 {
                                font-size: 32px;
                                margin-bottom: 25px;
                            }
                            .title {
                                font-size: 30px;
                                color: #000000;
                                margin-bottom: 20px;
                            }
                            .container {
                                width: 80%;
                                max-width: 700px;
                                background: white;
                                padding: 30px;
                                border-radius: 15px;
                                box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                                margin: auto;
                                text-align: left;
                            }
                            ul {
                                list-style-type: disc;
                                padding-left: 20px;
                            }
                            li {
                                font-size: 20px;
                                margin-bottom: 25px;
                            }
                            .formula-box {
                                margin-top: 8px;
                                padding: 10px;
                                border: 2px solid #0007D1;
                                border-radius: 8px;
                                background-color: #fff;
                                display: inline-block;
                                font-size: 22px;
                            }
                        </style>
                        <script type="text/javascript" id="MathJax-script" async
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                    </head>
                    <body>
                        <h1>Aplicații ale numerelor complexe în geometrie</h1>
                        <div class="container">
                        <div class="title">Unghiuri</div>
                            <ul>
                                <li>
                                    Fie \\( A, B, C \\) cu afixele \\( z_A, z_B, z_C \\), atunci unghiul dintre vectorii \\( \\vec{AB} \\) și \\( \\vec{AC} \\) este:
                                    <span class="math"> \\( \\measuredangle(\\vec{AB}, \\vec{AC}) = \\arg \\left( \\frac{z_C - z_A}{z_B - z_A} \\right) \\)</span>
                                </li>
                                <li>
                                    Dacă \\( \\frac{z_C - z_A}{z_B - z_A} \\in \\mathbb{R} \\), atunci punctele \\( A, B, C \\) sunt coliniare.
                                </li>
                                <li>
                                    Dacă \\( \\frac{z_A - z_B}{z_C - z_D} \\in \\mathbb{R}^* \\), atunci punctele \\( A, B, C, D \\) se află pe drepte perpendiculare: \\( AB \\perp CD \\).
                                </li>
                                <li>
                                    Dacă raportul
                                    <span class="math">\\( \\frac{z_A - z_C}{z_B - z_D} : \\frac{z_A - z_D}{z_B - z_C} \\in \\mathbb{R} \\)</span>
                                    atunci punctele \\( A, B, C, D \\) sunt conciclice sau coliniare, iar unghiurile \\( \\angle ACB \\) și \\( \\angle ADB \\) sunt egale sau suplementare.
                                </li>
                            </ul>
                        </div>
                    </body>
                    </html>
        """);
        return webViewAplicatiiGeo3;
    }
}
