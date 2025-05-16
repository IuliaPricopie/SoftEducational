package ro.itschool.sixth;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Exam {
    public static WebView createWebViewExam(){
        WebView webViewExam = new WebView();
        webViewExam.setMinWidth(900);
        webViewExam.setMinHeight(850);

        WebEngine engineExam = webViewExam.getEngine();
        engineExam.loadContent("""
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
                        background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
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
                        color: #2C3E50;
                    }
                    .question {
                        font-size: 22px;
                        font-weight: bold;
                        margin-bottom: 15px;
                    }
                    .options label {
                        display: block;
                        font-size: 20px;
                        background: #f0f8ff;
                        padding: 10px;
                        border-radius: 8px;
                        margin: 8px 0;
                        cursor: pointer;
                        transition: 0.3s;
                    }
                    .button {
                           position: relative;
                           display: inline-block;
                           margin: 20px;
                         }
                    .button a {
                      color: white;
                      font-family: Helvetica, sans-serif;
                      font-weight: bold;
                      font-size: 20px;
                      text-align: center;
                      text-decoration: none;
                      background-color: #3498DB;
                      display: block;
                      position: relative;
                      padding: 10px 20px;
                      -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
                      text-shadow: 0px 1px 0px #000;
                      filter: dropshadow(color=#000, offx=0px, offy=1px);
                      -webkit-box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                      -moz-box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                      box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                      -webkit-border-radius: 5px;
                      -moz-border-radius: 5px;
                      border-radius: 5px;
                      transition: background-color 0.3s;
                    }
                
                    .button a:hover {
                      background-color: #1f78b4;
                    }
                
                    .button a:active {
                      top: 6px;
                      background-color: #1f78b4;
                      -webkit-box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                      -moz-box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                      box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                    }
                
                    #result {
                        text-align: center;
                        font-size: 20px;
                        font-weight: bold;
                        margin-top: 15px;
                    }
                </style>
            </head>
            <body>
                <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                  <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                  Test: Numere complexe
                  <dotlottie-player src="https://lottie.host/86eee004-f8e7-4058-ae15-be36ba8ed075/lDkQ56QcqH.lottie"
                  background="transparent"
                  speed="1"
                  style="width: 150px; height: 150px"
                  loop autoplay
                  ></dotlottie-player>
                </h1>
                </div>
                <div class="container">
                    <p class="question">Calculați (a+bi)(a-bi)</p>
                    <div class="options">
                    <label><input type="radio" name="q0" value="$$ a^2 + 2abi + b^2 $$" data-correct="false">$$ a^2 + 2abi + b^2 $$</label>
                    <label><input type="radio" name="q0" value="$$ a^2 + b^2 $$" data-correct="true">$$ a^2 + b^2 $$</label>
                    <label><input type="radio" name="q0" value="$$ a^2 - 2abi + b^2 $$" data-correct="false">$$ a^2 - 2abi + b^2 $$</label>
                    <label><input type="radio" name="q0" value="$$ a^2 - b^2 $$" data-correct="false">$$ a^2 - b^2 $$</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Partea reală a numărului complex z=2-4i este:</p>
                    <div class="options">
                    <label><input type="radio" name="q1" value="4" data-correct="false">4</label>
                    <label><input type="radio" name="q1" value="i" data-correct="false">i</label>
                    <label><input type="radio" name="q1" value="-4" data-correct="false">-4</label>
                    <label><input type="radio" name="q1" value="2" data-correct="true">2</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Partea imaginară a numărului complex z=-5+i este:</p>
                    <div class="options">
                    <label><input type="radio" name="q2" value="-5" data-correct="false">-5</label>
                    <label><input type="radio" name="q2" value="5" data-correct="false">5</label>
                    <label><input type="radio" name="q2" value="1" data-correct="true">1</label>
                    <label><input type="radio" name="q2" value="i" data-correct="false">i</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Care este partea imaginară a numărului z=(3+2i)+(6-2i)?</p>
                    <div class="options">
                    <label><input type="radio" name="q3" value="i" data-correct="false">i</label>
                    <label><input type="radio" name="q3" value="0" data-correct="true">0</label>
                    <label><input type="radio" name="q3" value="2i" data-correct="false">2i</label>
                    <label><input type="radio" name="q3" value="2" data-correct="false">2</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Calculeaza \\[
                              \\frac{3i+1}{2+i}
                              \\]</p>
                    <div class="options">
                    <label><input type="radio" name="q4" value="1+i" data-correct="true">1+i</label>
                    <label><input type="radio" name="q4" value="2+i" data-correct="false">2+i</label>
                    <label><input type="radio" name="q4" value="-i-2" data-correct="false">-i-2</label>
                    <label><input type="radio" name="q4" value="1-i" data-correct="false">1-i</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Dacă înmulțim un număr complex cu conjugatul său, obținem</p>
                    <div class="options">
                    <label><input type="radio" name="q5" value="0" data-correct="false">0</label>
                    <label><input type="radio" name="q5" value="Pătratul modulului său" data-correct="true">Pătratul modulului său</label>
                    <label><input type="radio" name="q5" value="Modulul său" data-correct="false">Modulul său</label>
                    <label><input type="radio" name="q5" value="Partea reală" data-correct="false">Partea reală</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Care dintre aceste propoziții este falsă?</p>
                    <div class="options">
                    <label><input type="radio" name="q6" value="Partea reală este notată cu Re(z)" data-correct="false">Partea reală este notată cu Re(z)</label>
                    <label><input type="radio" name="q6" value="$$ i^2=-1 $$" data-correct="false">$$ i^2=-1 $$</label>
                    <label><input type="radio" name="q6" value="Partea imaginară este notată cu Im(z)" data-correct="false">Partea imaginară este notată cu Im(z)</label>
                    <label><input type="radio" name="q6" value="Axa Oy este axa reală" data-correct="true">Axa Oy este axa reală</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Conversia între forme se face cu ajutorul formulei:</p>
                    <div class="options">
                    <label><input type="radio" name="q7" value="\\( a = |z| \\cos \\theta \\)" data-correct="true">\\( a = |z| \\cos \\theta \\)</label>
                    <label><input type="radio" name="q7" value="\\( a = z \\cos \\theta \\)" data-correct="false">\\( a = z \\cos \\theta \\)</label>
                    <label><input type="radio" name="q7" value="\\( a = |z| \\sin \\theta \\)" data-correct="false">\\( a = |z| \\sin \\theta \\)</label>
                    <label><input type="radio" name="q7" value="\\( a = z \\sin \\theta \\)" data-correct="false">\\( a = z \\sin \\theta \\)</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Rezolvă în mulțimea numerelor complexe $$5x^2+6x+2=0$$</p>
                    <div class="options">
                    <label><input type="radio" name="q8" value="1" data-correct="false">1+i</label>
                    <label><input type="radio" name="q8" value="2" data-correct="false">2/3+i</label>
                    <label><input type="radio" name="q8" value="Nu există soluții" data-correct="false">Nu există soluții</label>
                    <label><input type="radio" name="q8" value="-3/5-i/5" data-correct="true">-3/5-i/5</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Când delta este negativă:</p>
                    <div class="options">
                    <label><input type="radio" name="q9" value="Nu există deloc soluții" data-correct="false">Nu există deloc soluții</label>
                    <label><input type="radio" name="q9" value="Nu există soluții reale" data-correct="true">Nu există soluții reale</label>
                    <label><input type="radio" name="q9" value="Nu există soluții complexe" data-correct="false">Nu există soluții complexe</label>
                    <label><input type="radio" name="q9" value="Nu putem afla soluțiile" data-correct="false">Nu putem afla soluțiile</label>
                    </div>
                </div>
                <div ontouchstart="">
                  <div class="button" onclick="checkAnswers()">
                    <a href="#">Verifică răspunsurile</a>
                  </div>
                </div>
                <p id="result"></p>
                <br><br><br><br><br><br><br><br><br><br>
                <script>
                    function checkAnswers() {
                        let correct=0;
                        for (let i = 0; i < 10; i++) {
                            const selected = document.querySelector('input[name="q' + i + '"]:checked');
                            if (selected && selected.dataset.correct === "true") {
                                correct++;
                            }
                        }
                        const resultContainer = document.getElementById("result");
                
                        if (correct === 10) {
                            resultContainer.innerHTML = `
                                <p style="font-size: 24px; color: green;">Felicitări! Ai răspuns corect la toate întrebările!</p>
                                <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                                <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                                <dotlottie-player
                                    src="https://lottie.host/b295a587-bbab-4628-af17-126f3dac5096/PZVNGSOhhw.lottie"
                                    background="transparent"
                                    speed="1"
                                    style="width: 300px; height: 300px"
                                    loop
                                    autoplay>
                                </dotlottie-player>
                                </h1></div>
                            `;
                        } else {
                            resultContainer.textContent = "Ai obținut " + correct + " / 10";
                        }
                    }
                </script>
            </body>
            </html>
            """);

        return webViewExam;
    }
}
