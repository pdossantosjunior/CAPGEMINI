Algoritmo "Enquanto"

Var
   alturaMarcelo, alturaJoao, cresMarcelo, cresJoao : real
   idade : inteiro
   
Inicio
      alturaMarcelo <- 1.2
      alturaJoao <- 1.05
      cresMarcelo <- 0.05
      cresJoao <- 0.07
      idade <- 8

     enquanto alturaMarcelo >= alturaJoao faca
              alturaMarcelo <- alturaMarcelo + cresMarcelo
              alturaJoao <- alturaJoao + cresJoao
              idade <- idade + 1
     fimenquanto
     
     escreval("João passou a ser maior que Marcelo com ",idade, " anos")
      

Fimalgoritmo