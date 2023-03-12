Algoritmo "Enquanto III"

Var
   qtdEntrevistados, maisNovo, maisVelho, idadeInformada, somaIdades : inteiro
   mediaIdade, porcentagemMenorIdade, qtdMenoresIdade : real
   
Inicio
      maisNovo <- 99999
      maisVelho<- 0
      qtdEntrevistados <- 0
      qtdMenoresIdade <- 0
      mediaIdade <- 0
      somaIdades <- 0
      porcentagemMenorIdade <- 0
      
      enquanto qtdEntrevistados < 5 faca
               escreval("Informe sua Idade: ")
               leia(idadeInformada)
               
               se idadeInformada >= maisVelho  entao
                  maisVelho <- idadeInformada
               fimse
               se idadeInformada <= maisNovo  entao
                  maisNovo <- idadeInformada
               fimse
               se idadeInformada < 18  entao
                  qtdMenoresIdade <- qtdMenoresIdade + 1
               fimse
               
               qtdEntrevistados <- qtdEntrevistados + 1
               somaIdades <- somaIdades + idadeInformada
      fimenquanto
      
      mediaIdade <- somaIdades/5
      porcentagemMenorIdade <- (qtdMenoresIdade / 5)*100
      
      escreval("Menor Idade: ",maisNovo)
      escreval("Maior Idade: ",maisVelho)
      escreval("Média das Idades: ",mediaIdade)
      escreval("Porcentagem menor de Idade ",porcentagemMenorIdade," %")

Fimalgoritmo