import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {
    private JPanel panel;
    private JLabel Application;
    private JTextField ApplicantFirstandLastName;
    private JLabel FirstandLastName;
    private JTextField NumberOfAdult;
    private JLabel NumOfAdults;
    private JLabel NumOfMinors;
    private JTextField NumberOfMinors;
    private JLabel NumOfPets;
    private JTextField NumberOfPets;
    private JButton Submit;
    private Applicant applicant;

    public Application() {
        setContentPane(panel);
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Submit.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                ApplicantFirstandLastName.getText();
                applicant = new Applicant(ApplicantFirstandLastName.getText(), NumOfAdults.getText(), NumberOfMinors.getText(), NumberOfPets.getText());
                ApplicantsInfo applicationInformation = new ApplicantsInfo(applicant);
            }
        });
    }

    //create list of applicants info

    public static void main(String[] args) {
        Application application = new Application();
    }
}
