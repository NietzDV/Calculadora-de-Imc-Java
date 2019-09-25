/*
  24/09/2019
  Calculadora de IMC
  Exercicio do Livro Programando em Java 
 */
package Estruturada;
import java.util.Scanner;

public class Imc 
{
    public static void main(String[] args) 
      {
        Scanner intup = new Scanner(System.in);
        float peso,
              altura,
              soma;  
          System.out.println("------------------------------------\n\tCalculadora de IMC\n------------------------------------");
        System.out.print("Digite seu peso: ");
        peso = intup.nextFloat();
        System.out.print("Digite sua altura: ");
        altura = intup.nextFloat();
        soma =  peso/(altura*altura);
        System.out.printf("Seu peso:%.2f\nSua altura:%.2f\nSeu IMC:%.2f\n", peso, altura, soma);
       // System.out.println("Seu peso: " + peso + " Sua altura: " + altura + " Seu IMC: " + soma); 
           //Outra forma valida de printar na tela as informaçoes
       // System.out.println("Seu peso: " + peso + " Sua altura: " + altura + " Seu IMC: " + peso/(altura*altura));
           //Outra forma valida de Printar na tela, porem não precisar ser chamado soma pois ele faz o calulo no proprio print
                 if(soma < 18.5)
                  System.out.println("Abaixo do peso");
                 if(soma >=18.5 && soma <= 24.9)
                  System.out.println("Peso normal");
                 if(soma >=25 && soma <= 29.9)
                  System.out.println("Sobrepeso");
                 if(soma >=30 && soma <= 34.9)
                  System.out.println("Obesidade grau 1");
                 if(soma >=35 && soma <= 39.9)
                  System.out.println("Obesidade grau 2");
                 if(soma > 40)
                  System.out.println("Obesidade grau");
      }
        
        
}

