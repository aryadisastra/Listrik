/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Koneksi.Koneksi;
import Model.ModelDaya;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * FXML Controller class
 *
 * @author Aryzx
 */
public class PengaturanController implements Initializable {

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
    private TextField tf_daya;
    @FXML
    private TextField tf_harga;
    @FXML
    private TableView<?> tbl_daya;
    @FXML
    private TableColumn<String, ModelDaya> col_id;
    @FXML
    private TableColumn<?, ?> col_daya;
    @FXML
    private TableColumn<?, ?> col_harga;
    @FXML
    private TextField tf_id;
    @FXML
    private TextField tf_biaya;
    @FXML
    private TableView<?> tbl_biaya;
    @FXML
    private TableColumn<?, ?> col_idbiaya;
    @FXML
    private TableColumn<?, ?> col_Biaya;
    
    Stage closeStage = new Stage();

    Connection con;
    Statement stm;
    ResultSet rs;
    @FXML
    private Label lbl_iddaya;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Koneksi db = new Koneksi();
        db.config();
        con = db.con;
        stm =  db.stm;
        
       
    }    

    @FXML
    private void PetugasOut(MouseEvent event) {
        hb_petugas.setStyle("-fx-background-color : #e7e4e4;");
    }

    @FXML
    private void PetugasIn(MouseEvent event) {
        hb_petugas.setStyle("-fx-background-color : White;");
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
    private void BerandaOut(MouseEvent event) {
        hb_beranda.setStyle("-fx-background-color : #e7e4e4;");
    }

    @FXML
    private void BerandaIn(MouseEvent event) {
        hb_beranda.setStyle("-fx-background-color : White;");
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
    private void PelangganOut(MouseEvent event) {
        hb_pelanggan.setStyle("-fx-background-color : #e7e4e4;");
    }

    @FXML
    private void PelangganIn(MouseEvent event) {
        hb_pelanggan.setStyle("-fx-background-color : White;");
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
    private void PengaturanOut(MouseEvent event) {
        hb_pengaturan.setStyle("-fx-background-color : #e7e4e4;");
    }

    @FXML
    private void PengaturanIn(MouseEvent event) {
        hb_pengaturan.setStyle("-fx-background-color : White;");
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
    private void InfoOut(MouseEvent event) {
        hb_info.setStyle("-fx-background-color : #e7e4e4;");
    }

    @FXML
    private void InfoIn(MouseEvent event) {
        hb_info.setStyle("-fx-background-color : White;");
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
    private void TambahDayaKlik(ActionEvent event) {
        try{
            String sql = "INSERT INTO daya (watt,hargakwh) VALUES ('"+tf_daya.getText()+"','"+tf_harga.getText()+"') ";
            stm.execute(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void UbahDayaKlik(ActionEvent event) {
        try{
            String sql = "UPDATE SET daya (watt,hargakwh) VALUES ('"+tf_daya.getText()+"','"+tf_harga.getText()+"') WHERE id = '"+lbl_iddaya.getText()+"'";
            stm.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void HapusDayaKlik(ActionEvent event) {
        try{
            String sql = "DELETE FROM daya WHERE id = '"+lbl_iddaya.getText()+"'";
            stm.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void TabelKlik(MouseEvent event) {  
    }
    

    @FXML
    private void TambahBiayaKlik(ActionEvent event) {
        try{
            String sql = "INSERT INTO biayaadmin VALUES ('"+tf_id.getText()+"','"+tf_biaya.getText()+"') ";
            stm.execute(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void UbahBiayaKlik(ActionEvent event) {
        try{
            String sql = "UPDATE SET biayaadmin VALUES ('"+tf_biaya.getText()+"') WHERE id = '"+tf_id.getText()+"'";
            stm.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void HapusBiayaKlik(ActionEvent event) {
        try{
            String sql = "DELETE FROM biayaadmin WHERE id = '"+tf_id.getText()+"'";
            stm.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
