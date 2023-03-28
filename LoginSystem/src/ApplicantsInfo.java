import javax.swing.*;

public class ApplicantsInfo extends JFrame {
    private JPanel panel;
    private JLabel Applicants;
    private JScrollBar scrollBar;
    private JScrollPane ApplicantInfoScroll;
    private Applicant applicant;

    public ApplicantsInfo(Applicant applicant){
        this.applicant = applicant;
        setContentPane(panel);
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //set the Jtext fields or jlabels and call the get applican method

}
