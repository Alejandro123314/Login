package dad.login;

import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView {

	private TextField textoText;
	private PasswordField contraseniaText;
	private Button accederButton, cancelarButton;
	private Label usuarioLabel, contraseniaLabel;
	private CheckBox checkLDAP;
	private VBox vbox;
	private HBox root;

	public LoginView() {
		super();

		textoText = new TextField();

		contraseniaText = new PasswordField();

		accederButton = new Button("Acceder");

		cancelarButton = new Button("Cancelar");

		usuarioLabel = new Label("ususario:");

		contraseniaLabel = new Label("contraseña:");

		checkLDAP = new CheckBox("Usar LDAP");

		GridPane gridPane = new GridPane();
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.add(usuarioLabel, 0, 0);
		gridPane.add(textoText, 1, 0);
		gridPane.add(contraseniaLabel, 0, 1);
		gridPane.add(contraseniaText, 1, 1);
		gridPane.add(checkLDAP, 1, 2);

		HBox cajaBox = new HBox(5, accederButton, cancelarButton);

		vbox = new VBox(gridPane, cajaBox);
		root = new HBox(vbox);
		
		vbox.setSpacing(5);
		root.setSpacing(5);
		vbox.setAlignment(Pos.CENTER);
		root.setAlignment(Pos.CENTER);
		cajaBox.setAlignment(Pos.CENTER);
	}
	
	public void mostrarCorrecto() {
		Alert alerta = new Alert(null);
		alerta.setTitle("Iniciar Sesión");
		
		alerta.setAlertType(AlertType.INFORMATION);
		alerta.setHeaderText("Acceso permitido");
		alerta.setContentText("Las credenciales de acceso son validas");
		alerta.showAndWait();
	}
	
	public void mostrarError() {
		Alert alerta = new Alert(null);
		alerta.setTitle("Iniciar Sesión");
		
		alerta.setAlertType(AlertType.ERROR);
		alerta.setHeaderText("Acceso denegado");
		alerta.setContentText("El usuario y/o la contraseña no son validas");
		alerta.showAndWait();
	}

	public TextField getTextoText() {
		return textoText;
	}

	public PasswordField getContraseniaText() {
		return contraseniaText;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

	public Label getUsuarioLabel() {
		return usuarioLabel;
	}

	public Label getContraseniaLabel() {
		return contraseniaLabel;
	}

	public CheckBox getCheckLDAP() {
		return checkLDAP;
	}

	public HBox getRoot() {
		return root;
	}
	
	

}
