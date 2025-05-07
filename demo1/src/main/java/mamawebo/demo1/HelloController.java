package mamawebo.demo1;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.Connection;
import java.time.LocalDate;

public class HelloController {

    int nia_anterior;
    Connection conexion;

    @FXML
    private TableView<Estudiante> tablaEstudiante;

    @FXML
    private TableColumn<Estudiante, Integer> niaTableview;

    @FXML
    private TableColumn<Estudiante, String> nombreTableview;

    @FXML
    private TableColumn<Estudiante, LocalDate> fechaTableview;

    @FXML
    private TextField niaTextField;

    @FXML
    private TextField nombreTextField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button addButton;

    @FXML
    private Button editarButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button guardarButton;

    public void onEditarButtonClick(ActionEvent actionEvent){

        addButton.setDisable(true);
        guardarButton.setDisable(true);

        Estudiante estudiante = tablaEstudiante.getSelectionModel().getSelectedItem();

    }

    ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        conexion = Mantenimiento.conectar();
        niaTableview.setCellValueFactory(data -> new javafx.beans.property.SimpleIntegerProperty(data.getValue().getNia()).asObject());
        nombreTableview.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        fechaTableview.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>(data.getValue().getFecha_nacimiento()));

        tablaEstudiante.setItems(Mantenimiento.consulta(conexion));
    }


    @FXML
    protected void onAnyadirEstudiante() {

        int nia = Integer.parseInt(niaTextField.getText());
        String nombre = nombreTextField.getText();
        LocalDate fecha = datePicker.getValue();

        Estudiante estudiante = new Estudiante(nia, nombre, fecha);

        Mantenimiento.insertar(conexion, estudiante);

        niaTextField.clear();
        nombreTextField.clear();
        datePicker.setValue(null);

        tablaEstudiante.setItems(Mantenimiento.consulta(conexion));

    }

    public void guardarButton(ActionEvent actionEvent) {

        addButton.setDisable(false);
        guardarButton.setDisable(true);

        int nia = Integer.parseInt(niaTextField.getText());
        String nombre = nombreTextField.getText();
        LocalDate fecha = datePicker.getValue();

        Estudiante estudiante = new Estudiante(nia, nombre, fecha);

        Mantenimiento.modificar(conexion, estudiante, nia_anterior);

        niaTextField.clear();
        nombreTextField.clear();
        datePicker.setValue(null);

        tablaEstudiante.setItems(Mantenimiento.consulta(conexion));

    }

    public void eliminarButton(ActionEvent actionEvent) {

        Estudiante estudiante_b = tablaEstudiante.getSelectionModel().getSelectedItem();

        if(estudiante_b != null){

            Mantenimiento.borrar(conexion, estudiante_b);

        }else{
            System.out.println("No has pulsao nada bobin!");
        }

        tablaEstudiante.setItems(Mantenimiento.consulta(conexion));

    }

    public void editarButton(ActionEvent actionEvent) {

        addButton.setDisable(true);
        guardarButton.setDisable(false);

        Estudiante estudiante_a = tablaEstudiante.getSelectionModel().getSelectedItem();

        nia_anterior = estudiante_a.getNia();

        if(estudiante_a != null){

            niaTextField.setText(Integer.toString(estudiante_a.getNia()));
            nombreTextField.setText(estudiante_a.getNombre());
            datePicker.setValue(estudiante_a.getFecha_nacimiento());

        }else{
            System.out.println("No has pulsao nada bobin!");
        }



    }
}