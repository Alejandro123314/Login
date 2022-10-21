package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class LoginController {

	private LoginView view = new LoginView();
	private LoginModel model = new LoginModel();
	private Stage primaryStage;

	public LoginController(Stage primaryStage) {
		this.primaryStage = primaryStage;

		model.nombreProperty().bindBidirectional(view.getTextoText().textProperty());
		model.contraseniaProperty().bindBidirectional(view.getContraseniaText().textProperty());
		model.ldapProperty().bindBidirectional(view.getCheckLDAP().selectedProperty());

		view.getAccederButton().setOnAction(e -> onAccerderAction(e));
		view.getCancelarButton().setOnAction(e -> onCancelarAction(e));
	}

	public LoginView getView() {
		return view;
	}

	private void onAccerderAction(ActionEvent e) {
		AuthService auth;
		if (model.isLdap()) {
			auth = new LdapAuthService();
		} else {
			auth = new FileAuthService();
		}

		try {
			boolean valido = auth.login(model.getNombre(), model.getContrasenia());
			if (valido) {
				view.mostrarCorrecto();
			} else {
				view.mostrarError();
				model.setContrasenia(null);				
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	private void onCancelarAction(ActionEvent e) {
		this.primaryStage.close();
	}

}
