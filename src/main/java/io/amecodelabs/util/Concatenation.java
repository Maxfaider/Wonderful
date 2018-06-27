package io.amecodelabs.util;

public class Concatenation {
	
	private String separator;
	private StringBuilder chain;
	
	public static Concatenation separateBy(String separator) {
		return new Concatenation(separator);
	}
	
	private Concatenation(String separator) {
		chain = new StringBuilder();
		this.separator = separator;
	}
	
	public void concat(String key, String value) {
		chain.append(key + " ");
		chain.append(separator);
		chain.append(" " + value);
		chain.append("\n");
	}
	
	public boolean empty() {
		return (chain.length() == 0);
	}
	
	public String result() {
		return chain.toString();
	}
	
}
