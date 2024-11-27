import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passCode
{
    private final JFrame f1;

    private final JFrame f2;

    private final JButton begin, button1, button2, button3,
            button4, button5, button6, button7, button8, button9, button0, submit, delete;

    private JTextField welcome;
    private JTextField instructions;
    private final String password;
    private String guess;
    private JTextField box1, box2, box3, box4;

    public passCode(String password)
    {
        f1 = new JFrame();

        f2 = new JFrame();

        welcome = new JTextField();

        begin = new JButton("Click here to unlock");

        button1 = new JButton("1");

        button2 = new JButton("2");

        button3 = new JButton("3");

        button4 = new JButton("4");

        button5 = new JButton("5");

        button6 = new JButton("6");

        button7 = new JButton("7");

        button8 = new JButton("8");

        button9 = new JButton("9");

        button0 = new JButton("0");

        submit = new JButton("Submit");

        delete = new JButton("X");

        instructions = new JTextField();

        guess = "";

        box1 = new JTextField("");

        box2 = new JTextField("");

        box3 = new JTextField("");

        box4 = new JTextField("");

        this.password = password;
    }
    public void playGame() {

        welcome.setText("Welcome to Sean's passcode unlocker. Enter the right passcode to unlock your device.");

        welcome.setBounds(80, 50, 470, 60);

        f2.add(welcome);

        begin.setBounds(200, 200, 150, 60);

        f2.add(begin);

        f2.getContentPane().setBackground(Color.blue);

        f2.setSize(60, 60);

        f2.setLayout(null);

        f2.setVisible(true);

        f1.setVisible(false);

        f1.setBackground(Color.GREEN);

        f1.add(instructions);

        f1.add(button1);

        button1.setBounds(180, 200, 60, 60);

        int width = button1.getWidth(); //the width for all the buttons

        int height = button1.getHeight(); //the height for all the buttons

        f1.add(button2);

        button2.setBounds(240, 200, width, height);

        f1.add(button3);

        button3.setBounds(300, 200, width, height);

        f1.add(button4);

        button4.setBounds(180, 260, width, height);

        f1.add(button5);

        button5.setBounds(240, 260, width, height);

        f1.add(button6);

        button6.setBounds(300, 260, width, height);

        f1.add(button7);

        button7.setBounds(180, 320, width, height);

        f1.add(button8);

        button8.setBounds(240, 320, width, height);

        f1.add(button9);

        button9.setBounds(300, 320, width, height);

        f1.add(button0);

        button0.setBounds(240, 380, width, height);

        f1.add(submit);

        submit.setEnabled(false);

        submit.setBounds(220, 450, 100, 60);

        f1.add(delete);

        delete.setBounds(300, 380, width, height);

        f1.add(box1);

        f1.add(box2);

        f1.add(box3);

        f1.add(box4);

        f1.setLayout(null);

        f1.setSize(600, 600);

        //f1.add(instructions, BorderLayout.CENTER);

        instructions.setText("  Enter your 4 digit passcode.");

        instructions.setEditable(false); //so the instructions cannot be modified

        instructions.setBounds(80, 50, 380, 60);

        instructions.setFont(new Font("Times New Roman", Font.BOLD, 30));

        box1.setBounds(130, 130, 40, 40);

        int boxHeight = box1.getHeight();

        int boxWidth = box1.getWidth();

        box2.setBounds(210, 130, boxWidth, boxHeight);

        box3.setBounds(290, 130, boxWidth, boxHeight);

        box4.setBounds(370, 130, boxWidth, boxHeight);

        box1.setEditable(false);

        box2.setEditable(false);

        box3.setEditable(false);

        box4.setEditable(false);

        //f1.setVisible(true);

            //changing the frames once the "begin" button is pressed
            begin.addActionListener(e ->
            {
                f2.setVisible(false);
                f1.setVisible(true);
            });

            button1.addActionListener(e -> {

                if (!box3.getText().equals(""))
                {
                    box4.setText("1");
                    submit.setEnabled(true);
                }

                else if (!box2.getText().equals("")) box3.setText("1");

                else if (!box1.getText().equals("")) box2.setText("1");

                else box1.setText(button1.getActionCommand());
            });

            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (!(box3.getText().equals(""))) {
                        box4.setText("2");
                        submit.setEnabled(true);
                    }
                    else if (!box2.getText().equals("")) box3.setText("2");

                    else if (!box1.getText().equals("")) box2.setText("2");

                    else box1.setText(button2.getActionCommand());
                }
            });

            button3.addActionListener(e -> {

                //checking the leftmost empty box

                if (!(box3.getText().isEmpty()))
                {
                    box4.setText("3");
                    submit.setEnabled(true);
                }

                else if (!(box2.getText().isEmpty())) box3.setText("3");

                else if (!(box1.getText().isEmpty())) box2.setText("3");

                else box1.setText(button3.getActionCommand());
            });

            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (!(box3.getText().isEmpty())) {
                        box4.setText("4");
                        submit.setEnabled(true);
                    }

                    else if (!(box2.getText().isEmpty())) box3.setText("4");

                    else if (!(box1.getText().isEmpty())) box2.setText("4");

                    else box1.setText(button4.getActionCommand());
                }

            });

            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (!(box3.getText().isEmpty())) {
                        box4.setText("5");
                        submit.setEnabled(true);
                    }
                    else if (!(box2.getText().isEmpty())) box3.setText("5");

                    else if (!(box1.getText().isEmpty())) box2.setText("5");

                    else box1.setText(button5.getActionCommand());
                };
            });

            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (!(box3.getText().isEmpty()))
                    {
                        box4.setText("6");
                        submit.setEnabled(true);
                    }

                    else if (!(box2.getText().isEmpty())) box3.setText("6");

                    else if (!(box1.getText().isEmpty())) box2.setText("6");

                    else box1.setText(button6.getActionCommand());
                }

            });

            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (!(box3.getText().isEmpty()))
                    {
                        box4.setText("7");
                        submit.setEnabled(true);
                    }

                    else if (!(box2.getText().isEmpty())) box3.setText("7");

                    else if (!(box1.getText().isEmpty())) box2.setText("7");

                    else box1.setText(button7.getActionCommand());
                }
            });

            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (!(box3.getText().isEmpty())) {
                        box4.setText("8");
                        submit.setEnabled(true);
                    }

                    else if (!(box2.getText().isEmpty())) box3.setText("8");

                    else if (!(box1.getText().isEmpty())) box2.setText("8");

                    else box1.setText(button8.getActionCommand());
                }
            });

            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (!(box3.getText().isEmpty()))
                    {
                        box4.setText("9");
                        submit.setEnabled(true);
                    }

                    else if (!(box2.getText().isEmpty())) box3.setText("9");

                    else if (!(box1.getText().isEmpty())) box2.setText("9");

                    else box1.setText(button9.getActionCommand());
                }
            });

            button0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (!(box3.getText().isEmpty()))
                    {
                        box4.setText("0");
                        submit.setEnabled(true);
                    }
                    else if (!(box2.getText().isEmpty())) box3.setText("0");

                    else if (!(box1.getText().isEmpty())) box2.setText("0");

                    else box1.setText(button0.getActionCommand());
                }

            });

            delete.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
               {
                   if (!(box4.getText().isEmpty()))  box4.setText("");

                   else if (!(box3.getText().isEmpty())) box3.setText("");

                   else if (!(box2.getText().isEmpty())) box2.setText("");

                   else box1.setText("");
               }
            });

            submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                guess = box1.getText() + box2.getText() + box3.getText() + box4.getText();

                if (guess.equals(password))
                {
                    instructions.setText("You've entered the right passcode!");
                    instructions.setBounds(80, 50, 480, 60);
                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button0.setEnabled(false);
                    delete.setEnabled(false);
                }
                else
                {
                    instructions.setText("  Wrong passcode. Try again.");
                    box1.setText("");
                    box2.setText("");
                    box3.setText("");
                    box4.setText("");
                    submit.setEnabled(false);
                }
            }
        });
    }
}