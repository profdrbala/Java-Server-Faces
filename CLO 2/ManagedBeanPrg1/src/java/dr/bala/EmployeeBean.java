/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr.bala;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author bala
 */
@Named(value = "emp")
@RequestScoped
public class EmployeeBean {
private String empName;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    /**
     * Creates a new instance of EmployeeBean
     */
    public EmployeeBean() {
    }
    
}
