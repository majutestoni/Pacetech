algoritmo "semnome"

var
tempH: vetor[1..4] de real
tempT: vetor[1..4] de real
opcaoMenu, h, t, j: inteiro
c,x, aux, auxh : real
v: logico

funcao FparaC (f: real): real
inicio
retorne (f-32)/1.8
fimfuncao

funcao CparaF(y: real): real
inicio
retorne y * 1.8 + 32
fimfuncao

procedimento metodoB() : real
inicio

para t de 1 ate 4 faca
   para j  de 1 ate 4 faca
      se tempT[t]< tempT[j] entao
         aux<- tempT[j]
         auxh <- tempH[j]
         tempT[j]<-tempT[t]
         tempH[j]<-tempH[t]
         tempT[t]<- aux
         tempH[t]<- auxh
      fimse
   fimpara
fimpara

fimprocedimento

inicio
escreval("Qual tipo de conversão você gostaria de realizar?")
escreval("Digite 1 de Celsius para Fahrenheit ou 2 de Fahrenheit para Celsius: ")
leia(opcaoMenu)
limpatela

para h de 1 ate 4 faca
   escreval("Digite a hora da medição", h)
   leia(tempH[h])
fimpara
para t de 1 ate 4 faca
   escreval("Digite a temperatura na mediçao ", t)
   leia(tempT[t])
fimpara
limpatela

metodoB()

se opcaoMenu = 1 entao

   escreval()
   escreval("Os resultados das conversões, em forma crescente, são: ")
   para t de 1 ate 4 faca
      x<-CparaF(tempT[t])
      escreval( "A temperatura ", tempT[t], ", registrada as ", tempH[t], " horas corresponde a ", x:10:2, " em Fahrenheit")
   fimpara

senao

   se opcaoMenu = 2 entao

      escreval()
      escreval("Os resultados das conversões, em forma crescente, são: ")
      para t de 1 ate 4 faca
         c<-FparaC(tempT[t])
         escreval( "A temperatura ", tempT[t], ", registrada as ", tempH[t], " horas corresponde a ", c:10:2, " em Celsius")
      fimpara

   fimse
fimse

fimalgoritmo
