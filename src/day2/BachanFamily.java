package day2;

public interface BachanFamily {

	public abstract void home();
	default void car() {System.out.println("Family Car");}
	default void office() {System.out.println("Family Office");}
	void gold();
}
