programa {
  inteiro notaUm, notaDois
  real media
  funcao inicio() 
  {
    escreva("Digite a primeira nota: ")
    leia(notaUm)
    
    escreva("Digite a segundo nota: ")
    leia(notaDois)

    media = (notaUm + notaDois) /2

    limpa()

    se (media >= 7) {
      escreva("Você está aprovado!")
    }
    senao
    escreva("Você está reprovado!")
  }
}
