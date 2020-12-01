package com.stackroute.keepnote.model;

import java.util.Date;

public class Category {

	/*
	 * This class should have five fields
	 * (categoryId,categoryName,categoryDescription,
	 * categoryCreatedBy,categoryCreationDate). This class should also contain the
	 * getters and setters for the fields along with the toString method. The value
	 * of categoryCreationDate should not be accepted from the user but should be
	 * always initialized with the system date.
	 */

   	String categoryId;
	Date categoryCreationDate;
	String categoryCreatedBy;
	String categoryDescription;
	String categoryName;

    public String getCategoryId() {
		return categoryId;
    }

    public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
    }

    public String getCategoryName() {
		return categoryName;
    }

    public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
		return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
    }

    public String getCategoryCreatedBy() {
		return categoryCreatedBy;
    }

    public void setCategoryCreatedBy(String categoryCreatedBy) {
		this.categoryCreatedBy = categoryCreatedBy;
    }

    public Date getCategoryCreationDate() {
		return categoryCreationDate;
    }

    public void setCategoryCreationDate(Date categoryCreationDate) {
		this.categoryCreationDate = categoryCreationDate;
	}
      
	@Override
	public String toString() {
		return String.format(
				"Category [categoryId=%s, categoryCreationDate=%s, categoryCreatedBy=%s, categoryDescription=%s, categoryName=%s]",
				categoryId, categoryCreationDate, categoryCreatedBy, categoryDescription, categoryName);
    }

}
