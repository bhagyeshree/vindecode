package com.bhagyeshree.spring.validate.api.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;


public class Results {
	
	
	
	private String Variable;

    private String Value;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ValueId;

    @Id
    private String VariableId;

    public String getVariable ()
    {
        return Variable;
    }

    public void setVariable (String Variable)
    {
        this.Variable = Variable;
    }

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getValueId ()
    {
        return ValueId;
    }

    public void setValueId (String ValueId)
    {
        this.ValueId = ValueId;
    }

    public String getVariableId ()
    {
        return VariableId;
    }

    public void setVariableId (String VariableId)
    {
        this.VariableId = VariableId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Variable = "+Variable+", Value = "+Value+", ValueId = "+ValueId+", VariableId = "+VariableId+"]";
    }
}
			
			


