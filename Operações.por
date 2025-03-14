programa {
  inteiro numero1, numero2, sub, mult, div
  funcao inicio() 
  {
    escreva("Digite o primeiro número: ")
    leia(numero1)
    
    escreva("Digite o segundo número: ")
    leia(numero2)

    sub = numero1 - numero2
    mult = numero1 * numero2
    div = numero1 / numero2

    escreva("\n" + sub + "\n" + mult + "\n" + div)
  }
}
