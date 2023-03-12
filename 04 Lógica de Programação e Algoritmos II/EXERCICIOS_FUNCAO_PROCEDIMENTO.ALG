Algoritmo "Exercícios_Função_Procedimento"

Var
lado1, lado2, lado3 : inteiro

procedimento lerDados()
inicio
      Escreval("Lado 1: ")
      leia(lado1)
      Escreval("Lado 2: ")
      leia(lado2)
      Escreval("Lado 3: ")
      leia(lado3)
fimprocedimento

funcao ehTriangulo ():logico
inicio
      se (lado1 > lado2 + lado3) ou (lado2 > lado1 + lado3) ou (lado3 > lado1 + lado2) entao
         retorne falso
      senao
         retorne verdadeiro
      fimse
fimfuncao

funcao tipoTriangulo() : caractere
inicio
      se (lado1 = lado2) E (lado2 = lado3) entao
         retorne "Equilátero"
      senao
      se (lado1 = lado2) OU (lado2 = lado3) OU (lado1 = lado3) entao
         retorne "Isósceles"
      senao
         retorne "Escaleno"
      fimse
      fimse
fimfuncao

Inicio
      lerDados()
      se ehTriangulo() entao
         escreval(tipoTriangulo())
      senao
         escreval("Não é triângulo")
      fimse
Fimalgoritmo