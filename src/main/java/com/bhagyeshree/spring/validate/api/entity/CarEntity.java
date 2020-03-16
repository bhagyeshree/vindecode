package com.bhagyeshree.spring.validate.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CarEntity {
	
	@Column(name="Message")
	private String Message;

	@Column(name="results")
    private Results[] Results;

	@Column(name="count")
    private String Count;

	@Column(name="searchcriteria")
    private String SearchCriteria;

    public String getMessage ()
    {
        return Message;
    }

    public void setMessage (String Message)
    {
        this.Message = Message;
    }

    public Results[] getResults ()
    {
        return Results;
    }

    public void setResults (Results[] Results)
    {
        this.Results = Results;
    }

    public String getCount ()
    {
        return Count;
    }

    public void setCount (String Count)
    {
        this.Count = Count;
    }

    public String getSearchCriteria ()
    {
        return SearchCriteria;
    }

    public void setSearchCriteria (String SearchCriteria)
    {
        this.SearchCriteria = SearchCriteria;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Message = "+Message+", Results = "+Results+", Count = "+Count+", SearchCriteria = "+SearchCriteria+"]";
    }
}
			


