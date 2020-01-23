/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
public class PelangganController implements Initializable {

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
    private TextField tf_email;
    @FXML
    private TextField tf_kodepos;
    @FXML
    private ComboBox<?> cb_daya;
    @FXML
    private TextArea tf_alamat;
    @FXML
    private TableView<?> tbl_pelanggan;
    @FXML
    private TableColumn<?, ?> col_id;
    @FXML
    private TableColumn<?, ?> col_nama;
    @FXML
    private TableColumn<?, ?> col_daya;

    Stage closeStage = new Stage();
    @FXML
    private Pane pn_data;
    @FXML
    private FontAwesomeIconView kecil;
    @FXML
    private Label lbl_datanama;
    @FXML
    private Label lbl_datausername;
    @FXML
    private Label lbl_dataakses;
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
        hb_info.setStyle("-fx-background-color : #e7e4e4;");
    }

    @FXML
    private void BerandaIn(MouseEvent event) {
        hb_info.setStyle("-fx-background-color : white;");
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
    }

    @FXML
    private void UbahKlik(ActionEvent event) {
    }

    @FXML
    private void HapusKlik(ActionEvent event) {
    }

    @FXML
    private void TabelKlik(MouseEvent event) {
    }

    @FXML
    private void namaKlik(MouseEvent event) {
    }

    @FXML
    private void kecilKlik(MouseEvent event) {
    }

    void ambilNama(String nama) {
        lbl_datanama.setText(nama);
        lbl_akses.setText(nama);
    }

    void ambilAkses(String akses) {
        lbl_dataakses.setText(akses);
    }

    void ambilUsername(String username) {
        lbl_datausername.setText(username);
    }
    
}
