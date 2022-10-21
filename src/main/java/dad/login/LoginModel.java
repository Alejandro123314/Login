package dad.login;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {

	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty contrasenia = new SimpleStringProperty();
	private BooleanProperty ldap = new SimpleBooleanProperty();
	public final StringProperty nombreProperty() {
		return this.nombre;
	}
	
	public final String getNombre() {
		return this.nombreProperty().get();
	}
	
	public final void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}
	
	public final StringProperty contraseniaProperty() {
		return this.contrasenia;
	}
	
	public final String getContrasenia() {
		return this.contraseniaProperty().get();
	}
	
	public final void setContrasenia(final String contrasenia) {
		this.contraseniaProperty().set(contrasenia);
	}
	
	public final BooleanProperty ldapProperty() {
		return this.ldap;
	}
	
	public final boolean isLdap() {
		return this.ldapProperty().get();
	}
	
	public final void setLdap(final boolean ldap) {
		this.ldapProperty().set(ldap);
	}
	

	

}
