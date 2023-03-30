import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {
    private JPanel panel;
    private JLabel Application;
    private JTextField ApplicantFirstAndLastName;
    private JLabel FirstAndLastName;
    private JTextField NumberOfAdult;
    private JLabel NumberOfAdults;
    private JLabel NumOfMinors;
    private JTextField NumberOfMinors;
    private JLabel NumOfPets;
    private JTextField NumberOfPets;
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
                applicant = new Applicant(ApplicantFirstAndLastName.getText(), NumberOfAdults.getText(), NumberOfMinors.getText(), NumberOfPets.getText());
                applicantsInfo.setApplicant(applicant);
            }
        });
    }

    public static void main(String[] args) {
        Application application = new Application();
    }
}
