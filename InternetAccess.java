public class InternetAccess implements LibraryResource{
    private String networkName;
    

    public void Capstone(String networkName){
        this.networkName = networkName;
    }

    public void borrow(){
        System.out.println(networkName + "is currently in used");
    }

    public void returnLibraryResource(){
        System.out.println(networkName + "is available");
    }
}
