Algoritmo "Vetores - N�meros Reversos"

Var
numeros, numerosReversos : vetor[1..10] de inteiro
i, aux : inteiro

Inicio

aux <- 11

para i de 1 ate 10 faca
     Escreval("Informe o n�mero ",i)
     leia(numeros[i])
     numerosReversos[aux-i] <- numeros[i]
fimpara

Fimalgoritmo