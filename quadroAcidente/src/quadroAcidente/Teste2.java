package quadroAcidente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Teste2 extends JFrame {
	int contagemInicial2 = 629;
	int contagemInicial = 605;
	long days;
	
	private JPanel contentPane;
	private JLabel lbl_contagem;
	private JLabel txt_data;
	private JLabel txtDia;
	private JLabel txtAcidentes;
	private JLabel lblNewLabel_2;
	
	Date data = new Date();
	private JLabel lblNewLabel_3;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste2 frame = new Teste2();
					frame.setVisible(true);
					frame.setResizable(false);
						//frame.setTitle("Monitoramento de dias de acidente");
					frame.setLocale(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	

	/**
	 * Create the frame.
	 */
	public Teste2() {
		setFont(new Font("Dialog", Font.PLAIN, 17));
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\vigjo\\Downloads\\logo.png"));
		setTitle("MONITORAMENTO DE ACIDENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 420);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setFocusableWindowState(true);
		
		
		
		JLabel lblNewLabel = new JLabel("QUADRO DE ACIDENTE ATUALIZADO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(210, 59, 342, 35);
		contentPane.add(lblNewLabel);
		
		lbl_contagem = new JLabel("0000");
		lbl_contagem.setEnabled(false);
		lbl_contagem.setBackground(new Color(255, 0, 0));
		lbl_contagem.setForeground(Color.BLACK);
		lbl_contagem.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lbl_contagem.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_contagem.setBounds(239, 135, 155, 59);
		contentPane.add(lbl_contagem);
		
		txt_data = new JLabel("00:00:00  00/00/0000");
		txt_data.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txt_data.setHorizontalAlignment(SwingConstants.CENTER);
		txt_data.setBounds(195, 335, 305, 35);
		contentPane.add(txt_data);
		
		JButton btnZerar = new JButton("ZERAR CONTAGEM");
		btnZerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int desfazer = contagemInicial;
//				contagemInicial = 0;
//				lbl_contagem.setText(String.valueOf(contagemInicial));
//				
//				
//				
//				btnZerar.setText("DESFAZER");
//				
//				System.out.println("Contagem foi zerada: "+contagemInicial);
			}
		});
		btnZerar.setBackground(SystemColor.windowBorder);
		btnZerar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnZerar.setBounds(240, 268, 209, 42);
		btnZerar.setBackground(new Color(238, 238, 238));
		contentPane.add(btnZerar);
		
		
		
		
		txtDia = new JLabel("DIAS");
		txtDia.setHorizontalAlignment(SwingConstants.CENTER);
	    txtDia.setFont(new Font("Tahoma", Font.PLAIN, 35));
	    txtDia.setBounds(400, 156, 86, 37);
	    contentPane.add(txtDia);
	    
	    
	    txtAcidentes = new JLabel("S/ ACIDENTES");
	    txtAcidentes.setHorizontalAlignment(SwingConstants.CENTER);
	    txtAcidentes.setFont(new Font("Tahoma", Font.PLAIN, 30));
	    txtAcidentes.setBounds(498, 158, 201, 37);
	    contentPane.add(txtAcidentes);
	    
	    lblNewLabel_2 = new JLabel("ESTAMOS H\u00C1");
	    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
	    lblNewLabel_2.setBounds(20, 156, 209, 37);
	    contentPane.add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_1 = new JLabel("Vers\u00E3o: 1.0");
	    lblNewLabel_1.setBounds(33, 367, 66, 14);
	    contentPane.add(lblNewLabel_1);
	    
	    lblNewLabel_3 = new JLabel("By Jo\u00E3o Paulo de Oliveira");
	    lblNewLabel_3.setBackground(Color.RED);
	    lblNewLabel_3.setBounds(562, 367, 165, 14);
	    contentPane.add(lblNewLabel_3);
		
		
		LocalDate dia_anterior, hoje;
		

		
		
		//pega dia atual e anterior
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		hoje = LocalDate.now();		
		dia_anterior = LocalDate.of(2022,4,26);
		
		
		
		System.out.println("Data atual: "+sdf.format(data));
		
		//PEGA DIFEREN�A ENTRE AS DATAS
		days = ChronoUnit.DAYS.between(dia_anterior, hoje);
		
		System.out.println("Diferen�a de dias: " + days);
		
		int i;
		for (i = 1; i <= days; i++) {
			
			
			contagemInicial+=1;
			lbl_contagem.setText(String.valueOf(contagemInicial));
		}			
		
		System.out.println("Contador: " + i);
		System.out.println("Quadro Acidentes: " + contagemInicial);
		
	 //   txt_data.setText(String.valueOf(sdf.format(data)));
	    
	   if(contagemInicial == 0) {
	    	txtAcidentes.setText("S/ ACIDENTE");
	    	txtDia.setText("DIA");
	    }
	    
	   
	   Thread atualizaHora = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					while (true) {
						Date date = new Date();
						StringBuffer data = new StringBuffer();
						
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Para Atualizar a DATA so mudar para o formato dd/MM/yyyy
					txt_data.setText(data.toString() + sdf.format(date));
						System.out.println(data.toString() + sdf.format(date));
						Thread.sleep(1000);
						
						//textFieldHorario.revalidate();
					}
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				
			}
		});
		atualizaHora.start();
	  
		
		
		

	}
}