package Telas;

import javax.swing.*; // Componentes swing
import Funcoes.CadastroFuncoes; // Funções dos botões
import java.awt.*; // Importa o Layout

public class janela extends JFrame {
    private JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf; // Títulos
    private JTextField jtfAgencia, jtfConta, jtfNome, jtfEndereco, jtfTelefone, jtfCpf; // Entrada de texto
    private JSeparator jSeparator01, jSeparator02; // Linhas de separação
    private JRadioButton jrbCorrente, jrbPoupanca; // Botõoes de opção
    private ButtonGroup bgContas; // Agrupamento dos radio buttons, para que só um seja selecionado
    private JButton jbConsultar, jbAtualizar, jbFechar; // Ações

    public static void main(String args []) {
        janela janela = new janela();
        janela.setVisible(true);
    }

    // Centralizar
    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }
        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }


    public janela() {
        super("Java Swing - Desenvolvimento de Sistemas");

        setSize(400, 255); // tamanho da janela
        setResizable(false); // não permite redimensionar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerra ao fechar
        getContentPane().setLayout(null); // layout null
        centralizar(); // centraliza a janela

        // Agência
        jlAgencia = new JLabel();
        jlAgencia.setText("Código da Agência: "); // Entitulamento
        jlAgencia.setBounds(10, 10, 120, 18);
        getContentPane().add(jlAgencia);

        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtfAgencia);

        // Conta
        jlConta = new JLabel();
        jlConta.setText("Número da Conta:");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtfConta);

        // Separador 1
        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        // Nome
        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT); // Alinha o texto do componente à direita
        getContentPane().add(jlNome);

        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);

        // Endereço
        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        getContentPane().add(jtfEndereco);

        // Telefone
        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);

        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        getContentPane().add(jtfTelefone);

        // CPF
        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlCpf);

        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        getContentPane().add(jtfCpf);

        // RadioButtons
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic('C'); // Alt + C
        jrbCorrente.setSelected(true);
        getContentPane().add(jrbCorrente);

        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic('P'); // Alt + P
        getContentPane().add(jrbPoupanca);

        // Agrupar botões
        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        // Separador 2
        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        // Botões de ação
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBounds(10, 180, 365, 40);

        jbConsultar = new JButton("Consultar");
        jbAtualizar = new JButton("Atualizar");
        jbFechar = new JButton("Fechar");

        panel.add(jbConsultar);
        panel.add(jbAtualizar);
        panel.add(jbFechar);

        getContentPane().add(panel);

        // Conectar botões ao Controller
        new CadastroFuncoes(this);
    }

    // Getters
    public JButton getBtnConsultar() { return jbConsultar; }
    public JButton getBtnAtualizar() { return jbAtualizar; }
    public JButton getBtnFechar() { return jbFechar; }

}