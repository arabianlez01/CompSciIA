import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicantOrLandlady extends JFrame {
    private JPanel panel;
    private JButton Applicant;
    private JButton Landlady;
    private JLabel ApplicantOrLandlady;

    public ApplicantOrLandlady() {
        setContentPane(panel);
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Applicant.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Application application = new Application();
            }
        });

        Landlady.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Login loginForm = new Login();
            }
        });
    }

    public static void main(String[] args) {
        ApplicantOrLandlady originalForm = new ApplicantOrLandlady();
    }
}
