package slideQ10;

/**
 * An AbstractGenerator gets the next value & returns value at an index.
 * @author Amanda Fernandez
 */
public abstract class AbstractGenerator implements Generator{
     private int index;
	 public abstract char getValueAt(int index);
	
	 public char next(){
		 index++;
		 return getValueAt(index-1);
	 }
}
