public class Main {
        public static void main(String[] args) {
            Student student = new Student("Renard B. Macorol");
    
            LibraryResource book = new Book("Basic Programming with Java");
            student.borrow(book);
            student.returnLibraryResource(book);
    
            LibraryResource capstone = new Capstone("Addressing Urban Mobility: A Capstone Proposal for Sustainable Transportation");
            student.borrow(capstone);
            student.returnLibraryResource(capstone);
    
            LibraryResource internet = new Book("Libary Free Internet");
            student.borrow(internet);
            student.returnLibraryResource(internet);
    
            LibraryResource Journals = new Journals("The Role of Artificial Intelligence in Healthcare: A Review");
            student.borrow(Journals);
            student.returnLibraryResource(Journals);
    
            LibraryResource newspaper = new Newspapers("Computer Science News Daily");
            student.borrow(newspaper);
            student.returnLibraryResource(newspaper);
    
            LibraryResource theses = new Theses("Machine Learning Algorithms for Fraud Detection in Financial Transactions: A Comparative Study");
            student.borrow(theses);
            student.returnLibraryResource(theses);
    
        }
}
