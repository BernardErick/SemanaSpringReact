# ![DevSuperior logo](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/devsuperior-logo-small.png) Semana Spring React
>  *Criando um app completo para gerenciamentos de vendas na Semana Spring React do professor Nélio Alves*

## Stacks
1) Sprint Boot - O Spring Boot facilita a criação de aplicativos autônomos baseados em Spring de nível de produção que você pode "simplesmente executar".
2) React - Uma biblioteca front-end JavaScript de código aberto com foco em criar interfaces de usuário em páginas web.
## Instalação
- Baixe o projeto com o comando: 
 
  `git clone https://github.com/BernardErick/SemanaSpringReact`

 
- Troque as configurações do `aplication.properties`, mudando as configurações da base de dados.


- Abra `Run Configurations` e coloque as váriaveis de ambiente que estão no `aplication.properties`.


- Execute o projeto.

## Heroku
- Caso queira subir sua própria versão para o heroku
- Entre na root do projeto e digite
```bash
heroku -v
heroku login
heroku git:remote -a <nome-do-app>
git remote -v
git subtree push --prefix backend heroku main
```