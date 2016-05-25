package manipulate;

import java.util.Collection;

public interface Pagination {

	/*
	 * return collection 
	 * put one collection you want to play per page
	 * put number per page
	 * put number start of record 
	 * put number end of record 
	 */
	public Collection<Object> first(Collection<Object> table, int firstPage);
	public Collection<Object> last(Collection<Object> table,int LastPage);
	public int next(int currentPage);
	public int previous(int currentPage);
	public Collection<Object> showList(Collection<Object> table,int perPage);
	public int goTo(int pagenumber);
	public int setRow(int perpage);
}
