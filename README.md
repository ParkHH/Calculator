<h1>Calculator Project</h1>
<ul>
  <li>개발기간 : 2019-02-14 ~ 2019-03-22 (1개월 9일)</li>
  <li>인원 : 1명</li>
  <li>개발환경 : JavaSE, JDK1.8, Eclipse</li>
</ul>

<table style="text-align:center;">
  <tr>
    <td>UI</td>
    <td>상세 설명</td>
  </tr>
  <tr>
    <td>
    <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMjc4/MDAxNTU3MjA4NzgzNzcx.xjmH5qEAspFcDgAypmif4J69xAuGkGn_mNXUJihBwUUg.zcfgayGbA1heNmMKnAx_G4w7HkHyagZEcF-g4A9z2-sg.PNG.phh_92/calc.png?type=w2" width="250px"/>
    </td>
    <td>
      ▶ Calculator Design<br>
      <ul>
        <li>구성</li>
         1. 연산 내용 기록<br>
         2. 입력 숫자 표시 및 결과 출력<br>
         3. 연산 숫자 및 연산 기호 입력 버튼<br><br>
        <li>기능</li>
         1. 키패드 문자에 맞게 KeyEventListener 가 적용되어 있음<br>
         2. esc 누를시에 계산기 초기화 진행<br>
         3. 연산은 연산기호를 기준으로 양옆 숫자를 저장해 놓았다가 '=' 를 누를시 결과<br>
        <table>
          <tr>
            <td>
              1. 덧셈<br>(양수, 음수, 소수)
            </td>
          </tr>
          <tr>
            <td>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMjE3/MDAxNTU3MjA5NzE0NDYx.ChRYlGaSOjhrV08JTl3ULH7sJ7dTvnVrLvBfhcBNxfQg.UlL6tFvrvZdiLNaU6GMbhLZc0HIx6nqxuUwYWGHEkoEg.PNG.phh_92/%EC%96%91%EC%88%98_%EB%8D%A7%EC%85%88.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMTMy/MDAxNTU3MjA5NzE0MTgz.20pr2inHZX4h08j8XjLeR2e2As5qdbEjQQkB_RhrMqog.5TUIzKIo9BbVI0pKf8O7638z76jh_nDKLEDoHAQMHfAg.PNG.phh_92/%EC%96%91_%EC%9D%8C%EC%88%98_%EB%8D%A7%EC%85%88.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMTQg/MDAxNTU3MjA5NzEzODE5.QYuWMnCMEHU4Xkn3MU7drYO750Vp4l9AYnkA119HDV4g.kNDD11dAXreCXb3j98CWZMYruG8IMBgcmIu860fA5k0g.PNG.phh_92/%EC%86%8C%EC%88%98_%EB%8D%A7%EC%85%88.png?type=w2" width="150px"/>
            </td>
          </tr>
          <tr>
            <td>
              2. 뺄셈<br>(양수, 음수, 소수)
            </td>
          </tr>
          <tr>
            <td>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMTQ3/MDAxNTU3MjA5NzI3MzU0.Ont2Cbix8OZ9luf_f0eWkJqGSw9v5AFKLUVYRwtW9gUg.plBQP6q2u0-lfMjUlF0srkxE5LlaFsFoc0nlQW4z3Ggg.PNG.phh_92/%EC%96%91%EC%88%98_%EB%BA%84%EC%85%88.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMjk4/MDAxNTU3MjA5NzI3NTI5.dy4NylQdYNq5bRNb31T5Kx4A1dmx00lpI3ipbzHyH5Ug.78lOmeX6_BnL6D3rmOWexDkTWcJLQeT0sVUQYFtOhhcg.PNG.phh_92/%EC%9D%8C%EC%88%98_%EB%BA%84%EC%85%88.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMzYg/MDAxNTU3MjA5NzI3MTUz.Y6pf1dwQD-G2L6r9nRYY3J-PI0oJrb0Soe83WhLT3HMg.kGqORyy287mOsfIG00DruM8MJh0lvEF2wKu40bzs2fYg.PNG.phh_92/%EC%86%8C%EC%88%98_%EB%BA%84%EC%85%88.png?type=w2" width="150px"/>
            </td>
          </tr>
          <tr>
            <td>
              3. 곱셈<br>(양수, 음수, 소수)
            </td>
          </tr>
          <tr>
            <td>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfNzMg/MDAxNTU3MjA5NzM5ODA3.AZ-1tGGhowqfLPmvFuf-YVWV_wF1OXNMLNPnAsEzaBgg._sdjaegaCNQJ0BnnJaCgBh0i2fRqNjKKyxdxCfLva5Qg.PNG.phh_92/%EC%96%91%EC%88%98_%EA%B3%B1%EC%85%88.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfNjUg/MDAxNTU3MjA5NzM5OTk0.trKcMPkGzvGw8arivXsY38v8P8pkqDPqPEnjIr-Lvakg.QxZRkrzky6qG1YgxHGxp2GduutcWS_qi09B5kCUaf54g.PNG.phh_92/%EC%9D%8C%EC%88%98_%EA%B3%B1%EC%85%88.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMzkg/MDAxNTU3MjA5NzM5NjIx.WyiwADGyuItoFPd-Ix1hK21z6FEROZjCseHpXoIE2qkg.faNDDqi5uZiOeIxx_tUt8VYXa0BCOEFXuqvPajKRSS8g.PNG.phh_92/%EC%86%8C%EC%88%98_%EA%B3%B1%EC%85%88.png?type=w2" width="150px"/>
            </td>
          </tr>
          <tr>
            <td>
              4. 나눗셈<br>(양수, 음수, 소수)
            </td>
          </tr>
          <tr>
            <td>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMTI5/MDAxNTU3MjA5NzUxMzEx.mBbyyZ00eBso-adhI7vEUEcwpSZY4-redv5eJzYc87gg.9p4nsGJDhKn2VrWHwFGYW5qHEcBWiyXP2R0Tb7pxFpcg.PNG.phh_92/%EC%96%91%EC%88%98_%EB%82%98%EB%88%97%EC%85%88.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMjgx/MDAxNTU3MjA5NzUxNTMy.Bl7VNqblN9xehzKEHzChYD7QZEMqaljwVXsTXT5usQEg.OeraOqwomZCxYaFq6ak4wm5ukL7Z8Gd1eMdLPg_oCicg.PNG.phh_92/%EC%9D%8C%EC%88%98_%EB%82%98%EB%88%97%EC%85%88.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMTEy/MDAxNTU3MjA5NzUxMDg4.LgcXXR8hCQsjIhjKD7PUddP7iiiiZIXh53zfxMM5ik8g.ySWlN0hxtj3XhxGR10N0bjacmvGJQgaSVACQ_rowCOwg.PNG.phh_92/%EC%86%8C%EC%88%98_%EB%82%98%EB%88%97%EC%85%88.png?type=w2" width="150px"/>
            </td>
          </tr>
          <tr>
            <td>
              5. 나머지<br>(양수, 음수, 소수)
            </td>
          </tr>
          <tr>
            <td>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMTkg/MDAxNTU3MjA5NzYyNTM2.KilSSe9MbjseeAkBFdI9XYNdVomVTToBGDXXyJB8zmAg.7mXqCrh3zs60RAg6z2NfAfS38klbt2NNIDzn_QTn-7Ig.PNG.phh_92/%EC%96%91%EC%88%98_%EB%82%98%EB%A8%B8%EC%A7%80.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfMjE0/MDAxNTU3MjA5NzYyNzcw.5mB9kTO3LE1GtoOdjYBigyT6uUqUjdEXxMy11ZITmIgg.jgayzIuFxCUP2s2fbSD6q9TbOEn7Ka1nmirx3WBtLzsg.PNG.phh_92/%EC%9D%8C%EC%88%98_%EB%82%98%EB%A8%B8%EC%A7%80.png?type=w2" width="150px"/>
              <img src="https://blogfiles.pstatic.net/MjAxOTA1MDdfNTAg/MDAxNTU3MjA5NzYyMzM4.uCoGZ_-ckdbo4GJLmUqSU0G0GbJXhu-pMZnmhvLbKtcg.gljaFgn-LHV_FH18hRjBmGLV8QXbf3rc8ZLrof6BGiUg.PNG.phh_92/%EC%86%8C%EC%88%98_%EB%82%98%EB%A8%B8%EC%A7%80.png?type=w2" width="150px"/>
            </td>
          </tr>
        </table>
      </ul>
    </td>
  </tr>
</table>
