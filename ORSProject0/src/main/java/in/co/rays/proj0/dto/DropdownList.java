package in.co.rays.proj0.dto;
/**
 * DropdownList interface is implemented by DTOs those are used to create drop
 * down list on HTML pages
 * 
 * @author Lucky rajpoot
 */
public interface DropdownList {
	
	/**
     * Returns key of list element
     * 
     * @return key
     */
    public String getKey();

    /**
     * Returns display text of list element
     * 
     * @return value
     */
    public String getValue();

}
