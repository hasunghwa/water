package application;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class waterV {
	private StringProperty name = new SimpleStringProperty();
	private FloatProperty Mg = new SimpleFloatProperty();
	private FloatProperty Ca = new SimpleFloatProperty();
	private FloatProperty K = new SimpleFloatProperty();
	private FloatProperty Na = new SimpleFloatProperty();
	private FloatProperty SiO2 = new SimpleFloatProperty();
	private FloatProperty Mo = new SimpleFloatProperty();
	private FloatProperty V = new SimpleFloatProperty();
	private FloatProperty Ge = new SimpleFloatProperty();
	private FloatProperty OI = new SimpleFloatProperty();
	
	public waterV() {

	}

	public waterV(String name, Float Mg, Float Ca, Float K, Float Na, Float SiO2, Float Mo , Float V, Float Ge, Float OI) {
		this.name.set(name);
		this.Mg.set(Mg);
		this.Ca.set(Ca);
		this.K.set(K);
		this.Na.set(Na);
		this.SiO2.set(SiO2);
		this.Mo.set(Mo);
		this.V.set(V);
		this.Ge.set(Ge);
		this.OI.set(OI);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public StringProperty nameProperty() {
		return name;
	}
	
	public Float getMg() {
		return Mg.get();
	}

	public void setMg(Float Mg) {
		this.Mg.set(Mg);
	}

	public FloatProperty MgProperty() {
		return Mg;
	}
	
	public Float getCa() {
		return Ca.get();
	}

	public void setCa(Float Ca) {
		this.Ca.set(Ca);
	}

	public FloatProperty CaProperty() {
		return Ca;
	}
	
	public Float getK() {
		return K.get();
	}

	public void setK(Float K) {
		this.K.set(K);
	}

	public FloatProperty KProperty() {
		return K;
	}
	
	public Float getNa() {
		return Na.get();
	}

	public void setNa(Float Na) {
		this.Na.set(Na);
	}

	public FloatProperty NaProperty() {
		return Na;
	}
	
	public Float getSiO2() {
		return SiO2.get();
	}

	public void setSiO2(Float SiO2) {
		this.SiO2.set(SiO2);
	}

	public FloatProperty SiO2Property() {
		return SiO2;
	}
	
	public Float getMo() {
		return Mo.get();
	}

	public void setMo(Float Mo) {
		this.Mo.set(Mo);
	}

	public FloatProperty MoProperty() {
		return Mo;
	}
	
	public Float getV() {
		return V.get();
	}

	public void setV(Float V) {
		this.V.set(V);
	}

	public FloatProperty VProperty() {
		return V;
	}
	
	public Float getGe() {
		return Ge.get();
	}

	public void setGe(Float Ge) {
		this.Ge.set(Ge);
	}

	public FloatProperty GeProperty() {
		return Ge;
	}
	
	public Float getOI() {
		return OI.get();
	}

	public void setOI(Float OI) {
		this.OI.set(OI);
	}

	public FloatProperty OIProperty() {
		return OI;
	}
	
}
