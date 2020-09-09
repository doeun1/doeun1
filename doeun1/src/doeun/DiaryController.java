package doeun;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import basic.doeun.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DiaryController implements Initializable{
@FXML TableView<Diary> tableView;
@FXML Button btnAdd, btnDel;

ObservableList<Diary> list;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TableColumn<Diary, ?> tc = tableView.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory<>("day"));
		tc = tableView.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("name"));
		tc = tableView.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("writer"));
		tc = tableView.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("etc"));
		
		list = FXCollections.observableArrayList();
		tableView.setItems(list);

		btnAdd.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				handleBtnAddAction();
			}
			
		});

	}
	public void handleBtnAddAction() {
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(btnAdd.getScene().getWindow());// 나중에 추가
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("DiaryAdd.fxml"));

			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
			Button btnFormAdd = (Button) parent.lookup("#btnFormAdd");
			btnFormAdd.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					TextField txtName = (TextField) parent.lookup("#txtName");
					TextField txtWriter = (TextField) parent.lookup("#txtWriter");
					TextField txt = (TextField) parent.lookup("#txtCompany");
					TextField txtPrice = (TextField) parent.lookup("#txtPrice");

					Diary diary = new Diary(
, null, null, null);
					list.add(diary);

					stage.close();

				}
			});

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	public void btnDel() {
		
	}

}
