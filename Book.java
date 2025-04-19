public class Book implements LibraryResource{
    private String title;
    

    public Book(String title){
        this.title = title;
    }


    public void borrow(){
        System.out.println(title+ " has been borrowed");
    }

    public void returnLibraryResource(){
        System.out.println(title+ " has been returned");
    }
}
