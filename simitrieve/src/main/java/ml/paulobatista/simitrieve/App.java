/**
 * 
 */
package ml.paulobatista.simitrieve;

import ml.paulobatista.simitrieve.args.ArgumentManager;
import ml.paulobatista.simitrieve.entity.project.Project;
import ml.paulobatista.simitrieve.similarity.ConceptualCouplingManager;

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
		ArgumentManager am = new ArgumentManager();
		Project project = am.execute(args);
		
		ConceptualCouplingManager cm = new ConceptualCouplingManager(am);
		cm.executeConceptualCouplingObtainProcess(project);
		
	}

}
