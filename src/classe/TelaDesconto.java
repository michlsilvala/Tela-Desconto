package classe;

import javax.swing.JOptionPane;

public class TelaDesconto extends javax.swing.JFrame {

    public TelaDesconto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        controleDesconto = new javax.swing.JSpinner();
        botaoCalcula = new javax.swing.JButton();
        lblValorFinal = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Desconto");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("TOTAL DA COMPRA R$");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("DESCONTO (%)");

        campoValor.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        campoValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        controleDesconto.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        controleDesconto.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        botaoCalcula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoCalcula.setText("CALCULAR VALOR");
        botaoCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalculaActionPerformed(evt);
            }
        });

        lblValorFinal.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblValorFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botaoLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoLimpar.setText("LIMPAR");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(controleDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoCalcula))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controleDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(lblValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botaoCalcula)
                .addGap(26, 26, 26)
                .addComponent(botaoLimpar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalculaActionPerformed

        // TRATAMENTO DE EXCEÇÃO PARA CASO DIGITE UM VALOR NÃO NUMERICO
        try {

            // pegando valor convertendo para double e removendo espaços
            double valor = Double.parseDouble(campoValor.getText().trim().replace(",", "."));
            int desconto = Integer.parseInt(controleDesconto.getValue().toString());

            // EXCEÇÃO PARA SE DIGITAR VALOR NEGATIVO
            if (valor < 0) {
                JOptionPane.showMessageDialog(this, "O valor do produto não pode ser negativo!");
                return;
            }

            // o valor 100 deve ter decimal para retornar valor double
            // por isso deve ser 100.0
            double valorDesconto = valor * (desconto / 100.0);

            double valorProdutoFinal = valor - valorDesconto;
            // mostrando valor do desconto
            lblValorFinal.setText(String.format("%.2f", valorProdutoFinal));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um valor numérico válido para o produto!");
        }

    }//GEN-LAST:event_botaoCalculaActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        
        campoValor.setText("");
        controleDesconto.setValue(1);
        lblValorFinal.setText("");
        
        
    }//GEN-LAST:event_botaoLimparActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDesconto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcula;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField campoValor;
    private javax.swing.JSpinner controleDesconto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblValorFinal;
    // End of variables declaration//GEN-END:variables
}
