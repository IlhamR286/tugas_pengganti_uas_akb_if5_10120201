//10120201 - Ilham Ramdhan Putra Lesmana - IF5
package com.belajarkuy.tugasuas_10120201;

import android.database.Cursor;
import com.belajarkuy.tugasuas_10120201.model.list;

public interface ListInterface {

    public Cursor read();

    public boolean create(list list);

    public boolean update(list list);

    public boolean delete(String id);
}
