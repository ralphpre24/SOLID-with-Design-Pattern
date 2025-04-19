public class Student {
    private String studentName;

    public Student(String studentName){
        this.studentName = studentName;
    }

    public void borrow(LibraryResource resource){
        resource.borrow();
    }

    public void returnLibraryResource(LibraryResource resource){
        resource.returnLibraryResource();
    }

}
