package threesolid;
// the interface can be entended to make take away tasks from the workers

public interface IWorker extends IFeedable, IWorkable {
}
interface IFeedable {
    public void eat();
        // nom nom nom
}
interface IWorkable {
    public void work();
        // work work work
}

//This Interface file is an example of the ISP principle

