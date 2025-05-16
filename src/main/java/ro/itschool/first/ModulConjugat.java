package ro.itschool.first;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ModulConjugat {
    public static WebView createWebViewModulConjugat(){
        WebView webViewModulConjugat=new WebView();
        WebEngine engineModulConjugat = webViewModulConjugat.getEngine();
        engineModulConjugat.loadContent("""
                <html>
                                        <head>
                                            <script type="text/javascript" async
                                                src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                            <script type="text/javascript" id="MathJax-script" async
                                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                                            <style>
                                                body {
                                                    font-family: Arial, sans-serif;
                                                    padding: 40px;
                                                    background-image: url('file:/C:/Users/iulica/Desktop/fundalBiblioteca.jpg');
                                                    background-size: cover;
                                                    background-position: center;
                                                    background-repeat: no-repeat;
                                                    background-attachment: fixed;
                                                }
                                                h1 {
                                                    font-size: 36px;
                                                    font-weight: bold;
                                                    color: #FFFFFF;
                                                    text-align: center;
                                                    margin-bottom: 20px;
                                                }
                                                .container {
                                                    display: flex;
                                                    justify-content: space-between;
                                                    gap: 50px;
                                                }
                                                .column {
                                                    width: 48%;
                                                    padding: 20px;
                                                    border-radius: 15px;
                                                    box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                                }
                                                .modul {
                                                    background-color: #264653;
                                                }
                                                .conjugat {
                                                    background-color: #1B263B;
                                                }
                                                .title {
                                                    font-size: 26px;
                                                    font-weight: bold;
                                                    color: #FFFFFF;
                                                    text-align: center;
                                                    margin-bottom: 20px;
                                                }
                                                .formula {
                                                    font-size: 22px;
                                                    color: #FFFFFF;
                                                    text-align: center;
                                                    margin-bottom: 15px;
                                                }
                                                .input-box {
                                                    width: 90%;
                                                    padding: 12px;
                                                    font-size: 18px;
                                                    border-radius: 8px;
                                                    border: 2px solid #ccc;
                                                    text-align: center;
                                                    display: block;
                                                    margin: 10px auto;
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
                                            <h1>Modulul și Conjugatul unui Număr Complex</h1>
                                            <div class="container">
                                                <div class="column modul">
                                                    <div class="title">Modulul unui număr complex</div>
                                                    <div class="formula">$$ |z| = \\sqrt{a^2 + b^2} $$</div>
                                                    <input class="input-box" id="inputA" type="number" placeholder="Introduceți a">
                                                    <input class="input-box" id="inputB" type="number" placeholder="Introduceți b">
                                                    <center><button class="glow-on-hover" type="button" onclick="calculateModul()">Calculează</button>
                                                    <div class="result" id="resultModul">Modulul: </div>
                                                </div>
                                                <div class="column conjugat">
                                                    <div class="title">Conjugatul unui număr complex</div>
                                                    <div class="formula">$$ \\overline{z} = a - b i $$</div>
                                                    <input class="input-box" id="inputAConj" type="number" placeholder="Introduceți a">
                                                    <input class="input-box" id="inputBConj" type="number" placeholder="Introduceți b">
                                                    <center><button class="glow-on-hover" type="button" onclick="calculateConjugat()">Calculează</button>
                                                    <div class="result" id="resultConjugat">Conjugatul: </div>
                                                </div>
                                            </div>
                
                                            <script>
                                                function calculateModul() {
                                                    let a = parseFloat(document.getElementById('inputA').value);
                                                    let b = parseFloat(document.getElementById('inputB').value);
                                                    if (!isNaN(a) && !isNaN(b)) {
                                                        let modul = Math.sqrt(a * a + b * b).toFixed(3);
                                                        document.getElementById('resultModul').innerText = "|z| = " + modul;
                                                    } else {
                                                        document.getElementById('resultModul').innerText = "Introduceți valori valide!";
                                                    }
                                                }
                
                                                function calculateConjugat() {
                                                    let a = parseFloat(document.getElementById('inputAConj').value);
                                                    let b = parseFloat(document.getElementById('inputBConj').value);
                                                    if (!isNaN(a) && !isNaN(b)) {
                                                        let sign = b >= 0 ? "-" : "+";
                                                        document.getElementById('resultConjugat').innerText = "Conjugatul: " + a + sign + Math.abs(b) + "i";
                                                    } else {
                                                        document.getElementById('resultConjugat').innerText = "Introduceți valori valide!";
                                                    }
                                                }
                                            </script>
                                        </body>
                                        </html>"""
        );
        webViewModulConjugat.setPrefHeight(800);
        VBox.setMargin(webViewModulConjugat, new Insets(-50, 0, 0, 0));
        return webViewModulConjugat;
    }
}
