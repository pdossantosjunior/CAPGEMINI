Algoritmo "Vetores - Números Reversos"

Var
numeros, numerosReversos : vetor[1..10] de inteiro
i, aux : inteiro

Inicio

aux <- 11

para i de 1 ate 10 faca
     Escreval("Informe o número ",i)
     leia(numeros[i])
     numerosReversos[aux-i] <- numeros[i]
fimpara

Fimalgoritmo