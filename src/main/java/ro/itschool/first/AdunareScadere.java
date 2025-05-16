package ro.itschool.first;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class AdunareScadere {
    public static WebView createWebViewAdunareScadere(){
        WebView webViewAdunareScadere =new WebView();
        WebEngine engineAdunareScadere = webViewAdunareScadere.getEngine();
        engineAdunareScadere.loadContent("""
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
                                             max-width: 400px;
                                             min-width: 340px;
                                             width: 95%;
                                             padding: 20px;
                                             border-radius: 15px;
                                             box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                             background-color: #FFFFFF;
                                         }
                                         .adunare {
                                             background-color: #264653;
                                         }
                                         .scadere {
                                             background-color: #1B263B;
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
                                         .glow-on-hover {
                                             width: 220px;
                                             height: 50px;
                                             border: none;
                                             outline: none;
                                             color: #fff;
                                             background: #111;
                                             cursor: pointer;
                                             position: relative;
                                             z-index: 0;
                                             border-radius: 10px;
                                         }
                
                                         .glow-on-hover:before {
                                             content: '';
                                             background: linear-gradient(45deg, #ff0000, #ff7300, #fffb00, #48ff00, #00ffd5, #002bff, #7a00ff, #ff00c8, #ff0000);
                                             position: absolute;
                                             top: -2px;
                                             left:-2px;
                                             background-size: 400%;
                                             z-index: -1;
                                             filter: blur(5px);
                                             width: calc(100% + 4px);
                                             height: calc(100% + 4px);
                                             animation: glowing 20s linear infinite;
                                             opacity: 0;
                                             transition: opacity .3s ease-in-out;
                                             border-radius: 10px;
                                         }
                
                                         .glow-on-hover:active {
                                             color: #000
                                         }
                
                                         .glow-on-hover:active:after {
                                             background: transparent;
                                         }
                
                                         .glow-on-hover:hover:before {
                                             opacity: 1;
                                         }
                
                                         .glow-on-hover:after {
                                             z-index: -1;
                                             content: '';
                                             position: absolute;
                                             width: 100%;
                                             height: 100%;
                                             background: #111;
                                             left: 0;
                                             top: 0;
                                             border-radius: 10px;
                                         }
                                         
                                         .result {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-top: 10px;
                                             gap: 20px;
                                         }
                
                                         @keyframes glowing {
                                             0% { background-position: 0 0; }
                                             50% { background-position: 400% 0; }
                                             100% { background-position: 0 0; }
                                         }
                                     </style>
                                 </head>
                                 <body>
                                 <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                                   <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                                   Operații cu Numere Complexe
                                   <dotlottie-player
                                     src="https://lottie.host/0c052b78-ec4c-4652-a8bf-e9330bebb4ab/oHtJ3Sv8va.lottie"
                                     background="transparent"
                                     speed="1"
                                     style="width: 100px; height: 100px;"
                                     loop
                                     autoplay>
                                   </dotlottie-player>
                                 </h1>
                                 </div>
                                 <div class="container">
                                            <div class="container">
                                                <div class="column adunare">
                                                    <div class="title">Suma a două  \nnumere complexe</div>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            z_1 + z_2 = (a + bi) + (c + di) =
                                                            \\]
                                                        </p>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            = (a + c) + (b + d)i
                                                            \\]
                                                        </p>
                                                        <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="a" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="b" placeholder="b" class="input-box">
                                                            <span>i</span> 
                                                        </div>
                                                        </div>
                                                        <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="c" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="d" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                        <center><button class="glow-on-hover" type="button" onclick="calculateSum()">Calculează</button></center>
                                                        <div class="result" id="sumResult">Rezultat: </div>
                                                    </div>
                                                </div>
                
                                                <div class="column scadere">
                                                    <div class="title">Diferența dintre două \nnumere complexe</div>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            z_1 - z_2 = (a + bi) - (c + di) =
                                                            \\]
                                                        </p>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            = (a - c) + (b - d)i
                                                            \\]
                                                        </p>
                                                    <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="aS" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="bS" placeholder="b" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                    </div>
                                                    <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="cS" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="dS" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                             <center><button class="glow-on-hover" type="button" onclick="calculateSub()">Calculează</button></center>
                                                             <div class="result" id="subResult">Rezultat: </div>
                                                    </div>
                                                </div>
                                            </div>
                                            </div>
                            <script>
                                function calculateSum() {
                                    let a = parseFloat(document.getElementById('a').value) || 0;
                                    let b = parseFloat(document.getElementById('b').value) || 0;
                                    let c = parseFloat(document.getElementById('c').value) || 0;
                                    let d = parseFloat(document.getElementById('d').value) || 0;
                                    document.getElementById('sumResult').innerText = `Rezultat: ${a + c} + ${b + d}i`;
                                }
                                function calculateSub() {
                                    let a = parseFloat(document.getElementById('aS').value) || 0;
                                    let b = parseFloat(document.getElementById('bS').value) || 0;
                                    let c = parseFloat(document.getElementById('cS').value) || 0;
                                    let d = parseFloat(document.getElementById('dS').value) || 0;
                                    document.getElementById('subResult').innerText = `Rezultat: ${a - c} + ${b - d}i`;
                                }
                            </script>
                        </body>
                        </html>"""
        );
        webViewAdunareScadere.setPrefHeight(800);
        VBox.setMargin(webViewAdunareScadere, new Insets(-50, 0, 0, 0));
        return webViewAdunareScadere;
    }
}
