# Criando um Banco Digital com Java e Orientação a Objetos

## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.


### Descrição do Desafio

Reforce seu conhecimento em Programação Orientada a Objetos (POO) em Java com um desafio de projeto totalmente prático. Para isso, os pilares da orientação a objetos são devidamente explorados no contexto bancário, onde o expert implementa um projeto de referência (disponibilizado no GitHub) de forma prática e interativa. Sendo assim, você poderá desenvolver sua capacidade de abstração reproduzindo essa solução. Além disso, caso queira ir além, implemente suas próprias evoluções e melhorias ;)


### Explicação das Melhorias

### Validação de Saque:

Verificação se o valor a ser sacado é maior que o saldo disponível. Se for, uma mensagem de erro é exibida.
Se o saldo for suficiente, o saque é realizado e uma mensagem de confirmação é exibida.

### Validação de Transferência:

Verificação se o valor a ser transferido é maior que o saldo disponível. Se for, uma mensagem de erro é exibida.
Se o saldo for suficiente, a transferência é realizada (sacar e depositar no destino) e uma mensagem de confirmação é exibida.
Adicionado um método getNumero() na interface IConta para que o número da conta de destino possa ser exibido na mensagem de confirmação.
Exemplo de Uso

### Ao executar o método main, se a transferência for bem-sucedida, as mensagens de confirmação serão exibidas no console. Se o saldo for insuficiente para alguma operação, a respectiva mensagem de erro será exibida.
