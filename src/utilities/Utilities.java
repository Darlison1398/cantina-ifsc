
package utilities;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Utilities {

    public static void ativa(boolean ativa, JPanel painel) {

        Component[] componentes = painel.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JButton) {
                if (((JButton) componente).getActionCommand() == "0") {
                    componente.setEnabled(ativa);
                } else {
                    componente.setEnabled(!ativa);
                }
            }

        }
    }

    public static void limpaComponentes(boolean ativa, JPanel painel) {
        Component[] componentes = painel.getComponents();
        for (Component componente : componentes) {

            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JFormattedTextField) {
                ((JFormattedTextField) componente).setText("");
            } else if(componente instanceof JComboBox){
                ((JComboBox) componente).setSelectedIndex(-1);
            } else if (componente instanceof JTextArea){
                ((JTextArea)componente).setText("");
            } else if (componente instanceof JRadioButton){
                ((JRadioButton) componente).setSelected(ativa);
            }
            componente.setEnabled(ativa);
        }

    }

}
