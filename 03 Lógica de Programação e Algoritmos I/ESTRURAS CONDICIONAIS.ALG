Algoritmo "Estruras Condicionais"

Var
   nota1, nota2, nota3, media : real
   
Inicio
      Escreva("Informe a nota 1: ")
      leia(nota1)
      Escreva("Informe a nota 2: ")
      leia(nota2)
      Escreva("Informe a nota 3: ")
      leia(nota3)
      Escreval(" ")
      
      media <- (nota1 + nota2 + nota3)/3
      Escreval("Sua m�dia � ", media)

      se media < 7 ent�o
         Escreva("Voc� est� de recupera��o")
      senao
           Escreva("Voc� passou!")
      fimse

      

Fimalgoritmo