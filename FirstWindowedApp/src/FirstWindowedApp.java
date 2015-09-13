import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.IDN;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FirstWindowedApp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindowedApp window = new FirstWindowedApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstWindowedApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setTitle("Best Broswer App");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JEditorPane editorPane = new JEditorPane();
		frame.getContentPane().add(editorPane, BorderLayout.CENTER);
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		final JButton btnGo = new JButton("go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
			          String url = textField.getText().toLowerCase();
			          if (url.startsWith("http://"))
			            url = url.substring(7);
			          editorPane.setPage("http://" + IDN.toASCII(url));
			        } catch (Exception e) {
			          e.printStackTrace();
			          JOptionPane.showMessageDialog( btnGo, "Browser problem: " + e.getMessage());
			        }
			}
		});
		frame.getContentPane().add(btnGo, BorderLayout.EAST);
		
		
	}

}
