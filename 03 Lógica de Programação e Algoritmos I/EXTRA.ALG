Algoritmo "Extra"

Var
   altura, peso, imc : real
   
Inicio
      Escreval("Informe sua altura")
      leia(altura)
      Escreval("Informe seu peso")
      leia(peso)
      
      imc <- peso / altura ^ 2
      
      se imc < 18 entao
         Escreval("Abaixo do peso")
      senao
           se imc < 24 entao
              Escreval("Peso ideal")
           senao
                Escreval("Acima do peso")
           fimse
      fimse
      

Fimalgoritmo