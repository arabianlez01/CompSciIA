import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * class login for login page
 */
public class Login extends JFrame{
    private JPasswordField PIN;
    private JPanel panel;
    private JButton login;

    public Login() {
        setContentPane(panel);
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        login.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String correctPin = "5726";
                if (PIN.getText().compareTo(correctPin) == 0){
                    ApplicantsInfo applicantsInfo = new ApplicantsInfo();
                } else {
                    Login login = new Login();
                }
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
    }

}
