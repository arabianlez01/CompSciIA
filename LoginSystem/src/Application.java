import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {
    private JPanel panel;
    private JLabel application;
    private JTextField applicantFirstAndLastName;
    private JLabel firstAndLastName;
    private JTextField numberOfAdults;
    private JLabel numOfAdults;
    private JTextField NumberOfMinors;
    private JLabel numOfMinors;
    private JTextField numberOfPets;
    private JLabel numOfPets;
    private JButton Submit;
    private Applicant applicant;
    private ApplicantsInfo applicantsInfo;

    public Application() {
        setContentPane(panel);
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Submit.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                applicant = new Applicant(applicantFirstAndLastName.getText(), numberOfAdults.getText(), NumberOfMinors.getText(), numberOfPets.getText());
                ApplicantsInfo.setApplicant(applicant);
            }
        });
    }

    public static void main(String[] args) {
        Application application = new Application();
    }
}
