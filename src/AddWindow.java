import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AddWindow extends JDialog {
    private static int HEIGHT = 300;
    private static int WIDTH = 1000;
    private static JLabel[] labels = {new JLabel("PESEL"),   //0
        new JLabel("FirstName"),                //1
        new JLabel("SecondName"),               //2
        new JLabel("Address"),                  //3
        new JLabel("JobType"),                  //4
        new JLabel("Salary"),                   //5
        new JLabel("School_ID"),                //6
        new JLabel("Supervisor_PESEL"),         //7
        new JLabel("Manager_PESEL"),            //8
        new JLabel("Name"),                     //9
        new JLabel("Equipment_id"),             //10
        new JLabel("ProductionYear"),           //11
        new JLabel("Client_PESEL"),             //12
        new JLabel("Course_Beginning_Date"),    //13
        new JLabel("Course_End_Date"),          //14
        new JLabel("Course_Employee_PESEL"),    //15
        new JLabel("Beginning_Date"),           //16
        new JLabel("End_Date"),                 //17
        new JLabel("Employee_PESEL")};          //18
    private ArrayList<String> values;

    private JComboBox<String> JobType = new JComboBox<>();

    private JButton addButton = new JButton("Add");
    private JButton cancelButton = new JButton("Cancel");

    AddWindow(JFrame owner , String header){
        super(owner, "Login Window", true);

        JPanel labelPanel = new JPanel();
        JPanel textFieldPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        this.setSize(WIDTH, HEIGHT);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - this.getSize().width/2 , dim.height/2 - this.getSize().height/2);

        buttonPanel.add(addButton);
        buttonPanel.add(cancelButton);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.add(buttonPanel, BorderLayout.WEST);

        JobType.addItem("Manager");
        JobType.addItem("Instructor");
        JobType.addItem("Bosman");
        JobType.addItem("Receptionist");
        JobType.addItem("Supervisor");

        if(header.equals("Employees"))
        {
                for(int i=0; i<8; i++)
                {
                    labelPanel.add(labels[i]);
                }
                textFieldPanel.add(new JTextField(11));
                textFieldPanel.add(new JTextField(20));
                textFieldPanel.add(new JTextField(30));
                textFieldPanel.add(new JTextField(60));
                textFieldPanel.add(JobType);
                textFieldPanel.add(new JTextField(8));
                textFieldPanel.add(new JTextField(4));
                textFieldPanel.add(new JTextField(11));

                this.add(labelPanel, BorderLayout.NORTH);
                this.add(textFieldPanel, BorderLayout.SOUTH);
            }
            else if(header.equals("Schools"))
            {
                labelPanel.add(labels[6]);
                labelPanel.add(labels[3]);
                labelPanel.add(labels[8]);
                labelPanel.add(labels[9]);

                textFieldPanel.add(new JTextField(4));
                textFieldPanel.add(new JTextField(60));
                textFieldPanel.add(new JTextField(11));
                textFieldPanel.add(new JTextField(30));
                this.add(labelPanel, BorderLayout.NORTH);
                this.add(textFieldPanel, BorderLayout.SOUTH);
            }
            else if(header.equals("Equipment"))
            {
                labelPanel.add(labels[10]);
                labelPanel.add(labels[11]);
                labelPanel.add(labels[6]);
                labelPanel.add(labels[12]);

                textFieldPanel.add(new JTextField(4));
                textFieldPanel.add(new JTextField(4));
                textFieldPanel.add(new JTextField(4));
                textFieldPanel.add(new JTextField(11));
                this.add(labelPanel, BorderLayout.NORTH);
                this.add(textFieldPanel, BorderLayout.SOUTH);
            }
            else if(header.equals("Clients"))
            {
                for(int i = 0; i<4; i++)
                {
                    labelPanel.add(labels[i]);
                }
                textFieldPanel.add(new JTextField(11));
                textFieldPanel.add(new JTextField(20));
                textFieldPanel.add(new JTextField(30));
                textFieldPanel.add(new JTextField(60));
                this.add(labelPanel, BorderLayout.NORTH);
                this.add(textFieldPanel, BorderLayout.SOUTH);
            }
            else if(header.equals("Courses_clients"))
            {
                labelPanel.add(labels[13]);
                labelPanel.add(labels[14]);
                labelPanel.add(labels[15]);
                labelPanel.add(labels[12]);

                textFieldPanel.add(new JTextField(8));
                textFieldPanel.add(new JTextField(8));
                textFieldPanel.add(new JTextField(11));
                textFieldPanel.add(new JTextField(11));
                this.add(labelPanel, BorderLayout.NORTH);
                this.add(textFieldPanel, BorderLayout.SOUTH);
            }
            else if(header.equals("Courses"))
            {
                labelPanel.add(labels[16]);
                labelPanel.add(labels[17]);
                labelPanel.add(labels[18]);

                textFieldPanel.add(new JTextField(8));
                textFieldPanel.add(new JTextField(8));
                textFieldPanel.add(new JTextField(11));
                this.add(labelPanel, BorderLayout.NORTH);
                this.add(textFieldPanel, BorderLayout.SOUTH);
            }
        this.setVisible(true);
    }
}