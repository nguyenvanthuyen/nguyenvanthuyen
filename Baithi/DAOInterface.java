package Baithi;

import java.util.ArrayList;

public interface DAOInterface<E> {
    ArrayList<E> getList();
    Boolean add (E e);

}
