# Teste Caixa Branca

Os erros localizados no código abaixo são referentes a legibilidade, estruturação e segurança, abaixo discorro detalhadamente cada área.

![Capturar](https://github.com/leonidas144/TesteCaixaBranca/assets/91976743/5eea49c3-56f4-4838-95ed-7c79903c00e3)

<h3>Legibilidade</h3>

<li>Analisando o código acima notei que não há comentários no código tornando difícil seu entendimento;</li>
<li>O código não segue boas práticas, sem formatação e desorganizado, o que deixa o código menos legível.</li>

<h3>Estruturação</h3>

<li>Suas variáveis estão nomeadas de forma genérica;</li>
<li>Falta o correto tratamento de exceções que podem ocorrer.</li>

<h3>Segurança</h3>

<li>As conexões com o banco de dados não estão sendo fechadas corretamente.</li>

<h3>Código numerado</h3>

![Capturar](https://github.com/leonidas144/TesteCaixaBranca/assets/91976743/bbf78e55-5c86-4e92-af42-7a2431dc41eb)

<h3>Grafo de fluxo</h3>

![grafo](https://github.com/leonidas144/TesteCaixaBranca/assets/91976743/2b49669d-c252-4eb2-82c4-17759bedb356)

<h3>Cálculo da Complexidade Ciclomática</h3>

V(G) = E-N+2<br>
V(G) = 24-22+3<br>
V(G) = 4

<h3>Caminhos</h3>

Caminho 1: 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 18, 21, 22<br>
Caminho 2: 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 21, 22<br>
Caminho 3: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 21, 22<br>
Caminho 4: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 19, 20, 21, 22

<h3>Código documentado</h3>

![Capturar](https://github.com/leonidas144/TesteCaixaBranca/assets/91976743/af01f982-ec5c-4650-b079-eedfc6dd6fb7)

