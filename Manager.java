package threesolid;
//the following class is using the Open close principle
// we want the manager class to be absolutetly its own class 
// because when modifying or extending it will just call the commands.
// the tasks will be applied accordying to the worker type

//Modified by: Samantha Hollensbe
//OPEN-CLOSE: Manager is a seperate class that can be extended if needed.
//			  Which will keep the original code unmodified and allow for extensions of code to be added.
//
//SINGLE-RESPONSIBILITY: Does not apply.
//
//INTERFACE-SEGREGATION: It depends. If the manager is salary based then yes this applies because
//						 there would be no need to calculate lunch breaks since they have a salary rate.
//						 So in that it would not need the "eat" function and not be forced to use the 
//						 interface since it would not use it. However, if the Manager was paid with an
//						 hourly rate then it would need to use the "eat" function.
//

public class Manager {
	IWorker worker;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}

}
