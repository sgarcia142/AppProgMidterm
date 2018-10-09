package slideQ8;
/**
 * A Generator supplies a series of values from a known list.
 * @author Amanda Fernandez
 */
public interface Generator {
	/**
	 * @return the next value generated
	 */
	public char next();
	
	
	/**
	 * @return the length
	 */
	public int length();

}