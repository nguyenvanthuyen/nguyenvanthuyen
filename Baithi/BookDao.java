package Baithi;
import java.util.ArrayList;
import java.sql.ResultSet;


public class BookDao implements DAOInterface<Book> {

    @Override

    public ArrayList<Book> getList() {
        try{
            Connector connector = Connector.getInstance();
            String sql ="SELECT * FROM book;";
            ArrayList<Book> list = new ArrayList<>();
            ResultSet result = connector.executeQuery(sql);

            while (result.next()){
                Book book= new Book();

                book.setId(result.getString("Book ID"));
                book.setTitle(result.getString("BookName"));
                book.setAuthor(result.getString("Author"));
                book.setPrice(result.getInt("Price"));

                list.add(book);
            };
            return list;

        }catch (Exception e){e.printStackTrace();}

        return null;
    }

    @Override//3. add new book
    public Boolean add(Book book) {
        try{
            Connector connector = Connector.getInstance();
            String sql = "INSERT INTO book \n" +
                    "(id, title, author, price)\n" +
                    "VALUES \n" +
                    "('"+book.getId()+"', '"+book.getTitle()+"', '"+book.getAuthor()+"', '"+book.getPrice()+"');";

            try {
                Integer result = connector.executeUpdate(sql);
                if(result==1){
                    System.out.println("Add book Succeed!");
                    return true;
                }else {
                    System.out.println("Can Not Add!");
                    return false;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){e.printStackTrace();}
        return false;
    }


}