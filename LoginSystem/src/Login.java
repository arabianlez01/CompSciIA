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
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        login.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JPasswordField = "5726";
                if (userPIN.equals(JPasswordField)){

                }
                ApplicantsInfo applicantsInfo = new ApplicantsInfo();
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
    }

}
