package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Koneksi.Koneksi;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Aryzx
 */
public class LoginController implements Initializable {
    
    private Label label;
    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField pf_pass;
    @FXML
    private Label lbl_alert;
    @FXML
    private Button btn_login;
    Connection con ;
    Statement stm;
    ResultSet rs;
    Stage closeStage =new Stage();
    
    String nama;
    String akses;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Koneksi db = new Koneksi();
       db.config();
       con = db.con;
       stm = db.stm;
       
    }    

    @FXML
    private void MasukKlik(ActionEvent event) {
        try{
            String sql = "Select * From petugas where username = '"+tf_username.getText()+"' AND password = '"+pf_pass.getText()+"'";
            rs = stm.executeQuery(sql);
            if(rs.next())
            {
                FXMLLoader fxmlloader= new
                    FXMLLoader(getClass().getResource("/FXML/Beranda.fxml"));
                Parent root=(Parent) fxmlloader.load();
                Node node = (Node)event.getSource();
                closeStage =(Stage) node.getScene().getWindow();
                closeStage.close();
                BerandaController brnda = fxmlloader.getController();
                brnda.ambilNama(rs.getString("nama"));
                brnda.ambilAkses(rs.getString("akses"));
                brnda.ambilUsername(rs.getString("username"));
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                
                
            }
            else
            {
                lbl_alert.setText("Cek Kembali Nama Pengguna Dan Kata Sandi!!");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Mohon Maaf Ada Kesalahan Pada Aplikasi!");
            e.printStackTrace();
        }
    }
    
}
