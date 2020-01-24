/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Koneksi.Koneksi;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Aryzx
 */
public class PetugasController implements Initializable {
    
    ObservableList<String> list = FXCollections.observableArrayList("PRIA","WANITA");
    
    ObservableList<String> listakses = FXCollections.observableArrayList("admin","Petugas");

    @FXML
    private Label lbl_akses;
    @FXML
    private HBox hb_beranda;
    @FXML
    private HBox hb_petugas;
    @FXML
    private HBox hb_pelanggan;
    @FXML
    private HBox hb_pengaturan;
    @FXML
    private HBox hb_info;
    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField pf_pass;
    @FXML
    private TextField tf_nama;
    @FXML
    private TextField tf_nohp;
    @FXML
    private TextField tf_tmpt;
    @FXML
    
    private DatePicker dp_tgl;
    @FXML
    private ComboBox<String> cb_gender;
    @FXML
    private ComboBox<String> tf_akses;
    @FXML
    private TextArea tf_alamat;
    @FXML
    private TableView<?> tbl_petugas;
    @FXML
    private TableColumn<?, ?> col_id;
    @FXML
    private TableColumn<?, ?> col_username;
    @FXML
    private TableColumn<?, ?> col_nama;
    Stage closeStage = new Stage();
    
    Connection con;
    Statement stm;
    ResultSet rs;
    @FXML
    private Label lbl_idpetugas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_gender.setItems(list);
        tf_akses.setItems(listakses);
         Koneksi db = new Koneksi();
        db.config();
        con = db.con;
        stm =  db.stm;
    }    

    @FXML
    private void PetugasIn(MouseEvent event) {
        hb_petugas.setStyle("-fx-background-color : White;");
    }

    @FXML
    private void PetugasOut(MouseEvent event) {
        hb_petugas.setStyle("-fx-background-color : #e7e4e4;");
    }


    @FXML
    private void PelangganIn(MouseEvent event) {
        hb_pelanggan.setStyle("-fx-background-color : White;");
    }

    @FXML
    private void PelangganOut(MouseEvent event) {
        hb_pelanggan.setStyle("-fx-background-color : #e7e4e4;");
    }


    @FXML
    private void PengaturanIn(MouseEvent event) {
        hb_pengaturan.setStyle("-fx-background-color : White;");
    }

    @FXML
    private void PengaturanOut(MouseEvent event) {
        hb_pengaturan.setStyle("-fx-background-color : #e7e4e4;");
    }
    @FXML
    private void InfoIn(MouseEvent event) {
        hb_info.setStyle("-fx-background-color : White;");
    }

    @FXML
    private void InfoOut(MouseEvent event) {
        hb_info.setStyle("-fx-background-color : #e7e4e4;");
    }

    @FXML
    private void BerandaOut(MouseEvent event) {
        hb_beranda.setStyle("-fx-background-color : #e7e4e4;");
    }

    @FXML
    private void BerandaIn(MouseEvent event) {
        hb_beranda.setStyle("-fx-background-color : white;");
    }
    
    @FXML
    private void PelangganKlik(MouseEvent event) {
        try{
                FXMLLoader fxmlloader= new
                FXMLLoader(getClass().getResource("/FXML/Pelanggan.fxml"));
                Node node = (Node)event.getSource();
                closeStage =(Stage) node.getScene().getWindow();
                closeStage.close();
                Parent root=(Parent) fxmlloader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
       }catch(Exception Ex)
       {
           JOptionPane.showMessageDialog(null,"Terjadi Kesalahan!!");
       }
    }
    
    @FXML
    private void PetugasKlik(MouseEvent event) {
        try{
                FXMLLoader fxmlloader= new
                FXMLLoader(getClass().getResource("/FXML/Petugas.fxml"));
                Node node = (Node)event.getSource();
                closeStage =(Stage) node.getScene().getWindow();
                closeStage.close();
                Parent root=(Parent) fxmlloader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
       }catch(Exception Ex)
       {
           JOptionPane.showMessageDialog(null,"Terjadi Kesalahan!!");
       }
    }
    
    @FXML
    private void PengaturanKlik(MouseEvent event) {
        try{
                FXMLLoader fxmlloader= new
                FXMLLoader(getClass().getResource("/FXML/Pengaturan.fxml"));
                Node node = (Node)event.getSource();
                closeStage =(Stage) node.getScene().getWindow();
                closeStage.close();
                Parent root=(Parent) fxmlloader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
       }catch(Exception Ex)
       {
           JOptionPane.showMessageDialog(null,"Terjadi Kesalahan!!");
       }
    }


    @FXML
    private void InfoKlik(MouseEvent event) {
    }

    @FXML
    private void ExitKlik(MouseEvent event) {
          try{
                FXMLLoader fxmlloader= new
                FXMLLoader(getClass().getResource("/FXML/Login.fxml"));
                Node node = (Node)event.getSource();
                closeStage =(Stage) node.getScene().getWindow();
                closeStage.close();
                Parent root=(Parent) fxmlloader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
       }catch(Exception Ex)
       {
           JOptionPane.showMessageDialog(null,"Terjadi Kesalahan!!");
       }
    }


    @FXML
    private void BerandaKlik(MouseEvent event) {
        try{
                FXMLLoader fxmlloader= new
                FXMLLoader(getClass().getResource("/FXML/Beranda.fxml"));
                Node node = (Node)event.getSource();
                closeStage =(Stage) node.getScene().getWindow();
                closeStage.close();
                Parent root=(Parent) fxmlloader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
       }catch(Exception Ex)
       {
           JOptionPane.showMessageDialog(null,"Terjadi Kesalahan!!");
       }
    }

    @FXML
    private void TambahKlik(ActionEvent event) {
        try{
            String sql = "INSERT INTO petugas (nama,tmptlhr,tgllhr,gender,alamat,nohp,akses,username,password) VALUES ('"+tf_nama.getText()+"','"+tf_tmpt.getText()+"','"+dp_tgl.getValue()+"','"+cb_gender.getSelectionModel().getSelectedItem().toString()+"','"+tf_alamat.getText()+"','"+tf_nohp.getText()+"','"+tf_akses.getSelectionModel().getSelectedItem().toString()+"','"+tf_username.getText()+"','"+pf_pass.getText()+"')";
            stm.execute(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void UbahKlik(ActionEvent event) {
        try{
            String sql = "UPDATE SET petugas (nama,tmptlhr,tgllhr,gender,alamat,nohp,akses,username,password) VALUES ('"+tf_nama.getText()+"','"+tf_tmpt.getText()+"','"+dp_tgl.getValue()+"','"+cb_gender.getSelectionModel().getSelectedItem().toString()+"','"+tf_alamat.getText()+"','"+tf_nohp.getText()+"','"+tf_akses.getSelectionModel().getSelectedItem().toString()+"','"+tf_username.getText()+"','"+pf_pass.getText()+"') WHERE id = '"+lbl_idpetugas.getText()+"'";
            stm.execute(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void HapusKlik(ActionEvent event) {
        try{
            String sql = "DELETE FROM petugas WHERE id = '"+lbl_idpetugas.getText()+"'";
            stm.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void TabelKlik(MouseEvent event) {
    }
    
}
