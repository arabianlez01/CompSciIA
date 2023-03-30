import javax.swing.*;

public class ApplicantsInfo extends JFrame {
    private JPanel panel;
    private JLabel Applicants;
    private JScrollPane ApplicantInfoScroll;
    private JTextField firstAndLastName;
    private JTextField numberOfAdults;
    private JTextField numberOfMinors;
    private JTextField numberOfPets;
    private Applicant applicant;

    public ApplicantsInfo(){
        this.applicant = applicant;
        setContentPane(panel);
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        firstAndLastName.setText(applicant.getFirstAndLastName());
        numberOfAdults.setText(applicant.getNumberOfAdults());
        numberOfMinors.setText(applicant.getNumberOfPets());
        numberOfPets.setText(applicant.getNumberOfPets());
    }

    public void setApplicant(Applicant newApplicant) {
        this.applicant = newApplicant;
    }
}
