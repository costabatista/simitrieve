/**
 * 
 */
package ml.paulobatista.simitrieve;

import java.util.List;

/**
 * @author paulo
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> paths = new ProjectReader().getProjectStructure("agera");
		
		for(String s : paths) {
			System.out.println(s);
		}
	}

}
