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
        String dados = "Agência: " + janela.getAgencia() + "\n" +
            "Conta: " + janela.getConta() + "\n" +
            "Nome: " + janela.getNome() + "\n" +
            "Endereço: " + janela.getEndereco() + "\n" +
            "Telefone: " + janela.getTelefone() + "\n" +
            "CPF: " + janela.getCpf() + "\n" +
            "Tipo de Conta: " + janela.getTipoConta();
        if (janela.getAgencia().isEmpty() || janela.getConta().isEmpty() || janela.getNome().isEmpty() || janela.getEndereco().isEmpty() || janela.getTelefone().isEmpty() || janela.getCpf().isEmpty() || janela.getTipoConta().isEmpty()){
            JOptionPane.showMessageDialog(janela,
            "Preencha todos os campos!",
            "Erro",
            JOptionPane.ERROR_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(janela, dados, "Dados do Cliente", JOptionPane.INFORMATION_MESSAGE);
        }
}

    private void atualizar() {
        cliente.editar();
        JOptionPane.showMessageDialog(janela, "Atualizando cliente...");
    }

    private void fechar() {
        janela.dispose();
    }
    
}