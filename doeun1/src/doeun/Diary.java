package doeun;

import javafx.beans.property.SimpleStringProperty;

public class Diary {

	private SimpleStringProperty day;
	private SimpleStringProperty name;
	private SimpleStringProperty writer;
	private SimpleStringProperty etc;

	public Diary(String day, String name, String writer,
		String etc) {
		this.day = new SimpleStringProperty(day);
		this.name =new SimpleStringProperty(name);
		this.writer = new SimpleStringProperty(writer);
		this.etc = new SimpleStringProperty(etc);
	}

	public String getDay() {
		return this.day.get();
	}

	public void setDay(String day) {
		this.day.set(day);
	}
	public String getName() {
		return this.name.get();
	}
	
	public void setName(String name) {
		this.name.set(name);
	}

	public String getWriter() {
		return this.writer.get();
	}

	public void setWriter(String writer) {
		this.writer.set(writer);
	}

	public String getEtc() {
		return this.etc.get();
	}

	public void setEtc(String etc) {
		this.etc.set(etc);
	}

	
}
