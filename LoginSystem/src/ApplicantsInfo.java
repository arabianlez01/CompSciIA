import javax.swing.*;

public class ApplicantsInfo extends JFrame {
    private JPanel panel;
    private JLabel Applicants;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    public static Applicant applicant;

    public ApplicantsInfo(){
        this.applicant = applicant;
        setContentPane(panel);
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        textArea1.setText(applicant.getFirstAndLastName());
        textArea2.setText(applicant.getNumberOfAdults());
        textArea3.setText(applicant.getNumberOfMinors());
        textArea4.setText(applicant.getNumberOfPets());
    }

    public static void setApplicant(Applicant newApplicant) {
        applicant = newApplicant;
    }
}
