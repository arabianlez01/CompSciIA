import javax.swing.*;

public class ApplicantsInfo extends JFrame {
    private JPanel panel;
    private JLabel Applicants;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    public Applicant applicant;

    public ApplicantsInfo(){
        setContentPane(panel);
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        textArea1.setText(applicant.getFirstAndLastName());
        textArea2.setText(applicant.getNumberOfAdults());
        textArea3.setText(applicant.getNumberOfMinors());
        textArea4.setText(applicant.getNumberOfPets());

        if (textArea1 != null){
            ApplicantsInfo applicantsInfo = new ApplicantsInfo();
        }

        if (textArea2 != null){
            ApplicantsInfo applicantsInfo = new ApplicantsInfo();
        }

        if (textArea3 != null){
            ApplicantsInfo applicantsInfo = new ApplicantsInfo();
        }

        if (textArea4 != null){
            ApplicantsInfo applicantsInfo = new ApplicantsInfo();
        }
    }

    public void setApplicant(Applicant newApplicant) {
        this.applicant = newApplicant;
    }
}
