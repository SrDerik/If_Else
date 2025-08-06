package com.mycompany.joguinho;
import javax.swing.*;
import java.util.Random;
/**
 *
 * @author D3
 */
public class Joguinho {

    public static void main(String[] args) {
        //Iniciação do randomizador (utilizei apenas para decidir o número do dado)
     Random gerador = new Random();
        //Mensagens iniciais da história
     JOptionPane.showMessageDialog(null," Você está acordado até tarde de novo... Cansado, decide ir dormir");
     JOptionPane.showMessageDialog(null,"Você dorme. Após uma boa noite de sono, você abre os olhos e se depara com uma sala branca com três portas.");
        //Variáveis utilizadas
        int votacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma de três portas..."));
        //Gera um número de 1 a 10 (utilizei apenas para decidir o número do dado)
        int dado = gerador.nextInt(10) + 1;
        //Código da escolha da porta
        // Se a votação for maior do que 4, mostrar mensagem de invalidez
           if (votacao >= 4){
               JOptionPane.showMessageDialog(null, " Voto inválido ");
           } //Se colocar um número diferente de 2, passa de fase
           else if (votacao != 2) {
         JOptionPane.showMessageDialog(null, " Parabéns, você passou!");
         JOptionPane.showMessageDialog(null, " Você se depara com um homem louco no canto da sala, ele te olha com um olhar violento...");
         JOptionPane.showMessageDialog(null, " Agora vamos jogar o dado...");
            //Código do dado
            //Se dado for maior ou igual a 9, mostrar mensagem de vitória
             if (dado >= 9) {
                 JOptionPane.showMessageDialog(null," Quanta sorte! Você tirou " + dado + " e combateu o homem");
                 JOptionPane.showMessageDialog(null," Mas afinal, por que isto está acontecendo, você realmente acha que isso é real?");
                 JOptionPane.showMessageDialog(null," Você acorda e percebe que isto foi um pesadelo");
            } //Se dado for maior do que 7, mostrar mensagem de vitória
             else if (dado > 7) {
                 JOptionPane.showMessageDialog(null, " Você tirou " + dado + " e sobreviveu cansado");
                 JOptionPane.showMessageDialog(null," Mas afinal, por que isto está acontecendo, você realmente acha que isso é real?");
                 JOptionPane.showMessageDialog(null," Você acorda e percebe que isto foi um pesadelo");
            } //Se dado for igual ou maior do que 5 e menor ou igual do que 7, mostrar mensagem de vitória
             else if (dado >= 5 && dado <=7) {
                 JOptionPane.showMessageDialog(null, " Por pouco! Você tirou " + dado + " e sobreviveu com ferimentos");
                 JOptionPane.showMessageDialog(null," Mas afinal, por que isto está acontecendo, você realmente acha que isso é real?");
                 JOptionPane.showMessageDialog(null," Você acorda e percebe que isto foi um pesadelo");
            } //Se dado for menor do que 4, mostrar mensagem de derrota
             else if (dado < 4) { 
                 JOptionPane.showMessageDialog(null, " Que azar!Você tirou " + dado + " e acabou sendo morto");
                 JOptionPane.showMessageDialog(null, " Fim de jogo");
            } 
           } 
           //Se errar a porta, mostrar está mensagem
        else {     
         JOptionPane.showMessageDialog(null, "Escolha errada... Você caiu no limbo");
         JOptionPane.showMessageDialog(null, "Fim de jogo");
        }
        
    }
}