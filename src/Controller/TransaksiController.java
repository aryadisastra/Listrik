/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
public class TransaksiController implements Initializable {

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
    private TextField tf_idpel;
    @FXML
    private TextField tf_nama;
    @FXML
    private TextField tf_taifdaya;
    @FXML
    private TextField tf_kwh;
    @FXML
    private TextField tf_biayahari;
    @FXML
    private TextField tf_bl;
    @FXML
    private TextField tf_tagihan;
    @FXML
    private TextField tf_biayaadm;
    @FXML
    private TextField tf_denda;
    @FXML
    private CheckBox cb_denda;
    @FXML
    private TextField tf_total;
    @FXML
    private TableView<?> tbl_transaksi;
    @FXML
    private TableColumn<?, ?> col_id;
    @FXML
    private TableColumn<?, ?> col_idpel;
    @FXML
    private TableColumn<?, ?> col_nama;
    
    Stage closeStage = new Stage();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
                FXMLLoader(getClass().getResource("/FXML/Exit.fxml"));
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
    private void BayarKlik(ActionEvent event) {
    }

    @FXML
    private void TabelKlik(MouseEvent event) {
    }
    
}
