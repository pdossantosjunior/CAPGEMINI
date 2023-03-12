Algoritmo "Exercícios_Função_Procedimento II"

Var
opcaoMenu: caractere
clientes: vetor[1..5] de caractere

procedimento mostrarMenu()
inicio
      Escreval("1- Cadastrar")
      Escreval("2- Pesquisar")
      Escreval("3- Excluir")
      Escreval("4- Sair")
      leia(opcaoMenu)
fimprocedimento

procedimento cadastrar()
var
   i: inteiro
inicio
      para i de 1 ate 5 faca
           se clientes[i] = "" entao
           Escreval("Informe o nome do cliente: ")
           leia(clientes[i])
           fimse
      fimpara
fimprocedimento

procedimento pesquisar()
var
   i, indiceSucesso: inteiro
   nomeAPesquisar: caractere
inicio
      Escreval("Informe o nome do cliente a pesquisar: ")
      leia(nomeAPesquisar)
      
      indiceSucesso <- -1 //Nesse caso para evitar algum erro futuro com vetores
      
      para i de 1 ate 5 faca
           se clientes[i] = nomeAPesquisar entao
                indiceSucesso <- i
                interrompa
           fimse
      fimpara
      
      se indiceSucesso = -1 entao
         Escreval("Cliente não encontrado!")
      senao
         Escreval("Cliente encontrado na posição ",indiceSucesso)
      fimse
fimprocedimento

procedimento excluir()
var
   indiceExclusao : inteiro
inicio
      Escreval("Informe o indice do cliente a ser excluído: ")
      leia(indiceExclusao)
      
      se (indiceExclusao > 5) OU (indiceExclusao < 1) entao
          escreval("Indice inválido!")
      senao
          clientes[indiceExclusao] <- ""
          escreval("Cliente excluido!")
      fimse
fimprocedimento

Inicio
      repita
            mostrarMenu()
            escolha opcaoMenu
            caso "1"
                 cadastrar()
            caso "2"
                 pesquisar()
            caso "3"
                 excluir()
            fimescolha
      ate opcaoMenu = "4"
Fimalgoritmo