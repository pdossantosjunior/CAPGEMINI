Algoritmo "Repita"

Var
   senha, resposta : caractere
   i : inteiro
   
Inicio

      i <- 0
      Escreval("Informe a senha")
      leia(senha)
      
      limpatela //limpa a tela, como o nome diz

      repita
      
      Escreval("Digite a senha para sair do programa")
      leia(resposta)
      limpatela
      
      i<- i+1
      se i = 5 entao
         Escreval("Limite de tentativas alcançadas!")
         interrompa
      fimse

      ate resposta = senha

Fimalgoritmo