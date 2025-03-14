programa {
    inclua biblioteca Matematica --> mat
    
    funcao inicio() {
        cadeia tipo
        real comprimento, largura
        real frente, fundos, lateral
        real areaRetangulo, areaTriangulo
        real ladosIgual, base, altura, semiPerimetro

        escreva("Bem-vindo ao sistema de cálculo de área de terrenos! \n")
        escreva("Escolha o tipo de terreno:\n")
        escreva(" [R] para Retângulo \n")
        escreva(" [T] para Triângulo \n")
        escreva("Digite sua opção: \n")
        leia(tipo)

        se (tipo == "r") {
            tipo = "R"
        }
        se (tipo == "t") {
            tipo = "T"
        }

        se (tipo == "R") {
            escreva(" \n")
            escreva("Você escolheu: Terreno Retangular. \n")
            escreva("Digite o comprimento do terreno (em metros): ")
            leia(comprimento)
            escreva("Digite a largura do terreno (em metros): ")
            leia(largura)

            areaRetangulo = comprimento * largura

            escreva("A área do terreno retangular é: ", areaRetangulo, " m² \n")
        } senao se (tipo == "T") {
            escreva(" \n")
            escreva("Você escolheu: Terreno Triangular. \n")
            escreva("Digite a medida da frente (em metros): ")
            leia(frente)
            escreva("Digite a medida do fundo (em metros): ")
            leia(fundos)
            escreva("Digite a medida da lateral (em metros): ")
            leia(lateral)

            se ((frente + fundos) > lateral e (frente + lateral) > fundos e (fundos + lateral) > frente) {
                se (frente == fundos e frente == lateral) {
                    escreva(" \n")
                    escreva("O triângulo é Equilátero. \n")
                    areaTriangulo = (mat.raiz(3, 2) / 4) * (frente * frente)
                } senao se (frente == fundos ou frente == lateral ou fundos == lateral) {
                    escreva(" \n")
                    escreva("O triângulo é Isósceles. \n")
                    
                    se (frente == fundos) {
                        ladosIgual = frente
                        base = lateral
                    } senao se (frente == lateral) {
                        ladosIgual = frente
                        base = fundos
                    } senao {
                        ladosIgual = fundos
                        base = frente
                    }
                    
                    altura = mat.raiz((ladosIgual * ladosIgual) - ((base / 2) * (base / 2)), 2)
                    areaTriangulo = (base * altura) / 2
                } senao {
                    escreva(" \n")
                    escreva("O triângulo é Escaleno. \n")
                    semiPerimetro = (frente + fundos + lateral) / 2
                    areaTriangulo = mat.raiz(semiPerimetro * (semiPerimetro - frente) * (semiPerimetro - fundos) * (semiPerimetro - lateral), 2)
                }
                escreva("A área do terreno triangular é: ", areaTriangulo, " m² \n")
            } senao {
                escreva(" \n")
                escreva("As medidas fornecidas não formam um triângulo válido. \n")
            }
        } senao {
            escreva(" \n")
            escreva("Opção inválida! Digite [R] para Retângulo ou [T] para Triângulo. \n")
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */