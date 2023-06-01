package br.edu.univas.calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class CalculadoraForm extends JFrame {

        private static final int TAMANHO_TXT = 15;

        protected JPanel pnlForm;
        protected JPanel pnlRodape;

        protected JButton btnCalcular;
        protected JButton btnLimpar;
        protected JButton btnFechar;


        protected JLabel lblcapital;
        protected JTextField txtcapital;

        protected JLabel lblTaxasJuros;
        protected JTextField txtTaxasJuros;

        protected JLabel lblPeriodo;
        protected JTextField txtPeriodo;

        protected JLabel lblMontante;
        protected JTextField txtMontante;


        public CalculadoraForm() {
            this.inicializar();
            this.eventos();
        }

        private void inicializar() {
            this.setTitle("Calculadora");
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.getContentPane().setLayout(new BorderLayout());
            this.setResizable(false);


            this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
            this.getContentPane().add(getPnlRodape(), BorderLayout.PAGE_END);
            this.pack();
        }
        protected abstract void btnCalcularClick(ActionEvent ev);
        protected abstract void btnLimparClick(ActionEvent ev);
        protected abstract void btnFecharClick(ActionEvent ev);
        private void eventos(){
            btnCalcular.addActionListener(this::btnCalcularClick);
            btnLimpar.addActionListener(this::btnLimparClick);
            btnFechar.addActionListener(this::btnFecharClick);
        }

        public JPanel getPnlForm() {
            if (pnlForm == null){
                pnlForm = new JPanel(new GridLayout(4 , 2));

                lblcapital = new JLabel("Capital");
                txtcapital = new JTextField(TAMANHO_TXT);

                lblTaxasJuros = new JLabel("Taxas Juros");
                txtTaxasJuros = new JTextField(TAMANHO_TXT);

                lblPeriodo = new JLabel("Periodo");
                txtPeriodo = new JTextField(TAMANHO_TXT);

                lblMontante = new JLabel("Montante");
                txtMontante = new JTextField(TAMANHO_TXT);
                txtMontante.setEditable(false);

                pnlForm.add(lblcapital);
                pnlForm.add(txtcapital);

                pnlForm.add(lblTaxasJuros);
                pnlForm.add(txtTaxasJuros);

                pnlForm.add(lblPeriodo);
                pnlForm.add(txtPeriodo);

                pnlForm.add(lblMontante);
                pnlForm.add(txtMontante);
            }
            return pnlForm;
        }

        public JPanel getPnlRodape() {
            if (pnlRodape == null){
                pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));


                btnCalcular = new JButton("Calcular");
                btnLimpar = new JButton("Limpar");
                btnFechar = new JButton("Fechar");


                pnlRodape.add(btnCalcular);
                pnlRodape.add(btnLimpar);
                pnlRodape.add(btnFechar);
            }
            return pnlRodape;
        }
}