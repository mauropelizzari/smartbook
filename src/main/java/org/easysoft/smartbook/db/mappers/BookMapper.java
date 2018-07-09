package org.easysoft.smartbook.db.mappers;

import java.util.List;

import org.easysoft.smartbook.beans.Book;

public interface BookMapper {

	List<Book> search();
}
