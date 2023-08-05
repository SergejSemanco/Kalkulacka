import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;


public class KalkulackaApp {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        JFrame frame = new JFrame("Kalkulačka App"); // Vytvorime okno
        frame.setMinimumSize(new Dimension(400, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Vycentrovanie okna

        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny
        //panel.setBackground(Color.darkGray);

        // JText
        JTextField textField = new JTextField();
        textField.setBounds(100, 20, 200, 30); // x, y, sirka, vyska
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textField);

        JLabel labelText = new JLabel("Zadaj číslo"); // popisok
        labelText.setBounds(160, 50, 150, 20); // x, y, sirka, vyska
        panel.add(labelText);

        frame.setContentPane(panel); // my dany panel pridame do frame

        JButton btnNumber1 = new JButton("1"); // tlacidlo
        btnNumber1.setBounds(120, 200, 40, 40); // x, y, sirka, vyska
        panel.add(btnNumber1);

        btnNumber1.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });

        JButton btnNumber2 = new JButton("2");
        btnNumber2.setBounds(160, 200, 40, 40);
        panel.add(btnNumber2);

        btnNumber2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });

        JButton btnNumber3 = new JButton("3");
        btnNumber3.setBounds(200, 200, 40, 40);
        panel.add(btnNumber3);

        btnNumber3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });

        JButton btnNumber4 = new JButton("4");
        btnNumber4.setBounds(120, 160, 40, 40);
        panel.add(btnNumber4);

        btnNumber4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });

        JButton btnNumber5 = new JButton("5");
        btnNumber5.setBounds(160, 160, 40, 40);
        panel.add(btnNumber5);

        btnNumber5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });

        JButton btnNumber6 = new JButton("6");
        btnNumber6.setBounds(200, 160, 40, 40);
        panel.add(btnNumber6);

        btnNumber6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });

        JButton btnNumber7 = new JButton("7");
        btnNumber7.setBounds(120, 120, 40, 40);
        panel.add(btnNumber7);

        btnNumber7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });

        JButton btnNumber8 = new JButton("8");
        btnNumber8.setBounds(160, 120, 40, 40);
        panel.add(btnNumber8);

        btnNumber8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });

        JButton btnNumber9 = new JButton("9");
        btnNumber9.setBounds(200, 120, 40, 40);
        panel.add(btnNumber9);

        btnNumber9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });

        JButton btnPlus = new JButton("+");
        btnPlus.setBounds(240, 240, 40, 40);
        panel.add(btnPlus);

        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textField.setText("+");
                textField.setText(textField.getText() + "+");
            }
        });

        JButton btnMinus = new JButton("-");
        btnMinus.setBounds(240, 200, 40, 40);
        panel.add(btnMinus);

        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textField.setText("+");
                textField.setText(textField.getText() + "-");
            }
        });

        JButton btnTimes = new JButton("*");
        btnTimes.setBounds(240, 160, 40, 40);
        panel.add(btnTimes);

        btnTimes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textField.setText("+");
                textField.setText(textField.getText() + "*");
            }
        });

        JButton btnDaily = new JButton("/");
        btnDaily.setBounds(240, 120, 40, 40);
        panel.add(btnDaily);

        btnDaily.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textField.setText("+");
                textField.setText(textField.getText() + "/");
            }
        });

        JButton btnBracketLeft = new JButton("(");
        btnBracketLeft.setBounds(120, 80, 40, 40);
        panel.add(btnBracketLeft);

        btnBracketLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textField.setText("+");
                textField.setText(textField.getText() + "(");
            }
        });

        JButton btnBracketRight = new JButton(")");
        btnBracketRight.setBounds(160, 80, 40, 40);
        panel.add(btnBracketRight);

        btnBracketRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textField.setText("+");
                textField.setText(textField.getText() + ")");
            }
        });

        JButton btnPoint = new JButton(",");
        btnPoint.setBounds(160, 240, 40, 40);
        panel.add(btnPoint);

        btnPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textField.setText("+");
                textField.setText(textField.getText() + ".");
            }
        });

        JButton btnZero = new JButton("0");
        btnZero.setBounds(120, 240, 40, 40);
        panel.add(btnZero);

        btnZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textField.setText("+");
                textField.setText(textField.getText() + "0");
            }
        });

        JButton btnPercent = new JButton("%");
        btnPercent.setBounds(200, 80, 40, 40);
        panel.add(btnPercent);

        btnPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //double priklad = Double.parseDouble(textField.getText()); // String na double

                String priklad = textField.getText();
                String regex = "([0-9]+)([-+*/])([0-9]+)";
                var pattern = Pattern.compile(regex);
                var matcher = pattern.matcher(priklad);
                if (matcher.matches()) {
                    String v1 = matcher.group(1);
                    String v2 = matcher.group(3);
                    double n1 = Double.parseDouble(v1);
                    double n2 = Double.parseDouble(v2);
                    double percentage = n1 / 100 * n2;
                    String operator = matcher.group(2);

                    if ("-".equals(operator)) {
                        double vysledok = n1 - percentage;
                        ScriptEngineManager factory = new ScriptEngineManager();
                        ScriptEngine engine = factory.getEngineByName("nashorn");
                        try {
                            textField.setText(engine.eval(String.valueOf(vysledok)).toString());
                        } catch (ScriptException ex) {
                            throw new RuntimeException(ex);
                        }
                    } else if ("+".equals(operator)) {
                        double vysledok = n1 + percentage;
                        ScriptEngineManager factory = new ScriptEngineManager();
                        ScriptEngine engine = factory.getEngineByName("nashorn");
                        try {
                            textField.setText(engine.eval(String.valueOf(vysledok)).toString());
                        } catch (ScriptException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }

                //double percent = value / 100;
                //textField.setText(String.valueOf(percent)); // double na String
            }
        });

        JButton btnRovnaSa = new JButton("=");
        btnRovnaSa.setBounds(200, 240, 40, 40);
        panel.add(btnRovnaSa);

        btnRovnaSa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager factory = new ScriptEngineManager();
                ScriptEngine engine = factory.getEngineByName("nashorn");
                String vzorec = textField.getText();
                try {
                    textField.setText(engine.eval(vzorec).toString()); // Vysledok Stringu, ktory obsahuje vzorec vypisem
                } catch (ScriptException e1) {
                    throw new RuntimeException(e1);
                }
                //textField.setText("=");
            }
        });

        JButton btnZmaz = new JButton("C");
        btnZmaz.setBounds(240, 80, 40, 40);
        panel.add(btnZmaz);

        btnZmaz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(""); // Zmaze okno
            }
        });

        // display it
        frame.pack();
        frame.setVisible(true);

    }
}
