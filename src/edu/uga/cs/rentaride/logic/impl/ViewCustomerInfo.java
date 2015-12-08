
//
// A control class to implement the 'View customer info' use case
//
//


package edu.uga.cs.rentaride.logic.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.uga.uga.cs.RARException;
import edu.uga.uga.cs.entity.Customer;
import edu.uga.uga.cs.object.ObjectLayer;


public class ViewCustomerInfoCtrl {
    
    private ObjectLayer objectLayer = null;
    
    public ViewCustomerInfoCtrl( ObjectLayer objectModel )
    {
        this.objectLayer = objectModel;
    }

    public List<User> ViewCustomerInfo()
            throws RARException
    {
        List<Customer> 	    customers  = null;
        Iterator<Customer> 	customerIter = null;
        Customer     	    customer = null;

        users = new LinkedList<Customer>();
        
        // retrieve all User objects
        //
        customerIter = objectLayer.ViewCustomerInfo( null );
        while( customerIter.hasNext() ) {
            customer = customerIter.next();
            System.out.println( customer);
            customers.add( customer );
        }

        return customers;
    }
}
