algoritmo "conversor"

var
temperaturaC: real
temperaturaF: real
moedaD: real
moedaR: real
valorD: real
menu: inteiro

inicio
escreval (" Olá, bem vindo ao melhor conversor!!")
escreval ("Por favor, digite o valor do dólar no atual momento:")
leia (valorD)
escreval ("Obrigado!!")
limpatela

repita

   escreval ("O que você gostaria de converter?")
   escreval(  "Digite 1 de Fahrenheit para Celsius")
   escreval(  "Digite 2 de Celsius para Fahrenheit")
   escreval(  "Digite 3 de Dólar para Real")
   escreval(  "Digite 4 de Real para Dólar")
   escreval(  "Digite 5 para sair")
   leia(menu)

   limpatela
   escolha menu
   caso 1
      escreval ("Digite em Fahrenheit:")
      leia (temperaturaF)
      temperaturaC <-  (temperaturaF - 32) * 5/9
      escreval (temperaturaC, "°C")
   caso 2
      escreval ("Digite em Celsius:")
      leia (temperaturaC)
      temperaturaF <-  (temperaturaC * 9/5) + 32
      escreval (temperaturaF, "°F")
   caso 3
      escreval ("Digite em Dólar")
      leia ( moedaD)
      moedaR<- moedaD * valorD
      escreval ("R$", moedaR)
   caso 4
      escreval ("Digite em Real")
      leia ( moedaR)
      moedaD<- moedaR / valorD
      escreval ( moedaD, " dólares")
   fimescolha
   se menu < 5 entao
      escreval ("Digite 5 para finalizar o programa ou 1 para outra conversão:")
      leia (menu)
   fimse
ate menu = 5

fimalgoritmo
