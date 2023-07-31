# Sistema de Cadastro de Veículos (Locadora de Carros) - JDBC
Um Sistema de cadastro de veículos de minha autoria, utilizando os conceitos de JDBC e JAVA.
O código todo foi escrito utilizando o ECLIPSE IDE para desenvolimento e a tabela de dados para teste foi criada utilizando a ferramenta MySQL Workbench.


Email : tiago.programador@hotmail.com<br>
Linkedin: https://www.linkedin.com/in/tiagoribeirosantos/ <br>
Github: https://github.com/tiglinux/LocadoraCarrosJDBC/<br>
Apresentação do Projeto ao vivo: https://www.youtube.com/watch?v=E0iSgj17oI0

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos

Para baixar e clonar o repositório na sua máquina, basta rodar esse seguinte comando no terminal :

```
git clone https://github.com/tiglinux/LocadoraCarrosJDBC/
```

Ou simplesmente abrir o link do repositório e baixar direto através do botão

![image](https://github.com/tiglinux/CursoProfissional-JAVACodes2023/assets/8001737/f2f0c04b-c562-472d-a813-d0a0a1c67523)

![image](https://github.com/tiglinux/LocadoraCarrosJDBC/assets/8001737/2135c3a0-6fa9-47bb-840f-98422e862272)



Selecionando a opção baixar .zip


### 🔧 Instalação

Procedimentos necessários para instalação e execução de códigos e projetos Java (Pré-requisitos)
```
1. JDK Instalado na sua máquina local (A versão utilizada aqui é a 19).
2. Eclipse IDE ou InteliJIDEA, ou qualquer outra IDE Java de sua preferência
3. JRE (Acompanha juntamente com o JDK)
4. MySQL JDBC Driver Connector (Ele já vem junto com o projeto clonado na pasta "lib")
5. MySQL Workench instalado e configurado
6. MySQL Server (Ou qualquer outro SGBD de sua preferência)
```

### Modelo da Entidade utilizado no Projeto

![image](https://github.com/tiglinux/LocadoraCarrosJDBC/assets/8001737/ac64165f-379c-454e-8aeb-754b4c773cc2)



### 🔧 Configuração

Vídeo de como configurar Mysql Workbench:
[Configurando MySQL Workbench](https://www.youtube.com/watch?v=a5ul8o76Hqw)<br>

Vídeo de como configurar JDBC:
[Como configurar JDBC Connector no ECLIPSE IDE](https://www.youtube.com/watch?v=m7CTBNXjvGw)

No arquivo connection.properties em sua máquina local, dentro do ECLIPSE IDE configure as variáveis:
```
banco.url = jdbc:mysql://localhost:3306/locadoraCarro
banco.user = usuarioDefinidoMysqlWorkbench
banco.pass = senhaDefinidaMysqlWorkbench

```
o user e o pass, são conforme a sua definição (no momento de instalação e configuração do Mysql Workbench)  em sua máquina local.


Em seguida importar o projeto Java no ECLIPSE IDE através da opção "IMPORT" (Ou IDE de sua preferência).

## ⚙️ Executando os Arquivos .java 

Para executar os arquivos e exemplos .java , simplesmente selecione a pasta SRC:

![image](https://github.com/tiglinux/LocadoraCarrosJDBC/assets/8001737/5230eead-93d1-4bcd-a9b5-785c9af8b0ee)



e em seguida para executar o sistema de cadastro no Console, acesse  o arquivo "LocadoraSystem.java" com o método main() do projeto.
![image](https://github.com/tiglinux/LocadoraCarrosJDBC/assets/8001737/0d674d7b-0c32-438c-b156-49bded2cd2a0)


Recomendo que os testes sejam feitos para verificar se forem cadastrados os dados na tabela no banco de dados utilizando algum SGBD 
(NO meu caso estou utilizando o Mysql Workbench).

![image](https://github.com/tiglinux/LocadoraCarrosJDBC/assets/8001737/6056b24a-04e9-407e-8093-380631592da8)



## ✒️ Autor

* **Tiago Ribeiro Santos*  - [Desenvolvedor JAVA cada vez se aperfeiçoando](https://github.com/tiglinux/)


Você também pode ver colaborar com o projeto.


## 🎁 Expressões de gratidão

* Esse projeto tem me ajudado a crescer mais e mais com desenvolvimento JAVA e gostaria de agradecer a todos que me apoiaram com os estudos de JAVA! 📢;
* Gratidão a DEUS, por estar sempre ao meu lado e me dar a cada dia mais sabedoria.😊

---
⌨️ com ❤️ por [Tiago Ribeiro Santos](https://github.com/tiglinux/) 😊
