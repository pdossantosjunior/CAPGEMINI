Algoritmo "Vetores"

Var
nomes : vetor[1..5] de caractere
i : inteiro
pesquisa : caractere
encontrado : logico

Inicio

para i de 1 ate 5 faca
     Escreval("Informe um nome para cadastrar")
     leia(nomes[i])
fimpara
limpatela

Escreval("Informe um nome a pesquisar")
leia(pesquisa)

encontrado <- Falso

para i de 1 ate 5 faca
     se nomes[i] = pesquisa então
        encontrado <- verdadeiro
     fimse
fimpara
     
se encontrado = verdadeiro entao
   Escreval("Nome encontrado!")
senao
   Escreval("Nome não encotrado!")
fimse

Fimalgoritmo