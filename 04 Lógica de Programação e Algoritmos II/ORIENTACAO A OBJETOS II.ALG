Algoritmo "Orientação a Objetos II"

tipo

cadastroCliente = registro
                nome: caractere
                rg: caractere
                idade: inteiro
fimregistro

Var

clientes: vetor[1..5] de cadastroCliente
opcao: caractere
i: inteiro
pesquisaRG: caractere

Inicio

repita
      Escreval("1- Cadastrar")
      Escreval("2- Pesquisar")
      Escreval("3- Sair")
      leia(opcao)
      
      se opcao = "1" entao
         para i de 1 ate 3 faca
              se clientes[i].nome = "" entao
                 Escreval("Digite seu nome: ")
                 leia(clientes[i].nome)
                 Escreval("Digite seu rg: ")
                 leia(clientes[i].rg)
                 Escreval("Digite sua idade: ")
                 leia(clientes[i].idade)
              interrompa
              fimse
         fimpara
      senao
           se opcao = "2" entao
              Escreval("Digite o RG: ")
              leia(pesquisaRG)
              para i de 1 ate 3 faca
                   se clientes[i].rg = pesquisaRG entao
                      Escreval(clientes[i].nome," encontrado!")
                      interrompa
                   fimse
              fimpara
           fimse
      fimse
ate opcao = "3"

Fimalgoritmo