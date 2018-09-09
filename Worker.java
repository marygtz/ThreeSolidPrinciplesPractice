package threesolid;
// Modified by: Jessica
// Open-close: Both the Worker and SuperWorker classes are separate for 
// unique application but also scaled for independent extension. 
// New functionality can be added while keeping basic actions like eating and 
// and working the same with little need to modify. 
// Single-responsibility: This principle is applied because the two kinds of workers are
// both included in a single file but still separated into two different classes in
// the case where enhancements are only supposed to be made to one type of worker and 
// not the other. Everything worker-related (outside of the interface) is tucked 
// away into only one source of change.
// Interface-segregation: This principle is applied because IWorker is a 
// client-specific interface that only focuses on worker-related interactions.
// Both the Worker class and the SuperWorker class only extend the IWorker 
// interface and thus do not depend on other functions that don't apply to a worker. 

public class Worker implements IWorker{
		public void work() {
			// ....working
		}

		public void eat() {
			//.... eating in launch break
		}
	}
	
class SuperWorker implements IWorker{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}


