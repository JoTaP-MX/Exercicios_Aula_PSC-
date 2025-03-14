import java.util.Scanner;

public class MedidordeTerreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao calculador de áreas de terrenos!\n");

        System.out.println("Escolha o tipo de terreno: [R]etângulo ou [T]riângulo:");
        String tipo = scanner.nextLine().trim().toUpperCase();

        switch (tipo) {
            case "R":
                // Cálculo para terreno retangular
                System.out.print("Digite o comprimento do retângulo (em metros): ");
                double comprimento = scanner.nextDouble();

                System.out.print("Digite a largura do retângulo (em metros): ");
                double largura = scanner.nextDouble();

                double areaRetangulo = comprimento * largura;
                System.out.printf("A área do terreno retangular é: %.2f m²%n", areaRetangulo);
                break;

            case "T":
                // Cálculo para terreno triangular
                System.out.print("Digite a medida da frente (em metros): ");
                double frente = scanner.nextDouble();

                System.out.print("Digite a medida do fundo (em metros): ");
                double fundos = scanner.nextDouble();

                System.out.print("Digite a medida da lateral (em metros): ");
                double lateral = scanner.nextDouble();

                // Verifica se realmente forma um triângulo
                if ((frente + fundos) > lateral 
                        && (frente + lateral) > fundos 
                        && (fundos + lateral) > frente) {

                    double areaTriangulo = 0.0;

                    // Verifica o tipo de triângulo
                    if (frente == fundos && frente == lateral) {
                        // Triângulo Equilátero
                        System.out.println("O triângulo é Equilátero.");
                        areaTriangulo = (Math.sqrt(3) / 4) * (frente * frente);
                    } 
                    else if (frente == fundos || frente == lateral || fundos == lateral) {
                        // Triângulo Isósceles
                        System.out.println("O triângulo é Isósceles.");

                        double ladosIgual = 0.0;
                        double base = 0.0;

                        // Identifica quais lados são iguais e qual será a base
                        if (frente == fundos) {
                            ladosIgual = frente;
                            base = lateral;
                        } else if (frente == lateral) {
                            ladosIgual = frente;
                            base = fundos;
                        } else {
                            ladosIgual = fundos;
                            base = frente;
                        }

                        // Calcula a altura usando Pitágoras
                        double altura = Math.sqrt((ladosIgual * ladosIgual) - (base / 2.0) * (base / 2.0));

                        // Área = (base * altura) / 2
                        areaTriangulo = (base * altura) / 2.0;
                    } 
                    else {
                        // Triângulo Escaleno
                        System.out.println("O triângulo é Escaleno.");
                        double semiPerimetro = (frente + fundos + lateral) / 2.0;
                        // Fórmula de Heron
                        areaTriangulo = Math.sqrt(
                            semiPerimetro
                            * (semiPerimetro - frente)
                            * (semiPerimetro - fundos)
                            * (semiPerimetro - lateral)
                        );
                    }

                    System.out.printf("A área do terreno triangular é: %.2f m²%n", areaTriangulo);
                } 
                else {
                    System.out.println("As medidas fornecidas não formam um triângulo válido.");
                }
                break;

            default:
                System.out.println("Opção inválida! Digite R para Retângulo ou T para Triângulo.");
        }

        scanner.close();
    }
}
