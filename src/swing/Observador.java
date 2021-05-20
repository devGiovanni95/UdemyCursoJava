package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Observador {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,300);
        janela.setLayout(new FlowLayout()); //cria o incone do botao
        janela.setLocationRelativeTo(null);// Centraliza a janela no centro da tela do compútador

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

//        botao.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Evento ocorreu!");//cria um evento na hora de clicar no botao
//
//            }
//        });
        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!!!!!!!");
        });

        janela.setVisible(true);
    }
}
