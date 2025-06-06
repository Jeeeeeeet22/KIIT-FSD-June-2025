package day4;

public class LowQuantityException extends RuntimeException   // LowQuantityException will become unchecked
{
	public LowQuantityException(String errorMessage)
	{
		super(errorMessage);
	}
}
