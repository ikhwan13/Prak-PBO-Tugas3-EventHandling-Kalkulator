package kalkulator;

import java.awt.event.*;
import javax.swing.*;

public class Kalkulator {

    public static void main(String[] args) {
        new GUI();
    }
    
}

class GUI extends JFrame implements ActionListener{
    String bil="";
    double jumlah;
    double angka[] = new double[100];   //untuk menyimpan angka yang akan dihitung
    int i=0;
    int pilih[] = new int[100];         //untuk menyimpan operator yang digunakan
    
    //deklarasi objek kalkulator
    JTextPane fcalc = new JTextPane();
    JButton bnol = new JButton("0");
    JButton bsatu = new JButton("1");
    JButton bdua = new JButton("2");
    JButton btiga = new JButton("3");
    JButton bempat = new JButton("4");
    JButton blima = new JButton("5");
    JButton benam = new JButton("6");
    JButton btujuh = new JButton("7");
    JButton bdelapan = new JButton("8");
    JButton bsembilan = new JButton("9");
    JButton bkali = new JButton("*");
    JButton bbagi = new JButton("/");
    JButton btambah = new JButton("+");
    JButton bkurang = new JButton("-");
    JButton bsamadengan = new JButton("=");
    JButton bclear = new JButton("C");
    JButton bkoma = new JButton(".");
    
    public GUI(){
        setTitle("Kalkulator");
        setSize(300,300);
        
        //penambahan objek pada tampilan kalkulator
        setLayout(null);
        add(fcalc);
        add(bsatu);
	add(bdua);
	add(btiga);
        add(bkali);
	add(bempat);
	add(blima);
	add(benam);
        add(bbagi);
	add(btujuh);
	add(bdelapan);
	add(bsembilan);
        add(btambah);
	add(bnol);
        add(bkoma);
	add(bsamadengan);
	add(bkurang);
	add(bclear);
        
        //pengaturan ukuran objek
        fcalc.setBounds(10,10,240,20);
        bsatu.setBounds(10,40,50,20);
        bdua.setBounds(70,40,50,20);
        btiga.setBounds(130,40,50,20);
        bkali.setBounds(190,40,50,20);
        bempat.setBounds(10,80,50,20);
        blima.setBounds(70,80,50,20);
        benam.setBounds(130,80,50,20);
        bbagi.setBounds(190,80,50,20);
        btujuh.setBounds(10,120,50,20);
        bdelapan.setBounds(70,120,50,20);
        bsembilan.setBounds(130,120,50,20);
        btambah.setBounds(190,120,50,20);
        bnol.setBounds(10,160,50,20);
        bkoma.setBounds(70,160,50,20);
        bsamadengan.setBounds(130,160,50,20);
        bkurang.setBounds(190,160,50,20);
        bclear.setBounds(10,200,50,20);
        
	setVisible(true);
        
        //bagian event handling
        bnol.addActionListener(this);
        bsatu.addActionListener(this);
        bdua.addActionListener(this);
        btiga.addActionListener(this);
        bempat.addActionListener(this);
        blima.addActionListener(this);
        benam.addActionListener(this);
        btujuh.addActionListener(this);
        bdelapan.addActionListener(this);
        bsembilan.addActionListener(this);
        bkoma.addActionListener(this);
        bkali.addActionListener(this);
        bbagi.addActionListener(this);
        btambah.addActionListener(this);
        bkurang.addActionListener(this);
        bsamadengan.addActionListener(this);
        bclear.addActionListener(this);
        
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
            if(e.getSource() == bnol){
                bil+="0";
                fcalc.setText(bil);
            }
            if(e.getSource() == bsatu){
                bil+="1";
                fcalc.setText(bil);
            }
            if(e.getSource() == bdua){
                bil+="2";
                fcalc.setText(bil);
            }
            if(e.getSource() == btiga){
                bil+="3";
                fcalc.setText(bil);
            }
            if(e.getSource() == bempat){
                bil+="4";
                fcalc.setText(bil);
            }
            if(e.getSource() == blima){
                bil+="5";
                fcalc.setText(bil);
            }
            if(e.getSource() == benam){
                bil+="6";
                fcalc.setText(bil);
            }
            if(e.getSource() == btujuh){
                bil+="7";
                fcalc.setText(bil);
            }
            if(e.getSource() == bdelapan){
                bil+="8";
                fcalc.setText(bil);
            }
            if(e.getSource() == bsembilan){
                bil+="9";
                fcalc.setText(bil);
            }
            if(e.getSource() == bkoma){
                bil+=".";
                fcalc.setText(bil);
            }
            
            //untuk bagian operator menggunakan array untuk menyimpan proses penghitungan berkelanjutan
            //proses penghitungan akan mulai dari depan
            //misal 2+2+2=6, 1+2/3=1
            if(e.getSource() == bkali){
                angka[i] = Double.parseDouble(bil);
                bil="";
                pilih[i]=3;
                i++;
            }
            if(e.getSource() == bbagi){
                angka[i] = Double.parseDouble(bil);
                bil="";
                pilih[i]=4;
                i++;
            }
            if(e.getSource() == btambah){
                angka[i] = Double.parseDouble(bil);
                bil="";
                pilih[i]=1;
                i++;
            }
            if(e.getSource() == bkurang){
                angka[i] = Double.parseDouble(bil);
                bil="";
                pilih[i]=2;
                i++;
            }
            if(e.getSource() == bsamadengan){
                angka[i] =Double.parseDouble(bil);
                for(int j=0;j<i;j++){
                    //proses penghitungan dapat disimpan tanpa harus klik tombol samadengan terlebih dahulu
                    //proses penghitungan akan berjalan dari awal input sampai akhir input dalam sekali klik tombol samadengan
                    switch(pilih[j]){
                    case 1:
                        if(j==0){
                            jumlah = angka[j]+angka[j+1];
                        }else jumlah = jumlah+angka[j+1];
                        bil = Double.toString(jumlah);            
                        break;
                    case 2:
                        if(j==0){
                            jumlah = angka[j]-angka[j+1];
                        }else jumlah = jumlah-angka[j+1];
                        bil = Double.toString(jumlah);            
                        break;
                    case 3:
                        if(j==0){
                            jumlah = angka[j]*angka[j+1];
                        }else jumlah = jumlah*angka[j+1];
                        bil = Double.toString(jumlah);            
                        break;
                    case 4:
                        if(j==0){
                            jumlah = angka[j]/angka[j+1];
                        }else jumlah = jumlah/angka[j+1];
                        bil = Double.toString(jumlah);            
                    break;           
                    }
                } 
                fcalc.setText(bil);
                i=0;
            }
            if(e.getSource() == bclear){
                fcalc.setText(null);
                jumlah=0;
                i=0;
                bil="";
            }
        }

}
