package ibmtal.trendyol.core.result;

import java.util.ArrayList;

public class Result<T> {
	private boolean success;
	private ArrayList<T> data;
	private ArrayList<ErrorItem> errors;
	public Result() {
		super();
		this.data=new ArrayList<>();
		this.errors=new ArrayList<>();
		this.setSuccess(true);
	}
	public Result(boolean success, ArrayList<T> data, ArrayList<ErrorItem> errors) {
		super();
		this.data=new ArrayList<>();
		this.errors=new ArrayList<>();
		this.success = success;
		this.data = data;
		this.errors = errors;
	}
	
	public void addError(String name,String value) {
		ErrorItem newError=new ErrorItem(name, value);
		this.errors.add(newError);
		this.setSuccess(false);
	}

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public ArrayList<T> getData() {
		return data;
	}
	public void setData(ArrayList<T> data) {
		this.data = data;
	}
	public ArrayList<ErrorItem> getErrors() {
		return errors;
	}
	public void setErrors(ArrayList<ErrorItem> errors) {
		this.errors = errors;
	}
	
}
