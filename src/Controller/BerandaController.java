/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Aryzx
 */
public class BerandaController implements Initializable {

    @FXML
    private HBox hb_petugas;
    @FXML
    private HBox hb_pelanggan;
    @FXML
    private HBox hb_pengaturan;
    @FXML
    private HBox hb_info;
    @FXML
    private HBox hb_beranda;
    @FXML
    private TableView<?> tbl_transaksi;
    @FXML
    private TableColumn<?, ?> colno;
    @FXML
    private TableColumn<?, ?> col_tgl;
    @FXML
    private TableColumn<?, ?> col_idt;
    @FXML
    private TableColumn<?, ?> col_idp;
    @FXML
    private TableColumn<?, ?> col_petugas;
    Stage closeStage = new Stage();
    @FXML
    private Label lbl_nama;
    @FXML
    private Label lbl_datanama;
    @FXML
    private Label lbl_datausername;
    @FXML
    private Label lbl_dataakses;
    @FXML
    private FontAwesomeIconView kecil;
    @FXML
    private Pane pn_data;
    @FXML
    private Label lbl_tranptgs;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pn_data.setVisible(false);
        String siapa;
        siapa = lbl_dataakses.getText();
        String siapa1 = "Akses : Petugas";
        
         if(siapa.equals(siapa1))
         {
             hb_pengaturan.setVisible(false);
             hb_petugas.setVisible(false);
         }
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
                PelangganController plngn = fxmlloader.getController();
                plngn.ambilNama(lbl_datanama.getText());
                plngn.ambilAkses(lbl_dataakses.getText());
                plngn.ambilUsername(lbl_datausername.getText());
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
    private void RefreshKlik(MouseEvent event) {
    }

    void ambilNama(String nama) {
       lbl_nama.setText(nama);
       lbl_datanama.setText("Nama : "+nama);
    }

    void ambilAkses(String akses) {
        String siapa;
        siapa = lbl_dataakses.getText();
        String siapa1 = "Akses : Petugas";
        
         if(akses.equals("Petugas"))
         {
             hb_pengaturan.setVisible(false);
             hb_petugas.setVisible(false);
         }
        lbl_dataakses.setText("Akses : "+akses);
    }

    void ambilUsername(String username) {
        lbl_datausername.setText("Username : "+username);
    }

    @FXML
    private void namaKlik(MouseEvent event) {
        pn_data.setVisible(true);
        kecil.setDisable(false);
    }

    @FXML
    private void kecilKlik(MouseEvent event) {
        pn_data.setVisible(false);
    }

   
    
}
