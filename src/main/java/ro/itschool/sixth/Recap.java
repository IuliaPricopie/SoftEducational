package ro.itschool.sixth;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Recap {
    public static WebView createWebViewRecap(){
        WebView webViewRecap = new WebView();
        webViewRecap.setMinWidth(900);
        webViewRecap.setMinHeight(850);

        WebEngine engineRecap = webViewRecap.getEngine();
        engineRecap.loadContent("""
              <html>
              <head>
                 <script type="text/javascript" async\s
                     src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                 <script type="text/javascript" id="MathJax-script" async\s
                     src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
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
                          font-size: 32px;
                          color: #2C3E50;
                      }
                      h2 {
                          font-size: 28px;
                          color: #2C3E50;
                      }
                      .formule {
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
                      .options label:hover {
                          background: #d4eaff;
                      }
                      .check-btn {
                          font-size: 20px;
                          padding: 10px 15px;
                          background: #3498db;
                          color: white;
                          border: none;
                          border-radius: 8px;
                          cursor: pointer;
                          margin-top: 15px;
                      }
                      .check-btn:hover {
                          background: #1f78b4;
                      }
                      #result {
                          font-size: 22px;
                          font-weight: bold;
                          margin-top: 15px;
                      }
                      .correct {
                          color: green;
                      }
                      .wrong {
                          color: red;
                      }
                  </style>
              </head>
              <body>
                  <h1>RECAPITULARE<h1>
                  <div class="container">
                      <h2>Modul</h2>
                      <p class="formule">$$ |z| = \\sqrt{a^2 + b^2} $$</p>
                  </div>
                  <div class="container">
                      <h2>Conjugat</h2>
                      <p class="formule">$$ \\overline{z} = a - b i $$</p>
                  </div>
                  <div class="container">
                      <h2>Suma</h2>
                      <p class="formule">
                      \\[
                      z_1 + z_2 = (a + bi) + (c + di) = (a + c) + (b + d)i
                      \\]
                      </p>
                  </div>
                  <div class="container">
                      <h2>Diferența</h2>
                      <p class="formule">
                      \\[
                      z_1 - z_2 = (a + bi) - (c + di) = (a - c) + (b - d)i
                      \\]
                      </p>
                  </div>
                  <div class="container">
                      <h2>Produsul</h2>
                      <p class="formule">
                      \\[
                      z_1 \\cdot z_2 = (a + bi) \\cdot (c + di) = (ac - bd) + (ad + bc)i
                      \\]
                      </p>
                  </div>
                  <div class="container">
                      <h2>Împărțirea</h2>
                      <p class="formule">
                          \\[
                          \\frac{z_1}{z_2} = \\frac{(a+bi)}{(c+di)} = \\frac{(a+bi)(c-di)}{c^2 + d^2} =
                          \\]
                      </p>
                      <p class="formule">
                          \\[
                          = \\frac{(ac+bd)+(bc-ad)i}{c^2 + d^2} = \\frac{ac+bd}{c^2 + d^2} + \\frac{(bc-ad)}{c^2 + d^2}i
                          \\]
                      </p>
                  </div>
                  <br><br><br><br><br><br><br><br><br>
              </body>
              </html>
              """);

        return webViewRecap;
    }
}
