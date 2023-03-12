Algoritmo "Estruras Condicionais II"

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
      Escreval("Sua média é ",media)

      se media >= 7 então
         Escreva("Você passou!")
      senao
           se media < 5 então
              Escreva("Você reprovou!")
           senao
                Escreva("Você está de recuperação")
           fimse
      fimse

Fimalgoritmo