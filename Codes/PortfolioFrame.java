package Portfolio;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
    import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import java.awt.Font;
	import java.awt.Image;
	import javax.swing.SwingConstants;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JPasswordField;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.awt.Color;

	class PortfolioFrame extends JFrame {
	   
	    protected JPasswordField passwordField;

	    public PortfolioFrame() {
	        setTitle("PORTFOLIO"); // title name of the frame
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 586, 443);
	        JPanel contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        JButton signInButton = new JButton("SIGN IN");
	        signInButton.setForeground(new Color(128, 128, 192));
	        signInButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                data_class myClass = new data_class("iarahmae");
	                
	                String password = new String(passwordField.getPassword());
	                
	                // Initialize flag to check if the input password is correct
	                boolean CheckPassword = false;
	                // identify the input password that should be correct
	                if (password.equals(myClass.getPassword())) {
	                    CheckPassword = true;
	                }
	                // check the input password if correct or incorrect
	                if (CheckPassword) {
	                    JOptionPane.showMessageDialog(null, "Successfully Login!");
	                    JOptionPane.showMessageDialog(null, "WELCOME TO MY PORTFOLIO");
	                   myPortfolio frame = new myPortfolio();
	                    frame.setVisible(true);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Invalid Password. Please Try Again");
	                }
	            }
	        });
	        signInButton.setBounds(246, 285, 89, 23);
	        contentPane.add(signInButton);
	        
	        passwordField = new JPasswordField();
	        passwordField.setBounds(214, 245, 154, 29);
	        contentPane.add(passwordField);
	        
	        JLabel label1 = new JLabel("PORTFOLIO");
	        label1.setHorizontalAlignment(SwingConstants.CENTER);
	        label1.setFont(new Font("Showcard Gothic", Font.BOLD, 70));
	        label1.setBounds(75, 45, 433, 87);
	        contentPane.add(label1);
	        
	        JLabel label2 = new JLabel("Iarah Mae Tusiap");
	        label2.setHorizontalAlignment(SwingConstants.CENTER);
	        label2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
	        label2.setBounds(182, 103, 212, 29);
	        contentPane.add(label2);
	      
	        JLabel label3 = new JLabel("");
	        label3.setBounds(0, 0, 570, 404);
	        contentPane.add(label3);
	        
	        
	        Image img1 = new ImageIcon(this.getClass().getResource("bg3.jpg")).getImage().getScaledInstance(570,404,Image.SCALE_DEFAULT);
	        label3.setIcon(new ImageIcon(img1));
	    }
	}

	
	