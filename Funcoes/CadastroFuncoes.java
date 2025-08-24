package Funcoes;

import Telas.janela;
import javax.swing.*;
import Objetos.cliente;

public class CadastroFuncoes {
    private janela janela;
    private cliente cliente;

    public CadastroFuncoes(janela janela) {
        this.janela = janela; //  Tela
        this.cliente = new cliente();// Cliente

        // Eventos
        janela.getBtnConsultar().addActionListener(e -> consultar());
        janela.getBtnAtualizar().addActionListener(e -> atualizar());
        janela.getBtnFechar().addActionListener(e -> fechar());
    }

    private void consultar() {
        cliente.gravar();
        JOptionPane.showMessageDialog(janela, "Consultando cliente...");
    }

    private void atualizar() {
        cliente.editar();
        JOptionPane.showMessageDialog(janela, "Atualizando cliente...");
    }

    private void fechar() {
        janela.dispose();
    }
}